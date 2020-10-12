package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps"},
        plugin = {"html:target/cucumber-reports/cucumber-pretty","json:target/json-cucumber-reports/default/cukejson.json",
                "testng:target/testng-cucumber-reports/cuketestng.xml" },
        features = {"src/test/resources/features"})

public class RunCucumberTest {

}