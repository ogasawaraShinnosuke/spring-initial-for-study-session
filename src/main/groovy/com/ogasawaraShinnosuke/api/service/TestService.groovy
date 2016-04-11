package com.ogasawaraShinnosuke.api.service

import com.ogasawaraShinnosuke.api.model.TestEntity
import groovy.sql.Sql

interface TestService {

    TestEntity findById(Sql sql, id)

    TestEntity[] findAll(Sql sql)

}
