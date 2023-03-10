package TestNGProgramms;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)

public class ITestlistenerExample {
	int i=0;
	
	
  @Test
  public void testMethod1() 
  {
  System.out.println("This method will pass and will invoke the onTestSuccess method of ITestlistener");
   int i=10;
	Assert.assertEquals(i,10);
  }
  
  @Test
  public void testMethod2()
  {
	  System.out.println("This method will fail and will invoke the onTestFail method of ITestlistener");
	  int i=10;
	  Assert.assertEquals(i,11);
  }
  
  @Test
  public void testMethod3()
  {
	  System.out.println("This method will skip and will invoke the onTestSkipped method of ITestlistener");
	  throw new SkipException("Skipping this test case");
  }
  
  @Test(successPercentage = 50,invocationCount =5)
  public void testMethod4()
  {
	  i++;
	  System.out.println("this will be failed");
	  Assert.assertEquals(i, 100);
  }
  
  
  
  
}
