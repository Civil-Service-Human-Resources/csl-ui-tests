package pages.admin.organisationAdmin;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pages.BasePage;

public class ManageOrganisationsPage extends BasePage {

    private String url = adminUrl + "content-management/organisations/manage";
    private String pageTitle = "Manage organisations - Civil Service Learning";

    public ManageOrganisationsPage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Loaded Manage Organisations page correctly");
        }
        return equals;
    }
}
