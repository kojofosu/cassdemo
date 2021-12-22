package com.mcdev.cassdemo.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringDocOpenApiConfig {
    @Bean
    fun springDocApiConfig(): OpenAPI {
        return  OpenAPI()
            .info(Info()
                .title("Demo Cassandra Project")
                .description("This is a demo project to test and showcase the cassandra database")
                .version("version 1.0"))
    }
}