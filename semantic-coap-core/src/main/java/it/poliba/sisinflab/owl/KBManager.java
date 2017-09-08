package it.poliba.sisinflab.owl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.apache.commons.io.IOUtils;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxOntologyFormat;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.poliba.sisinflab.owl.owlapi.MicroReasoner;
import it.poliba.sisinflab.owl.owlapi.MicroReasonerFactory;
import it.poliba.sisinflab.owl.sod.hlds.AtomicConcept;
import it.poliba.sisinflab.owl.sod.hlds.Composition;
import it.poliba.sisinflab.owl.sod.hlds.GreaterThanRole;
import it.poliba.sisinflab.owl.sod.hlds.Item;
import it.poliba.sisinflab.owl.sod.hlds.LessThanRole;
import it.poliba.sisinflab.owl.sod.hlds.SemanticDescription;
import it.poliba.sisinflab.owl.sod.hlds.UniversalRole;

public class KBManager {
	
	Logger log = LoggerFactory.getLogger(KBManager.class);

	MicroReasoner reasoner = null;
	OWLOntologyManager manager;
	OWLOntology onto;
	
	IRI defaultIRI = null;
	IRI requestIRI = null;
	
	IRI emptyIRI = null;
	
	//double rank;

	public KBManager(File file) throws OWLOntologyCreationException {
		// Get hold of an ontology manager
		manager = OWLManager.createOWLOntologyManager();
		
		// Load the local ontology
		log.info("Loading ontology... ");
		onto = manager.loadOntologyFromOntologyDocument(file);
		defaultIRI = onto.getOntologyID().getOntologyIRI();		
		log.info("Done! Reference ontology: " + defaultIRI);

		// Return an instance of OWLReasoner class that represents our Mini-ME reasoner
		this.reasoner = new MicroReasonerFactory().createMicroReasoner(onto);
				
		emptyIRI = IRI.create(defaultIRI.toString() + "#Empty");
		Item empty = new Item(emptyIRI);
		this.reasoner.loadSupply(empty);
	}
	
	public KBManager(InputStream is) throws OWLOntologyCreationException {
		// Get hold of an ontology manager
		manager = OWLManager.createOWLOntologyManager();

		// Load the local ontology
		log.info("Loading ontology... ");
		onto = manager.loadOntologyFromOntologyDocument(is);
		defaultIRI = onto.getOntologyID().getOntologyIRI();
		log.info("Done! Reference ontology: " + defaultIRI);

		// Return an instance of OWLReasoner class that represents our Mini-ME reasoner
		this.reasoner = new MicroReasonerFactory().createMicroReasoner(onto);
		
		emptyIRI = IRI.create(defaultIRI.toString() + "#Empty");
		Item empty = new Item(emptyIRI);
		this.reasoner.loadSupply(empty);
	}

	public IRI loadIndividualFromFile(File file) {

		IRI iri = null;

		try {
			OWLOntology tmp = manager.loadOntologyFromOntologyDocument(file);
			this.reasoner.loadSupply(tmp);
			
			OWLNamedIndividual ind = getIndividual(tmp);

			if (ind != null) {
				iri = ind.getIRI();
				log.info("OWL Individual loaded: " + iri);
			}

			manager.removeOntology(tmp);
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return iri;
	}	
	
	public IRI loadIndividualFromString(String owl) {

		IRI iri = null;

		try {
			OWLOntology tmp = manager.loadOntologyFromOntologyDocument(IOUtils.toInputStream(owl));
			this.reasoner.loadSupply(tmp);
			
			OWLNamedIndividual ind = getIndividual(tmp);

			if (ind != null) {
				iri = ind.getIRI();
				log.info("OWL Individual loaded: " + iri);
			} else 
				log.error("No OWL Individual found!");

			manager.removeOntology(tmp);
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return iri;
	}
	
	public void removeIndividualFromKB(IRI individual){
		this.reasoner.deleteSupply(individual);
	}
	
	public String getServiceAnnotation(String individual){
		Item item = this.reasoner.retrieveSupplyIndividual(IRI.create(individual));
		return item.toString();
	}
	
	private OWLNamedIndividual getIndividual(OWLOntology onto){
        for (OWLNamedIndividual ind : onto.getIndividualsInSignature()) {
            return ind;
        }
        return null;
    }
	
	public IRI loadRequestFromFile(File req){
        try {
            OWLOntology onto_ind = manager.loadOntologyFromOntologyDocument(req);                        
            
            this.reasoner.loadDemand(onto_ind);
            requestIRI = getIndividual(onto_ind).getIRI();
            
            manager.removeOntology(onto_ind);
            log.info("OWL Request loaded: " + requestIRI);
        } catch (OWLOntologyCreationException e) {
        	log.error("Request " + req.getName() + " already exists!");
            e.printStackTrace();
            return null;
        }
        
        return requestIRI;
    }
	
	public IRI loadRequestFromString(String req, boolean normalize){
        try {
            OWLOntology onto_ind = manager.loadOntologyFromOntologyDocument(IOUtils.toInputStream(req));                        
            
            this.reasoner.loadDemand(onto_ind, normalize);
            requestIRI = getIndividual(onto_ind).getIRI();
            
            manager.removeOntology(onto_ind);
            log.info("OWL Request loaded: " + requestIRI);
        } catch (OWLOntologyCreationException e) {
        	log.error("Ontology IRI already exists!");
            e.printStackTrace();
            return null;
        }
        
        return requestIRI;
    }
		
	public IRI getRequestIRI(){
		return requestIRI;
	}
	
	public double getSemanticRank(Item res, IRI reqIRI){      
		Item b = reasoner.retrieveDemandIndividual(reqIRI);		
		
        double penalty_res = res.description.abduce(b.description).penalty;
        double penalty_top = this.reasoner.abduction(emptyIRI, reqIRI).penalty;
        double rank = 1.0 - (penalty_res/penalty_top);
        return rank;
    }
	
	public double getSemanticRank(IRI resIRI, IRI reqIRI){      		
        double penalty_res = this.reasoner.abduction(resIRI, reqIRI).penalty;
        double penalty_top = this.reasoner.abduction(emptyIRI, reqIRI).penalty;
        double rank = 1.0 - (penalty_res/penalty_top);
        return rank;
    }
	
	public double getSemanticRank(IRI resIRI){
		double penalty_res = this.reasoner.abduction(resIRI, requestIRI).penalty;
        double penalty_top = this.reasoner.abduction(emptyIRI, requestIRI).penalty;
        double rank = 1.0 - (penalty_res/penalty_top);
        return rank;
    }
	
	public String renameIndividual(String owl, String deviceName) {
		try {
			OWLOntology tmp = manager.loadOntologyFromOntologyDocument(IOUtils.toInputStream(owl));						
			OWLNamedIndividual ind = tmp.getIndividualsInSignature().iterator().next();	
			
			long ts = System.currentTimeMillis();
			OWLOntology tmpNew = manager.createOntology(IRI.create(tmp.getOntologyID().getOntologyIRI().getNamespace() + ts));
			String indIRI = tmp.getOntologyID().getOntologyIRI().getNamespace() + deviceName + "_" + ts;
			OWLNamedIndividual ind2 = manager.getOWLDataFactory().getOWLNamedIndividual(IRI.create(indIRI));
						
			//for (OWLClassExpression c : EntitySearcher.getTypes(ind, tmp)) {
			for (OWLClassExpression c : ind.getTypes(tmp)) {
				OWLClassAssertionAxiom ax = manager.getOWLDataFactory().getOWLClassAssertionAxiom(c, ind2);
				AddAxiom addAx = new AddAxiom(tmpNew, ax);
				manager.applyChange(addAx); 
			}	

			ManchesterOWLSyntaxOntologyFormat ms = new ManchesterOWLSyntaxOntologyFormat();
			ms.setPrefix("hsn", tmp.getOntologyID().getOntologyIRI().getNamespace());
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			manager.saveOntology(tmpNew, ms, os);
			String resp = os.toString();
			os.close();				
			
			manager.removeOntology(tmpNew);
			manager.removeOntology(tmp);
			
			return resp;
		} catch (OWLOntologyCreationException | OWLOntologyStorageException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public IRI getIndividualIRI(String owl) {
		OWLOntology tmp;
		try {
			tmp = manager.loadOntologyFromOntologyDocument(IOUtils.toInputStream(owl));
			OWLNamedIndividual ind = tmp.getIndividualsInSignature().iterator().next();
			IRI iri = ind.getIRI();
			manager.removeOntology(tmp);
			return iri;
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}						
		return null;
	}
	
	public MicroReasoner getReasoner() {
		return this.reasoner;
	}
	
	public ArrayList<String> getSupplyIndividuals(){
		ArrayList<String> supplies = new ArrayList<String>();
		log.info(">>\tSupply Individuals");
		Set<IRI> set = this.reasoner.getSupplyIndividuals();
		for (IRI iri : set) {
			supplies.add(iri.toString());
			log.info(">>\t" + iri.toString());
		}
		return supplies;
	}
	
	public ArrayList<IRI> covering(IRI reqIRI) {
		ArrayList<IRI> list = new ArrayList<IRI>();
		
		try{
			log.info(">>\tCompute covering...");
			Composition result = this.reasoner.composition(reqIRI); 
			log.info(">>\tSet: \n");
			Vector<Item> set = (Vector<Item>)result.Rc;
			
			for (int i=0; i<set.size(); i++) {
				log.info(">>\t" + ((Item)set.get(i)).name + "\n");
				list.add(((Item)set.get(i)).name);
			}
			
			log.info(">>");
			log.info(">>\tUncovered-part:\n>>\t" + ((Item)result.Du).description.toString());
			//this.setPartNotCovered(((Item)result.Du).description);
			log.info(">>");
			
			Item top = new Item(IRI.create("Empty"));
			Item dem = this.reasoner.retrieveDemandIndividual(reqIRI);
			double rank = (1-top.description.abduce(((Item)result.Du).description).penalty/top.description.abduce(dem.description).penalty)*100; 
			
			//System.out.println(">>\tValore Nominatore Like: " + top.description.abduce(((Item)result.Du).description).penalty);
			//System.out.println(">>\tValore Denominatore Like: " + top.description.abduce(dem.description).penalty);
			log.info(">>\tLike Value: " + rank);
		}catch(Exception e){
			e.printStackTrace();
		}

		return list;
	}
	
	public String generateOWL(String fragment, SemanticDescription sd) {
		
		IRI name = IRI.create(defaultIRI.toString() + "#" + fragment);
		log.info("Generating OWL " + name);
		
		OWLOntologyManager tmp = OWLManager.createOWLOntologyManager();		
		OWLDataFactory df = tmp.getOWLDataFactory();
		
		OWLObjectIntersectionOf desc = this.semDescToOWL(df, sd);				
		
		try {
			OWLOntology tmpNew = tmp.createOntology(name);
			OWLNamedIndividual ind = df.getOWLNamedIndividual(name);
			
			OWLClassAssertionAxiom ax = df.getOWLClassAssertionAxiom(desc, ind);
			AddAxiom addAx = new AddAxiom(tmpNew, ax);
			tmp.applyChange(addAx); 
			
			ManchesterOWLSyntaxOntologyFormat ms = new ManchesterOWLSyntaxOntologyFormat();
			ms.setDefaultPrefix(defaultIRI.toString() + "#");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			tmp.saveOntology(tmpNew, ms, os);
			String resp = os.toString();
			os.close();				
			
			tmp.removeOntology(tmpNew);
			
			return resp.replaceAll("\n+", "\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private OWLObjectIntersectionOf semDescToOWL(OWLDataFactory df, SemanticDescription sd) {		
		Set<OWLClassExpression> desc = new HashSet<OWLClassExpression>();
		
		for (AtomicConcept a : sd.atomicConcepts) {
			OWLClass cls = df.getOWLClass(a.name);
			if (!a.denied)			
				desc.add(cls);
			else
				desc.add(df.getOWLObjectComplementOf(cls));
		}
		
		for (LessThanRole ltr : sd.lessThanRoles) {
			desc.add(df.getOWLObjectMaxCardinality(ltr.cardinality, df.getOWLObjectProperty(ltr.name)));
		}
		
		for (GreaterThanRole gtr : sd.greaterThanRoles) {
			desc.add(df.getOWLObjectMinCardinality(gtr.cardinality, df.getOWLObjectProperty(gtr.name)));
		}
		
		for (UniversalRole ur : sd.universalRoles){
			OWLObjectProperty p = df.getOWLObjectProperty(ur.name);
			OWLObjectIntersectionOf filler = this.semDescToOWL(df, ur.filler);			
			desc.add(df.getOWLObjectAllValuesFrom(p, filler));
		}				

		return df.getOWLObjectIntersectionOf(desc);
	}

	public void printResource(IRI req) {
		Item item = reasoner.retrieveDemandIndividual(req);
		System.out.println("Name: " + item.name + "\n" + item.description.toString());		
	}
	
	/*public String semanticDescription2OWLString(SemanticDescription semanticDescription, String nameIndividual){
		Set<String> Class, ObjectProperty, Prefix;
		
		StringBuilder b = new StringBuilder();
		Class = new HashSet<String>();
		ObjectProperty = new HashSet<String>();
		Prefix = new HashSet<String>();
		
		String body = this.toOWLString(semanticDescription, b, 2, false);
		if (body.equals(null))
			return null;
		
		String result = new String("");
		
		Prefix.add("hsn: <http://sisinflab.poliba.it/swot/hsn#>");
		Iterator<String> it = Prefix.iterator();
		while (it.hasNext()) {
			result = result + "Prefix: " + it.next() + "\n";
		}
		
		result = result + "\n";
		result = result + onto.getOntologyID().getOntologyIRI() + "\n";
		
		it = Class.iterator();
		while (it.hasNext()) {
			result = result + "Class: " + it.next() + "\n";
		}
		
		result = result + "\n";
		
		it = ObjectProperty.iterator();
		while (it.hasNext()) {
			result = result + "ObjectProperty: " + it.next() + "\n";
		}
		
		result = result + "\n";
		
		result = result + "Individual: " + nameIndividual + "\n\tTypes:\n\t\t"+ body;
		
		return result;
	}
	
	private String toOWLString(SemanticDescription d, StringBuilder b, int count, boolean recursion){
		String offset = "\n";
		for (int i = 0; i < count; i++) {
			offset = offset + "\t";
		}
		boolean flag = false;
	    if (d.atomicConcepts == null && d.greaterThanRoles == null && d.lessThanRoles == null && d.universalRoles == null){
	    	
	    }else {
	    	if (d.atomicConcepts != null) {
	    		if (d.atomicConcepts.size() > 0) {
	    			flag = true;
	    			List<AtomicConcept> l = d.atomicConcepts;
	    			for (int i = 0; i < l.size(); i++){
	    				if (i != 0)
   	    					b.append(offset + " and ");
	    				
	    				AtomicConcept c = (AtomicConcept) l.get(i);
	    				
	    				String cl = c.name.toString().substring(c.name.toString().indexOf("#") + 1);
	    				String prefix = c.name.toString().substring(c.name.toString().lastIndexOf("/") + 1, c.name.toString().indexOf("#"));
	    				String prefixHeading = c.name.toString().substring(0, c.name.toString().indexOf("#") + 1);
	    				
	    				if (!prefix.equals("")) {
	    					prefix = prefix + ":";
	    					prefixHeading = prefix + " <" + prefixHeading + ">";
		    				this.Prefix.add(prefixHeading);
	    				} 
	    				else
	    					return null;
	    				
	    				this.Class.add(prefix + cl);
	    				
	    				if (c.denied)
	    					b.append("(not " + prefix + cl + ")");
	    				else
	    					b.append(prefix + cl);
	    			}
	    		}
	    	}
	
	    	if (d.greaterThanRoles != null) {
	    		List<GreaterThanRole> l = d.greaterThanRoles;
	    		for (int i = 0; i < l.size(); i++) {
	    			if(i == 0)
	    				if(recursion)
	    					b.append(offset + " and ");
	    				else
	    					if(flag)
	    						b.append("," + offset);
	    					else
	    						flag = true;
	    			else
   	    				b.append(offset + " and ");
	    			
	    			GreaterThanRole r = (GreaterThanRole) l.get(i);

	    			String objProp = r.name.toString().substring(r.name.toString().indexOf("#") + 1);
	    			
	    			String prefix = r.name.toString().substring(r.name.toString().lastIndexOf("/") + 1, r.name.toString().indexOf("#"));
	    			String prefixHeading = r.name.toString().substring(0, r.name.toString().indexOf("#") + 1);
					
    				if (!prefix.equals("")) {
    					prefix = prefix + ":";
    					prefixHeading = prefix + " <" + prefixHeading + ">";
	    				this.Prefix.add(prefixHeading);
    				} 
    				else
    					return null;
	    			
	    			this.ObjectProperty.add(prefix + objProp);
	    			b.append("(" + prefix + objProp + " min " + r.cardinality + " owl:Thing)");
	    		}
	    	}
	
	    	if ( d.lessThanRoles != null) {
	    		List<LessThanRole> l = d.lessThanRoles;
	    		for (int i = 0; i < l.size(); i++) {
	    			if(i == 0)
	    				if(recursion)
	    					b.append(offset + " and ");
	    				else
	    					if(flag)
	    						b.append("," + offset);
	    					else
	    						flag = true;
	    			else
   	    				b.append(offset + " and ");
	    			
	    			LessThanRole r = (LessThanRole) l.get(i);
	    			
	    			String objProp = r.name.toString().substring(r.name.toString().indexOf("#") + 1);
	    			
	    			String prefix = r.name.toString().substring(r.name.toString().lastIndexOf("/") + 1, r.name.toString().indexOf("#"));
	    			String prefixHeading = r.name.toString().substring(0, r.name.toString().indexOf("#") + 1);
					
    				if (!prefix.equals("")) {
    					prefix = prefix + ":";
    					prefixHeading = prefix + " <" + prefixHeading + ">";
	    				this.Prefix.add(prefixHeading);
    				} else
    					return null;
	    			
	    			this.ObjectProperty.add(prefix + objProp);
	    			b.append("(" + prefix + objProp + " max " + r.cardinality + " owl:Thing)");
	    		}
	    	}
	
	    	if (d.universalRoles != null) {
	    		List<UniversalRole> l = d.universalRoles;
	    		for (int i = 0; i < l.size(); i++) {
	    			if(i == 0)
	    				if(recursion)
	    					b.append(offset + " and ");
	    				else
	    					if(flag)
	    						b.append("," + offset);
	    					else
	    						flag = true;
	    			else
	    				b.append(offset + " and ");

	    			UniversalRole r = (UniversalRole) l.get(i);

	    			String objProp = r.name.toString().substring(r.name.toString().indexOf("#") + 1);
	    			
	    			String prefix = r.name.toString().substring(r.name.toString().lastIndexOf("/") + 1, r.name.toString().indexOf("#"));
	    			String prefixHeading = r.name.toString().substring(0, r.name.toString().indexOf("#") + 1);
					
    				if (!prefix.equals("")) {
    					prefix = prefix + ":";
    					prefixHeading = prefix + " <" + prefixHeading + ">";
	    				this.Prefix.add(prefixHeading);
    				} else
    					return null;
	    			
	    			this.ObjectProperty.add(prefix + objProp);
    				
	    			b.append("(" + prefix + objProp + " some owl:Thing)" + offset + " and ");
    				b.append("(" + prefix + objProp + " only (");
	    			    				
	    			if (r.toString().contains(".(")) {
	    				count++;
	    				if (this.toOWLString(r.filler, b, count, true).equals(null)) {
	    					return null;
	    				}
	    				b.append("))");
	    			} 
	    			else {
	    				String cl = r.filler.toString().substring(r.filler.toString().indexOf("#") + 1, r.filler.toString().length() - 1);
	    				this.Class.add(prefix + cl);
	    				
	    				b.append(prefix + cl);
	    				if (i == l.size() - 1)
	    					b.append("))" + offset + " and ");
	    			}
	    		}
	    	}
	    }
	    
	    return b.toString();
	}*/

}
