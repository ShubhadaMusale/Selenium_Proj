package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class CrossBrowserTest {
	public WebDriver driver;
	@Test
  public void login() {
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn=driver.findElement(By.xpath("//button[@name='login']"));
		
		username.sendKeys("shubhada1234@gmail.com");
		password.sendKeys("123456791");
		LoginBtn.click();
	}
	@Test
	public void checktitleTest() {
		String expectedTitle = "Facebook-log in or sign up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle);
	}
	@Test
	public void teardown()
	{
		//driver.close();
		}
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com");
		System.out.println("Thread Id"+Thread.currentThread().getId());
		
	}

}


			
			
		

	
		
	
  

