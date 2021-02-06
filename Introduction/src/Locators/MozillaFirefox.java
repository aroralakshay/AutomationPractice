package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Learnings\\Selenium"
				+ "\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.xpath("//a[contains(@href, 'https')]")).click();
		driver.findElement(By.cssSelector("a[href *= 'https://www.facebook.com']")).click();
		

	}

}
