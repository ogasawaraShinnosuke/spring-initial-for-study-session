package com.ogasawaraShinnosuke.api.util

import com.ogasawaraShinnosuke.api.conf.ApplicationConfig
import com.ogasawaraShinnosuke.api.conf.DatabaseConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component('configUtil')
class ConfigUtil implements Util {

    @Autowired
    ApplicationConfig applicationConfig

    String ok() {
        applicationConfig.ok
    }

}
