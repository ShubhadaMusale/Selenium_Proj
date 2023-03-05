import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActionDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
		WebElement DoubleClickBtn=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement DynamicClickBtn=driver.findElement(By.xpath("//button[text()='Click Me']"));
		//WebElement Buttons=driver.findElement(By.xpath("//span[(text()='Buttons']"));
		
		act.doubleClick(DoubleClickBtn).perform();
		act.contextClick(RightClickBtn).perform();
		
		//act.moveToElement(Buttons).perform();
		
		act.click(DynamicClickBtn).perform();
		
		
		WebElement BookStore=driver.findElement(By.xpath("//div[text()='Book Store Application']"));
		act.moveToElement(BookStore).perform();
		
		//Drag and Drop
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement DragMe=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement DropHere=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
		
		WebElement Ineractions=driver.findElement(By.xpath("//div[text()='Interactions']"));
		
		act.moveToElement(Ineractions).perform();
		
		//Thread.sleep(5000);
		act.dragAndDrop(DragMe, DropHere).build().perform();
		
		
		driver.get("https://www.naukri.com/");
		
		WebElement forEmployee=driver.findElement(By.xpath("//div[text()='For employers']"));
		act.moveToElement(forEmployee).perform();
		
		WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(jobs).perform();
	
		
				
		
		

	}

}
