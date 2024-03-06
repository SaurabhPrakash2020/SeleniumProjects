package automationscript;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class AutomationRightClick {

	public static void main(String[] args) {
	    
		System.setProperty("WebDriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");	
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    WebElement images=driver.findElement(By.xpath("//a[normalize-space()=\"Images\"]"));
	    
	    
	    //Using Action class
	    
	    Actions act=new Actions(driver);
	    
	    act.contextClick(images).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	    
	}

}
