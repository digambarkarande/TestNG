package TestNgkeys;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test
  public void f() {
	  
	  //some time we need to do repat exicution of same method
	  
	  Reporter.log("i am using invocationCount method",true);
	  
	  
  }
  @Test
  public void A() {
	  
	  Reporter.log("i am using second invocationcount method",true);
	  
  }
  
  
}
