package FirstTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("This is test f");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before ~Test method is xexcuted");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After  ~Test method is xexcuted");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class is xexcuted");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After class is xexcuted");
  }
  

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before ~Test is xexcuted");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After ~Test  is xexcuted");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before ~Test Suite is xexcuted");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After  ~Test Suite is xexcuted");
  }

  @Test
  public void abc() {
	  
	  System.out.println("This is test abc");
  }
  
  @Test
 public void testthree() {
	  System.out.println("This is test method three");
  }
}
