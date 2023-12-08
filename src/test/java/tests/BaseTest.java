package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import utilities.Browser;
import utilities.Users;

public class BaseTest {

    public WebDriver driver;
    public Users users = new Users();
    public Browser browser = new Browser();


    @BeforeClass (alwaysRun = true)
    public void setUp() {
        driver = browser.createDriver();
    }

    @BeforeMethod (alwaysRun = true)
    public void clearHistory() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass (alwaysRun = true)
    public void tearDown() {
        browser.closeDriver();
    }


}
