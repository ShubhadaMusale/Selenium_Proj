import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardDemo {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://demoqa.com/text-box");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     Actions act=new Actions(driver);
     
     WebElement Fullname=driver.findElement(By.xpath("//input[@id='userName']"));
     act.sendKeys(Fullname,"Ravi Basaveshwar Nangare").perform();
     act.sendKeys(Keys.TAB).perform();
     act.sendKeys("ravinangare@gmail.com").perform();
     act.sendKeys("At Post Lokhandi Sawargaon Tal Ambajogai Dist Beed PIN 431517");
     
     
     //SELECT THE ADDRESS
     act.keyDown(Keys.CONTROL);
     act.sendKeys("a");
     act.build().perform();
     
     act.keyUp(Keys.CONTROL).perform();
     
     //COPY THE ADDRESS
     
     act.keyDown(Keys.CONTROL).perform();
     act.sendKeys("c");
     act.build().perform();
     
     act.keyUp(Keys.CONTROL).perform();
     
     //Paste the address in permenant address text box
     act.sendKeys(Keys.TAB).perform();
     act.keyDown(Keys.CONTROL);
     act.sendKeys("v");
     act.build().perform();
     
     
     
     
     
	}
	

}
