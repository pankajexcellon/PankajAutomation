package test;

import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class GetAllLinksFromPage {
 
    public static void main(String[] args) {
 
        // 1️⃣ Launch browser
    	WebDriverManager.chromedriver().setup();   
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();             
     	
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        // 2️⃣ Open website
        driver.get("https://www.google.com");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        System.out.println("Scroll sucessfully");
        WebElement element = driver.findElement(By.id("username"));
        js.executeScript("arguments[0].style.border='3px solid red'", element);
 
        // 3️⃣ Find all links (<a> tags)
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
 
        System.out.println("Total Links: " + allLinks.size());
        
 
        // 4️⃣ Loop and print links
        for (WebElement link : allLinks) {
            String linkText = link.getText();
            String url = link.getAttribute("href");
 
            System.out.println("Link Text: " + linkText);
            System.out.println("URL: " + url);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        }
 
        // 5️⃣ Close browser
        driver.quit();
    }
}