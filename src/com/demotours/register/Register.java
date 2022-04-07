package com.demotours.register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register {
	
	WebDriver driver;
	public String driverpath = "//Users//mousumighosh//Selenium//Driver//chromedriver";
	
	@BeforeTest
	public void launchchrome()
	{
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		System.out.println("Browser opened");
		Reporter.log("Before test executed");
		
	}
	
	@Test(priority = 0)
	public void registerclick()
	{
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		System.out.println("Register clicked");
		Reporter.log("Priority test 0 is executed");
	}
	
	@Test(priority = 1)
	public void verifyregisterpage() {
		
		if(driver.getTitle().equalsIgnoreCase("Register: Mercury Tours"))
			System.out.println("Register page is displayed successfully");
		else
			System.out.println("fail");
		Reporter.log("Priority test 1 is executed");
	}
	
	@Test(priority = 2)
	public void enterregister() {
		
		driver.findElement(By.name("firstName")).sendKeys("test");
		driver.findElement(By.name("lastName")).sendKeys("testlast");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.id("userName")).sendKeys("test@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("stoholm 31");
		driver.findElement(By.name("city")).sendKeys("Hoofddorp");
		driver.findElement(By.name("postalCode")).sendKeys("2134 JJ");
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByValue("NETHERLANDS");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc12345");
		driver.findElement(By.name("submit")).click();
		System.out.println("Entered details and click submit");
		Reporter.log("Priority test 2 is executed");
		
	}
	
	@Test(priority = 3)
	public void verifyusername() {
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")).getText());
		Reporter.log("Priority test 3 is executed");		
	}
	
	@Test(priority = 4)
	public void signoff() {
		
		driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
		System.out.println("Logg off");
		Reporter.log("Priority test 4 is executed");
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		Reporter.log("After test  is executed");
	}

}
