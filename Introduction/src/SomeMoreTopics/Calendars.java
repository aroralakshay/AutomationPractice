package SomeMoreTopics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
public class Calendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.chrome.driver", "C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

}
