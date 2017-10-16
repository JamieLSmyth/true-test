package net.mobiustesseract.truetest


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Before()
{ scenario ->
    System.out.println(scenario)
    trueTest = new TrueTest()
}

When(~"a '(\\S+)' is entered") { boolean parameter->
    result = trueTest.negate(parameter)
}

Then(~"the result should be the negation of the '(\\S+)'")
{ boolean parameter ->
    assert !parameter == result
}
