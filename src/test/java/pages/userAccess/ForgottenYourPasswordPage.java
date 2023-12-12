package pages.userAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertTrue;

public class ForgottenYourPasswordPage extends pages.BasePage {

    private String url = identityBaseUrl + "reset";
    private String pageTitle = "Reset your password - Civil Service Learning";

    @FindBy(css = "input[id='email']")
    public WebElement inputEmail;

    @FindBy(css = "input[class='button']")
    public WebElement inputContinue;

    @FindBy(css = "input:invalid")
    public WebElement fieldValidation;
    
    public ForgottenYourPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(url);
        assertTrue(inputEmail.isDisplayed());
    }
    public boolean correctPageTitle() {
        return driver.getTitle().equals(pageTitle);
    }
    
    public void inputEmailAddress(String email) {
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void clickContinue() {
        inputContinue.click();
    }

    public void inputEmailAndContinue(String email) {
        inputEmailAddress(email);
        clickContinue();
    }

    public boolean emailValidationDisplayed() {
        boolean isDisplayed = fieldValidation.isDisplayed();
        boolean correctValidation = inputEmail.getAttribute("validationMessage").contains("Please include an '@' in the email address.");
        return isDisplayed && correctValidation;
    }
}
