package com.ogasawaraShinnosuke.api.conf

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration('applicationConfig')
@ConfigurationProperties(prefix = "live")
class ApplicationConfig implements Config {
    String ok
}
