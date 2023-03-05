

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Locator Id
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("xyz1234@gmail.com");
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("124567345");
		
		Email.clear();
		Password.clear();
		
		WebElement Email1=driver.findElement(By.className("inputtext"));
		Email1.sendKeys("xyz1234@gmail.com");
		
		
		WebElement Password1=driver.findElement(By.name("pass"));
		Password1.sendKeys("1234569872");
		
		WebElement LoginBtn=driver.findElement(By.tagName("button"));
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
	     System.out.println(links.size());
	     
	     List<WebElement>divs=driver.findElements(By.tagName("div"));
	     System.out.println(divs.size());
	     
	     List<WebElement>Images=driver.findElements(By.tagName("img"));
	     System.out.println(Images.size());
	     
	     WebElement ForgotPassword=driver.findElement(By.linkText("Forgotten password?"));
	     ForgotPassword.click();
	     
	     driver.get("https://kite.zerodha.com/");
	     WebElement  Login=driver.findElement(By.className("button-orange"));
	     Login.click();
	     
				
	     

	}

}
