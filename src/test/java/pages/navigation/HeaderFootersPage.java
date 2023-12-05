package pages.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class HeaderFootersPage extends BasePage {
    @FindBy(css = "html > body > div:nth-of-type(1) > p > a")
    public WebElement linkCookiesBanner;

    @FindBy(css = "a[id='logo']")
    public WebElement linkGovUkLogo;

    @FindBy(css = "a[id='proposition-name']")
    public WebElement linkCivilServiceLearning;

    @FindBy(css = "a[rel='noopener noreferrer']")
    public WebElement linkFeedback;

    @FindBy(css = "html > body > footer > div > div > div:nth-of-type(1) > ul > li:nth-of-type(1) > a")
    public WebElement linkCookies;

    @FindBy(css = "html > body > footer > div > div > div:nth-of-type(1) > ul > li:nth-of-type(2) > a")
    public WebElement linkPrivacy;

    @FindBy(css = "html > body > footer > div > div > div:nth-of-type(1) > ul > li:nth-of-type(3) > a")
    public WebElement linkContactUs;

    @FindBy(css = "html > body > footer > div > div > div:nth-of-type(1) > ul > li:nth-of-type(4) > a")
    public WebElement linkAccessibilityStatement;

    @FindBy(css = "html > body > footer > div > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li > a")
    public WebElement linkBuiltByCslPlatform;

    @FindBy(css = "html > body > footer > div > div > div:nth-of-type(1) > div:nth-of-type(2) > p:nth-of-type(2) > a")
    public WebElement linkOpenGovernmentLicence;

    @FindBy(css = "div[class='copyright'] a")
    public WebElement linkCrownCopyright;


    public HeaderFootersPage(WebDriver driver) {
        super(driver);
    }

    public void clickCookiesBanner() {
        linkCookiesBanner.click();
    }

    public boolean isAtCookiesPage() {
        return driver.getTitle().equals("Cookies – Civil Service Learning");
    }

    public void clickGovUkIcon() {
        linkGovUkLogo.click();
    }

    public boolean isAtGovUkPage() {
        return driver.getTitle().equals("Welcome to GOV.UK");
    }

    public void clickCslHomeLink() {
        linkCivilServiceLearning.click();
    }

    public boolean isAtCslHomePage() {
        return driver.getTitle().equals("Your learning – Civil Service Learning");
    }

    public void clickFeedbackLink() {
        linkFeedback.click();
        String originalWindow = driver.getWindowHandle();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public boolean isAtFeedbackPage() {
        return driver.getTitle().equals("Qualtrics Survey | Qualtrics Experience Management");
    }

    public void clickCookiesLink() {
        linkCookies.click();
    }

    public void clickPrivacyLink() {
        linkPrivacy.click();
    }

    public boolean isAtPrivacyPage() {
        return driver.getTitle().equals("Privacy – Civil Service Learning");
    }

    public void clickContactUsLink() {
        linkContactUs.click();
    }

    public boolean isAtContactUsPage() {
        return driver.getTitle().equals("Contact us – Civil Service Learning");
    }

    public void clickAccessibilityStatementLink() {
        linkAccessibilityStatement.click();
    }

    public boolean isAtAccessibilityStatementPage() {
        return driver.getTitle().equals("Accessibility – Civil Service Learning");
    }

    public void clickBuiltByCslPlatformLink() {
        linkBuiltByCslPlatform.click();
    }

    public void clickOpenGovernmentLicenceLink() {
        linkOpenGovernmentLicence.click();
    }

    public boolean isAtOpenGovernmentLicencePage() {
        return driver.getTitle().equals("Open Government Licence");
    }

    public void clickCrownCopyrightLink() {
        linkCrownCopyright.click();
    }

    public boolean isAtCrownCopyrightPage() {
        return driver.getTitle().equals("Crown copyright - Re-using PSI");
    }

}
