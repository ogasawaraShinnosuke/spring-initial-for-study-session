package com.ogasawaraShinnosuke.api.conf

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration('databaseConfig')
@ConfigurationProperties(prefix = "database")
class DatabaseConfig implements Config {
    String url
    String user
    String password
    String driverClassName
}
