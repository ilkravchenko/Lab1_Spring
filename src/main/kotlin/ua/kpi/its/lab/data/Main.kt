package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.entity.SoftwareProduct
import ua.kpi.its.lab.data.config.Config
import ua.kpi.its.lab.data.entity.SoftwareModule
import ua.kpi.its.lab.data.svc.impl.SoftwareModuleServiceImpl
import ua.kpi.its.lab.data.svc.impl.SoftwareProductServiceImpl
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext(Config::class.java)
    //context.refresh()
    val productService = context.getBean(SoftwareProductServiceImpl::class.java)
    val moduleService = context.getBean(SoftwareModuleServiceImpl::class.java)

    val module1 = SoftwareModule(
        author = "Волхви Ігрознавці",
        description = "Базовий дескріпшен",
        language = "укр",
        lastEditDate = Date(),
        size = 231,
        linesOfCode = 4444,
        crossPlatform = true
    )

    // Створюємо 5 продуктів та додаткові модулі
    val product1 = SoftwareProduct(
        name = "Ігровий Геній",
        developer = "Волхви Ігрознавці",
        version = "1.0.1",
        releaseDate = Date(),
        distributionSize = 1000L,
        bitness = 64,
        crossPlatform = true,
    )
    val product2 = SoftwareProduct(
        name = "СуперМапа",
        developer = "Маги Картографи",
        version = "1.0.2",
        releaseDate = Date(),
        distributionSize = 2000L,
        bitness = 64,
        crossPlatform = true,
    )
    val product3 = SoftwareProduct(
        name = "ТрансФормер Завдань",
        developer = "Чарівники Місіонери",
        version = "1.0.3",
        releaseDate = Date(),
        distributionSize = 3000L,
        bitness = 64,
        crossPlatform = true,
    )
    val product4 = SoftwareProduct(
        name = "СуперКалендар",
        developer = "Шамани Годинників",
        version = "1.0.4",
        releaseDate = Date(),
        distributionSize = 4000L,
        bitness = 64,
        crossPlatform = true,
    )
    val product5 = SoftwareProduct(
        name = "АудіоМагія",
        developer = "Заклиначі Звуків",
        version = "1.0.5",
        releaseDate = Date(),
        distributionSize = 5000L,
        bitness = 64,
        crossPlatform = true,
    )

    productService.create(product1)
    productService.create(product2)
    productService.create(product3)
    productService.create(product4)
    productService.create(product5)


    // отримуємо продукт з індексом 3
    val retrievedProduct = productService.readByIndex(3)
    println("Retrieved product: $retrievedProduct")

    // Видаляємо продукт з індексом 4
    val deletedProduct = productService.deleteByIndex(4)
    println("Deleted product: $deletedProduct")
}