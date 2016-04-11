package com.ogasawaraShinnosuke.api.service

import com.ogasawaraShinnosuke.api.model.TestEntity
import groovy.sql.Sql

//import org.springframework.stereotype.Component
//import org.springframework.transaction.annotation.Transactional

//@Component("testService")
//@Transactional
class TestServiceImpl implements TestService {

//    private static final String findById = "select * from test where id="
//    private static final String findByAll = "select * from test"

    @Override
    TestEntity findById(Sql sql, id) {
//        sql.rows(findById, [id]).each { row ->
//            return new TestEntity(id: row.id, name: row.name)
//        }
        null
    }

    @Override
    TestEntity[] findAll(Sql sql) {
        def tests = []
//        sql.rows(findByAll).each { row ->
//            tests.add(new TestEntity(id: row.id, name: row.name))
//        }
        tests
    }

}
