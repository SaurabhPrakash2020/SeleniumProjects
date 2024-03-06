package automationscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class automationRadioButton {

	public static void main(String[] args) {
		
		System.getProperty("WebDriver.chrome.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Dell\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement radioButton=driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		radioButton.click();
		radioButton.isDisplayed();
		radioButton.isEnabled();
		radioButton.isSelected();
		System.out.println(radioButton.getText());
		System.out.println(radioButton.getAttribute("class"));
		System.out.println(radioButton.getTagName());		
	}

}
