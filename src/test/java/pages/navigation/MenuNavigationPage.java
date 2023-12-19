package pages.navigation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import pages.BasePage;

public class MenuNavigationPage extends BasePage {
    @FindBy(xpath = "//a[@href='/home']")
    public WebElement linkHome;

    @FindBy(xpath = "//a[@href='/suggestions-for-you']")
    public WebElement linkSuggestionsForYou;

    @FindBy(xpath = "//a[@href='/learning-record']")
    public WebElement linkLearningRecord;

    @FindBy(xpath = "//a[@href='/profile']")
    public WebElement linkProfile;

    @FindBy(xpath = "//a[@href='/skills']")
    public WebElement linkSkills;

    @FindBy(xpath = "//a[@href='https://management.performance.learn.civilservice.gov.uk/content-management/']")
    public WebElement linkAdmin;

    @FindBy(xpath = "//a[contains(@href, 'out')]")
    public WebElement linkSignOut;

    @FindBy(xpath = "//a[contains(@href, 'visibility')]")
    public WebElement linkAddNewCourse;

    @FindBy(xpath = "//a[@href='/reporting']")
    public WebElement linkReporting;
    

    public MenuNavigationPage(WebDriver driver) {
        super(driver);
    }

    public void clickHomeLink() {
        linkHome.click();
        Reporter.log("Clicked Home link");
    }

    public boolean isAtHomePage() {
        boolean equals = driver.getTitle().equals("Your learning – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Home page correctly");
        }
        return equals;
    }

    public void clickSuggestionsForYouLink() {
        linkSuggestionsForYou.click();
        Reporter.log("Clicked Suggestions For You link");
    }

    public boolean isAtSuggestionsForYouPage() {
        boolean equals = driver.getTitle().equals("Suggestions for you – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Suggestions For You page correctly");
        }
        return equals;
    }

    public void clickLearningRecordLink() {
        linkLearningRecord.click();
        Reporter.log("Clicked Learning Record link");
    }

    public boolean isAtLearningRecordPage() {
        boolean equals = driver.getTitle().equals("Learning record – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Learning Record page correctly");
        }
        return equals;
    }

    public void clickProfileLink() {
        linkProfile.click();
        Reporter.log("Clicked Profile link");
    }

    public boolean isAtProfilePage() {
        boolean equals = driver.getTitle().equals("Your profile – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Profile page correctly");
        }
        return equals;
    }

    public void clickSkillsLink() {
        linkSkills.click();
        Reporter.log("Clicked Skills link");
    }

    public boolean isAtSkillsPage() {
        boolean equals = driver.getTitle().equals("Skills – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Skills page correctly");
        }
        return equals;
    }

    public void clickAdminLink() {
        linkAdmin.click();
        Reporter.log("Clicked Admin link");
    }

    public boolean isAtAdminPage() {
        boolean equals = driver.getTitle().equals("Content management - Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Admin page correctly");
        }
        return equals;
    }

    public void clickSignOutLink() {
        linkSignOut.click();
        Reporter.log("Clicked Sign Out link");
    }

    public boolean isAtLoginPage() {
        boolean equals = driver.getTitle().equals("Sign in - Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Login page correctly");
        }
        return equals;
    }

    public boolean isAdminLinkShown() {
        List<WebElement> adminLinks = driver.findElements(By.xpath("//a[@href='https://management.performance.learn.civilservice.gov.uk/content-management/']"));
        if (!adminLinks.isEmpty()) {
            Reporter.log("No Admin link found");
        }
        return !adminLinks.isEmpty();
    }

}
