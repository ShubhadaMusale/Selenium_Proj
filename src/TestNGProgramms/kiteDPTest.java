package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class kiteDPTest {
  @Test(dataProvider="dp")
  public void kiteLogin(String username,String password) {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://kite.zerodha.com");
  
  WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
  WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
  WebElement LoginBtn=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
  
  userid.sendKeys(username);
  Password.sendKeys(password);
  LoginBtn.clear();
  
  }
  
  @DataProvider
  public Object[][] dp() {
	  return new Object[][] {
	   new Object[] {"XA0634" ,"qwertyu"},
	   new Object[] {"XA0635" ,"12345"},
	   new Object[] {"XA0636" ,"456790"},
	   new Object[] {"XA0637" ,"789345"},
	   new Object[] {"XA0638" ,"18934"},
	   new Object[] {"XA0639" ,"632659"},
	   new Object[] {"XA0630" ,"909234"},
	   new Object[] {"XA0631" ,"1567934"},
	   new Object[] {"XA0632" ,"34568790"},
	   
	  };
  }
  
}
