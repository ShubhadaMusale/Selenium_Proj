import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String mainwindow=driver.getWindowHandle();
		
		driver.switchTo().frame("frame1");
		
		WebElement frametext=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frametext.getText());
		
		driver.switchTo().parentFrame();
		//driver.switchTo().window(mainwindow);
		
		driver.switchTo().frame("frame2");
		
		WebElement frametext1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frametext1.getText());
		
		

	}

}
