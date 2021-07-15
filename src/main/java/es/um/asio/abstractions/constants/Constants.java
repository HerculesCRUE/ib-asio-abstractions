package es.um.asio.abstractions.constants;

/**
 * The Class Constants.
 */
public final class Constants {

	/** The Constant ACTION. */
	public static final String ACTION = "action";

	/** The Constant CACHE_CANONICAL_LOCAL_URIS. */
	public static final String CACHE_CANONICAL_LOCAL_URIS = "cacheCanonicalLocalUris";
	
	/** The Constant EXCEUTION_ID. */
	public static final String EXECUTION_ID = "jobExecutionId";

	/** The Constant CACHE_ENTITIES. */
	public static final String CACHE_ENTITIES = "cacheEntities";

	/** The Constant CACHE_PROPERTIES. */
	public static final String CACHE_PROPERTIES = "cacheProperties";

	/** The Constant CACHE_TRELLIS_CONTAINER. */
	public static final String CACHE_TRELLIS_CONTAINER = "cacheTrellisContainer";

	/** The Constant CANONICAL_CLASS. */
	public static final String CANONICAL_CLASS = "canonicalClass";

	/** The Constant CANONICAL_CLASS_NAME. */
	public static final String CANONICAL_CLASS_NAME = "canonicalClassName";

	/** The Constant CANONICAL_LANGUAGE_URI. */
	public static final String CANONICAL_LANGUAGE_URI = "canonicalLanguageURI";

	/** The Constant CANONICAL_PROPERTY. */
	public static final String CANONICAL_PROPERTY = "canonicalProperty";

	/** The Constant CANONICAL_URI. */
	public static final String CANONICAL_URI = "canonicalURI";

	/** The Constant CANONICAL_URI_LANGUAGE_STR. */
	public static final String CANONICAL_URI_LANGUAGE_STR = "canonicalURILanguageStr";

	/** The Constant CLASE. */
	public static final String CLASE = "clase";

	/** The Constant CLASS_NAME. */
	public static final String CLASS = "@class";

	/** The Constant CLASS_NAME. */
	public static final String CLASS_NAME = "className";

	/** The Constant dateTemplate_dd_mm_yyyy */
	public static final String DATE_FORMAT_DD_MM_YYYY = "FILTER (strdt(concat(substr(?{0}, 0, 2), \"-\", substr(?{0}, 3, 2), \"-\", substr(?{0}, 6, 4)), xsd:date) {2} \"{1}\"^^xsd:date) . ";

	/** The Constant dateTemplate_yyyy_mm_dd */
	public static final String DATE_FORMAT_YYYY_MM_DD = "FILTER (strdt(concat(substr(?{0}, 0, 5), \"-\", substr(?{0}, 6, 2), \"-\", substr(?{0}, 9, 2)), xsd:date) {2} \"{1}\"^^xsd:date) . ";

	/** The Constant DOMAIN. */
	public static final String DOMAIN = "domain";

	/** The Constant DOMAIN_VALUE. */
	public static final String DOMAIN_VALUE = "hercules.org";

	/** The Constant END_LINK_PLAIN */
	public final static String END_LINK_PLAIN = "END-LINK-OBJECTS";

	/** The Constant END_PLAIN */
	public final static String END_PLAIN = "END-PLAIN-OBJECTS";

	/** The Constant ENGLISH_LANGUAGE. */
	public static final String ENGLISH_LANGUAGE = "en-EN";

	/** The Constant ENTITY_ID. */
	public static final String ENTITY_ID = "entityId";

	/** The Constant ENTITY_LOCAL_URI. */
	public static final String ENTITY_LOCAL_URI = "entityLocalURI";

	/** The Constant ID. */
	public static final String ID = "id";

	/** The Constant KO */
	public static final String KO = "KO";

	/** The Constant LANG. */
	public static final String LANG = "lang";

	/** The Constant LANGUAGE. */
	public static final String LANGUAGE = "language";

	public static final String LINKED_MODEL = "linkedModel";

	/** The Constant LINKED_TO. */
	public static final String LINKED_TO = "linkedTo";

	public static final String LOCAL_Uri = "localUri";

	/** The Constant LOCAL_URI. */
	public static final String LOCAL_URI = "localURI";

	/** The Constant LOCAL_URIS. */
	public static final String LOCAL_URIS = "localURIS";

	/** The Constant MANAGEMENT_SYSTEM_BUSY */
	public static final String MANAGEMENT_SYSTEM_BUSY = "No se ha podido realizar la importación, management system en uso por la ETL";

	/** The Constant NODE. */
	public static final String NODE = "node";

	/** The Constant OBJECT. */
	public static final String OBJECT = "obj";

	/** The Constant OK */
	public static final String OK = "OK";

	/** The Constant POJO_FACTORY */
	public static final String POJO_FACTORY = "pojoKafkaListenerContainerFactory";

	/** The Constant POJO_LINK_FACTORY */
	public static final String POJO_LINK_FACTORY = "pojoLinkKafkaListenerContainerFactory";

	/** The Constant DISCOVERY_FACTORY */
	public static final String DISCOVERY_FACTORY = "discoveryKafkaListenerContainerFactory";

	/** The Constant PROPERTY. */
	public static final String PROPERTY = "property";

	/** The Constant REFERENCE. */
	public static final String REFERENCE = "reference";

	/** The Constant ROOT_URI. */
	public static final String ROOT_URI = "http://" + Constants.DOMAIN_VALUE;

	/** The Constant SPANISH_LANGUAGE. */
	public static final String SPANISH_LANGUAGE = "es-ES";

	/** The Constant SPANISH_LANGUAGE_SHORT. */
	public static final String SPANISH_LANGUAGE_SHORT = "es";

	/** The Constant START_LINK_PLAIN */
	public final static String START_LINK_PLAIN = "START-LINK-OBJECTS";

	/** The Constant START_PLAIN */
	public final static String START_PLAIN = "START-PLAIN-OBJECTS";

	/** The Constant STORAGE_NAME. */
	public static final String STORAGE_NAME = "storageName";

	/** The Constant SUBDOMAIN. */
	public static final String SUBDOMAIN = "subDomain";

	/** The Constant SUBDOMAIN_VALUE. */
	public static final String SUBDOMAIN_VALUE = "um";

	/** The Constant TRELLIS. */
	public static final String TRELLIS = "trellis";

	/** The Constant TRIPLE_STORE. */
	public static final String TRIPLE_STORE = "tripleStore";

	/** The Constant TYPE_CODE. */
	public static final String TYPE_CODE = "typeCode";

	/** The Constant TYPE_REST. */
	public static final String TYPE_REST = "res";

	/** The Constant TYPE_DEF. */
	public static final String TYPE_DEF = "def";

	/** The Constant WIKIBASE. */
	public static final String WIKIBASE = "wikibase";
}
