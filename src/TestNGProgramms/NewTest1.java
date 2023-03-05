package TestNGProgramms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=1)
  public void f() {
	  System.out.println("Welcome in TestNG");
  }
  @Test(priority=2)
  public void s() {
	  System.out.println("This is s method");
  }
  @Test(priority=3)
  public void failedTest() 
  {
	  Assert.assertEquals(false, true);
  }
  @Test(priority=4)
  public void a() {
  System.out.println("A TestNG Programme ");
	   
  }
  }

