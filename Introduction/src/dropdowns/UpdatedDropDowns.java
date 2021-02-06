package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.chrome.driver", "C:\\Learnings\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement element = null;
		Select dropDown = null;
		String[] d = new String[3];
		d[0] = driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).toString();
		d[1] = driver.findElement(By.id("ctl00_mainContent_ddl_Child")).toString();
		d[2] = driver.findElement(By.id("ctl00_mainContent_ddl_Infant")).toString(); 
		
		for(int i = 0; i<d.length;i++) {
			if(d[i].contains("Adult")) {
     		element = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
    		dropDown = new Select(element);
    		dropDown.selectByIndex(4);
				
			} else if(d[i].contains("Child")) {
				element = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
	    		dropDown = new Select(element);
	    		dropDown.selectByVisibleText("2");
			} else {
				element = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
	    		dropDown = new Select(element);
	    		dropDown.selectByVisibleText("1");
			}
		}
		 
		
		
		
		
	}

}
