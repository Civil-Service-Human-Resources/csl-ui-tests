package pages.navigation;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    

    public MenuNavigationPage(WebDriver driver) {
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

    public void clickSignOutLink() {
        linkSignOut.click();
    }

    public boolean isAtLoginPage() {
        return driver.getTitle().equals("Sign in - Civil Service Learning");
    }

    public boolean isAdminLinkShown() {
        List<WebElement> adminLinks = driver.findElements(By.xpath("//a[@href='https://management.performance.learn.civilservice.gov.uk/content-management/']"));
        return !adminLinks.isEmpty();
    }

}
