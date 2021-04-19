package es.um.asio.abstractions.domain;

/**
 * Data operation
 */
public enum Operation {
    /**
     * Insert operation
     */
    INSERT,
    /**
     * Update operation
     */
    UPDATE,
    /**
     * Delete operation
     */
    DELETE,
    /**
     * Insert nested objects
     */
    LINKED_INSERT,
    /**
     * Linked objects
     */
    LINK,
    /**
     * Linked objects
     */
    LOD_LINK
}
