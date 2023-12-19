package pages.reporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import pages.BasePage;

import static org.testng.Assert.assertTrue;

public class ReportingIndexPage extends BasePage {

    private String url = adminUrl + "reporting";
    private String pageTitle = "Reporting - Civil Service Learning";

    @FindBy(xpath = "//*[@id='bookingStartDay']")
    public WebElement inputBookingStartDay;

    @FindBy(xpath = "//*[@id='bookingStartMonth']")
    public WebElement inputBookingStartMonth;

    @FindBy(xpath = "//*[@id='bookingStartYear']")
    public WebElement inputBookingStartYear;

    @FindBy(xpath = "//*[@id='bookingEndDay']")
    public WebElement inputBookingEndDay;

    @FindBy(xpath = "//*[@id='bookingEndMonth']")
    public WebElement inputBookingEndMonth;

    @FindBy(xpath = "//*[@id='bookingEndYear']")
    public WebElement inputBookingEndYear;

    @FindBy(css = "form[action='/reporting/booking-information'] button")
    public WebElement buttonBookingReportDownload;

    @FindBy(css = "input[id='learningRecordStartDay']")
    public WebElement inputLearningRecordStartDay;

    @FindBy(css = "input[id='learningRecordStartMonth']")
    public WebElement inputLearningRecordStartMonth;

    @FindBy(css = "input[id='learningRecordStartYear']")
    public WebElement inputLearningRecordStartYear;

    @FindBy(css = "input[id='learningRecordEndDay']")
    public WebElement inputLearningRecordEndDay;

    @FindBy(css = "input[id='learningRecordEndMonth']")
    public WebElement inputLearningRecordEndMonth;

    @FindBy(css = "input[id='learningRecordEndYear']")
    public WebElement inputLearningRecordEndYear;

    @FindBy(css = "form[action='/reporting/learner-record'] button[data-module='govuk-button']")
    public WebElement buttonLearnerRecordReportDownload;

    
    
    public ReportingIndexPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(url);
        assertTrue(inputBookingStartDay.isDisplayed());
        Reporter.log("Navigated to Reporting page");
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Loaded Reporting Index page correctly");
        }
        return equals;
    }
}
