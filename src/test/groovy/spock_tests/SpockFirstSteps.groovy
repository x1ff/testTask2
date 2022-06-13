package spock_tests

import spock.lang.Specification

class SpockFirstSteps extends Specification{
    def "First spock test"() {
        expect:
        1 == 1
    }
}
