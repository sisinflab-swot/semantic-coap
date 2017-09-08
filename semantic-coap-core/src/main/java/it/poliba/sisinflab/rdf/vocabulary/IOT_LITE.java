package it.poliba.sisinflab.rdf.vocabulary;

import org.semanticweb.owlapi.model.IRI;

/**
 * iot-lite.
 * <p>
 * iot-lite is a lightweight ontology based on SSN to describe Internet
 * of Things (IoT) concepts and relationships..
 * <p>
 * Namespace iot-lite.
 * Prefix: {@code <http://purl.oclc.org/NET/UNIS/fiware/iot-lite#>}
 */
public class IOT_LITE {

	/** {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#} **/
	public static final String NAMESPACE = "http://purl.oclc.org/NET/UNIS/fiware/iot-lite#";

	/** {@code iot-lite} **/
	public static final String PREFIX = "iot-lite";

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#ActuatingDevice}.
	 * <p>
	 * Device that can actuate over an object or QuantityKind.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#ActuatingDevice">ActuatingDevice</a>
	 */
	public static final IRI ACTUATING_DEVICE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#altRelative}.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#altRelative">altRelative</a>
	 */
	public static final IRI ALT_RELATIVE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Attribute}.
	 * <p>
	 * An attribute of an IoT object that can be exposed by an IoT service
	 * (i.e. a room (IoT Object) has a temperature (Attribute), that can be
	 * exposed by a temperature sensor (IoT device).
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Attribute">Attribute</a>
	 */
	public static final IRI ATTRIBUTE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Circle}.
	 * <p>
	 * Circle coverage it needs the location of the sensor as the centre of
	 * the circle and the radius as a DataProperty.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Circle">Circle</a>
	 */
	public static final IRI CIRCLE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Coverage}.
	 * <p>
	 * The coverage of an IoT device (i.e. a temperature sensor inside a room
	 * has a coverage of that room).
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Coverage">Coverage</a>
	 */
	public static final IRI COVERAGE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#endpoint}.
	 * <p>
	 * Endpoint of the service. It is usually a URL where the service is
	 * available.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#endpoint">endpoint</a>
	 */
	public static final IRI ENDPOINT;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Entity}.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Entity">Entity</a>
	 */
	public static final IRI ENTITY;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#exposedBy}.
	 * <p>
	 * A device is exposed by a service.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#exposedBy">exposedBy</a>
	 */
	public static final IRI EXPOSED_BY;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#exposes}.
	 * <p>
	 * For service-oriented queries. The inverse of exposedBy.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#exposes">exposes</a>
	 */
	public static final IRI EXPOSES;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasAttribute}.
	 * <p>
	 * Links the devices with their attributes.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasAttribute">hasAttribute</a>
	 */
	public static final IRI HAS_ATTRIBUTE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasCoverage}.
	 * <p>
	 * Links the devices with their coverages.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasCoverage">hasCoverage</a>
	 */
	public static final IRI HAS_COVERAGE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasMetadata}.
	 * <p>
	 * Links any concept with metadata about that concept.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasMetadata">hasMetadata</a>
	 */
	public static final IRI HAS_METADATA;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasQuantityKind}.
	 * <p>
	 * Links a sensor or an attribute with the quantity kind it measures
	 * (e.g. A sensor -sensor1- measures temperature: sensor1 hasQuantityKind
	 * temperature).
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasQuantityKind">hasQuantityKind</a>
	 */
	public static final IRI HAS_QUANTITY_KIND;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasSensingDevice}.
	 * <p>
	 * Links a sensor with a sensing device the same way as SSN.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasSensingDevice">hasSensingDevice</a>
	 */
	public static final IRI HAS_SENSING_DEVICE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasUnit}.
	 * <p>
	 * Links the sensor with the units of the quantity kind it measures (e.g.
	 * A sensor -sensor1- measures temperature in Celsius: senso1 hasUnit
	 * celsius).
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#hasUnit">hasUnit</a>
	 */
	public static final IRI HAS_UNIT;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#id}.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#id">id</a>
	 */
	public static final IRI ID;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#interfaceDescription}.
	 * <p>
	 * Description of the service.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#interfaceDescription">interfaceDescription</a>
	 */
	public static final IRI INTERFACE_DESCRIPTION;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#interfaceType}.
	 * <p>
	 * Defines the type of interface of the service endpoint.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#interfaceType">interfaceType</a>
	 */
	public static final IRI INTERFACE_TYPE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#isAssociatedWith}.
	 * <p>
	 * Defines the associations between objects and sensors (e.g. A table
	 * (object) has an attribute (temperature at the table) which is
	 * associated with a sensor (the temperature sensor of the room). 
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#isAssociatedWith">isAssociatedWith</a>
	 */
	public static final IRI IS_ASSOCIATED_WITH;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#isMobile}.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#isMobile">isMobile</a>
	 */
	public static final IRI IS_MOBILE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#isSubSystemOf}.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#isSubSystemOf">isSubSystemOf</a>
	 */
	public static final IRI IS_SUB_SYSTEM_OF;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Metadata}.
	 * <p>
	 * Class used to describe properties that cannot be described by
	 * QuantityKind and Units. i.e. the resolution of a sensor.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Metadata">Metadata</a>
	 */
	public static final IRI METADATA;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#metadataType}.
	 * <p>
	 * Defines the type pf the metadata value (e.g. resolution of the
	 * sensor).
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#metadataType">metadataType</a>
	 */
	public static final IRI METADATA_TYPE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#metadataValue}.
	 * <p>
	 * Value of the metadata
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#metadataValue">metadataValue</a>
	 */
	public static final IRI METADATA_VALUE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Object}.
	 * <p>
	 * IoT entity
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Object">Object</a>
	 */
	public static final IRI OBJECT;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Polygon}.
	 * <p>
	 * The coverage is made up by linking several points by strait lines.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Polygon">Polygon</a>
	 */
	public static final IRI POLYGON;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#radius}.
	 * <p>
	 * Specifies the radius of a circle coverage defined by a point -the
	 * center of the circle- and its radius.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#radius">radius</a>
	 */
	public static final IRI RADIUS;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Rectangle}.
	 * <p>
	 * Teh coverage is made up by giving two points which are the oposite
	 * corners of a rentangle.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Rectangle">Rectangle</a>
	 */
	public static final IRI RECTANGLE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#relativeLocation}.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#relativeLocation">relativeLocation</a>
	 */
	public static final IRI RELATIVE_LOCATION;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Service}.
	 * <p>
	 * Service provided by an IoT Device
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#Service">Service</a>
	 */
	public static final IRI SERVICE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#TagDevice}.
	 * <p>
	 * Tag Device such as QR code or bar code.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#TagDevice">TagDevice</a>
	 */
	public static final IRI TAG_DEVICE;

	/**
	 * {@code http://purl.oclc.org/NET/UNIS/fiware/iot-lite#VirtualEntity}.
	 *
	 * @see <a href="http://purl.oclc.org/NET/UNIS/fiware/iot-lite#VirtualEntity">VirtualEntity</a>
	 */
	public static final IRI VIRTUAL_ENTITY;

	static {
		ACTUATING_DEVICE = IRI.create(IOT_LITE.NAMESPACE, "ActuatingDevice");
		ALT_RELATIVE = IRI.create(IOT_LITE.NAMESPACE, "altRelative");
		ATTRIBUTE = IRI.create(IOT_LITE.NAMESPACE, "Attribute");
		CIRCLE = IRI.create(IOT_LITE.NAMESPACE, "Circle");
		COVERAGE = IRI.create(IOT_LITE.NAMESPACE, "Coverage");
		ENDPOINT = IRI.create(IOT_LITE.NAMESPACE, "endpoint");
		ENTITY = IRI.create(IOT_LITE.NAMESPACE, "Entity");
		EXPOSED_BY = IRI.create(IOT_LITE.NAMESPACE, "exposedBy");
		EXPOSES = IRI.create(IOT_LITE.NAMESPACE, "exposes");
		HAS_ATTRIBUTE = IRI.create(IOT_LITE.NAMESPACE, "hasAttribute");
		HAS_COVERAGE = IRI.create(IOT_LITE.NAMESPACE, "hasCoverage");
		HAS_METADATA = IRI.create(IOT_LITE.NAMESPACE, "hasMetadata");
		HAS_QUANTITY_KIND = IRI.create(IOT_LITE.NAMESPACE, "hasQuantityKind");
		HAS_SENSING_DEVICE = IRI.create(IOT_LITE.NAMESPACE, "hasSensingDevice");
		HAS_UNIT = IRI.create(IOT_LITE.NAMESPACE, "hasUnit");
		ID = IRI.create(IOT_LITE.NAMESPACE, "id");
		INTERFACE_DESCRIPTION = IRI.create(IOT_LITE.NAMESPACE, "interfaceDescription");
		INTERFACE_TYPE = IRI.create(IOT_LITE.NAMESPACE, "interfaceType");
		IS_ASSOCIATED_WITH = IRI.create(IOT_LITE.NAMESPACE, "isAssociatedWith");
		IS_MOBILE = IRI.create(IOT_LITE.NAMESPACE, "isMobile");
		IS_SUB_SYSTEM_OF = IRI.create(IOT_LITE.NAMESPACE, "isSubSystemOf");
		METADATA = IRI.create(IOT_LITE.NAMESPACE, "Metadata");
		METADATA_TYPE = IRI.create(IOT_LITE.NAMESPACE, "metadataType");
		METADATA_VALUE = IRI.create(IOT_LITE.NAMESPACE, "metadataValue");
		OBJECT = IRI.create(IOT_LITE.NAMESPACE, "Object");
		POLYGON = IRI.create(IOT_LITE.NAMESPACE, "Polygon");
		RADIUS = IRI.create(IOT_LITE.NAMESPACE, "radius");
		RECTANGLE = IRI.create(IOT_LITE.NAMESPACE, "Rectangle");
		RELATIVE_LOCATION = IRI.create(IOT_LITE.NAMESPACE, "relativeLocation");
		SERVICE = IRI.create(IOT_LITE.NAMESPACE, "Service");
		TAG_DEVICE = IRI.create(IOT_LITE.NAMESPACE, "TagDevice");
		VIRTUAL_ENTITY = IRI.create(IOT_LITE.NAMESPACE, "VirtualEntity");
	}

	private IOT_LITE() {
		//static access only
	}

}
