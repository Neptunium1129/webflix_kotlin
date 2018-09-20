package com.ksm.wfx

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration

@SpringBootApplication(scanBasePackages = arrayOf("com.ksm.wfx"))
//@EnableAutoConfiguration(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class })

//@EnableAutoConfiguration(exclude=arrayOf(DataSourceTransactionManagerAutoConfiguration::class, DataSourceAutoConfiguration::class))
//@Import(PersistenceConfig::class, SwaggerConfig::class)
open class WfxApplication

fun main(args: Array<String>) {
    SpringApplication.run(WfxApplication::class.java, *args)
}
