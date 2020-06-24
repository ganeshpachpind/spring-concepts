package com.transaction.learning.transaction.flyway

import org.flywaydb.core.Flyway
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FlywayConfiguration {

    // Run migration for multiple schemas provided in application.yml
    @Bean
    fun flywayMigrationStrategy(): FlywayMigrationStrategy {
        println("Running flyway migration")
        return FlywayMigrationStrategy { flyway: Flyway ->
            for (schema in flyway.configuration.schemas) {
                Flyway.configure()
                    .configuration(flyway.configuration)
                    .schemas(schema)
                    .load()
                    .migrate()
            }
        }
    }
}