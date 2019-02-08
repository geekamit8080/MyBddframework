package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="G:\\Eclipse\\All programes\\Freecrmbddframework\\src\\main\\java\\Feature\\work.feature",
			glue= {"StepDefinations"},
			format= {"pretty","html:test-output"},
			monochrome=true,
			dryRun=false
			)
	
	public class workrunner {
}
