package automationscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AutomationCheckBox {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	    WebElement checkbox=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
	    checkbox.click();
	    Thread.sleep(5000);
	    checkbox.click();
	    
		
		
	}

}
