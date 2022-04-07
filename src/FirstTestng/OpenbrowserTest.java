package FirstTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenbrowserTest {
	
	public WebDriver driver;
	public String driverpath = "//Users//mousumighosh//Selenium//Driver//chromedriver";
  @Test
  public void f() {
	  
	  driver.findElement(By.id("No")).click();
		driver.findElement(By.id("buttoncheck")).click();
		String text = driver.findElement(By.className("radiobutton")).getText();
		if (text.contains("`No"))
		{
			System.out.println(text);
		}
		else
			System.out.println(text);
		
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver",driverpath);
	  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
