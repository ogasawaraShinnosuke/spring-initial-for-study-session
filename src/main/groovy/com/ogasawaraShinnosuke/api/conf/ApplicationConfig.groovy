package com.ogasawaraShinnosuke.api.conf

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "live")
class ApplicationConfig {
    String ok
}
