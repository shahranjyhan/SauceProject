package com.RunnerSauce;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/Negz.feature"},
		glue = {"com.StepDefSauce", "com.HookSauce"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
		
		//tags = "@smoke"
)
public class Runnerz extends AbstractTestNGCucumberTests {
	

}	
