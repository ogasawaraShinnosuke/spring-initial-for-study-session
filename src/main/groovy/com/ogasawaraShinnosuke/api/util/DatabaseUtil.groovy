package com.ogasawaraShinnosuke.api.util

import com.ogasawaraShinnosuke.api.conf.DatabaseConfig
import groovy.sql.Sql
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DatabaseUtil {

    @Autowired
    DatabaseConfig config

    Sql getInstance() {
        Sql.newInstance config.url, config.user, config.password, config.driverClassName
    }
}
