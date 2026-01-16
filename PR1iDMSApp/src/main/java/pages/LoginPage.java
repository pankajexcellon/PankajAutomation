package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    // Locators
    private String mobileNo = "#mobileNo";
    private String otpButton = "#otpButton";
    private String enterOtp = "#enterOtp";
    private String signInButton = "#signInButton";
    private String forwardArrow = "#arrow-forword-icon";
    private String workshopMenu = "#Workshop-menu";
    private String jobCard = "#Job\\ Card";
    private String newJobCard = "#New\\ job\\ card";
    private String Appointment ="#Appointment";

    public void openUrl() {
        page.navigate("https://qa-idms-v3-0.excellonconnect.com");
    }

    public void login() {
        page.fill(mobileNo, "9954922287");
        page.click(otpButton);
        page.fill(enterOtp, "9999");
        page.click(signInButton);
    }
    
    public void navigateToNewAppointment() {
    	 page.click(forwardArrow);
    	 page.click(workshopMenu);
    	 page.click(Appointment);
    }
   
    public void navigateToNewJobCard() {
        page.click(forwardArrow);
        page.click(workshopMenu);
        page.click(jobCard);
        page.click(newJobCard);
    }
}
