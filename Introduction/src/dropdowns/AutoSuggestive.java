package dropdowns;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.chrome.driver", "C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> lists = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		//List<WebElement> lists = driver.findElements(By.xpath("li[class='ui-menu-item'] a")); //byCssselector
		for(WebElement element : lists) {
			if(element.getText().equalsIgnoreCase("India")) {
				element.click();
				break;
			}
		}
	}

}
