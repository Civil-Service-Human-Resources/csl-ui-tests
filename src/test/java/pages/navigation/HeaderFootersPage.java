package pages.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
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
        Reporter.log("Clicked Cookies Banner link");
    }

    public boolean isAtCookiesPage() {
        boolean equals = driver.getTitle().equals("Cookies – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Cookies page");
        }
        return equals;
    }

    public void clickGovUkIcon() {
        linkGovUkLogo.click();
        Reporter.log("Clicked GOV.UK link");
    }

    public boolean isAtGovUkPage() {
        boolean equals = driver.getTitle().equals("Welcome to GOV.UK");
        if (equals) {
            Reporter.log("Loaded GOV.UK page");
        }
        return equals;
    }

    public void clickCslHomeLink() {
        linkCivilServiceLearning.click();
        Reporter.log("Clicked CSL Home link");
    }

    public boolean isAtCslHomePage() {
        boolean equals = driver.getTitle().equals("Your learning – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Home page");
        }
        return equals;
    }

    public void clickFeedbackLink() {
        linkFeedback.click();
        Reporter.log("Clicked Feedback link");
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
        boolean equals = driver.getTitle().equals("Qualtrics Survey | Qualtrics Experience Management");
        if (equals) {
            Reporter.log("Loaded Feedback page");
        }
        return equals;
    }

    public void clickCookiesLink() {
        linkCookies.click();
        Reporter.log("Clicked Cookies link");
    }

    public void clickPrivacyLink() {
        linkPrivacy.click();
        Reporter.log("Clicked Privacy link");
    }

    public boolean isAtPrivacyPage() {
        boolean equals = driver.getTitle().equals("Privacy – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Privacy page");
        }
        return equals;
    }

    public void clickContactUsLink() {
        linkContactUs.click();
        Reporter.log("Clicked Contact Us link");
    }

    public boolean isAtContactUsPage() {
        boolean equals = driver.getTitle().equals("Contact us – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Contact Us page");
        }
        return equals;
    }

    public void clickAccessibilityStatementLink() {
        linkAccessibilityStatement.click();
        Reporter.log("Clicked Accessibility Statement link");
    }

    public boolean isAtAccessibilityStatementPage() {
        boolean equals = driver.getTitle().equals("Accessibility – Civil Service Learning");
        if (equals) {
            Reporter.log("Loaded Accessibility page");
        }
        return equals;
    }

    public void clickBuiltByCslPlatformLink() {
        linkBuiltByCslPlatform.click();
        Reporter.log("Clicked Built By CSL Platform link");
    }

    public void clickOpenGovernmentLicenceLink() {
        linkOpenGovernmentLicence.click();
        Reporter.log("Clicked Open Government Licence link");
    }

    public boolean isAtOpenGovernmentLicencePage() {
        boolean equals = driver.getTitle().equals("Open Government Licence");
        if (equals) {
            Reporter.log("Loaded Open Government Licence page");
        }
        return equals;
    }

    public void clickCrownCopyrightLink() {
        linkCrownCopyright.click();
        Reporter.log("Clicked Crown Copyright link");
    }

    public boolean isAtCrownCopyrightPage() {
        boolean equals = driver.getTitle().equals("Crown copyright - Re-using PSI");
        if (equals) {
            Reporter.log("Loaded Crown Copyright page");
        }
        return equals;
    }

}
