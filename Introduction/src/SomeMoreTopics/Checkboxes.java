package SomeMoreTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.chrome.driver", "C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).click();
	    Assert.assertTrue(driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).isSelected());
	    if(driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).isSelected() == true) {
	    	Thread.sleep(2000);
	    	driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).click(); //uncheck
	    }
		
		
		//Counting number of checboxes
	     List<WebElement> element = 	driver.findElements(By.xpath("//input[@type='checkbox']"));
	     Assert.assertEquals(element.size(), 6);
		
		
	}

}
