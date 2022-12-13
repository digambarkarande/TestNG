package TestAnnoutation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestAnnoutation1 {
  @Test
  public void f() {
	  
	  Reporter.log("Validate the user id on upstox",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  Reporter.log("pass the Username and passward",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("logout frome upstox account",true);
  }

  @BeforeClass
  public void beforeClass() {
	  
	  Reporter.log("we lunch the browser ",true);
	  
  }
  @AfterClass
  public void afterClass() {
  
	  Reporter.log("close thw browser ",true);
  }
  
  

  

  
  
}
