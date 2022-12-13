package SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqual {
	SoftAssert soft=new SoftAssert(); 
	
	@Test  
  public void f() {
	   
	  String a="abc";
	  String b="abc";
	  String c="xyz";
	  String d="";
	   
	  soft.assertEquals(a,b,"a and b is not equal TC faile");
	  soft.assertNotEquals(a,b,"a and b are equal than TC faile");
	  
	  soft.assertNull(c,"c is not null TC faile");
	  
	  soft.assertNotNull(d,"d is null TC failed");
	  
	  soft.assertAll();
	  
  }
	
	@Test  
	  public void A() {
		
		boolean a = true;
		
		soft.assertTrue(a,"a is falues TC faile");
		soft.assertFalse(a,"a is true TC faile");
		soft.assertAll();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
