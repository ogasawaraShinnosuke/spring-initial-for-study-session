package com.ogasawaraShinnosuke.api.app

trait Controller {
    def println(List list) {
        list.each { v -> println v }
    }
}