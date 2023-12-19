package pages.admin.QuizAdmin;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pages.BasePage;

public class ManageQuizPage extends BasePage {

    private String url = adminUrl + "content-management/skills";
    private String pageTitle = "Add a new skills quiz - Civil Service Learning";

    public ManageQuizPage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Loaded Manage Quiz page correctly");
        }
        return equals;
    }
}
