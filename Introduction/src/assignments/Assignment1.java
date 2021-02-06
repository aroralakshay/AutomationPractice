package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.chrome.driver", "C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		List<WebElement> element = driver.findElements(By.xpath("//input[@type='checkbox']"));
		WebElement e1 = driver.findElement(By.id("checkBoxOption1"));
		e1.click();
		System.out.println(e1.isSelected());
		Thread.sleep(200);
		e1.click();
		System.out.println(e1.isSelected());
		System.out.println(element.size());

	}

}
