package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.userAccess.LoginPage;
import utilities.Users;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public Users users = new Users();


    @BeforeMethod (alwaysRun = true)
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod (alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }


}
