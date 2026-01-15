package test;
 
import java.util.Set;
 
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class a {
 
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/date/dateadded.html?d1=30&m1=8&y1=2024&type=add&ay=&am=1&aw=&ad=&rec=%22");		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		
		// Add new cookies
		
				Cookie cookie1 = new Cookie("testCookie", "12345");
				driver.manage().addCookie(cookie1);
 
		// Code down this line will get all cookies of the specific page.
 
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
 
		}
 
		// Get Specific cookie by name
 
		Cookie cookie = driver.manage().getCookieNamed("TADAN");
		System.out.println(cookie.getValue());
		
		
 
		driver.quit();
 
	}
}