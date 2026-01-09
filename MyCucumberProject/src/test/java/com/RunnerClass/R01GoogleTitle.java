package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F01GoogleTitle.feature", 
					glue = "com.StepDefinition")
public class R01GoogleTitle {
	//features = name of the feature file along with path
	//glue = name of the package where the step definition has been ketp

}
