package net.mobiustesseract.truetest

import spock.genesis.Gen
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll


class TrueTestSpec extends Specification
{

    @Subject TrueTest trueTest

    def setup()
    {
        Collection test = Mock();
        trueTest = new TrueTest()
    }

    @Unroll("#featureName when parameter is #parameter")
    def "Should negate parameter"(Boolean parameter)
    {
        when: "negate is called"
        def result = trueTest.negate(parameter)

        then: "result is the opposite of supplied parameter"
        result == !parameter

        where:
        parameter << Gen.these(true,false)
    }

    @Unroll("#featureName when parameter is #parameter")
    def "Should reverse parameter"(String parameter)
    {

        expect:
        trueTest.reverse(parameter) == parameter.reverse()

        where:
        parameter << Gen.string.take(10)
    }

    @Unroll("#featureName when parameters are #parameters")
    def "Should and parameters"(Boolean[] parameters)
    {
        expect:
        trueTest.and(parameters) == true

        where:
        parameters << Gen.any(true).take(Gen.integer(1, 10).iterator().next()).permutations()
    }

    @Unroll("#featureName when parameters are #parameters")
    def "Should not and parameters"(Boolean[] parameters)
    {
        expect:
        trueTest.and(parameters) == false

        where:
        parameters << Gen.these(false).then(Gen.any(true,false)).take(Gen.integer(1, 10).iterator().next()).permutations()
    }
}