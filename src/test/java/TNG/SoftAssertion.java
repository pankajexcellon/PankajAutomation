package TNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

@Test

public void softAssertionTest() {
 
    SoftAssert softAssert = new SoftAssert();
 
    System.out.println("Step 1");
 
    softAssert.assertEquals("Login", "Home", "Title mismatch");
 
    System.out.println("Step 2");
 
    softAssert.assertTrue(false, "Condition failed");
 
    System.out.println("Step 3");
 
    softAssert.assertAll(); // Mandatory

}

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

