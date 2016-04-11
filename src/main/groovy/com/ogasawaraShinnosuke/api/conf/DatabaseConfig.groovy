package com.ogasawaraShinnosuke.api.conf

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "database")
class DatabaseConfig {
    String url
    String user
    String password
    String driverClassName
}
