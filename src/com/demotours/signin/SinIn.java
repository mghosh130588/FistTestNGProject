package com.demotours.signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listnertest.ListnerTest.class)
public class SinIn {

	
	WebDriver driver;
	public String driverpath = "//Users//mousumighosh//Selenium//Driver//chromedriver";
	
	@BeforeTest
	public void launchchrome()
	{
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
	}
	
	@Test(priority = 0)
	public void ClickSignIn()
	{
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		System.out.println("Click on Sign on");
		
	}

	@Test (priority = 1)
	public void Entercredentials()
	{
		driver.findElement(By.name("userName")).sendKeys("mousumi.nit@gmail.com");
		System.out.println("Username Entered");
		driver.findElement(By.name("password")).sendKeys("12345");
		System.out.println("password Entered");
		driver.findElement(By.name("submit")).click();
		System.out.println("Entered submit");
	}
	
	@Test (priority = 2)
	public void verifyloginpage()
	{
		if (driver.getTitle().equalsIgnoreCase("Login: Mercury Tours"))
		{
			System.out.println("Success");
		}
		else 
			System.out.println("Fail");
		
	}
	
	@Test(priority = 3)
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
		System.out.println("Logg off");
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	}
