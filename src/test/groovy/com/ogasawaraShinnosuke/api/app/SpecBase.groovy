package com.ogasawaraShinnosuke.api.app

import com.ogasawaraShinnosuke.api.MainApplication
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.TestRestTemplate
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringApplicationConfiguration(classes = MainApplication)
@WebIntegrationTest
class SpecBase extends Specification {
    protected static final RestTemplate template = new TestRestTemplate()

    private static final String LOCAL_URL = 'http://localhost:8080'

    protected static def getUrl(path) {
        path == null ? LOCAL_URL : "$LOCAL_URL/$path"
    }

    // Communication confirmation
    def ok(a, b, c) {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        7 | 4 | 7
        0 | 0 | 0
    }
}
