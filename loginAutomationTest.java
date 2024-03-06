package automationscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class loginAutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximize the browser 

		//Accessing website
		driver.get("https://vtop.vitbhopal.ac.in/vtop/login");
		
		//Provide Username
		WebElement username=driver.findElement(By.id("username"));
		username.isDisplayed();
		username.isEnabled();		
		username.sendKeys("20BCE11005");
		
		//provide password
		
		WebElement password=driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("N829ADVJ5E");
		
		//Click on Login
		
		WebElement loginButton=driver.findElement(By.id("submitBtn"));
		loginButton.isDisplayed();
		loginButton.isEnabled();
		loginButton.click();
		
		//Asserting to ensure that login worked properly
		WebElement welcome=driver.findElement(By.id("welcome"));
		String actual=welcome.getText();
		String ExpectedValue="Welcome Paul";
		if(actual==ExpectedValue)
		{
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("failed");
		}
		
		
		

	}

}
