package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class DropdownExample {
    public static void main(String[] args) {
 
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
 
        WebElement dropdown = driver.findElement(By.id("india"));
        Select select = new Select(dropdown);
 
        // Select by visible text
        select.selectByVisibleText("India");
 
        // Select by value
        select.selectByValue("us");
 
        // Select by index
        select.selectByIndex(2);
 
        driver.quit();
    }
}

 