package amazon.us.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
plugin ={"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},	
	monochrome = true,
	
	features = "Amazon_feature",
	glue = "amazon.us.stepdefination",
	tags = "@iphone"	
		)












public class MyRunner extends AbstractTestNGCucumberTests{
	


}
