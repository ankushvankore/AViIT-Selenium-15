package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05SeleniumLinks.feature", 
					glue = "com.StepDefinition",
					tags = "@SeleniumLinks",
					publish = true)
public class R05SeleniumLinks {
	/*
	 * Execute single scenario:			tags = "@DownloadsLink"
	 * Execute multiple scenarios:		tags = "@DownloadsLink or @ProjectsLink"
	 * Skip Single Scenario:			tags = "not @ProjectsLink"
	 * Skip Multiple Scenarios:			tags = "not @ProjectsLink and not @SupportLink"
	 * 
	 */

}
