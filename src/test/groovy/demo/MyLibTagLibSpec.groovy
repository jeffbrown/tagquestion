package demo

import grails.testing.web.taglib.TagLibUnitTest
import spock.lang.Specification

class MyLibTagLibSpec extends Specification implements TagLibUnitTest<MyLibTagLib> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
