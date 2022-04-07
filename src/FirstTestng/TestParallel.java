package FirstTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestParallel {
	
	@Test
	public void executeSessionOne() {
		
		System.setProperty("webdriver.chrome.driver", "//Users//mousumighosh//Selenium//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Session one");
		System.out.println("Session one is executed");
	}

	@Test
	public void executeSessionTwo() {
		System.setProperty("webdriver.chrome.driver", "//Users//mousumighosh//Selenium//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Session Two");
		System.out.println("Session Two is executed");
		
	}
	
	@Test
	public void executeSessionThree() {
		System.setProperty("webdriver.chrome.driver", "//Users//mousumighosh//Selenium//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Session Three");
		System.out.println("Session three is executed");
		
	}
}

