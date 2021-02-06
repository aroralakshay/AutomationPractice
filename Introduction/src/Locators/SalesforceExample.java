package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SalesforceExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		/*
		driver.findElement(By.id("username")).sendKeys("Lakshay");
		driver.findElement(By.name("pw")).sendKeys("Arora123456");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error.loginError")).getText());
		*/
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("aroralakshay55");  //Standard version
		driver.findElement(By.cssSelector("input#password")).sendKeys("12345"); //using tagName#id formula
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error.loginError")).getText());
		
	}

}
