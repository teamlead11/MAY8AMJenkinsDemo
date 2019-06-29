package com.stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,features="C:src\\test\\resources\\Feature\\",glue="com.stepdefinition",plugin= {"json:src/test/resources/jsonreport/jsonreport.json"},
                           tags= {"@regression"},  strict=false)
public class TestRunner {

	
}
