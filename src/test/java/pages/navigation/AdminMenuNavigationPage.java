package pages.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminMenuNavigationPage extends BasePage {
    @FindBy(xpath = "/html/body/div/div[2]/div/nav/a[1]")
    public WebElement linkHome;

    @FindBy(xpath = "//a[contains(@href, 'you')]")
    public WebElement linkSuggestionsForYou;

    @FindBy(xpath = "//a[contains(@href, 'record')]")
    public WebElement linkLearningRecord;

    @FindBy(xpath = "//a[contains(@href, 'profile')]")
    public WebElement linkProfile;

    @FindBy(xpath = "//a[@href='https://performance.learn.civilservice.gov.uk/skills']")
    public WebElement linkSkills;

    @FindBy(xpath = "//a[@href='/content-management']")
    public WebElement linkAdmin;

    @FindBy(xpath = "//a[@href='/reporting']")
    public WebElement linkReporting;

    @FindBy(xpath = "//a[contains(@href, 'out')]")
    public WebElement linkSignOut;

    

    public AdminMenuNavigationPage(WebDriver driver) {
        super(driver);
    }

    public void clickHomeLink() {
        linkHome.click();
    }

    public boolean isAtHomePage() {
        return driver.getTitle().equals("Your learning – Civil Service Learning");
    }

    public void clickSuggestionsForYouLink() {
        linkSuggestionsForYou.click();
    }

    public boolean isAtSuggestionsForYouPage() {
        return driver.getTitle().equals("Suggestions for you – Civil Service Learning");
    }

    public void clickLearningRecordLink() {
        linkLearningRecord.click();
    }

    public boolean isAtLearningRecordPage() {
        return driver.getTitle().equals("Learning record – Civil Service Learning");
    }

    public void clickProfileLink() {
        linkProfile.click();
    }

    public boolean isAtProfilePage() {
        return driver.getTitle().equals("Your profile – Civil Service Learning");
    }

    public void clickSkillsLink() {
        linkSkills.click();
    }

    public boolean isAtSkillsPage() {
        return driver.getTitle().equals("Skills – Civil Service Learning");
    }

    public void clickAdminLink() {
        linkAdmin.click();
    }

    public boolean isAtAdminPage() {
        return driver.getTitle().equals("Content management – Civil Service Learning");
    }

    public void clickReportingLink() {
        linkReporting.click();
    }

    public boolean isAtReportingPage() {
        return driver.getTitle().equals("Reporting – Civil Service Learning");
    }

    public void clickSignOutLink() {
        linkSignOut.click();
    }

    public boolean isAtLoginPage() {
        return driver.getTitle().equals("Sign in – Civil Service Learning");
    }
}
