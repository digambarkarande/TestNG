package TestAnnoutation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReport {
  @Test
  public void f() {
	  //if we use sop-->it only print in concel not in Emailableble report
	  
	  System.out.println("print from sop");
	  
	  //when we use Report .log class-->we get only in Email
	  
	  Reporter.log("when we use only reporter method with zero parameter");
	  
	  //whwen we use reporter.log class-->we get consol and email also
	  
	  Reporter.log("when we use parametric reporter class",true);
	  
  }
  
  @Test
  public void b() {
	  
	  Reporter.log("B with zero ");
	  Reporter.log("B with parameter ",true);
  }
  
  
  
  
  
  
  
  
  
  
}
