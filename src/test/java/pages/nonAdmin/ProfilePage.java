package pages.nonAdmin;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pages.BasePage;

public class ProfilePage extends BasePage {

    private String url = baseUrl + "profile";
    private String pageTitle = "Your profile – Civil Service Learning";

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Loaded Profile page correctly");
        }
        return equals;
    }
}
