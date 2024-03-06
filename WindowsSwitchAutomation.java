package automationscript;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitchAutomation {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		String x=driver.getWindowHandle();                     // It will print the unique identifier of that window.
		driver.switchTo().newWindow(WindowType.TAB);                      //It will open the new tab in the same window.
		driver.get("https://www.google.com/");
		System.out.println(driver.getWindowHandle());   //It will print another identifier for google.com
		driver.switchTo().window(x);              //It will go back to window x.(Internet)
		driver.switchTo().newWindow(WindowType.WINDOW);                 //It will open the new Window.
		driver.get("https://www.instagram.com/");                        

	}

}
