package it.poliba.sisinflab.rdf.vocabulary;

import org.semanticweb.owlapi.model.IRI;

/**
 * The Machine-to-Machine Measurement (M3) Lite Ontology.
 * <p>
 * M3 lite taxonomy is designed for the FIESTA-IOT H2020 EU project. We
 * refactor, clean and simplify the M3 ontology designed by Eurecom
 * (Amelie Gyrard). M3 ontology lite is currently aligned with the
 * quantity taxonomy used by several testbeds: SmartSantander (Spain),
 * University of Surrey (United Kingdom), KETI (Korea) and Com4Innov
 * (France)..
 * <p>
 * Namespace m3-lite.
 * Prefix: {@code <http://purl.org/iot/vocab/m3-lite#>}
 */
public class M3_LITE {

	/** {@code http://purl.org/iot/vocab/m3-lite#} **/
	public static final String NAMESPACE = "http://purl.org/iot/vocab/m3-lite#";

	/** {@code m3-lite} **/
	public static final String PREFIX = "m3-lite";

	/**
	 * ABS (Anti-lock Braking System)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ABS}.
	 * <p>
	 * The actuator ABS (on/off)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ABS">ABS</a>
	 */
	public static final IRI A_B_S;

	/**
	 * Acceleration
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Acceleration}.
	 * <p>
	 * The rate of change with time of the velocity vector of a particle.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Acceleration">Acceleration</a>
	 */
	public static final IRI ACCELERATION;

	/**
	 * Acceleration Instantaneous
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AccelerationInstantaneous}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AccelerationInstantaneous">AccelerationInstantaneous</a>
	 */
	public static final IRI ACCELERATION_INSTANTANEOUS;

	/**
	 * Accelerometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Accelerometer}.
	 * <p>
	 * Accelerometer, Motion detector/Sensor. In iPhone 4, accelerometers are
	 * used to automatically determine the orientation in which the user is
	 * holding the phone (portrait or landscape).
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Accelerometer">Accelerometer</a>
	 */
	public static final IRI ACCELEROMETER;

	/**
	 * Initial ERAB Establishment Success Rate
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AccInitialERabEstabSuccRate}.
	 * <p>
	 * Initial ERAB Establishment Success Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AccInitialERabEstabSuccRate">AccInitialERabEstabSuccRate</a>
	 */
	public static final IRI ACC_INITIAL_E_RAB_ESTAB_SUCC_RATE;

	/**
	 * Initial ERAB Setup Success Rate
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AccInitialERabSetupSuccRate}.
	 * <p>
	 * Initial ERAB Setup Success Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AccInitialERabSetupSuccRate">AccInitialERabSetupSuccRate</a>
	 */
	public static final IRI ACC_INITIAL_E_RAB_SETUP_SUCC_RATE;

	/**
	 * RRC Connection Setup Success Rate
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AccRrcConnSetupSuccRate}.
	 * <p>
	 * RRC Connection Setup Success Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AccRrcConnSetupSuccRate">AccRrcConnSetupSuccRate</a>
	 */
	public static final IRI ACC_RRC_CONN_SETUP_SUCC_RATE;

	/**
	 * S1 Signaling Establishment Success Rate
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AccS1SigEstabSuccRate}.
	 * <p>
	 * S1 Signaling Establishment Success Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AccS1SigEstabSuccRate">AccS1SigEstabSuccRate</a>
	 */
	public static final IRI ACC_S1_SIG_ESTAB_SUCC_RATE;

	/**
	 * Active Power
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ActivePower}.
	 * <p>
	 * The product of the voltage across a branch of an alternating-current
	 * circuit and the component of the electric current that is in phase
	 * with the voltage.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ActivePower">ActivePower</a>
	 */
	public static final IRI ACTIVE_POWER;

	/**
	 * Activity Recognition
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Activity}.
	 * <p>
	 * Activity recognition as an IoT applicative domain
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Activity">Activity</a>
	 */
	public static final IRI ACTIVITY;

	/**
	 * Agriculture
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Agriculture}.
	 * <p>
	 * Agriculture, Smart farm as an Internet of Things (IoT) applicative
	 * domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Agriculture">Agriculture</a>
	 */
	public static final IRI AGRICULTURE;

	/**
	 * Air
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Air}.
	 * <p>
	 * Air as an IoT applicative domain
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Air">Air</a>
	 */
	public static final IRI AIR;

	/**
	 * Air Conditioner
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AirConditioner}.
	 * <p>
	 * An actuator to automatically switch on/off the air conditioner.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AirConditioner">AirConditioner</a>
	 */
	public static final IRI AIR_CONDITIONER;

	/**
	 * Air Pollutant Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AirPollutantSensor}.
	 * <p>
	 * Air Pollutant Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AirPollutantSensor">AirPollutantSensor</a>
	 */
	public static final IRI AIR_POLLUTANT_SENSOR;

	/**
	 * Air Pollution
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AirPollution}.
	 * <p>
	 * Air Pollution, Air Quality
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AirPollution">AirPollution</a>
	 */
	public static final IRI AIR_POLLUTION;

	/**
	 * Air Quality
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AirQuality}.
	 * <p>
	 * An air quality index (AQI) is a number used by government agencies to
	 * communicate to the public how polluted the air currently is or how
	 * polluted it is forecast to become. Different countries have their own
	 * air quality indices, corresponding to different national air quality
	 * standards.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AirQuality">AirQuality</a>
	 */
	public static final IRI AIR_QUALITY;

	/**
	 * Air Temperature, Weather Temperature, Ambient Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AirTemperature}.
	 * <p>
	 * The temperature of the air that would be indicated by a thermometer
	 * exposed to the air at a location sheltered from direct solar
	 * radiation.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AirTemperature">AirTemperature</a>
	 */
	public static final IRI AIR_TEMPERATURE;

	/**
	 * Air Thermometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AirThermometer}.
	 * <p>
	 * Air Thermometer
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AirThermometer">AirThermometer</a>
	 */
	public static final IRI AIR_THERMOMETER;

	/**
	 * Alarm System
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AlarmSystem}.
	 * <p>
	 * An actuator to automatically switch on/off the alarm system.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AlarmSystem">AlarmSystem</a>
	 */
	public static final IRI ALARM_SYSTEM;

	/**
	 * Alcohol Level
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AlcoholLevel}.
	 * <p>
	 * Alcohol Level
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AlcoholLevel">AlcoholLevel</a>
	 */
	public static final IRI ALCOHOL_LEVEL;

	/**
	 * Alcohol Level Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AlcoholLevelSensor}.
	 * <p>
	 * Alcohol Level Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AlcoholLevelSensor">AlcoholLevelSensor</a>
	 */
	public static final IRI ALCOHOL_LEVEL_SENSOR;

	/**
	 * Altitude
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Altitude}.
	 * <p>
	 * Altitude
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Altitude">Altitude</a>
	 */
	public static final IRI ALTITUDE;

	/**
	 * Ampere (A)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Ampere}.
	 * <p>
	 * The ampere is the SI unit for measuring an electric current which is
	 * the flow of electric charges through a surface at the rate of one
	 * coulomb per second.The ampere is the SI unit for measuring an electric
	 * current which is the flow of electric charges through a surface at the
	 * rate of one coulomb per second.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Ampere">Ampere</a>
	 */
	public static final IRI AMPERE;

	/**
	 * Angular
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Angular}.
	 * <p>
	 * Angular
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Angular">Angular</a>
	 */
	public static final IRI ANGULAR;

	/**
	 * Animal
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Animal}.
	 * <p>
	 * An RFID tag is embedded on animal.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Animal">Animal</a>
	 */
	public static final IRI ANIMAL;

	/**
	 * Animals
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Animals}.
	 * <p>
	 * Source of the sound were animals
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Animals">Animals</a>
	 */
	public static final IRI ANIMALS;

	/**
	 * Atmospheric Pressure
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AtmosphericPressure}.
	 * <p>
	 * The pressure exerted by the atmosphere as a consequence of
	 * gravitational attraction exerted upon the column of air lying directly
	 * above the point in question.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AtmosphericPressure">AtmosphericPressure</a>
	 */
	public static final IRI ATMOSPHERIC_PRESSURE;

	/**
	 * Atmospheric Pressure Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#AtmosphericPressureSensor}.
	 * <p>
	 * Atmospheric Pressure Sensor, Barometer or Barometric Pressure Sensor
	 * is a scientific instrument used im meteorology to measure atmospheric
	 * pressure.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#AtmosphericPressureSensor">AtmosphericPressureSensor</a>
	 */
	public static final IRI ATMOSPHERIC_PRESSURE_SENSOR;

	/**
	 * Automatic
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Automatic}.
	 * <p>
	 * Automatic Measurement
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Automatic">Automatic</a>
	 */
	public static final IRI AUTOMATIC;

	/**
	 * Barcode
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Barcode}.
	 * <p>
	 * A tagging device can be Barcode
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Barcode">Barcode</a>
	 */
	public static final IRI BARCODE;

	/**
	 * Battery Level
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BatteryLevel}.
	 * <p>
	 * This property holds the percentage of the battery capacity that
	 * remains available.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BatteryLevel">BatteryLevel</a>
	 */
	public static final IRI BATTERY_LEVEL;

	/**
	 * Beat Per Minute (bpm)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BeatPerMinute}.
	 * <p>
	 * BeatPerMinute (bpm) is the unit to measure heart rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BeatPerMinute">BeatPerMinute</a>
	 */
	public static final IRI BEAT_PER_MINUTE;

	/**
	 * Blind
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Blind}.
	 * <p>
	 * An actuator to automatically switch on/off the blind.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Blind">Blind</a>
	 */
	public static final IRI BLIND;

	/**
	 * Blood Glucose
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BloodGlucose}.
	 * <p>
	 * Blood Glucose level, blood sugar level
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BloodGlucose">BloodGlucose</a>
	 */
	public static final IRI BLOOD_GLUCOSE;

	/**
	 * Blood Pressure
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BloodPressure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BloodPressure">BloodPressure</a>
	 */
	public static final IRI BLOOD_PRESSURE;

	/**
	 * Blood Pressure Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BloodPressureSensor}.
	 * <p>
	 * Blood Pressure Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BloodPressureSensor">BloodPressureSensor</a>
	 */
	public static final IRI BLOOD_PRESSURE_SENSOR;

	/**
	 * Board Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BoardTemperature}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BoardTemperature">BoardTemperature</a>
	 */
	public static final IRI BOARD_TEMPERATURE;

	/**
	 * Board Thermometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BoardThermometer}.
	 * <p>
	 * Board Thermometer is provided by the Com4Innov testbed.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BoardThermometer">BoardThermometer</a>
	 */
	public static final IRI BOARD_THERMOMETER;

	/**
	 * Body Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BodyTemperature}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BodyTemperature">BodyTemperature</a>
	 */
	public static final IRI BODY_TEMPERATURE;

	/**
	 * Body Thermometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BodyThermometer}.
	 * <p>
	 * Body Thermometer
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BodyThermometer">BodyThermometer</a>
	 */
	public static final IRI BODY_THERMOMETER;

	/**
	 * Boiler
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Boiler}.
	 * <p>
	 * An actuator to automatically switch on/off the boiler.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Boiler">Boiler</a>
	 */
	public static final IRI BOILER;

	/**
	 * Book
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Book}.
	 * <p>
	 * An RFID tag is embedded on book.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Book">Book</a>
	 */
	public static final IRI BOOK;

	/**
	 * Smart Building
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BuildingAutomation}.
	 * <p>
	 * Smart Home/Building Automation as an Internet of Things (IoT)
	 * applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BuildingAutomation">BuildingAutomation</a>
	 */
	public static final IRI BUILDING_AUTOMATION;

	/**
	 * Building/Room Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#BuildingTemperature}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#BuildingTemperature">BuildingTemperature</a>
	 */
	public static final IRI BUILDING_TEMPERATURE;

	/**
	 * Calcium
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Calcium}.
	 * <p>
	 * Blood Calcium level
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Calcium">Calcium</a>
	 */
	public static final IRI CALCIUM;

	/**
	 * Calibration
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Calibration}.
	 * <p>
	 * If the measurement was taken when the sensor was being calibrated
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Calibration">Calibration</a>
	 */
	public static final IRI CALIBRATION;

	/**
	 * Candela
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Candela}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Candela">Candela</a>
	 */
	public static final IRI CANDELA;

	/**
	 * Capacitance
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Capacitance}.
	 * <p>
	 * Capacitance is the ability of a body to store an electric charge.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Capacitance">Capacitance</a>
	 */
	public static final IRI CAPACITANCE;

	/**
	 * CD
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#CD}.
	 * <p>
	 * An RFID tag is embedded on CD.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#CD">CD</a>
	 */
	public static final IRI C_D;

	/**
	 * Centibar
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Centibar}.
	 * <p>
	 * The centibar is a unit of pressure defined as 1e-2 bar.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Centibar">Centibar</a>
	 */
	public static final IRI CENTIBAR;

	/**
	 * Centimetre, Centimeter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Centimetre}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Centimetre">Centimetre</a>
	 */
	public static final IRI CENTIMETRE;

	/**
	 * Chemical Agent Atmospheric Concentration
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentration}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentration">ChemicalAgentAtmosphericConcentration</a>
	 */
	public static final IRI CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION;

	/**
	 * Chemical Agent Atmospheric Concentration Air Particles
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentrationAirParticles}.
	 * <p>
	 * The concentration of air particles suspended in an atmosphere.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentrationAirParticles">ChemicalAgentAtmosphericConcentrationAirParticles</a>
	 */
	public static final IRI CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_AIR_PARTICLES;

	/**
	 * Chemical Agent Atmospheric Concentration CO
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentrationCO}.
	 * <p>
	 * The concentration of CO gas suspended in an atmosphere.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentrationCO">ChemicalAgentAtmosphericConcentrationCO</a>
	 */
	public static final IRI CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_C_O;

	/**
	 * Chemical Agent Atmospheric Concentration NO2
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentrationNO2}.
	 * <p>
	 * The concentration of NO2 gas suspended in an atmosphere.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ChemicalAgentAtmosphericConcentrationNO2">ChemicalAgentAtmosphericConcentrationNO2</a>
	 */
	public static final IRI CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_N_O2;

	/**
	 * Chemical Agent Atmospheric Concentration O3
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#chemicalAgentAtmosphericConcentrationO3}.
	 * <p>
	 * The concentration of ozone (O3) gas suspended in an atmosphere.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#chemicalAgentAtmosphericConcentrationO3">chemicalAgentAtmosphericConcentrationO3</a>
	 */
	public static final IRI CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_O3;

	/**
	 * Cholesterol
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Cholesterol}.
	 * <p>
	 * Cholesterol measurement
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Cholesterol">Cholesterol</a>
	 */
	public static final IRI CHOLESTEROL;

	/**
	 * Cholesterol Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#CholesterolSensor}.
	 * <p>
	 * Cholesterol Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#CholesterolSensor">CholesterolSensor</a>
	 */
	public static final IRI CHOLESTEROL_SENSOR;

	/**
	 * Smart City
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#City}.
	 * <p>
	 * Smart City as an Internet of Things (IoT) applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#City">City</a>
	 */
	public static final IRI CITY;

	/**
	 * Clothes
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Clothing}.
	 * <p>
	 * An RFID tag is embedded on clothes.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Clothing">Clothing</a>
	 */
	public static final IRI CLOTHING;

	/**
	 * Cloud Cover
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#CloudCover}.
	 * <p>
	 * Cloud Cover
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#CloudCover">CloudCover</a>
	 */
	public static final IRI CLOUD_COVER;

	/**
	 * Cloud Cover Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#CloudCoverSensor}.
	 * <p>
	 * Cloud Cover Sensor is used to detect whater is is sunny, cloudy, etc.
	 * It is measured in okta.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#CloudCoverSensor">CloudCoverSensor</a>
	 */
	public static final IRI CLOUD_COVER_SENSOR;

	/**
	 * CO2 Measurements
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#CO2}.
	 * <p>
	 * To measure air quality
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#CO2">CO2</a>
	 */
	public static final IRI C_O2;

	/**
	 * Carbon Dioxide (CO2) Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#CO2Sensor}.
	 * <p>
	 * Carbon Dioxide (CO2) Sensor is used to measure air quality.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#CO2Sensor">CO2Sensor</a>
	 */
	public static final IRI C_O2_SENSOR;

	/**
	 * Coffee Machine, Coffee Maker
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#CoffeeMachine}.
	 * <p>
	 * An actuator to automatically switch on/off the coffe machine.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#CoffeeMachine">CoffeeMachine</a>
	 */
	public static final IRI COFFEE_MACHINE;

	/**
	 * Communication Properties
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Communication}.
	 * <p>
	 * Communication related properties
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Communication">Communication</a>
	 */
	public static final IRI COMMUNICATION;

	/**
	 * Computer, PC
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Computer}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Computer">Computer</a>
	 */
	public static final IRI COMPUTER;

	/**
	 * Conductivity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Conductivity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Conductivity">Conductivity</a>
	 */
	public static final IRI CONDUCTIVITY;

	/**
	 * Conductivity Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ConductivitySensor}.
	 * <p>
	 * Salinity
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ConductivitySensor">ConductivitySensor</a>
	 */
	public static final IRI CONDUCTIVITY_SENSOR;

	/**
	 * Construction Work
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ConstructionWork}.
	 * <p>
	 * Source of the sound was a construction work
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ConstructionWork">ConstructionWork</a>
	 */
	public static final IRI CONSTRUCTION_WORK;

	/**
	 * Carbon Monoxide (CO) Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#COSensor}.
	 * <p>
	 * Carbon Monoxide (CO) Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#COSensor">COSensor</a>
	 */
	public static final IRI C_O_SENSOR;

	/**
	 * Coulomb
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Coulomb}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Coulomb">Coulomb</a>
	 */
	public static final IRI COULOMB;

	/**
	 * Crowd
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Crowd}.
	 * <p>
	 * Source of the sound was crowd
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Crowd">Crowd</a>
	 */
	public static final IRI CROWD;

	/**
	 * Cupboard
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Cupboard}.
	 * <p>
	 * An actuator to automatically open/close the cupboard.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Cupboard">Cupboard</a>
	 */
	public static final IRI CUPBOARD;

	/**
	 * Curtain
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Curtain}.
	 * <p>
	 * An actuator to automatically open/close the curtain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Curtain">Curtain</a>
	 */
	public static final IRI CURTAIN;

	/**
	 * Day
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Day}.
	 * <p>
	 * Day
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Day">Day</a>
	 */
	public static final IRI DAY;

	/**
	 * Decibel (db)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Decibel}.
	 * <p>
	 * A ratio unit which is an indicator of sound power per unit area.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Decibel">Decibel</a>
	 */
	public static final IRI DECIBEL;

	/**
	 * DecibelA (db)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DecibelA}.
	 * <p>
	 * A ratio unit which is an indicator of sound power per unit area.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DecibelA">DecibelA</a>
	 */
	public static final IRI DECIBEL_A;

	/**
	 * Degree
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Degree}.
	 * <p>
	 * Degree
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Degree">Degree</a>
	 */
	public static final IRI DEGREE;

	/**
	 * Degree Celsius
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DegreeCelsius}.
	 * <p>
	 * A temperature unit which is equal to one kelvin degree. However, they
	 * have their zeros at different points. The centigrade scale has its
	 * zero at 273.15 K.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DegreeCelsius">DegreeCelsius</a>
	 */
	public static final IRI DEGREE_CELSIUS;

	/**
	 * Degree Fahrenheit
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DegreeFahrenheit}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DegreeFahrenheit">DegreeFahrenheit</a>
	 */
	public static final IRI DEGREE_FAHRENHEIT;

	/**
	 * Delta Dew Point
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DeltaDewPoint}.
	 * <p>
	 * Difference between Dewpoint and surface temperatures
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DeltaDewPoint">DeltaDewPoint</a>
	 */
	public static final IRI DELTA_DEW_POINT;

	/**
	 * Delta Dew Point Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DeltaDewPointSensor}.
	 * <p>
	 * Difference between Dewpoint and surface temperatures. The Com4Innov
	 * testbed is providing delta dew point sensor.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DeltaDewPointSensor">DeltaDewPointSensor</a>
	 */
	public static final IRI DELTA_DEW_POINT_SENSOR;

	/**
	 * Dew Point
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DewPoint}.
	 * <p>
	 * It is the temperature to which air must be cooled at constant pressure
	 * and water content to reach saturation. The Com4Innov testbed is
	 * providing dew point quantity kind.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DewPoint">DewPoint</a>
	 */
	public static final IRI DEW_POINT;

	/**
	 * Dew Point Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DewPointSensor}.
	 * <p>
	 * It is the temperature to which air must be cooled at constant pressure
	 * and water content to reach saturation. The Com4Innov testbed is
	 * providing dew point sensor.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DewPointSensor">DewPointSensor</a>
	 */
	public static final IRI DEW_POINT_SENSOR;

	/**
	 * Dew Point Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DewPointTemperature}.
	 * <p>
	 * The temperature at which dew forms and is a measure of atmospheric
	 * moisture. It is the temperature to which air must be cooled at
	 * constant pressure and water content to reach saturation.[1][2] A
	 * higher dew point indicates more moisture in the air; a dew point
	 * greater than 20 °C (68 °F) is considered uncomfortable and greater
	 * than 22 °C (72 °F) is considered to be extremely humid.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DewPointTemperature">DewPointTemperature</a>
	 */
	public static final IRI DEW_POINT_TEMPERATURE;

	/**
	 * Diastolic Blood Pressure
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DiastolicBloodPressure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DiastolicBloodPressure">DiastolicBloodPressure</a>
	 */
	public static final IRI DIASTOLIC_BLOOD_PRESSURE;

	/**
	 * Dimensionless
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Dimensionless}.
	 * <p>
	 * Without dimensions; having no appreciable or noteworthy extent.
	 * Without physical meaning.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Dimensionless">Dimensionless</a>
	 */
	public static final IRI DIMENSIONLESS;

	/**
	 * Direction
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Direction}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Direction">Direction</a>
	 */
	public static final IRI DIRECTION;

	/**
	 * Direction Azimuth
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DirectionAzimuth}.
	 * <p>
	 * The geodetic azimuth of the direction towards which an object is
	 * moving.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DirectionAzimuth">DirectionAzimuth</a>
	 */
	public static final IRI DIRECTION_AZIMUTH;

	/**
	 * Direction Heading
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DirectionHeading}.
	 * <p>
	 * The course or direction in which a object (vehicle, person, ...) is
	 * pointing or moving.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DirectionHeading">DirectionHeading</a>
	 */
	public static final IRI DIRECTION_HEADING;

	/**
	 * Dish Washer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DishWasher}.
	 * <p>
	 * An actuator to automatically switch on/off the dishwasher.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DishWasher">DishWasher</a>
	 */
	public static final IRI DISH_WASHER;

	/**
	 * Distance
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Distance}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Distance">Distance</a>
	 */
	public static final IRI DISTANCE;

	/**
	 * Distance Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DistanceSensor}.
	 * <p>
	 * Distance Sensor to detect the safety distance with other cars for
	 * instance (it can be a laser).
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DistanceSensor">DistanceSensor</a>
	 */
	public static final IRI DISTANCE_SENSOR;

	/**
	 * Domain Of Interest
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DomainOfInterest}.
	 * <p>
	 * Domain of Interest
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DomainOfInterest">DomainOfInterest</a>
	 */
	public static final IRI DOMAIN_OF_INTEREST;

	/**
	 * Door
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Door}.
	 * <p>
	 * An actuator to automatically open/close the door.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Door">Door</a>
	 */
	public static final IRI DOOR;

	/**
	 * Drawer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Drawer}.
	 * <p>
	 * An actuator to automatically open/close the drawer.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Drawer">Drawer</a>
	 */
	public static final IRI DRAWER;

	/**
	 * DVD
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#DVD}.
	 * <p>
	 * An RFID tag is embedded on DVD.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#DVD">DVD</a>
	 */
	public static final IRI D_V_D;

	/**
	 * European Air Quality Index (EAQI)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#EAQI}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#EAQI">EAQI</a>
	 */
	public static final IRI E_A_Q_I;

	/**
	 * ECG or EKG (Electrocardiogram)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ECG}.
	 * <p>
	 * ECG or EKG (Electrocardiogram)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ECG">ECG</a>
	 */
	public static final IRI E_C_G;

	/**
	 * Electrical Resistance
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricalResistance}.
	 * <p>
	 * The electrical resitance of an electrical conductor is the opposition
	 * to the passage of an electric current through that conductor.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricalResistance">ElectricalResistance</a>
	 */
	public static final IRI ELECTRICAL_RESISTANCE;

	/**
	 * Electrical Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricalSensor}.
	 * <p>
	 * Electrical Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricalSensor">ElectricalSensor</a>
	 */
	public static final IRI ELECTRICAL_SENSOR;

	/**
	 * Electric Charge
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricCharge}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricCharge">ElectricCharge</a>
	 */
	public static final IRI ELECTRIC_CHARGE;

	/**
	 * Electric Field
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricField}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricField">ElectricField</a>
	 */
	public static final IRI ELECTRIC_FIELD;

	/**
	 * Electric Field 1800 MHz
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricField1800MHz}.
	 * <p>
	 * A field of force associated with a moving electric charge equivalent
	 * to an electric field and a magnetic field at right angles to each
	 * other and to the direction of propagation. Applied to the 1800 MHz UHF
	 * band.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricField1800MHz">ElectricField1800MHz</a>
	 */
	public static final IRI ELECTRIC_FIELD1800_M_HZ;

	/**
	 * Electric Field 2100 MHz
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricField2100MHz}.
	 * <p>
	 * A field of force associated with a moving electric charge equivalent
	 * to an electric field and a magnetic field at right angles to each
	 * other and to the direction of propagation. Applied to the 2100 MHz UHF
	 * band.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricField2100MHz">ElectricField2100MHz</a>
	 */
	public static final IRI ELECTRIC_FIELD2100_M_HZ;

	/**
	 * Electric Field 2400 MHz
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricField2400MHz}.
	 * <p>
	 * A field of force associated with a moving electric charge equivalent
	 * to an electric field and a magnetic field at right angles to each
	 * other and to the direction of propagation. Applied to the 2400 MHz UHF
	 * band.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricField2400MHz">ElectricField2400MHz</a>
	 */
	public static final IRI ELECTRIC_FIELD2400_M_HZ;

	/**
	 * Electric Field 900 MHz
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricField900Mhz}.
	 * <p>
	 * A field of force associated with a moving electric charge equivalent
	 * to an electric field and a magnetic field at right angles to each
	 * other and to the direction of propagation. Applied to the 900 MHz UHF
	 * band.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricField900Mhz">ElectricField900Mhz</a>
	 */
	public static final IRI ELECTRIC_FIELD900_MHZ;

	/**
	 * Electric Potential
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ElectricPotential}.
	 * <p>
	 * Electric potential is the potential energy per unit charge associated
	 * with static (time-invariant) electric field.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ElectricPotential">ElectricPotential</a>
	 */
	public static final IRI ELECTRIC_POTENTIAL;

	/**
	 * Emotion
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Emotion}.
	 * <p>
	 * Affective Science, Emotion, Mood, Emotional State, Brain Wave as an
	 * Internet of Things (IoT) applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Emotion">Emotion</a>
	 */
	public static final IRI EMOTION;

	/**
	 * Energy
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Energy}.
	 * <p>
	 * Measure procuded by energy meter
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Energy">Energy</a>
	 */
	public static final IRI ENERGY;

	/**
	 * Energy FOI
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#EnergyFOI}.
	 * <p>
	 * Energy or Smart Grid as an Internet of Things (IoT) applicative
	 * domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#EnergyFOI">EnergyFOI</a>
	 */
	public static final IRI ENERGY_F_O_I;

	/**
	 * Energy Meter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#EnergyMeter}.
	 * <p>
	 * Sensor to measure energy
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#EnergyMeter">EnergyMeter</a>
	 */
	public static final IRI ENERGY_METER;

	/**
	 * Environment
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Environment}.
	 * <p>
	 * Environment (earthquake, flooding, fire, pollution) as an Internet of
	 * Things (IoT) applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Environment">Environment</a>
	 */
	public static final IRI ENVIRONMENT;

	/**
	 * ESP (Electronic Stability Program)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ESP}.
	 * <p>
	 * The actuator ESP (on/off)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ESP">ESP</a>
	 */
	public static final IRI E_S_P;

	/**
	 * Event
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Event}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Event">Event</a>
	 */
	public static final IRI EVENT;

	/**
	 * Experiment
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Experiment}.
	 * <p>
	 * Experiment based measurements
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Experiment">Experiment</a>
	 */
	public static final IRI EXPERIMENT;

	/**
	 * Fall Detector
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FallDetector}.
	 * <p>
	 * Fall detectors to detect if elderly people falls.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FallDetector">FallDetector</a>
	 */
	public static final IRI FALL_DETECTOR;

	/**
	 * Fan
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Fan}.
	 * <p>
	 * Source of the sound was Fan
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Fan">Fan</a>
	 */
	public static final IRI FAN;

	/**
	 * Farad
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Farad}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Farad">Farad</a>
	 */
	public static final IRI FARAD;

	/**
	 * Fill Level
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FillLevel}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FillLevel">FillLevel</a>
	 */
	public static final IRI FILL_LEVEL;

	/**
	 * Fill Level Gas Tank
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FillLevelGasTank}.
	 * <p>
	 * Ratio of volume of combustible exhaust fluid to the total volume of
	 * diesel exhaust fluid storage container.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FillLevelGasTank">FillLevelGasTank</a>
	 */
	public static final IRI FILL_LEVEL_GAS_TANK;

	/**
	 * Fill Level Gas Tank 1
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FillLevelGasTank1}.
	 * <p>
	 * Ratio of volume of combustible exhaust fluid to the total volume of
	 * diesel exhaust fluid storage container. This is the value for the
	 * primary tank of the vehicle.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FillLevelGasTank1">FillLevelGasTank1</a>
	 */
	public static final IRI FILL_LEVEL_GAS_TANK1;

	/**
	 * Fill Level Gas Tank 2
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FillLevelGasTank2}.
	 * <p>
	 * Ratio of volume of combustible exhaust fluid to the total volume of
	 * diesel exhaust fluid storage container. This is the value for the
	 * secondary tank of the vehicle.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FillLevelGasTank2">FillLevelGasTank2</a>
	 */
	public static final IRI FILL_LEVEL_GAS_TANK2;

	/**
	 * Fill Level Waste Container
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FillLevelWasteContainer}.
	 * <p>
	 * Ratio between the current filleage level and the total capacity of a
	 * waste container.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FillLevelWasteContainer">FillLevelWasteContainer</a>
	 */
	public static final IRI FILL_LEVEL_WASTE_CONTAINER;

	/**
	 * Fire
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Fire}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Fire">Fire</a>
	 */
	public static final IRI FIRE;

	/**
	 * Fog Lamp Actuator
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FogLamp}.
	 * <p>
	 * The actuator fog lamp (on/off)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FogLamp">FogLamp</a>
	 */
	public static final IRI FOG_LAMP;

	/**
	 * Food
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Food}.
	 * <p>
	 * An RFID tag is embedded on food.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Food">Food</a>
	 */
	public static final IRI FOOD;

	/**
	 * Food Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FoodTemperature}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FoodTemperature">FoodTemperature</a>
	 */
	public static final IRI FOOD_TEMPERATURE;

	/**
	 * Freezer, Chiller
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Freezer}.
	 * <p>
	 * An actuator to automatically open/close the freezer.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Freezer">Freezer</a>
	 */
	public static final IRI FREEZER;

	/**
	 * Frequency
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Frequency}.
	 * <p>
	 * Frequency
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Frequency">Frequency</a>
	 */
	public static final IRI FREQUENCY;

	/**
	 * Frequency Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FrequencySensor}.
	 * <p>
	 * Frequency Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FrequencySensor">FrequencySensor</a>
	 */
	public static final IRI FREQUENCY_SENSOR;

	/**
	 * Fridge, Refrigerator
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Fridge}.
	 * <p>
	 * An actuator to automatically switch on/off the fridge.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Fridge">Fridge</a>
	 */
	public static final IRI FRIDGE;

	/**
	 * Fuel Consumption
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FuelConsumption}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FuelConsumption">FuelConsumption</a>
	 */
	public static final IRI FUEL_CONSUMPTION;

	/**
	 * Fuel Consumption Instantaneous
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FuelConsumptionInstantaneous}.
	 * <p>
	 * A measure that displays the instantaneous fuel consumption of a
	 * vehicle during its operation.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FuelConsumptionInstantaneous">FuelConsumptionInstantaneous</a>
	 */
	public static final IRI FUEL_CONSUMPTION_INSTANTANEOUS;

	/**
	 * Fuel Consumption Total
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FuelConsumptionTotal}.
	 * <p>
	 * Accumulated amount of fuel used during vehicle operation.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FuelConsumptionTotal">FuelConsumptionTotal</a>
	 */
	public static final IRI FUEL_CONSUMPTION_TOTAL;

	/**
	 * Fuel Level Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#FuelLevel}.
	 * <p>
	 * Fuel Level Sensor is used in car.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#FuelLevel">FuelLevel</a>
	 */
	public static final IRI FUEL_LEVEL;

	/**
	 * Gas Detector
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#GasDetector}.
	 * <p>
	 * Gas Detector
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#GasDetector">GasDetector</a>
	 */
	public static final IRI GAS_DETECTOR;

	/**
	 * Gaseous Pollutant Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#GaseousPollutantSensor}.
	 * <p>
	 * Gaseous Pollutant Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#GaseousPollutantSensor">GaseousPollutantSensor</a>
	 */
	public static final IRI GASEOUS_POLLUTANT_SENSOR;

	/**
	 * Gauss
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Gauss}.
	 * <p>
	 * Gauss is a unit.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Gauss">Gauss</a>
	 */
	public static final IRI GAUSS;

	/**
	 * Glucometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Glucometer}.
	 * <p>
	 * Glucometer, Blood sugar, blood glucose level
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Glucometer">Glucometer</a>
	 */
	public static final IRI GLUCOMETER;

	/**
	 * GPS Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#GPSSensor}.
	 * <p>
	 * Used in iPhone4 which allows the phone to localize itself.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#GPSSensor">GPSSensor</a>
	 */
	public static final IRI G_P_S_SENSOR;

	/**
	 * Gram (g)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Gram}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Gram">Gram</a>
	 */
	public static final IRI GRAM;

	/**
	 * Gram Per Cubic Metre
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#GramPerCubicMetre}.
	 * <p>
	 * Gram Per Cubic Metre
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#GramPerCubicMetre">GramPerCubicMetre</a>
	 */
	public static final IRI GRAM_PER_CUBIC_METRE;

	/**
	 * Gram Per Liter (g/L)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#GramPerLiter}.
	 * <p>
	 * Gram per Liter
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#GramPerLiter">GramPerLiter</a>
	 */
	public static final IRI GRAM_PER_LITER;

	/**
	 * Gyrometer Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#GyrometerSensor}.
	 * <p>
	 * A gyrometer is an instrument which measures an angular speed.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#GyrometerSensor">GyrometerSensor</a>
	 */
	public static final IRI GYROMETER_SENSOR;

	/**
	 * Gyroscope Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#GyroscopeSensor}.
	 * <p>
	 * A gyroscope is a device for measuring or maintening orientation. In a
	 * home it can be attached to a broom, mop, etc. Used in iPhone 4.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#GyroscopeSensor">GyroscopeSensor</a>
	 */
	public static final IRI GYROSCOPE_SENSOR;

	/**
	 * H2S Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#H2SSensor}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#H2SSensor">H2SSensor</a>
	 */
	public static final IRI H2_S_SENSOR;

	/**
	 * {@code http://purl.org/iot/vocab/m3-lite#hasDirection}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#hasDirection">hasDirection</a>
	 */
	public static final IRI HAS_DIRECTION;

	/**
	 * has Domain Of Interest
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#hasDomainOfInterest}.
	 * <p>
	 * This property is used to classify devices by DomainOfInterest (e.g.,
	 * blood pressure sensor is used in healthcare)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#hasDomainOfInterest">hasDomainOfInterest</a>
	 */
	public static final IRI HAS_DOMAIN_OF_INTEREST;

	/**
	 * {@code http://purl.org/iot/vocab/m3-lite#hasMeasurementType}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#hasMeasurementType">hasMeasurementType</a>
	 */
	public static final IRI HAS_MEASUREMENT_TYPE;

	/**
	 * {@code http://purl.org/iot/vocab/m3-lite#hasSoundSource}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#hasSoundSource">hasSoundSource</a>
	 */
	public static final IRI HAS_SOUND_SOURCE;

	/**
	 * {@code http://purl.org/iot/vocab/m3-lite#hasSource}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#hasSource">hasSource</a>
	 */
	public static final IRI HAS_SOURCE;

	/**
	 * Health Care
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Health}.
	 * <p>
	 * Healthcare as an Internet of Things (IoT) applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Health">Health</a>
	 */
	public static final IRI HEALTH;

	/**
	 * Heart Beat
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#HeartBeat}.
	 * <p>
	 * Heart Beat, Heart Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#HeartBeat">HeartBeat</a>
	 */
	public static final IRI HEART_BEAT;

	/**
	 * Heart Beat Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#HeartBeatSensor}.
	 * <p>
	 * Heart Beat Sensor, Heart Rate, Breath Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#HeartBeatSensor">HeartBeatSensor</a>
	 */
	public static final IRI HEART_BEAT_SENSOR;

	/**
	 * Heating
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Heating}.
	 * <p>
	 * An actuator to automatically switch on/off the heating.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Heating">Heating</a>
	 */
	public static final IRI HEATING;

	/**
	 * Hertz
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Hertz}.
	 * <p>
	 * Hertz
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Hertz">Hertz</a>
	 */
	public static final IRI HERTZ;

	/**
	 * Hotel
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Hotel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Hotel">Hotel</a>
	 */
	public static final IRI HOTEL;

	/**
	 * Hour
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Hour}.
	 * <p>
	 * Hour of the day
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Hour">Hour</a>
	 */
	public static final IRI HOUR;

	/**
	 * Household Appliance Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#HouseholdApplianceTemperature}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#HouseholdApplianceTemperature">HouseholdApplianceTemperature</a>
	 */
	public static final IRI HOUSEHOLD_APPLIANCE_TEMPERATURE;

	/**
	 * Humidity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Humidity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Humidity">Humidity</a>
	 */
	public static final IRI HUMIDITY;

	/**
	 * Humidity Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#HumiditySensor}.
	 * <p>
	 * Humidity sensor or hygrometer is an instrument used for measuring the
	 * moisture concent in the environment.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#HumiditySensor">HumiditySensor</a>
	 */
	public static final IRI HUMIDITY_SENSOR;

	/**
	 * Hydrophone
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Hydrophone}.
	 * <p>
	 * A hydrophone is a microphone designed to be used underwater for
	 * recording or listening to underwater sound.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Hydrophone">Hydrophone</a>
	 */
	public static final IRI HYDROPHONE;

	/**
	 * Illuminance
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Illuminance}.
	 * <p>
	 * Illuminance is the total luminous flux incident on a surface, per unit
	 * area.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Illuminance">Illuminance</a>
	 */
	public static final IRI ILLUMINANCE;

	/**
	 * Image Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ImageSensor}.
	 * <p>
	 * Image Sensor (suggested by INRIA experiment)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ImageSensor">ImageSensor</a>
	 */
	public static final IRI IMAGE_SENSOR;

	/**
	 * Inch
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Inch}.
	 * <p>
	 * Lenght in inches
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Inch">Inch</a>
	 */
	public static final IRI INCH;

	/**
	 * Index
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Index}.
	 * <p>
	 * Arbitrary indirect reference which should be translated into
	 * meaningful measurements by using the corresponding decoding algorithm
	 * detailed in the resource description. In this case the returned values
	 * can only take certain values from a finite set.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Index">Index</a>
	 */
	public static final IRI INDEX;

	/**
	 * Downlink Latency
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#IntDlLatency}.
	 * <p>
	 * Downlink Latency
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#IntDlLatency">IntDlLatency</a>
	 */
	public static final IRI INT_DL_LATENCY;

	/**
	 * Downlink Throughput
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#intDlThroughputKbps}.
	 * <p>
	 * Downlink Throughput
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#intDlThroughputKbps">intDlThroughputKbps</a>
	 */
	public static final IRI INT_DL_THROUGHPUT_KBPS;

	/**
	 * Uplink Packet Loss
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#intUlPacketLoss}.
	 * <p>
	 * Uplink Packet Loss
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#intUlPacketLoss">intUlPacketLoss</a>
	 */
	public static final IRI INT_UL_PACKET_LOSS;

	/**
	 * Uplink Throughput
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#intUlThroughputKbps}.
	 * <p>
	 * Uplink Throughput
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#intUlThroughputKbps">intUlThroughputKbps</a>
	 */
	public static final IRI INT_UL_THROUGHPUT_KBPS;

	/**
	 * Invalid
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Invalid}.
	 * <p>
	 * If the measurement was tagged invalid
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Invalid">Invalid</a>
	 */
	public static final IRI INVALID;

	/**
	 * Irrigation
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Irrigation}.
	 * <p>
	 * An actuator to automatically irrigate or not.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Irrigation">Irrigation</a>
	 */
	public static final IRI IRRIGATION;

	/**
	 * Kelvin, Degree Kelvin
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Kelvin}.
	 * <p>
	 * Kelvin is a unit of measurement for temperature.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Kelvin">Kelvin</a>
	 */
	public static final IRI KELVIN;

	/**
	 * Kilo
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Kilo}.
	 * <p>
	 * Measure of wight
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Kilo">Kilo</a>
	 */
	public static final IRI KILO;

	/**
	 * Kilobits Per Second
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#KilobitsPerSecond}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#KilobitsPerSecond">KilobitsPerSecond</a>
	 */
	public static final IRI KILOBITS_PER_SECOND;

	/**
	 * Kilogram (kg)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Kilogram}.
	 * <p>
	 * The SI unit of mass, it is equal to the mass of the international
	 * prototype of the kilogram.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Kilogram">Kilogram</a>
	 */
	public static final IRI KILOGRAM;

	/**
	 * Kilogram Per Cubic Metre, Kilogram Per Cubic Meter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#KilogramPerCubicMetre}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#KilogramPerCubicMetre">KilogramPerCubicMetre</a>
	 */
	public static final IRI KILOGRAM_PER_CUBIC_METRE;

	/**
	 * Kilometer Per Hour
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#KilometerPerHour}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#KilometerPerHour">KilometerPerHour</a>
	 */
	public static final IRI KILOMETER_PER_HOUR;

	/**
	 * Kilometre, Kilometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Kilometre}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Kilometre">Kilometre</a>
	 */
	public static final IRI KILOMETRE;

	/**
	 * Kilo Watt Hour
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#KiloWattHour}.
	 * <p>
	 * Unit to measure electricity by electricity meter devicesy
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#KiloWattHour">KiloWattHour</a>
	 */
	public static final IRI KILO_WATT_HOUR;

	/**
	 * Lamp Actuator
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Lamp}.
	 * <p>
	 * An actuator to automatically switch on/off the lamp.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Lamp">Lamp</a>
	 */
	public static final IRI LAMP;

	/**
	 * Latitude
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Latitude}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Latitude">Latitude</a>
	 */
	public static final IRI LATITUDE;

	/**
	 * Lavatory
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Lavatory}.
	 * <p>
	 * An actuator to automatically switch on/off the lavatory.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Lavatory">Lavatory</a>
	 */
	public static final IRI LAVATORY;

	/**
	 * Leaf Wetness
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#LeafWetness}.
	 * <p>
	 * Leaf Wetness
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#LeafWetness">LeafWetness</a>
	 */
	public static final IRI LEAF_WETNESS;

	/**
	 * Leaf Wetness Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#LeafWetnessSensor}.
	 * <p>
	 * Leaf Wetness Sensor is used in agriculture to check whether the plants
	 * need to be watered.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#LeafWetnessSensor">LeafWetnessSensor</a>
	 */
	public static final IRI LEAF_WETNESS_SENSOR;

	/**
	 * Light Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#LightSensor}.
	 * <p>
	 * Light/Illuminance Sensor is used in iPhone4 to adjust the brightness
	 * of the screen.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#LightSensor">LightSensor</a>
	 */
	public static final IRI LIGHT_SENSOR;

	/**
	 * Liter, Litre
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Liter}.
	 * <p>
	 * A metric unit of capacity defined as the volume of one kilogram of
	 * water under standard conditions. It is equal to 1,000 cubic
	 * centimetres.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Liter">Liter</a>
	 */
	public static final IRI LITER;

	/**
	 * Litre Per 100 Kilometres, Liter Per 100 Kilometers
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#LitrePer100Kilometres}.
	 * <p>
	 * A consumption unit which is equal to the one of a vehicle which needs
	 * 1 fuel litre in order to traverse 100 kilometres.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#LitrePer100Kilometres">LitrePer100Kilometres</a>
	 */
	public static final IRI LITRE_PER100_KILOMETRES;

	/**
	 * Location
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Location}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Location">Location</a>
	 */
	public static final IRI LOCATION;

	/**
	 * Longitude
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Longitude}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Longitude">Longitude</a>
	 */
	public static final IRI LONGITUDE;

	/**
	 * Luggage
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Luggage}.
	 * <p>
	 * An RFID tag is embedded on luggage.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Luggage">Luggage</a>
	 */
	public static final IRI LUGGAGE;

	/**
	 * Lumen (lm)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Lumen}.
	 * <p>
	 * The SI unit of luminous flux, equal to the amount of light emitted per
	 * second in a unit solid angle of one steradian from a uniform source of
	 * one candela.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Lumen">Lumen</a>
	 */
	public static final IRI LUMEN;

	/**
	 * Luminous Flux
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#LuminousFlux}.
	 * <p>
	 * Luminous Flux is the measure of the perceived power of light.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#LuminousFlux">LuminousFlux</a>
	 */
	public static final IRI LUMINOUS_FLUX;

	/**
	 * Luminous Intensity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#LuminousIntensity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#LuminousIntensity">LuminousIntensity</a>
	 */
	public static final IRI LUMINOUS_INTENSITY;

	/**
	 * Lux (lx)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Lux}.
	 * <p>
	 * The SI unit of illuminance, equal to one lumen per square metre.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Lux">Lux</a>
	 */
	public static final IRI LUX;

	/**
	 * Magnetic Field
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MagneticField}.
	 * <p>
	 * Magnetic Field
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MagneticField">MagneticField</a>
	 */
	public static final IRI MAGNETIC_FIELD;

	/**
	 * Magnetic Flux Density
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MagneticFluxDensity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MagneticFluxDensity">MagneticFluxDensity</a>
	 */
	public static final IRI MAGNETIC_FLUX_DENSITY;

	/**
	 * Magnetic Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Magnetometer}.
	 * <p>
	 * Magnetic sensors or magnetometer sensors are attached to cupboards to
	 * deduce if they are opened or closed
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Magnetometer">Magnetometer</a>
	 */
	public static final IRI MAGNETOMETER;

	/**
	 * Manual
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Manual}.
	 * <p>
	 * If the measurement was taken when human effort was involved
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Manual">Manual</a>
	 */
	public static final IRI MANUAL;

	/**
	 * Mass
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Mass}.
	 * <p>
	 * Mass is a property that is a constant that indicates the resistance of
	 * a material against acceleration.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Mass">Mass</a>
	 */
	public static final IRI MASS;

	/**
	 * Measurement Type
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MeasurementType}.
	 * <p>
	 * Type of Measurement
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MeasurementType">MeasurementType</a>
	 */
	public static final IRI MEASUREMENT_TYPE;

	/**
	 * Meter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Meter}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Meter">Meter</a>
	 */
	public static final IRI METER;

	/**
	 * Meter Per Second (m/s)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MeterPerSecond}.
	 * <p>
	 * A speed/velocity unit which is equal to the speed of an object
	 * traveling 1 meter distance in one second.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MeterPerSecond">MeterPerSecond</a>
	 */
	public static final IRI METER_PER_SECOND;

	/**
	 * Meter Per Second Square
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MeterPerSecondSquare}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MeterPerSecondSquare">MeterPerSecondSquare</a>
	 */
	public static final IRI METER_PER_SECOND_SQUARE;

	/**
	 * Methane (CH4) Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MethaneSensor}.
	 * <p>
	 * Methane (CH4) Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MethaneSensor">MethaneSensor</a>
	 */
	public static final IRI METHANE_SENSOR;

	/**
	 * Microampere (uA)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Microampere}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Microampere">Microampere</a>
	 */
	public static final IRI MICROAMPERE;

	/**
	 * Microgram (ug)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Microgram}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Microgram">Microgram</a>
	 */
	public static final IRI MICROGRAM;

	/**
	 * Microgram Per Cubic Metre, Microgram Per Cubic Meter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MicrogramPerCubicMetre}.
	 * <p>
	 * Microgram per cubic metre is a unit of density defined as microgram
	 * divided by cubic metre. Milligram per cubic metre is a derived unit in
	 * the International System of Units.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MicrogramPerCubicMetre">MicrogramPerCubicMetre</a>
	 */
	public static final IRI MICROGRAM_PER_CUBIC_METRE;

	/**
	 * Microvolt (uV)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Microvolt}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Microvolt">Microvolt</a>
	 */
	public static final IRI MICROVOLT;

	/**
	 * Microwatt (uW)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Microwatt}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Microwatt">Microwatt</a>
	 */
	public static final IRI MICROWATT;

	/**
	 * Microwave
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Microwave}.
	 * <p>
	 * An actuator to automatically switch on/off the Microwave.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Microwave">Microwave</a>
	 */
	public static final IRI MICROWAVE;

	/**
	 * Mileage
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Mileage}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Mileage">Mileage</a>
	 */
	public static final IRI MILEAGE;

	/**
	 * Mileage Distance To Service
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MileageDistanceToService}.
	 * <p>
	 * The distance which can be travelled by the vehicle before the next
	 * service inspection is required. A negative distance is transmitted if
	 * the service inspection has been passed.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MileageDistanceToService">MileageDistanceToService</a>
	 */
	public static final IRI MILEAGE_DISTANCE_TO_SERVICE;

	/**
	 * Mileage Total
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MileageTotal}.
	 * <p>
	 * The total distance travelled by the particular vehicle since its
	 * initial production.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MileageTotal">MileageTotal</a>
	 */
	public static final IRI MILEAGE_TOTAL;

	/**
	 * Miles
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Miles}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Miles">Miles</a>
	 */
	public static final IRI MILES;

	/**
	 * Milliampere (mA)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Milliampere}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Milliampere">Milliampere</a>
	 */
	public static final IRI MILLIAMPERE;

	/**
	 * Millibar
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Millibar}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Millibar">Millibar</a>
	 */
	public static final IRI MILLIBAR;

	/**
	 * Milligram (mg)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Milligram}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Milligram">Milligram</a>
	 */
	public static final IRI MILLIGRAM;

	/**
	 * Milligram Per Cubic Metre, Milligram Per Cubic Meter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MilligramPerCubicMetre}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MilligramPerCubicMetre">MilligramPerCubicMetre</a>
	 */
	public static final IRI MILLIGRAM_PER_CUBIC_METRE;

	/**
	 * Milligram Per Square Metre
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MilligramPerSquareMetre}.
	 * <p>
	 * A dose unit which is equal to 1 milligram of a toxic or pharmaceutical
	 * substance per square meter of surface area of the recipient subject.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MilligramPerSquareMetre">MilligramPerSquareMetre</a>
	 */
	public static final IRI MILLIGRAM_PER_SQUARE_METRE;

	/**
	 * Millilitre
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Millilitre}.
	 * <p>
	 * Millilitre, Milliliter
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Millilitre">Millilitre</a>
	 */
	public static final IRI MILLILITRE;

	/**
	 * Millimeter Per Hour, Millimetre Per Hour
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MillimeterPerHour}.
	 * <p>
	 * One millimetre of rainfall is the equivalent of one litre of water per
	 * square metre in one hour.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MillimeterPerHour">MillimeterPerHour</a>
	 */
	public static final IRI MILLIMETER_PER_HOUR;

	/**
	 * Millimetre, Millimeter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Millimetre}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Millimetre">Millimetre</a>
	 */
	public static final IRI MILLIMETRE;

	/**
	 * Millisecond
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Millisecond}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Millisecond">Millisecond</a>
	 */
	public static final IRI MILLISECOND;

	/**
	 * Millivolt (mV)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Millivolt}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Millivolt">Millivolt</a>
	 */
	public static final IRI MILLIVOLT;

	/**
	 * Millivolt Per Meter, Millivolt Per Metre
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MillivoltPerMeter}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MillivoltPerMeter">MillivoltPerMeter</a>
	 */
	public static final IRI MILLIVOLT_PER_METER;

	/**
	 * Milliwatt (mW)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Milliwatt}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Milliwatt">Milliwatt</a>
	 */
	public static final IRI MILLIWATT;

	/**
	 * Minute Angle
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MinuteAngle}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MinuteAngle">MinuteAngle</a>
	 */
	public static final IRI MINUTE_ANGLE;

	/**
	 * Minute Time
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MinuteTime}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MinuteTime">MinuteTime</a>
	 */
	public static final IRI MINUTE_TIME;

	/**
	 * MmHg
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MmHg}.
	 * <p>
	 * mmHg unit is used to measure blood pressure measurements (systolic and
	 * diastolic).
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MmHg">MmHg</a>
	 */
	public static final IRI MM_HG;

	/**
	 * Mmol Per Liter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MmolPerLiter}.
	 * <p>
	 * MmolPerLiter unit to measure cholesterol
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MmolPerLiter">MmolPerLiter</a>
	 */
	public static final IRI MMOL_PER_LITER;

	/**
	 * Handover Execution
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MobHoExecSuccRate}.
	 * <p>
	 * Handover Execution
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MobHoExecSuccRate">MobHoExecSuccRate</a>
	 */
	public static final IRI MOB_HO_EXEC_SUCC_RATE;

	/**
	 * Handover Preparation Success Rate
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MobHoPrepSuccRate}.
	 * <p>
	 * Handover Preparation Success Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MobHoPrepSuccRate">MobHoPrepSuccRate</a>
	 */
	public static final IRI MOB_HO_PREP_SUCC_RATE;

	/**
	 * Handover Mobility Success Rate
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MobMobilitySuccRate}.
	 * <p>
	 * Handover Mobility Success Rate
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MobMobilitySuccRate">MobMobilitySuccRate</a>
	 */
	public static final IRI MOB_MOBILITY_SUCC_RATE;

	/**
	 * Monument
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Monument}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Monument">Monument</a>
	 */
	public static final IRI MONUMENT;

	/**
	 * Motion
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Motion}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Motion">Motion</a>
	 */
	public static final IRI MOTION;

	/**
	 * Motion State
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MotionState}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MotionState">MotionState</a>
	 */
	public static final IRI MOTION_STATE;

	/**
	 * Motion State Vehicle
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#MotionStateVehicle}.
	 * <p>
	 * Indicates whether motion of the vehicle is detected or not.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#MotionStateVehicle">MotionStateVehicle</a>
	 */
	public static final IRI MOTION_STATE_VEHICLE;

	/**
	 * Neighbors
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Neighbors}.
	 * <p>
	 * Source of the sound were noisy neighbors
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Neighbors">Neighbors</a>
	 */
	public static final IRI NEIGHBORS;

	/**
	 * NFC
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#NFC}.
	 * <p>
	 * A tagging device can be NFC (Near Field Communication)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#NFC">NFC</a>
	 */
	public static final IRI N_F_C;

	/**
	 * NH3 Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#NH3Sensor}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#NH3Sensor">NH3Sensor</a>
	 */
	public static final IRI N_H3_SENSOR;

	/**
	 * Nitrogen Dioxide (NO2) Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#NO2Sensor}.
	 * <p>
	 * E.g. provided by OpenIoT, gas sensor detecting levels of nitrogen
	 * dioxide (NO2)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#NO2Sensor">NO2Sensor</a>
	 */
	public static final IRI N_O2_SENSOR;

	/**
	 * Nitrogen Oxide (NO) Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#NOSensor}.
	 * <p>
	 * Nitrogen Oxide (NO) Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#NOSensor">NOSensor</a>
	 */
	public static final IRI N_O_SENSOR;

	/**
	 * Number Step
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#NumberStep}.
	 * <p>
	 * Number Step
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#NumberStep">NumberStep</a>
	 */
	public static final IRI NUMBER_STEP;

	/**
	 * Ozone (O3) Level Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#O3Sensor}.
	 * <p>
	 * E.g. provided by OpenIoT, gas sensor detecting levels of ozone (O3)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#O3Sensor">O3Sensor</a>
	 */
	public static final IRI O3_SENSOR;

	/**
	 * Presence Detector
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#OccupancyDetector}.
	 * <p>
	 * Presence detector, motion sensor, Pyroelectric IR Occupancy Detector,
	 * Intrusion Detector/ Trespassing, Infrared Sensor, Proximity sensor are
	 * used to detect human location. Used in iPhone4 to detect whtn the user
	 * holds the phone to her face to speak to diable touchscreen.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#OccupancyDetector">OccupancyDetector</a>
	 */
	public static final IRI OCCUPANCY_DETECTOR;

	/**
	 * Odometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Odometer}.
	 * <p>
	 * An odometer or odograph is an instrument that indicates distance
	 * traveled by a vehicle, such as bicycle or automobile.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Odometer">Odometer</a>
	 */
	public static final IRI ODOMETER;

	/**
	 * Ohm
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Ohm}.
	 * <p>
	 * Ohm is the unit of electrical resistance.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Ohm">Ohm</a>
	 */
	public static final IRI OHM;

	/**
	 * Okta
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Okta}.
	 * <p>
	 * Okta is the unit to measure the cloud cover
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Okta">Okta</a>
	 */
	public static final IRI OKTA;

	/**
	 * Others
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Others}.
	 * <p>
	 * Relates to phenomenon and unit that are not available currently in the
	 * current version of Taxonomy
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Others">Others</a>
	 */
	public static final IRI OTHERS;

	/**
	 * Oxygen Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#OxygenSensor}.
	 * <p>
	 * Oxygen Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#OxygenSensor">OxygenSensor</a>
	 */
	public static final IRI OXYGEN_SENSOR;

	/**
	 * Parking Space
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ParkingSpace}.
	 * <p>
	 * An RFID tag is embedded on parking space to detect if they are
	 * available or not.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ParkingSpace">ParkingSpace</a>
	 */
	public static final IRI PARKING_SPACE;

	/**
	 * Pascal
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Pascal}.
	 * <p>
	 * Unit for pressure (e.g., atmospheric pressure)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Pascal">Pascal</a>
	 */
	public static final IRI PASCAL;

	/**
	 * Passport
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Passport}.
	 * <p>
	 * An RFID tag is embedded on passport.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Passport">Passport</a>
	 */
	public static final IRI PASSPORT;

	/**
	 * Payment Card
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PaymentCard}.
	 * <p>
	 * An RFID tag is embedded on payment card.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PaymentCard">PaymentCard</a>
	 */
	public static final IRI PAYMENT_CARD;

	/**
	 * Pedometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Pedometer}.
	 * <p>
	 * Pedometer is used to count the number of steps when walking, running,
	 * etc.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Pedometer">Pedometer</a>
	 */
	public static final IRI PEDOMETER;

	/**
	 * Percent
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Percent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Percent">Percent</a>
	 */
	public static final IRI PERCENT;

	/**
	 * PH
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PH}.
	 * <p>
	 * PH
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PH">PH</a>
	 */
	public static final IRI P_H;

	/**
	 * PH Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PHSensor}.
	 * <p>
	 * PH Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PHSensor">PHSensor</a>
	 */
	public static final IRI P_H_SENSOR;

	/**
	 * Location
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Place}.
	 * <p>
	 * Location, Place, GPS coordinates as an Internet of Things (IoT)
	 * applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Place">Place</a>
	 */
	public static final IRI PLACE;

	/**
	 * Pollution
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Pollution}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Pollution">Pollution</a>
	 */
	public static final IRI POLLUTION;

	/**
	 * Position
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Position}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Position">Position</a>
	 */
	public static final IRI POSITION;

	/**
	 * Position Altitude
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PositionAltitude}.
	 * <p>
	 * The vertical distance above mean sea level.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PositionAltitude">PositionAltitude</a>
	 */
	public static final IRI POSITION_ALTITUDE;

	/**
	 * Position Latitude
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PositionLatitude}.
	 * <p>
	 * The angular distance north or south from the equator of a point on the
	 * earth's surface, measured on the meridian of the point.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PositionLatitude">PositionLatitude</a>
	 */
	public static final IRI POSITION_LATITUDE;

	/**
	 * Position Longitude
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PositionLongitude}.
	 * <p>
	 * The angular distance east or west on the earth's surface, measured by
	 * the angle contained between the meridian of a particular place and
	 * some prime meridian, as that of Greenwich, England, and expressed
	 * either in degrees or by some corresponding difference in time.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PositionLongitude">PositionLongitude</a>
	 */
	public static final IRI POSITION_LONGITUDE;

	/**
	 * Potassium
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Potassium}.
	 * <p>
	 * Blood Potassium Level
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Potassium">Potassium</a>
	 */
	public static final IRI POTASSIUM;

	/**
	 * Pound
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Pound}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Pound">Pound</a>
	 */
	public static final IRI POUND;

	/**
	 * Power
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Power}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Power">Power</a>
	 */
	public static final IRI POWER;

	/**
	 * PPM (parts per million)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PPM}.
	 * <p>
	 * Used by CO2 sensor level
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PPM">PPM</a>
	 */
	public static final IRI P_P_M;

	/**
	 * Precipitation
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Precipitation}.
	 * <p>
	 * Precipitation or rainfall measurements
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Precipitation">Precipitation</a>
	 */
	public static final IRI PRECIPITATION;

	/**
	 * Precipitation Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PrecipitationSensor}.
	 * <p>
	 * Precipitation Sensor, Pluviometer or Rainfall sensor is a sensor
	 * measuring the amount of precipitation/rainfall.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PrecipitationSensor">PrecipitationSensor</a>
	 */
	public static final IRI PRECIPITATION_SENSOR;

	/**
	 * Presence
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Presence}.
	 * <p>
	 * A person is in the room or not.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Presence">Presence</a>
	 */
	public static final IRI PRESENCE;

	/**
	 * Presence State
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PresenceState}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PresenceState">PresenceState</a>
	 */
	public static final IRI PRESENCE_STATE;

	/**
	 * Presence State Driver Card
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PresenceStateDriverCard}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PresenceStateDriverCard">PresenceStateDriverCard</a>
	 */
	public static final IRI PRESENCE_STATE_DRIVER_CARD;

	/**
	 * Presence State Driver Card 1
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PresenceStateDriverCard1}.
	 * <p>
	 * Indicates the presence of the first driver card.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PresenceStateDriverCard1">PresenceStateDriverCard1</a>
	 */
	public static final IRI PRESENCE_STATE_DRIVER_CARD1;

	/**
	 * Presence State Driver Card 2
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PresenceStateDriverCard2}.
	 * <p>
	 * Indicates the presence of the second driver card.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PresenceStateDriverCard2">PresenceStateDriverCard2</a>
	 */
	public static final IRI PRESENCE_STATE_DRIVER_CARD2;

	/**
	 * Presence State Emergency Vehicle
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PresenceStateEmergencyVehicle}.
	 * <p>
	 * The presence or absence of an emergency vehicle (ambulance, fire
	 * fighters, etc.).
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PresenceStateEmergencyVehicle">PresenceStateEmergencyVehicle</a>
	 */
	public static final IRI PRESENCE_STATE_EMERGENCY_VEHICLE;

	/**
	 * Presence State Parking
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PresenceStateParking}.
	 * <p>
	 * The presence or absence of a vehicle parked.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PresenceStateParking">PresenceStateParking</a>
	 */
	public static final IRI PRESENCE_STATE_PARKING;

	/**
	 * Presence State People
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PresenceStatePeople}.
	 * <p>
	 * The presence or absence of people passing.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PresenceStatePeople">PresenceStatePeople</a>
	 */
	public static final IRI PRESENCE_STATE_PEOPLE;

	/**
	 * Pressure
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Pressure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Pressure">Pressure</a>
	 */
	public static final IRI PRESSURE;

	/**
	 * Pressure Sensor (e.g., bed)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PressureSensor}.
	 * <p>
	 * A pressure sensor can be attached on the bed to infer if the user is
	 * lying, sleeping, sitting, bed occupancy, etc.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PressureSensor">PressureSensor</a>
	 */
	public static final IRI PRESSURE_SENSOR;

	/**
	 * Proximity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Proximity}.
	 * <p>
	 * Proximity
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Proximity">Proximity</a>
	 */
	public static final IRI PROXIMITY;

	/**
	 * Proximity Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ProximitySensor}.
	 * <p>
	 * Detect if something is within proximity of a sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ProximitySensor">ProximitySensor</a>
	 */
	public static final IRI PROXIMITY_SENSOR;

	/**
	 * Public Transit
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PublicTransit}.
	 * <p>
	 * Source of the sound was Public transit
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PublicTransit">PublicTransit</a>
	 */
	public static final IRI PUBLIC_TRANSIT;

	/**
	 * Pulse Oxymeter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#PulseOxymeter}.
	 * <p>
	 * Pulse Oxymeter, SpO2, Blood Oxygen Saturation Sensor are used to
	 * measure the concentration of oxygen in the blood.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#PulseOxymeter">PulseOxymeter</a>
	 */
	public static final IRI PULSE_OXYMETER;

	/**
	 * QR Code
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#QRCode}.
	 * <p>
	 * A tagging device can be QRCode
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#QRCode">QRCode</a>
	 */
	public static final IRI Q_R_CODE;

	/**
	 * Radian
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Radian}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Radian">Radian</a>
	 */
	public static final IRI RADIAN;

	/**
	 * Radian Per Second
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RadianPerSecond}.
	 * <p>
	 * The radian per second is defined as the change in the orientation of
	 * an object, in radians, every second. The radian per second is the SI
	 * unit of angular (rotational) speed.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RadianPerSecond">RadianPerSecond</a>
	 */
	public static final IRI RADIAN_PER_SECOND;

	/**
	 * Rainfall
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Rainfall}.
	 * <p>
	 * The depth of precipitation (water-equivalent) that accumulated over a
	 * measurement time quantity
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Rainfall">Rainfall</a>
	 */
	public static final IRI RAINFALL;

	/**
	 * Reactive Power
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ReactivePower}.
	 * <p>
	 * The portion of electricity that establishes and sustains the electric
	 * and magnetic fields of alternating-current equipment.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ReactivePower">ReactivePower</a>
	 */
	public static final IRI REACTIVE_POWER;

	/**
	 * Recognized Activity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RecognizedActivity}.
	 * <p>
	 * Activity Recognized
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RecognizedActivity">RecognizedActivity</a>
	 */
	public static final IRI RECOGNIZED_ACTIVITY;

	/**
	 * Relative Humidity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RelativeHumidity}.
	 * <p>
	 * The ratio of vapour pressure to saturation vapour pressure, where
	 * vapour pressure is the pressure exerted by the molecules of water
	 * vapour and saturation vapour pressure is the pressure exerted by
	 * molecules of water vapour in AIR that has attained saturation.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RelativeHumidity">RelativeHumidity</a>
	 */
	public static final IRI RELATIVE_HUMIDITY;

	/**
	 * Connected Users
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ResAverageLicConnectedUsers}.
	 * <p>
	 * Connected Users
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ResAverageLicConnectedUsers">ResAverageLicConnectedUsers</a>
	 */
	public static final IRI RES_AVERAGE_LIC_CONNECTED_USERS;

	/**
	 * Restaurant
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Restaurant}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Restaurant">Restaurant</a>
	 */
	public static final IRI RESTAURANT;

	/**
	 * ERAB Drop
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RetERabDrop}.
	 * <p>
	 * ERAB Drop
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RetERabDrop">RetERabDrop</a>
	 */
	public static final IRI RET_E_RAB_DROP;

	/**
	 * Revolutions Per Minute
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RevolutionsPerMinute}.
	 * <p>
	 * Revolutions per minute (abbreviated rpm, RPM, rev/min, r/min) is a
	 * measure of the frequency of rotation, specifically the number of
	 * rotations around a fixed axis in one minute. It is used as a measure
	 * of rotational speed of a mechanical component.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RevolutionsPerMinute">RevolutionsPerMinute</a>
	 */
	public static final IRI REVOLUTIONS_PER_MINUTE;

	/**
	 * RFID
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RFID}.
	 * <p>
	 * A tagging device can be RFID
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RFID">RFID</a>
	 */
	public static final IRI R_F_I_D;

	/**
	 * RFID Measurement Type
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RFIDQuantityKind}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RFIDQuantityKind">RFIDQuantityKind</a>
	 */
	public static final IRI R_F_I_D_QUANTITY_KIND;

	/**
	 * Road Occupancy
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RoadOccupancy}.
	 * <p>
	 * Ratio of time on which a road lane section is occupied by vehicles
	 * within a given period of time.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RoadOccupancy">RoadOccupancy</a>
	 */
	public static final IRI ROAD_OCCUPANCY;

	/**
	 * Road Surface Thermometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RoadSurfaceThermometer}.
	 * <p>
	 * Road Surface Thermometer
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RoadSurfaceThermometer">RoadSurfaceThermometer</a>
	 */
	public static final IRI ROAD_SURFACE_THERMOMETER;

	/**
	 * Road Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RoadTemperature}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RoadTemperature">RoadTemperature</a>
	 */
	public static final IRI ROAD_TEMPERATURE;

	/**
	 * Room Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RoomTemperature}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RoomTemperature">RoomTemperature</a>
	 */
	public static final IRI ROOM_TEMPERATURE;

	/**
	 * Rotational Speed
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RotationalSpeed}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RotationalSpeed">RotationalSpeed</a>
	 */
	public static final IRI ROTATIONAL_SPEED;

	/**
	 * Rotational Speed Engine
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#RotationalSpeedEngine}.
	 * <p>
	 * Rotational speed is a property that is the rate of rotation of a
	 * material around an axis, in this case the engine cylinders.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#RotationalSpeedEngine">RotationalSpeedEngine</a>
	 */
	public static final IRI ROTATIONAL_SPEED_ENGINE;

	/**
	 * Salinity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Salinity}.
	 * <p>
	 * Salinity
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Salinity">Salinity</a>
	 */
	public static final IRI SALINITY;

	/**
	 * Salt Meter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SaltMeter}.
	 * <p>
	 * Salt meter, salinity can be used in the fishery domain [Xiang Su et
	 * al. 2014]
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SaltMeter">SaltMeter</a>
	 */
	public static final IRI SALT_METER;

	/**
	 * Scale
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Scale}.
	 * <p>
	 * Arbitrary indirect reference which should be translated into
	 * meaningful measurements by using the corresponding decoding algorithm
	 * detailed in the resource description. In this case the returned values
	 * are part of a continuous variable which can take any numeric value.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Scale">Scale</a>
	 */
	public static final IRI SCALE;

	/**
	 * Seat Belt Tension Actuator (on/off)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SeatBeltTensionSensor}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SeatBeltTensionSensor">SeatBeltTensionSensor</a>
	 */
	public static final IRI SEAT_BELT_TENSION_SENSOR;

	/**
	 * Second Angle
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SecondAngle}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SecondAngle">SecondAngle</a>
	 */
	public static final IRI SECOND_ANGLE;

	/**
	 * Second Time
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SecondTime}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SecondTime">SecondTime</a>
	 */
	public static final IRI SECOND_TIME;

	/**
	 * Seismometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Seismometer}.
	 * <p>
	 * Seismometers are instruments that measure motions of the ground,
	 * including those of seismic waves generated by earthquakes, volcanic
	 * eruptions, and other seismic sources.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Seismometer">Seismometer</a>
	 */
	public static final IRI SEISMOMETER;

	/**
	 * Shake Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ShakeSensor}.
	 * <p>
	 * Shake sensors can deduce the quality of the road, earthquakes.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ShakeSensor">ShakeSensor</a>
	 */
	public static final IRI SHAKE_SENSOR;

	/**
	 * Shower
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Shower}.
	 * <p>
	 * An actuator to automatically switch on/off the shower.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Shower">Shower</a>
	 */
	public static final IRI SHOWER;

	/**
	 * Sink
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Sink}.
	 * <p>
	 * An actuator to automatically switch on/off the sink.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Sink">Sink</a>
	 */
	public static final IRI SINK;

	/**
	 * Sirens
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Sirens}.
	 * <p>
	 * Source of the sound were sirens either from ambulence, police car or
	 * factory etc
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Sirens">Sirens</a>
	 */
	public static final IRI SIRENS;

	/**
	 * Skin conductance, GSR
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SkinConductance}.
	 * <p>
	 * Skin conductance (or GSR: Galvanic Skin Response)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SkinConductance">SkinConductance</a>
	 */
	public static final IRI SKIN_CONDUCTANCE;

	/**
	 * Skin Conductance Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SkinConductanceSensor}.
	 * <p>
	 * Skin Conductance Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SkinConductanceSensor">SkinConductanceSensor</a>
	 */
	public static final IRI SKIN_CONDUCTANCE_SENSOR;

	/**
	 * Smoke Detector
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SmokeDetector}.
	 * <p>
	 * Smoke detectors/Fire Alarms can detect if there is a fire, the smoke.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SmokeDetector">SmokeDetector</a>
	 */
	public static final IRI SMOKE_DETECTOR;

	/**
	 * Snow Chains
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SnowChains}.
	 * <p>
	 * The actuator Snow chains (on/off)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SnowChains">SnowChains</a>
	 */
	public static final IRI SNOW_CHAINS;

	/**
	 * Sulphur Dioxide (SO2) Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SO2Sensor}.
	 * <p>
	 * Sulphur Dioxide (SO2) Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SO2Sensor">SO2Sensor</a>
	 */
	public static final IRI S_O2_SENSOR;

	/**
	 * Sodium
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Sodium}.
	 * <p>
	 * Blood Sodium level
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Sodium">Sodium</a>
	 */
	public static final IRI SODIUM;

	/**
	 * Soil
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Soil}.
	 * <p>
	 * Environment
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Soil">Soil</a>
	 */
	public static final IRI SOIL;

	/**
	 * Soil Humidity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoilHumidity}.
	 * <p>
	 * Soil Humidity
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoilHumidity">SoilHumidity</a>
	 */
	public static final IRI SOIL_HUMIDITY;

	/**
	 * Soil Humidity Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoilHumiditySensor}.
	 * <p>
	 * Soil Humidity sensor, Soil moisture, Hygrometer are an instrument used
	 * for measuring the soil moisture.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoilHumiditySensor">SoilHumiditySensor</a>
	 */
	public static final IRI SOIL_HUMIDITY_SENSOR;

	/**
	 * Soil Moisture Tension
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoilMoistureTension}.
	 * <p>
	 * The force per unit area required to remove film water from soil.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoilMoistureTension">SoilMoistureTension</a>
	 */
	public static final IRI SOIL_MOISTURE_TENSION;

	/**
	 * Soil Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoilTemperature}.
	 * <p>
	 * Soil temperature is the bulk temperature of the soil, not the surface
	 * (skin) temperature.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoilTemperature">SoilTemperature</a>
	 */
	public static final IRI SOIL_TEMPERATURE;

	/**
	 * Solar Radiation Measurement, PAR Measurement (Photosynthetically Active Radiation)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SolarRadiation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SolarRadiation">SolarRadiation</a>
	 */
	public static final IRI SOLAR_RADIATION;

	/**
	 * Solar Radiation Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SolarRadiationSensor}.
	 * <p>
	 * Solar Radiation Sensor. PAR (Photosynthetically Active Radiation)
	 * Sensor, Sun Light. Unit watts per square meter (w/m2)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SolarRadiationSensor">SolarRadiationSensor</a>
	 */
	public static final IRI SOLAR_RADIATION_SENSOR;

	/**
	 * Sound, Noise Level
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Sound}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Sound">Sound</a>
	 */
	public static final IRI SOUND;

	/**
	 * Sound Pressure Level
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoundPressureLevel}.
	 * <p>
	 * Sound pressure level is a logarithmic measure of the RMS sound
	 * pressure of a sound relative to a reference value, the threshold of
	 * hearing. The reference sound pressure was chosen conventionally to
	 * correspond to the quietest sound at 1000 Hz that the human ear can
	 * detect (20 uPa). In this case, the specific parameter is measured in
	 * an open environment.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoundPressureLevel">SoundPressureLevel</a>
	 */
	public static final IRI SOUND_PRESSURE_LEVEL;

	/**
	 * Sound Pressure Level Ambient
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoundPressureLevelAmbient}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoundPressureLevelAmbient">SoundPressureLevelAmbient</a>
	 */
	public static final IRI SOUND_PRESSURE_LEVEL_AMBIENT;

	/**
	 * Sound Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoundSensor}.
	 * <p>
	 * Sound Sensor, Noise level Sensor, Volume sensor, Microphone
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoundSensor">SoundSensor</a>
	 */
	public static final IRI SOUND_SENSOR;

	/**
	 * Sound Source
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SoundSource}.
	 * <p>
	 * Source where the sound originated
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SoundSource">SoundSource</a>
	 */
	public static final IRI SOUND_SOURCE;

	/**
	 * Source
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Source}.
	 * <p>
	 * Environmental Source
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Source">Source</a>
	 */
	public static final IRI SOURCE;

	/**
	 * Speed
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Speed}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Speed">Speed</a>
	 */
	public static final IRI SPEED;

	/**
	 * Speed Average
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SpeedAverage}.
	 * <p>
	 * A measure of the average rate of motion of an object.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SpeedAverage">SpeedAverage</a>
	 */
	public static final IRI SPEED_AVERAGE;

	/**
	 * Speed Instantaneous
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SpeedInstantaneous}.
	 * <p>
	 * A measure of the instantaneous rate of motion of an object.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SpeedInstantaneous">SpeedInstantaneous</a>
	 */
	public static final IRI SPEED_INSTANTANEOUS;

	/**
	 * Speed Median
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SpeedMedian}.
	 * <p>
	 * A measure of the median rate of motion of an object.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SpeedMedian">SpeedMedian</a>
	 */
	public static final IRI SPEED_MEDIAN;

	/**
	 * Car Speed Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SpeedSensor}.
	 * <p>
	 * Car Speed Sensor, speedometer or Velocity used in a car
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SpeedSensor">SpeedSensor</a>
	 */
	public static final IRI SPEED_SENSOR;

	/**
	 * SPO2
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SPO2}.
	 * <p>
	 * SPO2 Measurement
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SPO2">SPO2</a>
	 */
	public static final IRI S_P_O2;

	/**
	 * Sun Position Direction
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SunPositionDirection}.
	 * <p>
	 * To detect sun from north eastm, south or west. Unit Degree
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SunPositionDirection">SunPositionDirection</a>
	 */
	public static final IRI SUN_POSITION_DIRECTION;

	/**
	 * Sun Position Direction Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SunPositionDirectionSensor}.
	 * <p>
	 * To detect sun from north eastm, south or west. Unit Degree
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SunPositionDirectionSensor">SunPositionDirectionSensor</a>
	 */
	public static final IRI SUN_POSITION_DIRECTION_SENSOR;

	/**
	 * Sun Position Elevation
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SunPositionElevation}.
	 * <p>
	 * To detect sun state (day, twilight, night, etc). Unit Degree
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SunPositionElevation">SunPositionElevation</a>
	 */
	public static final IRI SUN_POSITION_ELEVATION;

	/**
	 * Sun Position Elevation Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SunPositionElevationSensor}.
	 * <p>
	 * To detect sun state (day, twilight, night, etc). Unit Degree
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SunPositionElevationSensor">SunPositionElevationSensor</a>
	 */
	public static final IRI SUN_POSITION_ELEVATION_SENSOR;

	/**
	 * Systolic Blood Pressure
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#SystolicBloodPressure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#SystolicBloodPressure">SystolicBloodPressure</a>
	 */
	public static final IRI SYSTOLIC_BLOOD_PRESSURE;

	/**
	 * Telephone
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Telephone}.
	 * <p>
	 * An actuator to automatically switch on/off the Telephone.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Telephone">Telephone</a>
	 */
	public static final IRI TELEPHONE;

	/**
	 * Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Temperature}.
	 * <p>
	 * By defaut, Air temperature
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Temperature">Temperature</a>
	 */
	public static final IRI TEMPERATURE;

	/**
	 * Temperature Engine
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TemperatureEngine}.
	 * <p>
	 * The temperature of a vehicle engine.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TemperatureEngine">TemperatureEngine</a>
	 */
	public static final IRI TEMPERATURE_ENGINE;

	/**
	 * Temperature Waste Container
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TemperatureWasteContainer}.
	 * <p>
	 * The temperature of the air that would be indicated by a thermometer
	 * exposed to the air inside a waste container.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TemperatureWasteContainer">TemperatureWasteContainer</a>
	 */
	public static final IRI TEMPERATURE_WASTE_CONTAINER;

	/**
	 * Tesla
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Tesla}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Tesla">Tesla</a>
	 */
	public static final IRI TESLA;

	/**
	 * Thermometer
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Thermometer}.
	 * <p>
	 * A thermometer to measure the temperature in a room or outside
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Thermometer">Thermometer</a>
	 */
	public static final IRI THERMOMETER;

	/**
	 * Throttle Position Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#ThrottleSensor}.
	 * <p>
	 * Throttle Position Sensor is used in cars.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#ThrottleSensor">ThrottleSensor</a>
	 */
	public static final IRI THROTTLE_SENSOR;

	/**
	 * Time
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Time}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Time">Time</a>
	 */
	public static final IRI TIME;

	/**
	 * Time Related State
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TimeRelatedState}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TimeRelatedState">TimeRelatedState</a>
	 */
	public static final IRI TIME_RELATED_STATE;

	/**
	 * Time Related State Driver
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TimeRelatedStateDriver}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TimeRelatedStateDriver">TimeRelatedStateDriver</a>
	 */
	public static final IRI TIME_RELATED_STATE_DRIVER;

	/**
	 * Time Related State Driver 1
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TimeRelatedStateDriver1}.
	 * <p>
	 * Indicates if the first driver approaches or exceeds working time
	 * limits (or other limits).
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TimeRelatedStateDriver1">TimeRelatedStateDriver1</a>
	 */
	public static final IRI TIME_RELATED_STATE_DRIVER1;

	/**
	 * Time Related State Driver 2
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TimeRelatedStateDriver2}.
	 * <p>
	 * Indicates if the second driver approaches or exceeds working time
	 * limits (or other limits).
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TimeRelatedStateDriver2">TimeRelatedStateDriver2</a>
	 */
	public static final IRI TIME_RELATED_STATE_DRIVER2;

	/**
	 * Timestamp
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Timestamp}.
	 * <p>
	 * Sequence of characters or encoded information identifying when a
	 * certain event occurred, usually giving date and time of day, sometimes
	 * accurate to a small fraction of a second. This representation should
	 * be encoded following ISO8601.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Timestamp">Timestamp</a>
	 */
	public static final IRI TIMESTAMP;

	/**
	 * Toll
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Toll}.
	 * <p>
	 * An RFID tag is embedded on electronic toll system.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Toll">Toll</a>
	 */
	public static final IRI TOLL;

	/**
	 * Tonne
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Tonne}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Tonne">Tonne</a>
	 */
	public static final IRI TONNE;

	/**
	 * Touch Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TouchSensor}.
	 * <p>
	 * Touch Sensor (suggested by INRIA experiment)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TouchSensor">TouchSensor</a>
	 */
	public static final IRI TOUCH_SENSOR;

	/**
	 * Tourism
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Tourism}.
	 * <p>
	 * Tourism as an Internet of Things (IoT) applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Tourism">Tourism</a>
	 */
	public static final IRI TOIRISM;

	/**
	 * Tracking Animal
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingAnimal}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingAnimal">TrackingAnimal</a>
	 */
	public static final IRI TRACKING_ANIMAL;

	/**
	 * Tracking Book
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingBook}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingBook">TrackingBook</a>
	 */
	public static final IRI TRACKING_BOOK;

	/**
	 * Tracking CD
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingCD}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingCD">TrackingCD</a>
	 */
	public static final IRI TRACKING_C_D;

	/**
	 * Tracking Clothing
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingClothing}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingClothing">TrackingClothing</a>
	 */
	public static final IRI TRACKING_CLOTHING;

	/**
	 * Tracking DVD
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingDVD}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingDVD">TrackingDVD</a>
	 */
	public static final IRI TRACKING_D_V_D;

	/**
	 * Tracking Food
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingFood}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingFood">TrackingFood</a>
	 */
	public static final IRI TRACKING_FOOD;

	/**
	 * Tracking RFID Goods
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingGood}.
	 * <p>
	 * Tracking RFID Goods as an Internet of Things (IoT) applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingGood">TrackingGood</a>
	 */
	public static final IRI TRACKING_GOOD;

	/**
	 * Tracking Luggage
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingLuggage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingLuggage">TrackingLuggage</a>
	 */
	public static final IRI TRACKING_LUGGAGE;

	/**
	 * Tracking Parking Space
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingParkingSpace}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingParkingSpace">TrackingParkingSpace</a>
	 */
	public static final IRI TRACKING_PARKING_SPACE;

	/**
	 * Tracking Passport
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingPassport}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingPassport">TrackingPassport</a>
	 */
	public static final IRI TRACKING_PASSPORT;

	/**
	 * Tracking Payment Card
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingPaymentCard}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingPaymentCard">TrackingPaymentCard</a>
	 */
	public static final IRI TRACKING_PAYMENT_CARD;

	/**
	 * Tracking Toll
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingToll}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingToll">TrackingToll</a>
	 */
	public static final IRI TRACKING_TOLL;

	/**
	 * Tracking Transit Pass
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrackingTransitPass}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrackingTransitPass">TrackingTransitPass</a>
	 */
	public static final IRI TRACKING_TRANSIT_PASS;

	/**
	 * Traffic
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Traffic}.
	 * <p>
	 * Source of the sound was traffic
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Traffic">Traffic</a>
	 */
	public static final IRI TRAFFIC;

	/**
	 * Traffic Congestion
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrafficCongestion}.
	 * <p>
	 * Descriptive level of road traffic congestion within a defined area.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrafficCongestion">TrafficCongestion</a>
	 */
	public static final IRI TRAFFIC_CONGESTION;

	/**
	 * Traffic Intensity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrafficIntensity}.
	 * <p>
	 * The intensity of a traffic flow is the number of vehicles passing a
	 * cross section of a road in a unit of time
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrafficIntensity">TrafficIntensity</a>
	 */
	public static final IRI TRAFFIC_INTENSITY;

	/**
	 * Traffic Jam
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TrafficJam}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TrafficJam">TrafficJam</a>
	 */
	public static final IRI TRAFFIC_JAM;

	/**
	 * Transit Pass
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TransitPass}.
	 * <p>
	 * CommutationTicket/ Transit pass
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TransitPass">TransitPass</a>
	 */
	public static final IRI TRANSIT_PASS;

	/**
	 * Transportation
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Transportation}.
	 * <p>
	 * Transportation, Smart Car/Vehicle, Intelligent Transport System (ITS)
	 * as an Internet of Things (IoT) applicative domain
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Transportation">Transportation</a>
	 */
	public static final IRI TRANSPORTATION;

	/**
	 * TV
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#TV}.
	 * <p>
	 * An actuator to automatically switch on/off the television.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#TV">TV</a>
	 */
	public static final IRI T_V;

	/**
	 * Ultrasonic Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#UltrasonicSensor}.
	 * <p>
	 * Ultrasonic sensors are used to deduce human posture in smart home for
	 * example.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#UltrasonicSensor">UltrasonicSensor</a>
	 */
	public static final IRI ULTRASONIC_SENSOR;

	/**
	 * Vehicle Count Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#VehicleCountSensor}.
	 * <p>
	 * To count the number of vehicles (e.g., used within the Citypulse
	 * project)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#VehicleCountSensor">VehicleCountSensor</a>
	 */
	public static final IRI VEHICLE_COUNT_SENSOR;

	/**
	 * Vehicle Overspeed State
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#VehicleOverspeedState}.
	 * <p>
	 * Indicates whether the vehicle is exceeding the legal speed limit.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#VehicleOverspeedState">VehicleOverspeedState</a>
	 */
	public static final IRI VEHICLE_OVERSPEED_STATE;

	/**
	 * Vehicles Per Minute
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#VehiclesPerMinute}.
	 * <p>
	 * Number of vehicles that traverse a concrete region of the space in one
	 * minute.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#VehiclesPerMinute">VehiclesPerMinute</a>
	 */
	public static final IRI VEHICLES_PER_MINUTE;

	/**
	 * Ventilation
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Ventilation}.
	 * <p>
	 * An actuator to automatically open/close the ventilation.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Ventilation">Ventilation</a>
	 */
	public static final IRI VENTILATION;

	/**
	 * Visibility
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Visibility}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Visibility">Visibility</a>
	 */
	public static final IRI VISIBILITY;

	/**
	 * Visibility Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#VisibilitySensor}.
	 * <p>
	 * Visibility sensor to detect fog
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#VisibilitySensor">VisibilitySensor</a>
	 */
	public static final IRI VISIBILITY_SENSOR;

	/**
	 * Volt
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Volt}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Volt">Volt</a>
	 */
	public static final IRI VOLT;

	/**
	 * Voltage Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#VoltageSensor}.
	 * <p>
	 * The Com4Innov testbed is providing voltage sensor.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#VoltageSensor">VoltageSensor</a>
	 */
	public static final IRI VOLTAGE_SENSOR;

	/**
	 * Volt Ampere Reactive, VAR
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#VoltAmpereReactive}.
	 * <p>
	 * In electric power transmission and distribution, volt-ampere reactive
	 * (var) is a unit in which reactive power is expressed in an AC electric
	 * power system.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#VoltAmpereReactive">VoltAmpereReactive</a>
	 */
	public static final IRI VOLT_AMPERE_REACTIVE;

	/**
	 * Washing Machine
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WashingMachine}.
	 * <p>
	 * An actuator to automatically switch on/off the washing machine.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WashingMachine">WashingMachine</a>
	 */
	public static final IRI WASHING_MACHINE;

	/**
	 * Water Flow
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WaterFlow}.
	 * <p>
	 * Water flow to detect if sinks, showers, baths or flushing are used.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WaterFlow">WaterFlow</a>
	 */
	public static final IRI WATER_FLOW;

	/**
	 * Water Level
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WaterLevel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WaterLevel">WaterLevel</a>
	 */
	public static final IRI WATER_LEVEL;

	/**
	 * Water Temperature
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WaterTemperature}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WaterTemperature">WaterTemperature</a>
	 */
	public static final IRI WATER_TEMPERATURE;

	/**
	 * Watt (W)
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Watt}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Watt">Watt</a>
	 */
	public static final IRI WATT;

	/**
	 * Watt Per Meter Square
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WattPerMeterSquare}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WattPerMeterSquare">WattPerMeterSquare</a>
	 */
	public static final IRI WATT_PER_METER_SQUARE;

	/**
	 * Watt Per Square Metre, Watt Per Square Meter
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WattPerSquareMeter}.
	 * <p>
	 * Unit to measure solar radiation
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WattPerSquareMeter">WattPerSquareMeter</a>
	 */
	public static final IRI WATT_PER_SQUARE_METER;

	/**
	 * Weather Forecasting
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Weather}.
	 * <p>
	 * Weather Forecasting, Meterology as an Internet of Things (IoT)
	 * applicative domain.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Weather">Weather</a>
	 */
	public static final IRI WEATHER;

	/**
	 * Weather Luminosity
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WeatherLuminosity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WeatherLuminosity">WeatherLuminosity</a>
	 */
	public static final IRI WEATHER_LUMINOSITY;

	/**
	 * Weather Precipitation
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WeatherPrecipitation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WeatherPrecipitation">WeatherPrecipitation</a>
	 */
	public static final IRI WEATHER_PRECIPITATION;

	/**
	 * Weight
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Weight}.
	 * <p>
	 * Weight
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Weight">Weight</a>
	 */
	public static final IRI WEIGHT;

	/**
	 * Weight Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WeightSensor}.
	 * <p>
	 * Weight Sensor can be used to weigh a person.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WeightSensor">WeightSensor</a>
	 */
	public static final IRI WEIGHT_SENSOR;

	/**
	 * Wind
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Wind}.
	 * <p>
	 * Wind
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Wind">Wind</a>
	 */
	public static final IRI WIND;

	/**
	 * Wind Chill
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WindChill}.
	 * <p>
	 * Wind chill
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WindChill">WindChill</a>
	 */
	public static final IRI WIND_CHILL;

	/**
	 * Wind Chill Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WindChillSensor}.
	 * <p>
	 * Wind Chill Sensor
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WindChillSensor">WindChillSensor</a>
	 */
	public static final IRI WIND_CHILL_SENSOR;

	/**
	 * Wind Direction
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WindDirection}.
	 * <p>
	 * The geodetic azimuth of the direction from which the wind is blowing.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WindDirection">WindDirection</a>
	 */
	public static final IRI WIND_DIRECTION;

	/**
	 * Wind Direction Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WindDirectionSensor}.
	 * <p>
	 * Wind Direction Sensor, unit in Degree
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WindDirectionSensor">WindDirectionSensor</a>
	 */
	public static final IRI WIND_DIRECTION_SENSOR;

	/**
	 * Window
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Window}.
	 * <p>
	 * An actuator to automatically open/close the window.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Window">Window</a>
	 */
	public static final IRI WINDOW;

	/**
	 * Wind Velocity, Wind Speed
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WindSpeed}.
	 * <p>
	 * The ratio of the distance covered by moving air to the time quantity
	 * taken to cover it.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WindSpeed">WindSpeed</a>
	 */
	public static final IRI WIND_SPEED;

	/**
	 * Wind Speed Sensor
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WindSpeedSensor}.
	 * <p>
	 * Wind Speed Sensor, Anemometer or Wind Velocity Sensor is used to
	 * measure the wind speed.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WindSpeedSensor">WindSpeedSensor</a>
	 */
	public static final IRI WIND_SPEED_SENSOR;

	/**
	 * Working State
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WorkingState}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WorkingState">WorkingState</a>
	 */
	public static final IRI WORKING_STATE;

	/**
	 * Working State Driver
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WorkingStateDriver}.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WorkingStateDriver">WorkingStateDriver</a>
	 */
	public static final IRI WORKING_STATE_DRIVER;

	/**
	 * Working State Driver 1
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WorkingStateDriver1}.
	 * <p>
	 * State of work of the first driver as defined in the FMS standard.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WorkingStateDriver1">WorkingStateDriver1</a>
	 */
	public static final IRI WORKING_STATE_DRIVER1;

	/**
	 * Working State Driver 2
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#WorkingStateDriver2}.
	 * <p>
	 * State of work of the second driver as defined in the FMS standard.
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#WorkingStateDriver2">WorkingStateDriver2</a>
	 */
	public static final IRI WORKING_STATE_DRIVER2;

	/**
	 * W/out
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Wout}.
	 * <p>
	 * This unit is used to measure delta dew point within the Com4Innov
	 * tesbed. Natural number (W/out unit)
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Wout">Wout</a>
	 */
	public static final IRI WOUT;

	/**
	 * Year
	 * <p>
	 * {@code http://purl.org/iot/vocab/m3-lite#Year}.
	 * <p>
	 * Year
	 *
	 * @see <a href="http://purl.org/iot/vocab/m3-lite#Year">Year</a>
	 */
	public static final IRI YEAR;

	static {
		A_B_S = IRI.create(M3_LITE.NAMESPACE, "ABS");
		ACCELERATION = IRI.create(M3_LITE.NAMESPACE, "Acceleration");
		ACCELERATION_INSTANTANEOUS = IRI.create(M3_LITE.NAMESPACE, "AccelerationInstantaneous");
		ACCELEROMETER = IRI.create(M3_LITE.NAMESPACE, "Accelerometer");
		ACC_INITIAL_E_RAB_ESTAB_SUCC_RATE = IRI.create(M3_LITE.NAMESPACE, "AccInitialERabEstabSuccRate");
		ACC_INITIAL_E_RAB_SETUP_SUCC_RATE = IRI.create(M3_LITE.NAMESPACE, "AccInitialERabSetupSuccRate");
		ACC_RRC_CONN_SETUP_SUCC_RATE = IRI.create(M3_LITE.NAMESPACE, "AccRrcConnSetupSuccRate");
		ACC_S1_SIG_ESTAB_SUCC_RATE = IRI.create(M3_LITE.NAMESPACE, "AccS1SigEstabSuccRate");
		ACTIVE_POWER = IRI.create(M3_LITE.NAMESPACE, "ActivePower");
		ACTIVITY = IRI.create(M3_LITE.NAMESPACE, "Activity");
		AGRICULTURE = IRI.create(M3_LITE.NAMESPACE, "Agriculture");
		AIR = IRI.create(M3_LITE.NAMESPACE, "Air");
		AIR_CONDITIONER = IRI.create(M3_LITE.NAMESPACE, "AirConditioner");
		AIR_POLLUTANT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "AirPollutantSensor");
		AIR_POLLUTION = IRI.create(M3_LITE.NAMESPACE, "AirPollution");
		AIR_QUALITY = IRI.create(M3_LITE.NAMESPACE, "AirQuality");
		AIR_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "AirTemperature");
		AIR_THERMOMETER = IRI.create(M3_LITE.NAMESPACE, "AirThermometer");
		ALARM_SYSTEM = IRI.create(M3_LITE.NAMESPACE, "AlarmSystem");
		ALCOHOL_LEVEL = IRI.create(M3_LITE.NAMESPACE, "AlcoholLevel");
		ALCOHOL_LEVEL_SENSOR = IRI.create(M3_LITE.NAMESPACE, "AlcoholLevelSensor");
		ALTITUDE = IRI.create(M3_LITE.NAMESPACE, "Altitude");
		AMPERE = IRI.create(M3_LITE.NAMESPACE, "Ampere");
		ANGULAR = IRI.create(M3_LITE.NAMESPACE, "Angular");
		ANIMAL = IRI.create(M3_LITE.NAMESPACE, "Animal");
		ANIMALS = IRI.create(M3_LITE.NAMESPACE, "Animals");
		ATMOSPHERIC_PRESSURE = IRI.create(M3_LITE.NAMESPACE, "AtmosphericPressure");
		ATMOSPHERIC_PRESSURE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "AtmosphericPressureSensor");
		AUTOMATIC = IRI.create(M3_LITE.NAMESPACE, "Automatic");
		BARCODE = IRI.create(M3_LITE.NAMESPACE, "Barcode");
		BATTERY_LEVEL = IRI.create(M3_LITE.NAMESPACE, "BatteryLevel");
		BEAT_PER_MINUTE = IRI.create(M3_LITE.NAMESPACE, "BeatPerMinute");
		BLIND = IRI.create(M3_LITE.NAMESPACE, "Blind");
		BLOOD_GLUCOSE = IRI.create(M3_LITE.NAMESPACE, "BloodGlucose");
		BLOOD_PRESSURE = IRI.create(M3_LITE.NAMESPACE, "BloodPressure");
		BLOOD_PRESSURE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "BloodPressureSensor");
		BOARD_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "BoardTemperature");
		BOARD_THERMOMETER = IRI.create(M3_LITE.NAMESPACE, "BoardThermometer");
		BODY_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "BodyTemperature");
		BODY_THERMOMETER = IRI.create(M3_LITE.NAMESPACE, "BodyThermometer");
		BOILER = IRI.create(M3_LITE.NAMESPACE, "Boiler");
		BOOK = IRI.create(M3_LITE.NAMESPACE, "Book");
		BUILDING_AUTOMATION = IRI.create(M3_LITE.NAMESPACE, "BuildingAutomation");
		BUILDING_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "BuildingTemperature");
		CALCIUM = IRI.create(M3_LITE.NAMESPACE, "Calcium");
		CALIBRATION = IRI.create(M3_LITE.NAMESPACE, "Calibration");
		CANDELA = IRI.create(M3_LITE.NAMESPACE, "Candela");
		CAPACITANCE = IRI.create(M3_LITE.NAMESPACE, "Capacitance");
		C_D = IRI.create(M3_LITE.NAMESPACE, "CD");
		CENTIBAR = IRI.create(M3_LITE.NAMESPACE, "Centibar");
		CENTIMETRE = IRI.create(M3_LITE.NAMESPACE, "Centimetre");
		CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION = IRI.create(M3_LITE.NAMESPACE, "ChemicalAgentAtmosphericConcentration");
		CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_AIR_PARTICLES = IRI.create(M3_LITE.NAMESPACE, "ChemicalAgentAtmosphericConcentrationAirParticles");
		CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_C_O = IRI.create(M3_LITE.NAMESPACE, "ChemicalAgentAtmosphericConcentrationCO");
		CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_N_O2 = IRI.create(M3_LITE.NAMESPACE, "ChemicalAgentAtmosphericConcentrationNO2");
		CHEMICAL_AGENT_ATMOSPHERIC_CONCENTRATION_O3 = IRI.create(M3_LITE.NAMESPACE, "chemicalAgentAtmosphericConcentrationO3");
		CHOLESTEROL = IRI.create(M3_LITE.NAMESPACE, "Cholesterol");
		CHOLESTEROL_SENSOR = IRI.create(M3_LITE.NAMESPACE, "CholesterolSensor");
		CITY = IRI.create(M3_LITE.NAMESPACE, "City");
		CLOTHING = IRI.create(M3_LITE.NAMESPACE, "Clothing");
		CLOUD_COVER = IRI.create(M3_LITE.NAMESPACE, "CloudCover");
		CLOUD_COVER_SENSOR = IRI.create(M3_LITE.NAMESPACE, "CloudCoverSensor");
		C_O2 = IRI.create(M3_LITE.NAMESPACE, "CO2");
		C_O2_SENSOR = IRI.create(M3_LITE.NAMESPACE, "CO2Sensor");
		COFFEE_MACHINE = IRI.create(M3_LITE.NAMESPACE, "CoffeeMachine");
		COMMUNICATION = IRI.create(M3_LITE.NAMESPACE, "Communication");
		COMPUTER = IRI.create(M3_LITE.NAMESPACE, "Computer");
		CONDUCTIVITY = IRI.create(M3_LITE.NAMESPACE, "Conductivity");
		CONDUCTIVITY_SENSOR = IRI.create(M3_LITE.NAMESPACE, "ConductivitySensor");
		CONSTRUCTION_WORK = IRI.create(M3_LITE.NAMESPACE, "ConstructionWork");
		C_O_SENSOR = IRI.create(M3_LITE.NAMESPACE, "COSensor");
		COULOMB = IRI.create(M3_LITE.NAMESPACE, "Coulomb");
		CROWD = IRI.create(M3_LITE.NAMESPACE, "Crowd");
		CUPBOARD = IRI.create(M3_LITE.NAMESPACE, "Cupboard");
		CURTAIN = IRI.create(M3_LITE.NAMESPACE, "Curtain");
		DAY = IRI.create(M3_LITE.NAMESPACE, "Day");
		DECIBEL = IRI.create(M3_LITE.NAMESPACE, "Decibel");
		DECIBEL_A = IRI.create(M3_LITE.NAMESPACE, "DecibelA");
		DEGREE = IRI.create(M3_LITE.NAMESPACE, "Degree");
		DEGREE_CELSIUS = IRI.create(M3_LITE.NAMESPACE, "DegreeCelsius");
		DEGREE_FAHRENHEIT = IRI.create(M3_LITE.NAMESPACE, "DegreeFahrenheit");
		DELTA_DEW_POINT = IRI.create(M3_LITE.NAMESPACE, "DeltaDewPoint");
		DELTA_DEW_POINT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "DeltaDewPointSensor");
		DEW_POINT = IRI.create(M3_LITE.NAMESPACE, "DewPoint");
		DEW_POINT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "DewPointSensor");
		DEW_POINT_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "DewPointTemperature");
		DIASTOLIC_BLOOD_PRESSURE = IRI.create(M3_LITE.NAMESPACE, "DiastolicBloodPressure");
		DIMENSIONLESS = IRI.create(M3_LITE.NAMESPACE, "Dimensionless");
		DIRECTION = IRI.create(M3_LITE.NAMESPACE, "Direction");
		DIRECTION_AZIMUTH = IRI.create(M3_LITE.NAMESPACE, "DirectionAzimuth");
		DIRECTION_HEADING = IRI.create(M3_LITE.NAMESPACE, "DirectionHeading");
		DISH_WASHER = IRI.create(M3_LITE.NAMESPACE, "DishWasher");
		DISTANCE = IRI.create(M3_LITE.NAMESPACE, "Distance");
		DISTANCE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "DistanceSensor");
		DOMAIN_OF_INTEREST = IRI.create(M3_LITE.NAMESPACE, "DomainOfInterest");
		DOOR = IRI.create(M3_LITE.NAMESPACE, "Door");
		DRAWER = IRI.create(M3_LITE.NAMESPACE, "Drawer");
		D_V_D = IRI.create(M3_LITE.NAMESPACE, "DVD");
		E_A_Q_I = IRI.create(M3_LITE.NAMESPACE, "EAQI");
		E_C_G = IRI.create(M3_LITE.NAMESPACE, "ECG");
		ELECTRICAL_RESISTANCE = IRI.create(M3_LITE.NAMESPACE, "ElectricalResistance");
		ELECTRICAL_SENSOR = IRI.create(M3_LITE.NAMESPACE, "ElectricalSensor");
		ELECTRIC_CHARGE = IRI.create(M3_LITE.NAMESPACE, "ElectricCharge");
		ELECTRIC_FIELD = IRI.create(M3_LITE.NAMESPACE, "ElectricField");
		ELECTRIC_FIELD1800_M_HZ = IRI.create(M3_LITE.NAMESPACE, "ElectricField1800MHz");
		ELECTRIC_FIELD2100_M_HZ = IRI.create(M3_LITE.NAMESPACE, "ElectricField2100MHz");
		ELECTRIC_FIELD2400_M_HZ = IRI.create(M3_LITE.NAMESPACE, "ElectricField2400MHz");
		ELECTRIC_FIELD900_MHZ = IRI.create(M3_LITE.NAMESPACE, "ElectricField900Mhz");
		ELECTRIC_POTENTIAL = IRI.create(M3_LITE.NAMESPACE, "ElectricPotential");
		EMOTION = IRI.create(M3_LITE.NAMESPACE, "Emotion");
		ENERGY = IRI.create(M3_LITE.NAMESPACE, "Energy");
		ENERGY_F_O_I = IRI.create(M3_LITE.NAMESPACE, "EnergyFOI");
		ENERGY_METER = IRI.create(M3_LITE.NAMESPACE, "EnergyMeter");
		ENVIRONMENT = IRI.create(M3_LITE.NAMESPACE, "Environment");
		E_S_P = IRI.create(M3_LITE.NAMESPACE, "ESP");
		EVENT = IRI.create(M3_LITE.NAMESPACE, "Event");
		EXPERIMENT = IRI.create(M3_LITE.NAMESPACE, "Experiment");
		FALL_DETECTOR = IRI.create(M3_LITE.NAMESPACE, "FallDetector");
		FAN = IRI.create(M3_LITE.NAMESPACE, "Fan");
		FARAD = IRI.create(M3_LITE.NAMESPACE, "Farad");
		FILL_LEVEL = IRI.create(M3_LITE.NAMESPACE, "FillLevel");
		FILL_LEVEL_GAS_TANK = IRI.create(M3_LITE.NAMESPACE, "FillLevelGasTank");
		FILL_LEVEL_GAS_TANK1 = IRI.create(M3_LITE.NAMESPACE, "FillLevelGasTank1");
		FILL_LEVEL_GAS_TANK2 = IRI.create(M3_LITE.NAMESPACE, "FillLevelGasTank2");
		FILL_LEVEL_WASTE_CONTAINER = IRI.create(M3_LITE.NAMESPACE, "FillLevelWasteContainer");
		FIRE = IRI.create(M3_LITE.NAMESPACE, "Fire");
		FOG_LAMP = IRI.create(M3_LITE.NAMESPACE, "FogLamp");
		FOOD = IRI.create(M3_LITE.NAMESPACE, "Food");
		FOOD_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "FoodTemperature");
		FREEZER = IRI.create(M3_LITE.NAMESPACE, "Freezer");
		FREQUENCY = IRI.create(M3_LITE.NAMESPACE, "Frequency");
		FREQUENCY_SENSOR = IRI.create(M3_LITE.NAMESPACE, "FrequencySensor");
		FRIDGE = IRI.create(M3_LITE.NAMESPACE, "Fridge");
		FUEL_CONSUMPTION = IRI.create(M3_LITE.NAMESPACE, "FuelConsumption");
		FUEL_CONSUMPTION_INSTANTANEOUS = IRI.create(M3_LITE.NAMESPACE, "FuelConsumptionInstantaneous");
		FUEL_CONSUMPTION_TOTAL = IRI.create(M3_LITE.NAMESPACE, "FuelConsumptionTotal");
		FUEL_LEVEL = IRI.create(M3_LITE.NAMESPACE, "FuelLevel");
		GAS_DETECTOR = IRI.create(M3_LITE.NAMESPACE, "GasDetector");
		GASEOUS_POLLUTANT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "GaseousPollutantSensor");
		GAUSS = IRI.create(M3_LITE.NAMESPACE, "Gauss");
		GLUCOMETER = IRI.create(M3_LITE.NAMESPACE, "Glucometer");
		G_P_S_SENSOR = IRI.create(M3_LITE.NAMESPACE, "GPSSensor");
		GRAM = IRI.create(M3_LITE.NAMESPACE, "Gram");
		GRAM_PER_CUBIC_METRE = IRI.create(M3_LITE.NAMESPACE, "GramPerCubicMetre");
		GRAM_PER_LITER = IRI.create(M3_LITE.NAMESPACE, "GramPerLiter");
		GYROMETER_SENSOR = IRI.create(M3_LITE.NAMESPACE, "GyrometerSensor");
		GYROSCOPE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "GyroscopeSensor");
		H2_S_SENSOR = IRI.create(M3_LITE.NAMESPACE, "H2SSensor");
		HAS_DIRECTION = IRI.create(M3_LITE.NAMESPACE, "hasDirection");
		HAS_DOMAIN_OF_INTEREST = IRI.create(M3_LITE.NAMESPACE, "hasDomainOfInterest");
		HAS_MEASUREMENT_TYPE = IRI.create(M3_LITE.NAMESPACE, "hasMeasurementType");
		HAS_SOUND_SOURCE = IRI.create(M3_LITE.NAMESPACE, "hasSoundSource");
		HAS_SOURCE = IRI.create(M3_LITE.NAMESPACE, "hasSource");
		HEALTH = IRI.create(M3_LITE.NAMESPACE, "Health");
		HEART_BEAT = IRI.create(M3_LITE.NAMESPACE, "HeartBeat");
		HEART_BEAT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "HeartBeatSensor");
		HEATING = IRI.create(M3_LITE.NAMESPACE, "Heating");
		HERTZ = IRI.create(M3_LITE.NAMESPACE, "Hertz");
		HOTEL = IRI.create(M3_LITE.NAMESPACE, "Hotel");
		HOUR = IRI.create(M3_LITE.NAMESPACE, "Hour");
		HOUSEHOLD_APPLIANCE_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "HouseholdApplianceTemperature");
		HUMIDITY = IRI.create(M3_LITE.NAMESPACE, "Humidity");
		HUMIDITY_SENSOR = IRI.create(M3_LITE.NAMESPACE, "HumiditySensor");
		HYDROPHONE = IRI.create(M3_LITE.NAMESPACE, "Hydrophone");
		ILLUMINANCE = IRI.create(M3_LITE.NAMESPACE, "Illuminance");
		IMAGE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "ImageSensor");
		INCH = IRI.create(M3_LITE.NAMESPACE, "Inch");
		INDEX = IRI.create(M3_LITE.NAMESPACE, "Index");
		INT_DL_LATENCY = IRI.create(M3_LITE.NAMESPACE, "IntDlLatency");
		INT_DL_THROUGHPUT_KBPS = IRI.create(M3_LITE.NAMESPACE, "intDlThroughputKbps");
		INT_UL_PACKET_LOSS = IRI.create(M3_LITE.NAMESPACE, "intUlPacketLoss");
		INT_UL_THROUGHPUT_KBPS = IRI.create(M3_LITE.NAMESPACE, "intUlThroughputKbps");
		INVALID = IRI.create(M3_LITE.NAMESPACE, "Invalid");
		IRRIGATION = IRI.create(M3_LITE.NAMESPACE, "Irrigation");
		KELVIN = IRI.create(M3_LITE.NAMESPACE, "Kelvin");
		KILO = IRI.create(M3_LITE.NAMESPACE, "Kilo");
		KILOBITS_PER_SECOND = IRI.create(M3_LITE.NAMESPACE, "KilobitsPerSecond");
		KILOGRAM = IRI.create(M3_LITE.NAMESPACE, "Kilogram");
		KILOGRAM_PER_CUBIC_METRE = IRI.create(M3_LITE.NAMESPACE, "KilogramPerCubicMetre");
		KILOMETER_PER_HOUR = IRI.create(M3_LITE.NAMESPACE, "KilometerPerHour");
		KILOMETRE = IRI.create(M3_LITE.NAMESPACE, "Kilometre");
		KILO_WATT_HOUR = IRI.create(M3_LITE.NAMESPACE, "KiloWattHour");
		LAMP = IRI.create(M3_LITE.NAMESPACE, "Lamp");
		LATITUDE = IRI.create(M3_LITE.NAMESPACE, "Latitude");
		LAVATORY = IRI.create(M3_LITE.NAMESPACE, "Lavatory");
		LEAF_WETNESS = IRI.create(M3_LITE.NAMESPACE, "LeafWetness");
		LEAF_WETNESS_SENSOR = IRI.create(M3_LITE.NAMESPACE, "LeafWetnessSensor");
		LIGHT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "LightSensor");
		LITER = IRI.create(M3_LITE.NAMESPACE, "Liter");
		LITRE_PER100_KILOMETRES = IRI.create(M3_LITE.NAMESPACE, "LitrePer100Kilometres");
		LOCATION = IRI.create(M3_LITE.NAMESPACE, "Location");
		LONGITUDE = IRI.create(M3_LITE.NAMESPACE, "Longitude");
		LUGGAGE = IRI.create(M3_LITE.NAMESPACE, "Luggage");
		LUMEN = IRI.create(M3_LITE.NAMESPACE, "Lumen");
		LUMINOUS_FLUX = IRI.create(M3_LITE.NAMESPACE, "LuminousFlux");
		LUMINOUS_INTENSITY = IRI.create(M3_LITE.NAMESPACE, "LuminousIntensity");
		LUX = IRI.create(M3_LITE.NAMESPACE, "Lux");
		MAGNETIC_FIELD = IRI.create(M3_LITE.NAMESPACE, "MagneticField");
		MAGNETIC_FLUX_DENSITY = IRI.create(M3_LITE.NAMESPACE, "MagneticFluxDensity");
		MAGNETOMETER = IRI.create(M3_LITE.NAMESPACE, "Magnetometer");
		MANUAL = IRI.create(M3_LITE.NAMESPACE, "Manual");
		MASS = IRI.create(M3_LITE.NAMESPACE, "Mass");
		MEASUREMENT_TYPE = IRI.create(M3_LITE.NAMESPACE, "MeasurementType");
		METER = IRI.create(M3_LITE.NAMESPACE, "Meter");
		METER_PER_SECOND = IRI.create(M3_LITE.NAMESPACE, "MeterPerSecond");
		METER_PER_SECOND_SQUARE = IRI.create(M3_LITE.NAMESPACE, "MeterPerSecondSquare");
		METHANE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "MethaneSensor");
		MICROAMPERE = IRI.create(M3_LITE.NAMESPACE, "Microampere");
		MICROGRAM = IRI.create(M3_LITE.NAMESPACE, "Microgram");
		MICROGRAM_PER_CUBIC_METRE = IRI.create(M3_LITE.NAMESPACE, "MicrogramPerCubicMetre");
		MICROVOLT = IRI.create(M3_LITE.NAMESPACE, "Microvolt");
		MICROWATT = IRI.create(M3_LITE.NAMESPACE, "Microwatt");
		MICROWAVE = IRI.create(M3_LITE.NAMESPACE, "Microwave");
		MILEAGE = IRI.create(M3_LITE.NAMESPACE, "Mileage");
		MILEAGE_DISTANCE_TO_SERVICE = IRI.create(M3_LITE.NAMESPACE, "MileageDistanceToService");
		MILEAGE_TOTAL = IRI.create(M3_LITE.NAMESPACE, "MileageTotal");
		MILES = IRI.create(M3_LITE.NAMESPACE, "Miles");
		MILLIAMPERE = IRI.create(M3_LITE.NAMESPACE, "Milliampere");
		MILLIBAR = IRI.create(M3_LITE.NAMESPACE, "Millibar");
		MILLIGRAM = IRI.create(M3_LITE.NAMESPACE, "Milligram");
		MILLIGRAM_PER_CUBIC_METRE = IRI.create(M3_LITE.NAMESPACE, "MilligramPerCubicMetre");
		MILLIGRAM_PER_SQUARE_METRE = IRI.create(M3_LITE.NAMESPACE, "MilligramPerSquareMetre");
		MILLILITRE = IRI.create(M3_LITE.NAMESPACE, "Millilitre");
		MILLIMETER_PER_HOUR = IRI.create(M3_LITE.NAMESPACE, "MillimeterPerHour");
		MILLIMETRE = IRI.create(M3_LITE.NAMESPACE, "Millimetre");
		MILLISECOND = IRI.create(M3_LITE.NAMESPACE, "Millisecond");
		MILLIVOLT = IRI.create(M3_LITE.NAMESPACE, "Millivolt");
		MILLIVOLT_PER_METER = IRI.create(M3_LITE.NAMESPACE, "MillivoltPerMeter");
		MILLIWATT = IRI.create(M3_LITE.NAMESPACE, "Milliwatt");
		MINUTE_ANGLE = IRI.create(M3_LITE.NAMESPACE, "MinuteAngle");
		MINUTE_TIME = IRI.create(M3_LITE.NAMESPACE, "MinuteTime");
		MM_HG = IRI.create(M3_LITE.NAMESPACE, "MmHg");
		MMOL_PER_LITER = IRI.create(M3_LITE.NAMESPACE, "MmolPerLiter");
		MOB_HO_EXEC_SUCC_RATE = IRI.create(M3_LITE.NAMESPACE, "MobHoExecSuccRate");
		MOB_HO_PREP_SUCC_RATE = IRI.create(M3_LITE.NAMESPACE, "MobHoPrepSuccRate");
		MOB_MOBILITY_SUCC_RATE = IRI.create(M3_LITE.NAMESPACE, "MobMobilitySuccRate");
		MONUMENT = IRI.create(M3_LITE.NAMESPACE, "Monument");
		MOTION = IRI.create(M3_LITE.NAMESPACE, "Motion");
		MOTION_STATE = IRI.create(M3_LITE.NAMESPACE, "MotionState");
		MOTION_STATE_VEHICLE = IRI.create(M3_LITE.NAMESPACE, "MotionStateVehicle");
		NEIGHBORS = IRI.create(M3_LITE.NAMESPACE, "Neighbors");
		N_F_C = IRI.create(M3_LITE.NAMESPACE, "NFC");
		N_H3_SENSOR = IRI.create(M3_LITE.NAMESPACE, "NH3Sensor");
		N_O2_SENSOR = IRI.create(M3_LITE.NAMESPACE, "NO2Sensor");
		N_O_SENSOR = IRI.create(M3_LITE.NAMESPACE, "NOSensor");
		NUMBER_STEP = IRI.create(M3_LITE.NAMESPACE, "NumberStep");
		O3_SENSOR = IRI.create(M3_LITE.NAMESPACE, "O3Sensor");
		OCCUPANCY_DETECTOR = IRI.create(M3_LITE.NAMESPACE, "OccupancyDetector");
		ODOMETER = IRI.create(M3_LITE.NAMESPACE, "Odometer");
		OHM = IRI.create(M3_LITE.NAMESPACE, "Ohm");
		OKTA = IRI.create(M3_LITE.NAMESPACE, "Okta");
		OTHERS = IRI.create(M3_LITE.NAMESPACE, "Others");
		OXYGEN_SENSOR = IRI.create(M3_LITE.NAMESPACE, "OxygenSensor");
		PARKING_SPACE = IRI.create(M3_LITE.NAMESPACE, "ParkingSpace");
		PASCAL = IRI.create(M3_LITE.NAMESPACE, "Pascal");
		PASSPORT = IRI.create(M3_LITE.NAMESPACE, "Passport");
		PAYMENT_CARD = IRI.create(M3_LITE.NAMESPACE, "PaymentCard");
		PEDOMETER = IRI.create(M3_LITE.NAMESPACE, "Pedometer");
		PERCENT = IRI.create(M3_LITE.NAMESPACE, "Percent");
		P_H = IRI.create(M3_LITE.NAMESPACE, "PH");
		P_H_SENSOR = IRI.create(M3_LITE.NAMESPACE, "PHSensor");
		PLACE = IRI.create(M3_LITE.NAMESPACE, "Place");
		POLLUTION = IRI.create(M3_LITE.NAMESPACE, "Pollution");
		POSITION = IRI.create(M3_LITE.NAMESPACE, "Position");
		POSITION_ALTITUDE = IRI.create(M3_LITE.NAMESPACE, "PositionAltitude");
		POSITION_LATITUDE = IRI.create(M3_LITE.NAMESPACE, "PositionLatitude");
		POSITION_LONGITUDE = IRI.create(M3_LITE.NAMESPACE, "PositionLongitude");
		POTASSIUM = IRI.create(M3_LITE.NAMESPACE, "Potassium");
		POUND = IRI.create(M3_LITE.NAMESPACE, "Pound");
		POWER = IRI.create(M3_LITE.NAMESPACE, "Power");
		P_P_M = IRI.create(M3_LITE.NAMESPACE, "PPM");
		PRECIPITATION = IRI.create(M3_LITE.NAMESPACE, "Precipitation");
		PRECIPITATION_SENSOR = IRI.create(M3_LITE.NAMESPACE, "PrecipitationSensor");
		PRESENCE = IRI.create(M3_LITE.NAMESPACE, "Presence");
		PRESENCE_STATE = IRI.create(M3_LITE.NAMESPACE, "PresenceState");
		PRESENCE_STATE_DRIVER_CARD = IRI.create(M3_LITE.NAMESPACE, "PresenceStateDriverCard");
		PRESENCE_STATE_DRIVER_CARD1 = IRI.create(M3_LITE.NAMESPACE, "PresenceStateDriverCard1");
		PRESENCE_STATE_DRIVER_CARD2 = IRI.create(M3_LITE.NAMESPACE, "PresenceStateDriverCard2");
		PRESENCE_STATE_EMERGENCY_VEHICLE = IRI.create(M3_LITE.NAMESPACE, "PresenceStateEmergencyVehicle");
		PRESENCE_STATE_PARKING = IRI.create(M3_LITE.NAMESPACE, "PresenceStateParking");
		PRESENCE_STATE_PEOPLE = IRI.create(M3_LITE.NAMESPACE, "PresenceStatePeople");
		PRESSURE = IRI.create(M3_LITE.NAMESPACE, "Pressure");
		PRESSURE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "PressureSensor");
		PROXIMITY = IRI.create(M3_LITE.NAMESPACE, "Proximity");
		PROXIMITY_SENSOR = IRI.create(M3_LITE.NAMESPACE, "ProximitySensor");
		PUBLIC_TRANSIT = IRI.create(M3_LITE.NAMESPACE, "PublicTransit");
		PULSE_OXYMETER = IRI.create(M3_LITE.NAMESPACE, "PulseOxymeter");
		Q_R_CODE = IRI.create(M3_LITE.NAMESPACE, "QRCode");
		RADIAN = IRI.create(M3_LITE.NAMESPACE, "Radian");
		RADIAN_PER_SECOND = IRI.create(M3_LITE.NAMESPACE, "RadianPerSecond");
		RAINFALL = IRI.create(M3_LITE.NAMESPACE, "Rainfall");
		REACTIVE_POWER = IRI.create(M3_LITE.NAMESPACE, "ReactivePower");
		RECOGNIZED_ACTIVITY = IRI.create(M3_LITE.NAMESPACE, "RecognizedActivity");
		RELATIVE_HUMIDITY = IRI.create(M3_LITE.NAMESPACE, "RelativeHumidity");
		RES_AVERAGE_LIC_CONNECTED_USERS = IRI.create(M3_LITE.NAMESPACE, "ResAverageLicConnectedUsers");
		RESTAURANT = IRI.create(M3_LITE.NAMESPACE, "Restaurant");
		RET_E_RAB_DROP = IRI.create(M3_LITE.NAMESPACE, "RetERabDrop");
		REVOLUTIONS_PER_MINUTE = IRI.create(M3_LITE.NAMESPACE, "RevolutionsPerMinute");
		R_F_I_D = IRI.create(M3_LITE.NAMESPACE, "RFID");
		R_F_I_D_QUANTITY_KIND = IRI.create(M3_LITE.NAMESPACE, "RFIDQuantityKind");
		ROAD_OCCUPANCY = IRI.create(M3_LITE.NAMESPACE, "RoadOccupancy");
		ROAD_SURFACE_THERMOMETER = IRI.create(M3_LITE.NAMESPACE, "RoadSurfaceThermometer");
		ROAD_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "RoadTemperature");
		ROOM_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "RoomTemperature");
		ROTATIONAL_SPEED = IRI.create(M3_LITE.NAMESPACE, "RotationalSpeed");
		ROTATIONAL_SPEED_ENGINE = IRI.create(M3_LITE.NAMESPACE, "RotationalSpeedEngine");
		SALINITY = IRI.create(M3_LITE.NAMESPACE, "Salinity");
		SALT_METER = IRI.create(M3_LITE.NAMESPACE, "SaltMeter");
		SCALE = IRI.create(M3_LITE.NAMESPACE, "Scale");
		SEAT_BELT_TENSION_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SeatBeltTensionSensor");
		SECOND_ANGLE = IRI.create(M3_LITE.NAMESPACE, "SecondAngle");
		SECOND_TIME = IRI.create(M3_LITE.NAMESPACE, "SecondTime");
		SEISMOMETER = IRI.create(M3_LITE.NAMESPACE, "Seismometer");
		SHAKE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "ShakeSensor");
		SHOWER = IRI.create(M3_LITE.NAMESPACE, "Shower");
		SINK = IRI.create(M3_LITE.NAMESPACE, "Sink");
		SIRENS = IRI.create(M3_LITE.NAMESPACE, "Sirens");
		SKIN_CONDUCTANCE = IRI.create(M3_LITE.NAMESPACE, "SkinConductance");
		SKIN_CONDUCTANCE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SkinConductanceSensor");
		SMOKE_DETECTOR = IRI.create(M3_LITE.NAMESPACE, "SmokeDetector");
		SNOW_CHAINS = IRI.create(M3_LITE.NAMESPACE, "SnowChains");
		S_O2_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SO2Sensor");
		SODIUM = IRI.create(M3_LITE.NAMESPACE, "Sodium");
		SOIL = IRI.create(M3_LITE.NAMESPACE, "Soil");
		SOIL_HUMIDITY = IRI.create(M3_LITE.NAMESPACE, "SoilHumidity");
		SOIL_HUMIDITY_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SoilHumiditySensor");
		SOIL_MOISTURE_TENSION = IRI.create(M3_LITE.NAMESPACE, "SoilMoistureTension");
		SOIL_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "SoilTemperature");
		SOLAR_RADIATION = IRI.create(M3_LITE.NAMESPACE, "SolarRadiation");
		SOLAR_RADIATION_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SolarRadiationSensor");
		SOUND = IRI.create(M3_LITE.NAMESPACE, "Sound");
		SOUND_PRESSURE_LEVEL = IRI.create(M3_LITE.NAMESPACE, "SoundPressureLevel");
		SOUND_PRESSURE_LEVEL_AMBIENT = IRI.create(M3_LITE.NAMESPACE, "SoundPressureLevelAmbient");
		SOUND_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SoundSensor");
		SOUND_SOURCE = IRI.create(M3_LITE.NAMESPACE, "SoundSource");
		SOURCE = IRI.create(M3_LITE.NAMESPACE, "Source");
		SPEED = IRI.create(M3_LITE.NAMESPACE, "Speed");
		SPEED_AVERAGE = IRI.create(M3_LITE.NAMESPACE, "SpeedAverage");
		SPEED_INSTANTANEOUS = IRI.create(M3_LITE.NAMESPACE, "SpeedInstantaneous");
		SPEED_MEDIAN = IRI.create(M3_LITE.NAMESPACE, "SpeedMedian");
		SPEED_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SpeedSensor");
		S_P_O2 = IRI.create(M3_LITE.NAMESPACE, "SPO2");
		SUN_POSITION_DIRECTION = IRI.create(M3_LITE.NAMESPACE, "SunPositionDirection");
		SUN_POSITION_DIRECTION_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SunPositionDirectionSensor");
		SUN_POSITION_ELEVATION = IRI.create(M3_LITE.NAMESPACE, "SunPositionElevation");
		SUN_POSITION_ELEVATION_SENSOR = IRI.create(M3_LITE.NAMESPACE, "SunPositionElevationSensor");
		SYSTOLIC_BLOOD_PRESSURE = IRI.create(M3_LITE.NAMESPACE, "SystolicBloodPressure");
		TELEPHONE = IRI.create(M3_LITE.NAMESPACE, "Telephone");
		TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "Temperature");
		TEMPERATURE_ENGINE = IRI.create(M3_LITE.NAMESPACE, "TemperatureEngine");
		TEMPERATURE_WASTE_CONTAINER = IRI.create(M3_LITE.NAMESPACE, "TemperatureWasteContainer");
		TESLA = IRI.create(M3_LITE.NAMESPACE, "Tesla");
		THERMOMETER = IRI.create(M3_LITE.NAMESPACE, "Thermometer");
		THROTTLE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "ThrottleSensor");
		TIME = IRI.create(M3_LITE.NAMESPACE, "Time");
		TIME_RELATED_STATE = IRI.create(M3_LITE.NAMESPACE, "TimeRelatedState");
		TIME_RELATED_STATE_DRIVER = IRI.create(M3_LITE.NAMESPACE, "TimeRelatedStateDriver");
		TIME_RELATED_STATE_DRIVER1 = IRI.create(M3_LITE.NAMESPACE, "TimeRelatedStateDriver1");
		TIME_RELATED_STATE_DRIVER2 = IRI.create(M3_LITE.NAMESPACE, "TimeRelatedStateDriver2");
		TIMESTAMP = IRI.create(M3_LITE.NAMESPACE, "Timestamp");
		TOLL = IRI.create(M3_LITE.NAMESPACE, "Toll");
		TONNE = IRI.create(M3_LITE.NAMESPACE, "Tonne");
		TOUCH_SENSOR = IRI.create(M3_LITE.NAMESPACE, "TouchSensor");
		TOIRISM = IRI.create(M3_LITE.NAMESPACE, "Tourism");
		TRACKING_ANIMAL = IRI.create(M3_LITE.NAMESPACE, "TrackingAnimal");
		TRACKING_BOOK = IRI.create(M3_LITE.NAMESPACE, "TrackingBook");
		TRACKING_C_D = IRI.create(M3_LITE.NAMESPACE, "TrackingCD");
		TRACKING_CLOTHING = IRI.create(M3_LITE.NAMESPACE, "TrackingClothing");
		TRACKING_D_V_D = IRI.create(M3_LITE.NAMESPACE, "TrackingDVD");
		TRACKING_FOOD = IRI.create(M3_LITE.NAMESPACE, "TrackingFood");
		TRACKING_GOOD = IRI.create(M3_LITE.NAMESPACE, "TrackingGood");
		TRACKING_LUGGAGE = IRI.create(M3_LITE.NAMESPACE, "TrackingLuggage");
		TRACKING_PARKING_SPACE = IRI.create(M3_LITE.NAMESPACE, "TrackingParkingSpace");
		TRACKING_PASSPORT = IRI.create(M3_LITE.NAMESPACE, "TrackingPassport");
		TRACKING_PAYMENT_CARD = IRI.create(M3_LITE.NAMESPACE, "TrackingPaymentCard");
		TRACKING_TOLL = IRI.create(M3_LITE.NAMESPACE, "TrackingToll");
		TRACKING_TRANSIT_PASS = IRI.create(M3_LITE.NAMESPACE, "TrackingTransitPass");
		TRAFFIC = IRI.create(M3_LITE.NAMESPACE, "Traffic");
		TRAFFIC_CONGESTION = IRI.create(M3_LITE.NAMESPACE, "TrafficCongestion");
		TRAFFIC_INTENSITY = IRI.create(M3_LITE.NAMESPACE, "TrafficIntensity");
		TRAFFIC_JAM = IRI.create(M3_LITE.NAMESPACE, "TrafficJam");
		TRANSIT_PASS = IRI.create(M3_LITE.NAMESPACE, "TransitPass");
		TRANSPORTATION = IRI.create(M3_LITE.NAMESPACE, "Transportation");
		T_V = IRI.create(M3_LITE.NAMESPACE, "TV");
		ULTRASONIC_SENSOR = IRI.create(M3_LITE.NAMESPACE, "UltrasonicSensor");
		VEHICLE_COUNT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "VehicleCountSensor");
		VEHICLE_OVERSPEED_STATE = IRI.create(M3_LITE.NAMESPACE, "VehicleOverspeedState");
		VEHICLES_PER_MINUTE = IRI.create(M3_LITE.NAMESPACE, "VehiclesPerMinute");
		VENTILATION = IRI.create(M3_LITE.NAMESPACE, "Ventilation");
		VISIBILITY = IRI.create(M3_LITE.NAMESPACE, "Visibility");
		VISIBILITY_SENSOR = IRI.create(M3_LITE.NAMESPACE, "VisibilitySensor");
		VOLT = IRI.create(M3_LITE.NAMESPACE, "Volt");
		VOLTAGE_SENSOR = IRI.create(M3_LITE.NAMESPACE, "VoltageSensor");
		VOLT_AMPERE_REACTIVE = IRI.create(M3_LITE.NAMESPACE, "VoltAmpereReactive");
		WASHING_MACHINE = IRI.create(M3_LITE.NAMESPACE, "WashingMachine");
		WATER_FLOW = IRI.create(M3_LITE.NAMESPACE, "WaterFlow");
		WATER_LEVEL = IRI.create(M3_LITE.NAMESPACE, "WaterLevel");
		WATER_TEMPERATURE = IRI.create(M3_LITE.NAMESPACE, "WaterTemperature");
		WATT = IRI.create(M3_LITE.NAMESPACE, "Watt");
		WATT_PER_METER_SQUARE = IRI.create(M3_LITE.NAMESPACE, "WattPerMeterSquare");
		WATT_PER_SQUARE_METER = IRI.create(M3_LITE.NAMESPACE, "WattPerSquareMeter");
		WEATHER = IRI.create(M3_LITE.NAMESPACE, "Weather");
		WEATHER_LUMINOSITY = IRI.create(M3_LITE.NAMESPACE, "WeatherLuminosity");
		WEATHER_PRECIPITATION = IRI.create(M3_LITE.NAMESPACE, "WeatherPrecipitation");
		WEIGHT = IRI.create(M3_LITE.NAMESPACE, "Weight");
		WEIGHT_SENSOR = IRI.create(M3_LITE.NAMESPACE, "WeightSensor");
		WIND = IRI.create(M3_LITE.NAMESPACE, "Wind");
		WIND_CHILL = IRI.create(M3_LITE.NAMESPACE, "WindChill");
		WIND_CHILL_SENSOR = IRI.create(M3_LITE.NAMESPACE, "WindChillSensor");
		WIND_DIRECTION = IRI.create(M3_LITE.NAMESPACE, "WindDirection");
		WIND_DIRECTION_SENSOR = IRI.create(M3_LITE.NAMESPACE, "WindDirectionSensor");
		WINDOW = IRI.create(M3_LITE.NAMESPACE, "Window");
		WIND_SPEED = IRI.create(M3_LITE.NAMESPACE, "WindSpeed");
		WIND_SPEED_SENSOR = IRI.create(M3_LITE.NAMESPACE, "WindSpeedSensor");
		WORKING_STATE = IRI.create(M3_LITE.NAMESPACE, "WorkingState");
		WORKING_STATE_DRIVER = IRI.create(M3_LITE.NAMESPACE, "WorkingStateDriver");
		WORKING_STATE_DRIVER1 = IRI.create(M3_LITE.NAMESPACE, "WorkingStateDriver1");
		WORKING_STATE_DRIVER2 = IRI.create(M3_LITE.NAMESPACE, "WorkingStateDriver2");
		WOUT = IRI.create(M3_LITE.NAMESPACE, "Wout");
		YEAR = IRI.create(M3_LITE.NAMESPACE, "Year");
	}

	private M3_LITE() {
		//static access only
	}

}
