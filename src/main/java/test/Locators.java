package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();			
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        
        Thread.sleep(2000);
        driver.findElement(By.id("alert")).click();  // Locate By ID
        driver.findElement(By.name("Create Appointment"));	// Locate By name       
		driver.findElement(By.className("login-btn"));	// Locate By className
		driver.findElement(By.tagName(""));				// Locate By tagName
		driver.findElement(By.linkText(""));			// Locate By linkText
		driver.findElement(By.partialLinkText(""));		// Locate By partialLinkText
		
		// Locate By Absolute xpath //
		
		driver.findElement(By.xpath("/html/body/div[1]/form/input\r\n"));
		
		// Below Locate By Relative xpath //
		
		driver.findElement(By.xpath("//input[@id='email']"));						
		driver.findElement(By.xpath("//button[text()='Login']"));
		driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'user')]"));
		driver.findElement(By.xpath("//input[@type='text' and @name='username']"));
		driver.findElement(By.xpath("//input[@id='email']/parent::div"));
		driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
		
        
		
		driver.findElement(By.cssSelector("By ID - #email"));
		driver.findElement(By.cssSelector("By Class - .login-btn"));
		driver.findElement(By.cssSelector("Attribute Selector - input[name='password']"));
		driver.findElement(By.cssSelector("contains (*) - input[id*='user']"));
		driver.findElement(By.cssSelector("starts-with (^) - input[id^='user']"));
		
        driver.quit();
	}

}
