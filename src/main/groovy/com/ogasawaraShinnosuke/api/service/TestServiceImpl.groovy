package com.ogasawaraShinnosuke.api.service

import groovy.sql.Sql

import org.springframework.stereotype.Component

//import org.springframework.transaction.annotation.Transactional

@Component('testService')
//@Transactional
class TestServiceImpl implements TestService {
    private static final String SELECT_TEST_BY_ID = "select id, name from test where id=?;"
    private static final String SELECT_TEST_ALL = "select id, name from test;"

    @Override
    List findById(Sql sql, id) {
        sql.rows SELECT_TEST_BY_ID, [id]
    }

    @Override
    List findAll(Sql sql) {
        sql.rows SELECT_TEST_ALL
    }

}
