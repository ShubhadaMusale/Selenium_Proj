package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parademo {
  @Test
  @Parameters({"username","password"})
  public void LoginZerodha(String Uname,String Pass) {
	  System.setProperty("webdriver.chrrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  driver.findElement(By.id("username")).sendKeys(Uname);
	  driver.findElement(By.id("password")).sendKeys(Pass);
}
}