package com.ogasawaraShinnosuke.api.util

import com.ogasawaraShinnosuke.api.conf.DatabaseConfig
import groovy.sql.Sql
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component('databaseUtil')
class DatabaseUtil implements Util {

    @Autowired
    DatabaseConfig databaseConfig

    Sql getInstance() {
        Sql.newInstance databaseConfig.url,
                databaseConfig.user,
                databaseConfig.password,
                databaseConfig.driverClassName
    }
}
