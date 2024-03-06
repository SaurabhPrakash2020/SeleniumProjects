package automationscript;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadSelenium {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement file=driver.findElement(By.id("file-upload"));
		file.sendKeys("C:\\Users\\Dell\\OneDrive\\Desktop\\Main.java");           //file uploaded
        WebElement submit=driver.findElement(By.id("file-submit"));
        submit.click();
        
		
		

	}

}
