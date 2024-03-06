package automationscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {

	public static void main(String[] args) {
		//Step1- To Provide the path of your driver
		System.setProperty("webdriver.chrome.driver", "D:\\ccc\\chromedriver-win64\\");

         
		//Ste2-To instantiate a chromeDrive class
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
	}

}
