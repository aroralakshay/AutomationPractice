package SomeMoreTopics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

public class AlertCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.chrome.driver", "C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys("Lakshay Arora");
		/*
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 */
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		driver.switchTo().alert();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

}
