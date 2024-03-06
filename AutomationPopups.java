package automationscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPopups {

	public static void main(String[] args) throws InterruptedException{
		System.getProperty("WebDriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Dell\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//1st
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		//2nd
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		//3rd
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Hey please be clicked");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		

	}

}
 