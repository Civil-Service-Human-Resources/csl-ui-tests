package pages.admin.courseAdmin;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pages.BasePage;

public class AddCourseVisibilityPage extends BasePage {

    private String url = adminUrl + "content-management/courses/visibility";
    private String pageTitle = "Add course visibility - Civil Service Learning";

    public AddCourseVisibilityPage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Loaded Add Course Visibility page correctly");
        }
        return equals;
    }
}
