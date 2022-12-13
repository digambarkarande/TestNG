package VarificationTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\libs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	//	driver.findElement(By.id("hide-textbox")).click();
	//	Thread.sleep(1000);
			
		WebElement display = driver.findElement(By.name("show-hide"));
		boolean Actula = display.isDisplayed();
		
		Assert.assertFalse(Actula,"if the Display is wisiable than TC faile");
  }
}
