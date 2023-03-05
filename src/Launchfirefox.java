import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecho.driver","E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com");
	}

}
