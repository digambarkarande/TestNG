package TestNgkeys;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class  EnabledTn {
	//Enabled method  is used to get disable the method
	  @Test(enabled=true)
	  public void A() {
		  
		  Reporter.log("i am method A",true);
	  }
	  @Test(enabled=false)
	  public void D() {
		  Reporter.log("i am method D",true);
	  }
	  @Test(enabled=false)
	  public void B() {
		  
		  Reporter.log("i nam method B",true);
	  }
	  @Test(enabled=true)
	  public void E() {
		  
		  Reporter.log("i am method E",true);
	  }
	  @Test(enabled=false)
	  public void C() {
		  Reporter.log("i am method C",true);
		  
		  
		  
	  }
}
