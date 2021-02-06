package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("//div[@id = 'container']/div/input")).sendKeys("34+35");  //using parent child relation
		driver.findElement(By.cssSelector("button#search-icon-legacy")).click();   //using tagname#id
		driver.findElement(By.xpath(".//*[@id = 'video-title']")).click();  //Relative Path
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input[name = 'search_query']")).sendKeys("positions"); //using tagname[attribute = 'value']
		driver.findElement(By.cssSelector("button.style-scope.ytd-searchbox")).click(); //using button.className
		
	}

}
