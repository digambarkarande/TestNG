package parllaandserial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\libs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.phonepe.com/");
  }
}
