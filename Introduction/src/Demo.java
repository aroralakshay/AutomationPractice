import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty
		("webdriver.chrome.driver", "C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com"); //hit url on the browser
		System.out.println(driver.getTitle()); //getTitle prints the title of the website
		System.out.println(driver.getCurrentUrl()); //used to validate if we landed on current url
		System.out.println(driver.getPageSource()); //used to get the page source(when we right click we get option to view page source)
		driver.get("http://yahoo.com");
		driver.navigate().back();  //this function navigate back from yahoo to google
		driver.navigate().forward(); //this function again navigate forward to yahoo
		//driver.close(); //closes the current browser
		driver.quit(); //it closes all the browsers opened by slenium
		                                                
	}

}
