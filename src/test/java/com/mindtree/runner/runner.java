package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Features",
                 glue = { "com.mindtree.StepDefinitions" },
plugin = {	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
publish=true
		)

public class runner{

}
