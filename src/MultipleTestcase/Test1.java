package MultipleTestcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
  @Test(groups="un")
  public void A() {
	  //Assert.fail();
	  Reporter.log("A test case",true);
	  
  }
  @Test(groups="fu")
  public void B() {
	  
	  //Assert.fail();
	  
	  Reporter.log("B test case",true);

  }
  @Test(groups="un")
  public void C() {
	  
	  Reporter.log("C test case",true);

  }
  @Test(groups="fu")
  public void D() {
	  Reporter.log("D test case",true);

  }
  
  
  
}
