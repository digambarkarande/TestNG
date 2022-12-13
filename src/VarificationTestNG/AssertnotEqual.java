package VarificationTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertnotEqual {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\libs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://paytm.com/");
		
		WebElement Text = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
		String Actual = Text.getText();
		String expected="Paytm for Consumer";
		
		Assert.assertNotEquals(Actual,expected,"text are equal that why TC faile");
		
		
		
	  
  }
}
