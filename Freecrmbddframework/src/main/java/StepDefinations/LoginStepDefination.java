package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
 WebDriver driver;
@Given("^user is allready in login page$")
	public void user_already_on_loginpage()
	{
		System.out.println("ENd");
		
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		
	}
	

@When("^title of login page is free crm$")
public void checkpagetitle()
{
	System.out.println("Inside title function");
//	String title=driver.getTitle();
//System.out.println("Title:="+title);
	
}//function check page title ends

@Then("^user enters \"(.*)\" as username$")
public void user_enter_username(String username)
{
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	System.out.println("Username sucessfully entered");
}//function ends 

@And("^user enters \"(.*)\" as password$")
public void user_enters_password(String password)
{
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	System.out.println("password sucessfully entered");
}//user enters password function end

@Then("^user is able to login the application$")
public void login_and_check()
{
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	System.out.println("Sucessfully clicked on the login button");
	driver.quit();
}//function login and check ends
}//class ends 
