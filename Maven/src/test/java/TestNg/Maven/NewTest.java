package TestNg.Maven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest {
	
	static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	public static WebDriver Workingwithbrowser(String browser)
	{
		
		switch(browser)
		{
		
		case "ie":
			driver = new InternetExplorerDriver();
			System.setProperty("webdriver.gecko.driver","IEDriverServer.exe");
			break;
			
		case "chrome":
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			
			break;
		
		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("scrollBy(0,4500)");
		
		return driver;
		
	}//working with browser ends 


@Test
	public void tets()
	{
		//driver.close();
		System.out.println("driver closed");
		WebElement element = driver.findElement(By.xpath("a"));
		
	}
}//Class NewTest ends
