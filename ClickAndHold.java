package automationscript;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
		WebElement button=driver.findElement(By.id("1"));
		Actions act=new Actions(driver);
		act.clickAndHold(button).build().perform();
	;
	}

}
