package pages.userAccess;

import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends pages.BasePage {

    private String url = identityBaseUrl + "signup/request";
    private String pageTitle = "Create an account - Civil Service Learning";


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        return driver.getTitle().equals(pageTitle);
    }
}
