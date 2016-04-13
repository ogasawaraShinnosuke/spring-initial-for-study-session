package com.ogasawaraShinnosuke.api.service

import groovy.sql.Sql
import org.springframework.stereotype.Component

//import org.springframework.transaction.annotation.Transactional

@Component('dummy')
//@Transactional
class TestServiceImplDummy implements TestService {
    @Override
    List findById(Sql sql, id) {
        null
    }

    @Override
    List findAll(Sql sql) {
        null
    }

}
