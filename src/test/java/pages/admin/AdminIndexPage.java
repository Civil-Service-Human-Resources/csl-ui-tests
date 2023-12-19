package pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import pages.BasePage;

import static org.testng.Assert.assertTrue;

public class AdminIndexPage extends BasePage {

    private String url = adminUrl + "content-management";
    private String pageTitle = "Content management - Civil Service Learning";

    @FindBy(css = "input[id='q']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@href='/content-management/courses/visibility']")
    public WebElement linkAddNewCourse;

    @FindBy(xpath = "//a[contains(@href, 'organisations')]")
    public WebElement linkManageOrganisations;

    @FindBy(xpath = "//a[@href='/content-management/skills']")
    public WebElement linkManageQuiz;

    

    public AdminIndexPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(url);
        assertTrue(searchBox.isDisplayed());
        Reporter.log("Admin page loaded");
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Admin page loaded correctly");
        }
        return equals;
    }

    public void clickAddNewCourseLink() {
        linkAddNewCourse.click();
        Reporter.log("Add New Course link clicked");
    }

    public void clickManageOrganisationsLink() {
        linkManageOrganisations.click();
        Reporter.log("Manage Organisations link clicked");
    }

    public void clickManageQuizLink() {
        linkManageQuiz.click();
        Reporter.log("Manage Quiz link clicked");
    }
}
