import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readproperties {

	public static void main(String[] args)throws IOException
	{
		FileInputStream  filesrc=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\config.properties");
		Properties prop=new Properties();
		prop.load(filesrc);
		
		System.setProperty(prop.getProperty("key"),prop.getProperty("driverpath"));
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
	    WebElement UserID=driver.findElement(By.id("email"));
	   UserID.sendKeys(prop.getProperty("username"));
	    
	    WebElement Password=driver.findElement(By.id("pass"));
	    Password.sendKeys(prop.getProperty("password"));
		
		//How to capture a screen shot
		//call TakeScreenShot interface
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    
	    //call getScreenshotAs method for capture a screenshot
	    File srcfile=ts.getScreenshotAs(OutputType.FILE);
	    
	    //for moving that screenshot for different location use fileutils
	   // FileUtils.copyFile(srcfile,new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\screenshot\\facebook.jpeg"));
	    
	    FileUtils.copyFile(srcfile,new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Proj\\screenshot\\"+timestamp()+".jpeg"));
	    
	}
	public static String  timestamp()
	{
		return new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss").format(new Date());
			
	
		
	    
		

	}

}
