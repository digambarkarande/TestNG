package TestNgkeys;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class  TimeOut {
  @Test
  public void A() {
	  
	  Reporter.log("i am method A",true);
  }
  
  @Test(timeOut=1000)
  public void B() throws InterruptedException {
	  
	  Thread.sleep(500);
	  
	  Reporter.log("i am method B",true);
  }
  @Test
  public void C() {
	  
	  Reporter.log("i am method C",true);
  }
  @Test
  public void D() {
	  
	  Reporter.log("i am method D",true);
  }
}
