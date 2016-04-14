package com.ogasawaraShinnosuke.api.app

import spock.lang.Unroll

class LiveControllerSpec extends SpecBase {

    @Unroll
    def live() {
        when:
        def body = template.getForEntity(getUrl(null), String).body

        then:
        body == '[{"id":1,"name":"test"},{"id":2,"name":"ken"}]'
    }

    @Unroll
    def live_id() {
        when:
        def body = template.getForEntity(getUrl('1'), String).body

        then:
        body == '[{"id":1,"name":"test"}]'
    }

    def getUrl(path) {
        super.getUrl(path == null ? 'live' : "live/$path")
    }

}
