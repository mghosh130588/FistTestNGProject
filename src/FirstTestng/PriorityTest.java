package FirstTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTest {
  
	public WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "//Users//mousumighosh//Selenium//Driver//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("BROWSER OPENED");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Broswe quit");
	}
	
	@Test(priority = 1)
	public void launchurl() throws InterruptedException
	{
		driver.get("http://www.google.com");
		System.out.println("url launch");
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void sperformearchtext() {
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Facebook");
		System.out.println("sarch text enterer");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@value = 'Google Search']")).click();
		System.out.println("clicked search");
		
	}
	
	@Test (priority = 3)
	public void facebookverifyresult()
	{
		
		Assert.assertEquals(driver.getTitle(),"Facebook - Google Search","Not correct page");
	}
}
