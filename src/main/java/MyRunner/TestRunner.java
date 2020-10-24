package MyRunner;

import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="C:\\Users\\Madhuri\\eclipse-workspace\\MyCucumber\\src\\main\\java\\features\\Login.feature",//path of feature file
		
		features="C:\\Users\\Madhuri\\eclipse-workspace\\MyCucumber\\src\\main\\java\\features\\Contatcs.feature",
		glue= {"stepDefination"},//path of step definition file
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//to generate different report
		dryRun=false,//it will check the mapping between stepdefinition file and feature file
		monochrome=false,//to display console output in proper readable format
		strict=false//it will check sny step is not defined in step definition file 
	
		
		
		
		
		)



public class TestRunner {

}
