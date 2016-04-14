package com.ogasawaraShinnosuke.api.app

import com.ogasawaraShinnosuke.api.util.ConfigUtil

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/')
class RootController {

    @Autowired
    ConfigUtil configUtil

    @RequestMapping
    def index() {
        configUtil.ok()
    }

}
