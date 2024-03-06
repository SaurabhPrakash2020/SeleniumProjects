package automationscript;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class DoubleClickActionClass {
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/jquery/msg-demo/event-dblclick.php");
		WebElement button=driver.findElement(By.id("b1"));
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();
		
	}

}
