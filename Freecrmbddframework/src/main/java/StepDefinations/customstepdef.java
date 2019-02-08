package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customstepdef {
WebDriver driver;
	@Given("^user have username and password$")
	public void userhaveusernapass()
	{
		System.out.println("Username:- amitvaidyatech password:-entertentment");
	}//function ends 
	
	@When("^user is on gmail login page$")
	public void userisongmailpage()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://accounts.google.com/ServiceLogin/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
	}

	@Then("^user is able to enter username and password$")
	public void userabletoenter(DataTable cred) throws InterruptedException
	{
		List<List<String>> list=cred.raw();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(list.get(0).get(0));
		Thread.sleep(2);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(2);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(list.get(1).get(1));
		
	}

	@And ("^user is able to click on login btn$")
	public void userisabletoclick()
	{
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
}
