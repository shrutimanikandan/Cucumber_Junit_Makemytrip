package runner;


import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.*;
//import cucumber.api.testng.AbstractTestNGCucumberTests;   
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/", 
glue = "steps", monochrome = true
)

public class RunTest{

}	
