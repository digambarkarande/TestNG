package TestNgkeys;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordDependsOnMethod1  {
  
@Test(dependsOnMethods ="Logout")
  public void Login() {
	  
	  Reporter.log("login to facebook",true);
	  Assert.fail();
  }
  @Test(priority=2)
  public void validation() {
	  
	  Reporter.log("validate to facebook",true);
  }
  @Test
  public void Logout() {
	  
	  Reporter.log("logout to facebook",true);
  }
}
