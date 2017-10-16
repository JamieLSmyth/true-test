package net.mobiustesseract.truetest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        features = "classpath:net/mobiustesseract/truetest/truetest.feature"
)
public class TrueTestFeatures {
}
