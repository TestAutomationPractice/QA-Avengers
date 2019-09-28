package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Java-Workspace\\QaAvengers_UIAutomation\\src\\main\\java\\Features",
		glue="stepDefinitions", 
		format= {"pretty","html:test-output","json: json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		 dryRun=true,
		 //tags= {"@RegressionTest"},
		 monochrome=true,
		 strict=true
		) 
  
public class TestRunner {
	
	
	
	

}
