/**
 * 
 */
package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Lakshay
 *
 */
public class RegularExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[contains(@title,'Sign')]")).click();  //for xpath regular expression
		driver.findElement(By.cssSelector("input[id *='logi']")).sendKeys("hello"); //for css regular expression
	}

}
