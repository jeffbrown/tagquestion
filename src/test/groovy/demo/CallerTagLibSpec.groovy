package demo

import grails.testing.web.taglib.TagLibUnitTest
import spock.lang.Specification

class CallerTagLibSpec extends Specification implements TagLibUnitTest<CallerTagLib> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
