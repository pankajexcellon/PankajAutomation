package test;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_UP_DOWN {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.timeanddate.com/date/dateadded.html?d1=30&m1=8&y1=2024&type=add&ay=&am=1&aw=&ad=&rec=");
       
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        
        Thread.sleep(3000);
        act.sendKeys(Keys.PAGE_UP).perform();
        
        Thread.sleep(5000);
        driver.quit();
		}
	}
