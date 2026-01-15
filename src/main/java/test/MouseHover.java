package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		Actions act = new Actions(driver);
			
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
 
        Thread.sleep(2000);
        WebElement menu = driver.findElement(By.xpath("//*[@class='header_soc_twitter']"));

        Thread.sleep(2000);
        act.moveToElement(menu).perform(); 	// Performed Action
//        
//        Thread.sleep(2000);
//        act.click(menu).perform(); 			// Click    
//        
//        Thread.sleep(2000);
//        act.contextClick(menu).perform(); 	// Right Click (Context Click)
        
                  
        WebElement menu1 = driver.findElement(By.xpath("//*[@title='GlobalSQA']"));      
            
        
        Thread.sleep(2000);
        act.moveToElement(menu1).perform();
        
        Thread.sleep(2000);
        act.doubleClick(menu1).perform();
        
        Thread.sleep(2000);
		driver.quit();
	}

}
