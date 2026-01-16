package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CreateJC extends BaseTest {

    @Test
    public void verifyLoginAndCreateJobCard() {

        LoginPage loginPage = new LoginPage(page);

        loginPage.openUrl();
        loginPage.login();   
        loginPage.navigateToNewJobCard(); 

        System.out.println("Job Card creation Flow Started");
    }
}
