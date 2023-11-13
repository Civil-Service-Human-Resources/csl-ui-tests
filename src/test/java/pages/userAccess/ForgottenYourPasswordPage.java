package pages.userAccess;

import org.openqa.selenium.WebDriver;

public class ForgottenYourPasswordPage extends pages.BasePage {

    private String url = "https://identity.performance.learn.civilservice.gov.uk/reset";
    private String pageTitle = "Reset your password - Civil Service Learning";

    public ForgottenYourPasswordPage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        return driver.getTitle().equals(pageTitle);
    }
}
