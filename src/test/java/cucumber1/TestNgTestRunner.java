package cucumber1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//To run cucumber feature files, we need either testng orjunit test runners
@CucumberOptions(features="src/test/java/cucumber1",glue="rahulshettyacademy.stepDefinitions1",
monochrome=true,tags="@ErrorValidation", plugin={"html:target/cucumber1.html"}) 
//monochrome - to get output in readable format
// to use testng methods cucumber needs to extend testng class
public class TestNgTestRunner extends AbstractTestNGCucumberTests{

	
	
}
