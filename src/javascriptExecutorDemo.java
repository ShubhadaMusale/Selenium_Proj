import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class javascriptExecutorDemo {
	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement LoginBtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		WebElement ResetBtn=driver.findElement(By.xpath("//input[@name='btnReset']"));
		
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		
		//pass the custom alert using java script executor
		js.executeScript("alert('welcome to Guru 99 login page');");
		driver.switchTo().alert().accept();
		
		//passing the value in text box use java script value method
		js.executeScript("arguments[0].value='mngr422489';",username);
		js.executeScript("arguments[0].value='EgEsume'",password);
		//click using java script executor
		//WebDriverWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(LoginBtn));
		js.executeScript("arguments[0].click()",LoginBtn);
		
		//js.executeScript("window.scrollBy(0,600)");
		
		WebElement changepassword=driver.findElement(By.xpath("//a[text()='Change Password']"));
		js.executeScript("arguments[0].scrollIntoView(true)",changepassword);
		
		js.executeScript("window.location='https://www.amazon.in'");
		WebElement abc=driver.findElement(By.xpath("//h2[text()='Cookware & dining']"));
		js.executeScript("arguments[0].scrollIntoView(true)",abc);
		
		js.executeScript("location.reload()");
		
		
		

	}
	
		

	}


