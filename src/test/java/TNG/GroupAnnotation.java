package TNG;

import org.testng.annotations.Test;

public class GroupAnnotation {
 
    @Test(groups = {"smoke"})
    public void verifyLogin() {
        System.out.println("Smoke Login test");
    }
 
    @Test(groups = {"regression"})
    public void verifyForgotPassword() {
        System.out.println("regression-Forgot Password test");
    }
 
    @Test(groups = {"smoke", "regression"})
    public void verifyLogout() {
        System.out.println("Smoke and regression-Logout test");
    }
}