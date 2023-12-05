package pages.userAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

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
    }

    public boolean correctPageTitle() {
        return driver.getTitle().equals(pageTitle);
    }

    public void inputEmailAddress(String email) {
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
    }

    public void inputConfirmEmailAddress(String confirmEmail) {
        confirmEmailTextBox.clear();
        confirmEmailTextBox.sendKeys(confirmEmail);
    }

    public void inputMatchingEmailAddresses(String email) {
        inputEmailAddress(email);
        inputConfirmEmailAddress(email);
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }

    public boolean validationShowingEmailAddressNotValid() {
        boolean visible = linkEmailAddressError.isDisplayed();
        boolean text = linkEmailAddressError.getText().equals("Email address is not valid");
        return visible && text;
    }

    public boolean validationShowingEmailAddressesDoNotMatch() {
        boolean visible = linkEmailAddressError.isDisplayed();
        boolean text = linkEmailAddressError.getText().equals("Email addresses do not match");
        return visible && text;
    }

    public boolean validationShowingPleaseConfirmYourEmail() {
        boolean visible = linkConfirmEmailAddressError.isDisplayed();
        boolean text = linkConfirmEmailAddressError.getText().equals("Please confirm your email address");
        return visible && text;
    }

    public boolean validationShowingYourOrganisationIsUnableToUseThisService() {
        boolean visible = linkEmailAddressError.isDisplayed();
        boolean text = linkEmailAddressError.getText().equals("Your organisation is unable to use this service. Please contact your line manager.");
        return visible && text;
    }
}
