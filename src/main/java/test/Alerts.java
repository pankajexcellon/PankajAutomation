package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
			
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
 
        Thread.sleep(2000);
       driver.findElement(By.id("alert")).click();     
        
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        Thread.sleep(2000);
        driver.quit();

	}

}
