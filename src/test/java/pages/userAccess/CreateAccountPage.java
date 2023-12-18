package pages.userAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import static org.testng.Assert.assertTrue;

public class CreateAccountPage extends pages.BasePage {

    private String url = identityBaseUrl + "signup/request";
    private String pageTitle = "Create an account - Civil Service Learning";

    @FindBy(id="email")
    private WebElement emailTextBox;

    @FindBy(id="confirmEmail")
    private WebElement confirmEmailTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement continueBtn;

    @FindBy(xpath = "//a[@href='#email']")
    public WebElement linkEmailAddressError;

    @FindBy(xpath = "//a[@href='#confirmEmail']")
    public WebElement linkConfirmEmailAddressError;

    
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(url);
        assertTrue(emailTextBox.isDisplayed());
        Reporter.log("Loaded Create Account page");
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Loaded Create Account page correctly");
        }
        return equals;
    }

    public void inputEmailAddress(String email) {
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
        Reporter.log("Input Email Address");
    }

    public void inputConfirmEmailAddress(String confirmEmail) {
        confirmEmailTextBox.clear();
        confirmEmailTextBox.sendKeys(confirmEmail);
        Reporter.log("Input Confirm Email Address");
    }

    public void inputMatchingEmailAddresses(String email) {
        inputEmailAddress(email);
        inputConfirmEmailAddress(email);
    }

    public void clickContinueBtn() {
        continueBtn.click();
        Reporter.log("Clicked Continue button");
    }

    public boolean validationShowingEmailAddressNotValid() {
        boolean visible = linkEmailAddressError.isDisplayed();
        boolean text = linkEmailAddressError.getText().equals("Email address is not valid");
        if (visible && text) {
            Reporter.log("Email Address Not Valid message showing");
        }
        return visible && text;
    }

    public boolean validationShowingEmailAddressesDoNotMatch() {
        boolean visible = linkEmailAddressError.isDisplayed();
        boolean text = linkEmailAddressError.getText().equals("Email addresses do not match");
        if (visible && text) {
            Reporter.log("Email Addresses Do Not Match message showing");
        }
        return visible && text;
    }

    public boolean validationShowingPleaseConfirmYourEmail() {
        boolean visible = linkConfirmEmailAddressError.isDisplayed();
        boolean text = linkConfirmEmailAddressError.getText().equals("Please confirm your email address");
        if (visible && text) {
            Reporter.log("Please Confirm Your Email message showing");
        }
        return visible && text;
    }

    public boolean validationShowingYourOrganisationIsUnableToUseThisService() {
        boolean visible = linkEmailAddressError.isDisplayed();
        boolean text = linkEmailAddressError.getText().equals("Your organisation is unable to use this service. Please contact your line manager.");
        if (visible && text) {
            Reporter.log("Your Organisation is Unable to Use This Service message showing");
        }
        return visible && text;
    }
}
