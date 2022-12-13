package TestNgkeys;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class  Priority {
	
	//priority is used to get method 1st
  @Test(priority=1)
  public void A() {
	  
	  Reporter.log("i am method A",true);
  }
  @Test
  public void D() {
	  Reporter.log("i am method D",true);
  }
  @Test(priority=-3)
  public void B() {
	  
	  Reporter.log("i nam method B",true);
  }
  @Test(priority=2)
  public void E() {
	  
	  Reporter.log("i am method E",true);
  }
  @Test(priority=-4)
  public void C() {
	  Reporter.log("i am method C",true);
	  
	  
	  
  }
}
