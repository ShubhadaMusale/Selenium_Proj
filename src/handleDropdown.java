import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Selectoption=driver.findElement(By.xpath("//div[text()='Select Option']"));
		Selectoption.click();
		
		WebElement opt1=driver.findElement(By.xpath("//*[text()='Group 1, option 1']"));
		opt1.click();
		
		WebElement oldselect=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select oselect=new Select(oldselect);
		//oselect.selectByIndex(3);
		//oselect.selectByVisibleText("Voilet");
		oselect.selectByValue("6");
		
				
				
				
				
		
		
		

	}

}
