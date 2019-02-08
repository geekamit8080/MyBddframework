package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//comment
	@RunWith(Cucumber.class)
	@CucumberOptions(
			//features="G:\\Eclipse\\All programes\\Freecrmbddframework\\src\\main\\java\\Feature\\login.feature",
			features="C:\\Users\\Amit\\git\\MyBddframework\\Freecrmbddframework\\src\\main\\java\\Feature\\login.feature",
			glue= {"StepDefinations"},
			format= {"pretty","html:test-output"},
			monochrome=true,
			dryRun=false,
			tags= {"@SmokeTest"}
			)
	 
	public class TestRunner {
	 
		public void justcheck()
		{
			
		}
	}