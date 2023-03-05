package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	public WebDriver driver;
  @Test
  public void chrometest (){
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  String expectedTitle= "Kite-zerodha's fast and elegant flagship trading platform";
	  String ActualTitle=driver.getTitle();
	  SoftAssert sassert=new SoftAssert();                       //(using soft assert)
	  sassert.assertEquals(ActualTitle, expectedTitle);
	  WebElement KiteLogo=driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
	  sassert.assertTrue(KiteLogo.isDisplayed());
	  System.out.println(KiteLogo.isDisplayed());
	  sassert.assertAll();
  }
  
  @Test
  public void edgeTest()
  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
	  String expTitle= "Facebook- log in or sign up";
	  String ActTitle=driver.getTitle();
	  Assert.assertEquals(expTitle, ActTitle);
  }
}
