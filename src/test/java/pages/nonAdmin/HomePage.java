package pages.nonAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HomePage extends pages.BasePage {
    private String url = "https://performance.learn.civilservice.gov.uk/home";
    private String pageTitle = "Your learning – Civil Service Learning";

    @FindBy(xpath = "//a[@href='/sign-out']")
    public WebElement linkSignOut;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        return driver.getTitle().equals(pageTitle);
    }

    public void clickSignOut() {
        linkSignOut.click();
    }
}
