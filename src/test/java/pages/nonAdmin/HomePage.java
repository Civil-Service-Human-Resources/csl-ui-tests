package pages.nonAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import pages.BasePage;

public class HomePage extends pages.BasePage {
    private String url = baseUrl + "home";
    private String pageTitle = "Your learning – Civil Service Learning";

    @FindBy(xpath = "//a[@href='/sign-out']")
    public WebElement linkSignOut;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean correctPageTitle() {
        boolean equals = driver.getTitle().equals(pageTitle);
        if (equals) {
            Reporter.log("Loaded Home page correctly");
        }
        return equals;
    }

    public void clickSignOut() {
        linkSignOut.click();
        Reporter.log("Clicked Sign Out link");
    }
}
