package automationscript;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAutomation {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
		Actions act=new Actions(driver);
		act.click(userName).sendKeys(Keys.TAB).sendKeys("Admin123").sendKeys(Keys.ENTER).build().perform();
		

	}

}
