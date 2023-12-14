package pages.userAccess;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import static org.testng.Assert.assertTrue;

public class LoginPage extends pages.BasePage {

    private String url = identityBaseUrl + "login";
    private String pageTitle = "Sign in - Civil Service Learning";

    @FindBy(id="email-address")
    private WebElement emailTextBox;

    @FindBy(id="password")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueBtn;

    @FindBy(xpath = "//a[@href='/reset']")
    public WebElement linkForgottenYourPassword;

    @FindBy(xpath = "//a[@href='/signup/request']")
    public WebElement linkCreateAccount;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(url);
        assertTrue(emailTextBox.isDisplayed());
        Reporter.log("Login page loaded");
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Login page loaded correctly");
        }
        return equals;
    }

    public void enterEmail(String emailAddress) {
        emailTextBox.clear();
        emailTextBox.sendKeys(emailAddress);
        Reporter.log("Input Email Address");
    }

    public void enterPassword(String password) {
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
        Reporter.log("Input Password");
    }

    public void clickContinue() {
        continueBtn.click();
        Reporter.log("Clicked Continue button");
    }

    public void loginWithCredentials(String emailAddress, String password) {
        enterEmail(emailAddress);
        enterPassword(password);
        clickContinue();
    }

    public void clickCreateAccount() {
        linkCreateAccount.click();
        Reporter.log("Clicked Create Account link");
    }

    public void clickForgottenYourPassword() {
        linkForgottenYourPassword.click();
        Reporter.log("Clicked Forgotten Your Password link");
    }

}
