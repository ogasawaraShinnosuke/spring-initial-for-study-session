package com.ogasawaraShinnosuke.api.app

import com.ogasawaraShinnosuke.api.service.TestService
import com.ogasawaraShinnosuke.api.util.DatabaseUtil
import groovy.sql.Sql
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('live')
class LiveController {

    @Autowired
    DatabaseUtil databaseUtil

    @Autowired
    TestService testService

    @RequestMapping
    def live() {
        Sql sql = databaseUtil.getInstance()
        testService.findAll(sql).each { test -> println test }
    }

    @RequestMapping('{id}')
    def live(@PathVariable int id) {
        Sql sql = databaseUtil.getInstance()
        testService.findById(sql, id).each { test -> println test }
    }
}
