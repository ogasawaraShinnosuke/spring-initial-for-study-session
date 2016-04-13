package com.ogasawaraShinnosuke.api.model

import javax.persistence.Column
import javax.persistence.Entity

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
//@Table(name = 'test')
class TestEntity implements Serializable {
    private static final long serialVersionUID = 1L

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id

    @Column(nullable = true)
    String name

}
