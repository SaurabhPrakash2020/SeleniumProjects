package automationscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAuthentication {

	public static void main(String[] args) {
	   
		System.getProperty("WebDriver.chrome.driver","C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
String username="admin";
String password="admin";
String URL="https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
		
	}

}
