package com.ogasawaraShinnosuke.api.service

import groovy.sql.Sql

/**
 * test table service.
 */
trait TestService {
    /**
     * select test table by id.
     * @param sql
     * @param id
     * @return
     */
    List findById(Sql sql, id) { null }

    /**
     * select test table.
     * @param sql
     * @return
     */
    List findAll(Sql sql) { null }
}
