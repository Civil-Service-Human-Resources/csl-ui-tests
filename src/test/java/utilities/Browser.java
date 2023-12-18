package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

import java.time.Duration;

public class Browser {
    public WebDriver driver;
    public String browserType;
    private final Integer defaultWaitTimeSeconds = 10;

    public Browser() {
        ConfigReader configReader = new ConfigReader();
        browserType = configReader.getBrowser();
    }

    public WebDriver createDriver () {
        switch(browserType.toLowerCase()) {
            case "chrome":
                createChromeBrowser();
                break;
            case "edge":
                createEdgeBrowser();
                break;
            case "safari":
                createSafariBrowser();
                break;
            default:
                throw new RuntimeException("Browser not correctly specified in config.properties file");
        }
        Reporter.log(browserType + " browser created");
        return driver;
    }

    private void createChromeBrowser() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        restoreDefaultBrowserWaitTime();
    }

    private void createEdgeBrowser() {
        EdgeOptions options = new EdgeOptions();
        WebDriverManager.edgedriver().clearDriverCache().setup();
        WebDriverManager.edgedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        restoreDefaultBrowserWaitTime();
    }

    private void createSafariBrowser() {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        restoreDefaultBrowserWaitTime();
    }

    public void closeDriver () {
        driver.quit();
        Reporter.log(" Closed browser");
    }

    public void restoreDefaultBrowserWaitTime() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(defaultWaitTimeSeconds));
    }

    public void setCustomBrowserWaitTime(Integer seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void waitFor(WebDriver driver, Integer seconds, WebElement element) {
        System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().toMillis());
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(d -> element.isDisplayed());
    }

}
