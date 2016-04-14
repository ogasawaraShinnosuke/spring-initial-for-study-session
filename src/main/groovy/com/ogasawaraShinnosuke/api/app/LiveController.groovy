package com.ogasawaraShinnosuke.api.app

import com.ogasawaraShinnosuke.api.service.TestService
import com.ogasawaraShinnosuke.api.util.DatabaseUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('live')
class LiveController implements Controller {

    @Autowired
    DatabaseUtil databaseUtil

    @Autowired
    TestService testService

    @RequestMapping
    def live() {
        println testService.findAll(databaseUtil.getInstance())
    }

    @RequestMapping('{id}')
    def live(@PathVariable int id) {
        println testService.findById(databaseUtil.getInstance(), id)
    }

}
