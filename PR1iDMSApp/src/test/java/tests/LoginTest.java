package tests;

import base.BaseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeClass
    public void setupLogin() {
        loginPage = new LoginPage(page);
        loginPage.openUrl();
        loginPage.login();
        System.out.println("Login Successful - BeforeClass executed");
    }

    @Test
    public void verifyLogin() {
        System.out.println("verifyLogin test executed");
    }

    @Test
    public void verifyLoginAndCreateAppointment() {
        loginPage.navigateToNewAppointment();
        System.out.println("Click on Appointment Successful");
    }

    @Test
    public void verifyLoginAndCreateJobCard() {
        loginPage.navigateToNewJobCard();
        System.out.println("Click on Job Card Successful");
    }
}
