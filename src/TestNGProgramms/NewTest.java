package TestNGProgramms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
	
  @Test
  public void f() {
	   System.out.println("Hii this is the TestNg first programme");
	   
	   
  }
  @Test
  public void s() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https:/demoqa.com/");
	  
	  String expectedTitle="DemoQa" ;
	  
	  String ActualTitle=driver.getTitle();
	  org .testng .Assert.assertEquals(ActualTitle, expectedTitle);
	  
  }
  
  
  
  
  
}
