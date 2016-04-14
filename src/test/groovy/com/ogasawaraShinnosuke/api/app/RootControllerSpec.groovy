package com.ogasawaraShinnosuke.api.app

import spock.lang.Unroll

class RootControllerSpec extends SpecBase {

    @Unroll
    def index() {
        when:
        def body = template.getForEntity(getUrl(null), String).body

        then:
        body == 'ok'
    }

}
