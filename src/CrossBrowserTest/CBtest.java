package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBtest {
	

	WebDriver driver;
	@Parameters("browserName")
	
  @Test
  public void crossbrowser(String Bname) {
	  if(Bname.equals("firefox")) {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\libs\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	  
	  driver=new FirefoxDriver();
	  
	  
	  
	  }
	  else if(Bname.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\libs\\chromedriver_win32\\chromedriver.exe");
		  
		   driver=new ChromeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  
	  driver.get("http://www.google.com");
	  
	  
	  
	  
	  
	  
	  
  }
}
