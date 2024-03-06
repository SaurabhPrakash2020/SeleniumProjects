package automationscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import org.openqa.selenium.WebElement;

public class AutomateDropDown {
 static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		
		Select obj=new Select(driver.findElement(By.id("dropdown")));
		obj.selectByIndex(1);
		Thread.sleep(4000);
		obj.selectByValue("2");
		Thread.sleep(5000);
		obj.selectByVisibleText("Option 1");
		// count number of options available in drop down
		
		
		List<WebElement>dropdownvaluescount=obj.getOptions();
		
		System.out.println(dropdownvaluescount.size());

	}

}
