package automationscript;
import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	    List<WebElement>list=driver.findElements(By.tagName("frame"));
	    System.out.println(list.size());
	    driver.switchTo().frame(1);     //Entering into frame 1.
	    String str=driver.findElement(By.tagName("body")).getText();
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame("frame-top");
	    driver.switchTo().frame("frame-right");
	    String framee=driver.findElement(By.tagName("body")).getText();
	    System.out.println(framee);
	    driver.switchTo().defaultContent();
	    driver.quit();

	}

}
