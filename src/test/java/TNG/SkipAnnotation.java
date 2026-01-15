package TNG;

import org.testng.SkipException;
import org.testng.annotations.*;

public class SkipAnnotation {

	@Test(priority = 1)
	public void TC1() {
		System.out.println("Test Case 1");
	}

	@Test(enabled = false)
	public void TC2() {
		System.out.println("Test Case 2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@Test(enabled = false)
	public void skipmethod() {
		System.out.println("Skipped this method as mention annotation");

	}

	@Test
	public void Skipexception() {
		boolean serverDown = true;

		if (serverDown) {
			throw new SkipException("Skipping because server is down");
		}
	}

}