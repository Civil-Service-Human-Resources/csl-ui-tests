package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.userAccess.LoginPage;
import utilities.Browser;
import utilities.Users;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public Users users = new Users();
    public Browser browser = new Browser();


    @BeforeMethod (alwaysRun = true)
    public void setUp() {
        driver = browser.createDriver();

    }

    @AfterMethod (alwaysRun = true)
    public void tearDown() {
        browser.closeDriver();
    }


}
