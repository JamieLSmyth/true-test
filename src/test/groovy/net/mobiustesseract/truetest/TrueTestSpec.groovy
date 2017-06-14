package net.mobiustesseract.truetest

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll


class TrueTestSpec extends Specification
{

    @Subject TrueTest trueTest

    def setup()
    {
        trueTest = new TrueTest()
    }

    @Unroll("#featureName when parameter is #parameter")
    def "Should negate parameter"(boolean parameter)
    {
        expect:
            trueTest.negate(parameter) != parameter

        where:
            parameter << [true, false]
    }
}