package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

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
                createChromeBrowser();
        }
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
        SafariOptions options = new SafariOptions();
        WebDriverManager.safaridriver().clearDriverCache().setup();
        WebDriverManager.safaridriver().setup();
        //options.addArguments("--remote-allow-origins=*");
        driver = new SafariDriver(options);
        driver.manage().window().maximize();
        restoreDefaultBrowserWaitTime();
    }

    public void closeDriver () {
        driver.quit();
    }

    public void restoreDefaultBrowserWaitTime() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(defaultWaitTimeSeconds));
    }

    public void setCustomBrowserWaitTime(Integer seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

}
