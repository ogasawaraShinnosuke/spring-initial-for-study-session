package com.ogasawaraShinnosuke.api.model

import org.springframework.data.repository.CrudRepository


interface TestRepository
        extends CrudRepository<TestEntity, Long> {
//    List<TestEntity> findAll()

//    TestEntity findByName(String name)
}
