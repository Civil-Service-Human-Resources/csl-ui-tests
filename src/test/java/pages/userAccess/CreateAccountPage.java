package pages.userAccess;

import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends pages.BasePage {

    private String url = "https://identity.performance.learn.civilservice.gov.uk/signup/request";
    private String pageTitle = "Create an account - Civil Service Learning";


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        return driver.getTitle().equals(pageTitle);
    }
}
