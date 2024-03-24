package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.SoftwareProduct
import ua.kpi.its.lab.data.entity.SoftwareModule

interface SoftwareProductService {
    /**
     * Creates a new SoftwareProduct record.
     *
     * @param softwareProduct: The SoftwareProduct instance to be inserted
     * @return: The recently created SoftwareProduct instance
     */
    fun create(softwareProduct: SoftwareProduct): SoftwareProduct

    /**
     * Reads all created SoftwareProduct records.
     *
     * @return: List of created SoftwareProduct records
     */
    fun read(): List<SoftwareProduct>

    /**
     * Reads a SoftwareProduct record by its index.
     * The order is determined by the order of creation.
     *
     * @param index: The index of SoftwareProduct record
     * @return: The SoftwareProduct instance at index
     */
    fun readByIndex(index: Int): SoftwareProduct

    /**
     * Updates a SoftwareProduct record data.
     *
     * @param softwareProduct: The SoftwareProduct instance to be updated
     * @return: The updated SoftwareProduct record
     */
    fun update(softwareProduct: SoftwareProduct): SoftwareProduct

    /**
     * Deletes a SoftwareProduct record data.
     *
     * @param softwareProduct: The SoftwareProduct instance to be deleted
     */
    fun delete(softwareProduct: SoftwareProduct)

    /**
     * Deletes a SoftwareProduct record by its index.
     *
     * @param index: The index of SoftwareProduct record to delete
     * @return: The deleted SoftwareProduct instance at index
     */
    fun deleteByIndex(index: Int): SoftwareProduct
}

interface SoftwareModuleService {
    /**
    * Creates a new SoftwareModule record.
    *
    * @param softwareModule: The SoftwareModule instance to be inserted
    * @return: The recently created SoftwareModule instance
    */
    fun create(softwareModule: SoftwareModule): SoftwareModule

    /**
     * Reads all created SoftwareModule records.
     *
     * @return: List of created SoftwareModule records
     */
    fun read(): List<SoftwareModule>

    /**
     * Reads a SoftwareModule record by its index.
     * The order is determined by the order of creation.
     *
     * @param index: The index of SoftwareModule record
     * @return: The SoftwareModule instance at index
     */
    fun readByIndex(index: Int): SoftwareModule

    /**
     * Updates a SoftwareModule record data.
     *
     * @param softwareModule: The SoftwareModule instance to be updated
     * @return: The updated SoftwareModule record
     */
    fun update(softwareModule: SoftwareModule): SoftwareModule

    /**
     * Deletes a SoftwareModule record data.
     *
     * @param softwareModule: The SoftwareModule instance to be deleted
     */
    fun delete(softwareModule: SoftwareModule)

    /**
     * Deletes a SoftwareModule record by its index.
     *
     * @param index: The index of SoftwareModule record to delete
     * @return: The deleted SoftwareModule instance at index
     */
    fun deleteByIndex(index: Int): SoftwareModule
}