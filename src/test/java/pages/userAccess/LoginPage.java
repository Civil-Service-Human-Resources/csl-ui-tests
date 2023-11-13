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

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo(WebDriver driver) {
        driver.get(url);
        assertTrue(emailTextBox.isDisplayed());
    }

    public boolean correctPageTitle(WebDriver driver) {
        return driver.getTitle().equals(pageTitle);
    }

}
