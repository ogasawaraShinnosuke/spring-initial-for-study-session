package com.ogasawaraShinnosuke.api.app

import com.ogasawaraShinnosuke.api.model.TestEntity

//import com.ogasawaraShinnosuke.api.service.TestService
//import com.ogasawaraShinnosuke.api.service.TestServiceImpl
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
    ConfigUtil config

    @Autowired
    DatabaseUtil util

//    @Autowired
//    TestService testService

    @RequestMapping("/")
    def index() {
        config.ok()
    }

    @RequestMapping("/live")
//    @Transactional(readOnly = true)
    def live() {
        Sql sql = util.getInstance()
//        testService.findAll(sql)

//        def tests = testService.findAll(sql)
        def tests = []
        sql.eachRow("select * from test") { test ->
            tests.add(new TestEntity(id: test.id, name: test.name))
        }
        tests.each { test -> println "id=$test.id, name=$test.name" }
    }
}
