package com.ogasawaraShinnosuke.api.model

//import javax.persistence.Column
import javax.persistence.Entity

import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class TestEntity
//        implements Serializable
{
//    private static final long serialVersionUID = 1L

    @Id
    @GeneratedValue
    int id

//    @Column(nullable = true)
    String name


}
