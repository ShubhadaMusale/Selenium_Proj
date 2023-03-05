package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kiteTest {
  @Test(dataProvider="dp",dataProviderClass=DataTest.class)
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
}
