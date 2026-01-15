package TNG;

import org.testng.annotations.*;

public class DependsOnMethodAnnotation {

	@Test
	public void login() {
		System.out.println("Yes. Login Scessfully");
	}

	@Test(dependsOnMethods = "login")
	public void addToCart() {
		System.out.println("Item added sucessfully but you need to call login first and then come to me");
	}
}
