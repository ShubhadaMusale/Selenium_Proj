package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	  WebDriver driver;
	  @Test(priority=1,groups= {"sanity","regression"})
	  public void launch_edge() {
		  System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
	  }
	  @Test(priority=2,groups= {"regression"})
	  public void check_login() {
	  WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login']"));
	  username.sendKeys("shubhada1243@gmail.com");
	  password.sendKeys("123567789");
	  loginBtn.click();
	  }
	  
	  @Test(priority=3,groups= {"regression"})
	   public void check_Title() throws InterruptedException {
	  Thread.sleep(2000); 
	  String expectedTitle="Log in to Facebook";
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle,expectedTitle);
	  }
	  
	  @Test(priority=4,groups= {"sanity"})
	  public void check_forgotpassword() {
	  WebElement ForgotLink=driver.findElement(By.linkText("Forgotten password?"));
	  ForgotLink.click();
	  }
	  
	  @Test(priority=5,groups= {"sanity","regression"})
	  public void tear_down() {
		   driver.close();
	  }
		  
	  }
	  
	  





