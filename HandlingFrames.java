package automationscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class HandlingFrames {

	public static void main(String[] args)  throws InterruptedException{
		
		System.getProperty("WebDriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Dell\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
      	driver.switchTo().frame("mce_0_ifr");
	    WebElement frame=driver.findElement(By.id("tinymce"));
	    Thread.sleep(5000);
	    frame.clear();
	    Thread.sleep(5000);
	    frame.sendKeys("Hyy i am saurabh testing your website");
	    Thread.sleep(6000);
	    driver.quit();

	}

}
