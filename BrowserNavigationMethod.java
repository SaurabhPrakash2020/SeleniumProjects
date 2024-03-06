package automationscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserNavigationMethod {

	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.navigate().to("https://www.selenium.dev/documentation/");
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000); 
		driver.navigate().forward();
		Thread.sleep(6000); 
//		driver.navigate().to("https://www.selenium.dev/downloads/");
//		driver.navigate().refresh();;
	}
}
