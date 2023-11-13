package pages.userAccess;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class LoginPage extends pages.BasePage {

    private String url = "https://identity.performance.learn.civilservice.gov.uk/login";
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
    }

    public boolean correctPageTitle() {
        return driver.getTitle().equals(pageTitle);
    }

    public void enterEmail(String emailAddress) {
        emailTextBox.clear();
        emailTextBox.sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void clickContinue() {
        continueBtn.click();
    }

    public void loginWithCredentials(String emailAddress, String password) {
        enterEmail(emailAddress);
        enterPassword(password);
        clickContinue();
    }

    public void clickCreateAccount() {
        linkCreateAccount.click();
    }

    public void clickForgottenYourPassword() {
        linkForgottenYourPassword.click();
    }

}
