package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Appointment extends BaseTest {

    @Test
    public void verifyLoginAndCreateAppointment() {

        LoginPage loginPage = new LoginPage(page);

        loginPage.openUrl();
        loginPage.login();
        loginPage.navigateToNewAppointment();

        System.out.println("Job Card creation Flow Started");
    }
}
