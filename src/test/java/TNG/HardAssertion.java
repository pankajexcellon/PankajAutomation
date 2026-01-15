package TNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

//	@Test
//	public void hardAssertExample() {
//
//		System.out.println("Step 1");
//
//		Assert.assertEquals("Login", "Home", "Gapp re mismatch zal ye "); // "Login", and "Home", Match hot nhi so failes
//
//		System.out.println("Step 2"); // ❌ Will NOT execute if not match
//	}
//}

@Test
public void hardAssertExample() {
 
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
 
    String actualTitle = driver.getTitle();
    String expectedTitle = "Google";
 
    Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
 
    driver.quit(); // ❌ Will NOT execute if assertion fails
}
}