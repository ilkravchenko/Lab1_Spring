package ua.kpi.its.lab.data.svc.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.SoftwareModule
import ua.kpi.its.lab.data.entity.SoftwareProduct
import ua.kpi.its.lab.data.repo.SoftwareModuleRepository
import ua.kpi.its.lab.data.repo.SoftwareProductRepository
import ua.kpi.its.lab.data.svc.SoftwareModuleService
import ua.kpi.its.lab.data.svc.SoftwareProductService

@Service
class SoftwareModuleServiceImpl @Autowired constructor(
    private val repository: SoftwareModuleRepository
): SoftwareModuleService {
    /**
     * Creates a new SoftwareModule record.
     *
     * @param softwareModule: The SoftwareModule instance to be inserted
     * @return: The recently created SoftwareModule instance
     */
    override fun create(softwareModule: SoftwareModule): SoftwareModule {
        return repository.save(softwareModule)
    }

    /**
     * Reads all created SoftwareModule records.
     *
     * @return: List of created SoftwareModule records
     */
    override fun read(): List<SoftwareModule> {
        return repository.findAll()
    }

    /**
     * Reads a SoftwareModule record by its index.
     * The order is determined by the order of creation.
     *
     * @param index: The index of SoftwareModule record
     * @return: The SoftwareModule instance at index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    override fun readByIndex(index: Int): SoftwareModule {
        val moduleList = this.read()
        if (index < 0 || index >= moduleList.size) {
            throw IndexOutOfBoundsException("Index out of bounds")
        }
        return moduleList[index]
    }

    /**
     * Updates an existing SoftwareModule record.
     *
     * @param softwareModule: The SoftwareModule instance to be updated
     * @return: The updated SoftwareModule record
     */
    override fun update(softwareModule: SoftwareModule): SoftwareModule {
        return repository.save(softwareModule)
    }

    /**
     * Deletes a SoftwareModule record by its ID.
     *
     * @param softwareModule: The SoftwareModule instance to be deleted
     */
    override fun delete(softwareModule: SoftwareModule) {
        repository.delete(softwareModule)
    }

    /**
     * Deletes a SoftwareModule record by its index.
     *
     * @param index: The index of SoftwareModule record to delete
     * @return: The deleted SoftwareModule instance at index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    override fun deleteByIndex(index: Int): SoftwareModule {
        val target = this.readByIndex(index)
        this.delete(target)
        return target
    }
}

@Service
class SoftwareProductServiceImpl @Autowired constructor(
    private val repository: SoftwareProductRepository
): SoftwareProductService {
    /**
     * Creates a new SoftwareProduct record.
     *
     * @param softwareProduct: The SoftwareProduct instance to be inserted
     * @return: The recently created SoftwareProduct instance
     */
    override fun create(softwareProduct: SoftwareProduct): SoftwareProduct {
        return repository.save(softwareProduct)
    }

    /**
     * Reads all created SoftwareProduct records.
     *
     * @return: List of created SoftwareProduct records
     */
    override fun read(): List<SoftwareProduct> {
        return repository.findAll()
    }

    /**
     * Reads a SoftwareProduct record by its index.
     * The order is determined by the order of creation.
     *
     * @param index: The index of SoftwareProduct record
     * @return: The SoftwareProduct instance at index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    override fun readByIndex(index: Int): SoftwareProduct {
        val productList = this.read()
        if (index < 0 || index >= productList.size) {
            throw IndexOutOfBoundsException("Index out of bounds")
        }
        return productList[index]
    }

    /**
     * Updates an existing SoftwareProduct record.
     *
     * @param softwareProduct: The SoftwareProduct instance to be updated
     * @return: The updated SoftwareProduct record
     */
    override fun update(softwareProduct: SoftwareProduct): SoftwareProduct {
        return repository.save(softwareProduct)
    }

    /**
     * Deletes a SoftwareProduct record by its ID.
     *
     * @param softwareProduct: The SoftwareProduct instance to be deleted
     */
    override fun delete(softwareProduct: SoftwareProduct) {
        repository.delete(softwareProduct)
    }

    /**
     * Deletes a SoftwareProduct record by its index.
     *
     * @param index: The index of SoftwareProduct record to delete
     * @return: The deleted SoftwareProduct instance at index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    override fun deleteByIndex(index: Int): SoftwareProduct {
        val target = this.readByIndex(index)
        this.delete(target)
        return target
    }
}
