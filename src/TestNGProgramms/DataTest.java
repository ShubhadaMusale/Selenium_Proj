package TestNGProgramms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
  @DataProvider
   public Object[][] dp() {
	  return new Object[][] {
		new Object[]  { "XA0634" ,"qwertyu" },
		new Object[] {"XA0635" ,"12345"},
		   new Object[] {"XA0636" ,"456790"},
		   new Object[] {"XA0637" ,"789345"},
		   new Object[] {"XA0638" ,"18934"},
		   new Object[] {"XA0639" ,"632659"},
		   new Object[] {"XA0630" ,"909234"},
		   new Object[] {"XA0631" ,"1567934"},
		   new Object[] {"XA0632" ,"34568790"}
	  };
	  
  }
   {
  }
}
