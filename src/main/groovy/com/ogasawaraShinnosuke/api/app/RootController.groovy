package com.ogasawaraShinnosuke.api.app

import com.ogasawaraShinnosuke.api.service.TestService

import com.ogasawaraShinnosuke.api.util.ConfigUtil

import com.ogasawaraShinnosuke.api.util.DatabaseUtil
import groovy.sql.Sql
import org.springframework.beans.factory.annotation.Autowired

//import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {

    @Autowired
    ConfigUtil configUtil

    @Autowired
    DatabaseUtil databaseUtil

    @Autowired
    TestService testService

    @RequestMapping("/")
    def index() {
        configUtil.ok()
    }

    @RequestMapping("/live")
//    @Transactional(readOnly = true)
    def live() {
        Sql sql = databaseUtil.getInstance()
        testService.findAll(sql).each { test -> println test }
    }
}
