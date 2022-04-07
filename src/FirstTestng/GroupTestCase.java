package FirstTestng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestCase {

	public static WebDriver driver;
	public final String homepage = "//h2[text()='Guru99 Bank']";
	String username = "//input[@name ='uid']", password = "//input[@name= 'password']" , 
			submit = "//input[@name='btnLogin']";
	String managerid = "//td[text()='Manger Id : mngr296547']";
	String logoutbutton = "//a[text()= 'Log out']";
	String fundtransfer = "//a[text()='Fund Transfer']", 
			fundtransferheading = "//p[text()='Fund transfer']";
			
			

	@Test(groups = { "bonding", "ties" })
	public void tc01_LaunchUrl()
	{
		System.setProperty("webdriver.chrome.driver","//Users//mousumighosh//Selenium//Driver//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");	
	}
	
	@Test(groups = { "ties" })
	public void tc02_verifyLaunchPage()
	{
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath(homepage)).isDisplayed(), "Homepage Banner is not displayed");
		System.out.println("Home Page Banner is displayed");
	}
	
	@Test(groups = { "bonding", "ties" })
	public void tc03_Entercredentials()
	{
		
		driver.findElement(By.xpath(username)).sendKeys("mngr296547");
		System.out.println("Username is entered");
		driver.findElement(By.xpath(password)).sendKeys("utUpArU");
		System.out.println("password is entered");
		driver.findElement(By.xpath(submit)).click();
		System.out.println("submit is clicked");
	}
	
	@Test (groups = { "ties" })
	public void tc04_verifymanagercrendentia()
	{
		Assert.assertTrue(driver.findElement(By.xpath(managerid)).isDisplayed(), "Correct manager id not dispayed");
		System.out.println(driver.findElement(By.xpath(managerid)).getText() +"is the manager id");
		
	}
		
	@Test (groups = { "bonding" })
	public void tc05_fundtransfer()
	{
		//driver.findElement(By.xpath(fundtransfer)).click();
		//Assert.assertTrue(driver.findElement(By.xpath(fundtransferheading)).isDisplayed(),"fundtrasnfer page not displayed");
		System.out.println("fundtransfer page is displayed");
		
	}
	
	@Test (groups = { "bonding", "ties" })
	public void tc06_logout()

	{
		driver.findElement(By.xpath(logoutbutton)).click();
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.MILLISECONDS);
		System.out.println(alert.getText());
		alert.accept();
	}
}
