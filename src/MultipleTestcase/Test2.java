package MultipleTestcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test(groups="un")
  public void X() {
	  Reporter.log("X test case",true);

  }
  @Test(groups="fu")
  public void y() {
	  Reporter.log("y test case",true);

  }
  @Test(groups="un")
  public void Z() {
	  Reporter.log("Z test case",true);

  }
  @Test(groups="fu")
  public void W() {
	  Reporter.log("W test case",true);

  }
}
