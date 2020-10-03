package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features",
		//features="/Users/anala/Desktop/Selenium_Testing/CucumberAMBatch/Features/Tagging.feature",
		features="/Users/anala/Desktop/Selenium_Testing/CucumberAMBatch/Features/Hooks.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_otput/cucumber.xml"}
		//tags= {"@SanityTest"}   //execute only sanity tests
		
		//tags= {"@SanityTest,@RegressionTest"} //execute both 
		//tags= {"@RegressionTest","@End2End"}
		//tags= {"@SanityTest","@End2End"}
		//tags={"~@End2End"} 
		//tags={"~@End2End","~@SanityTest"}//this will ignore end to end  
		)
public class TestRunner {

}

