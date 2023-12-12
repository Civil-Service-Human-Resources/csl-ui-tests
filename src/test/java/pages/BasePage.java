package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Browser;
import utilities.ConfigReader;

public class BasePage {

    protected WebDriver driver;
    protected ConfigReader configReader;

    protected String identityBaseUrl;
    protected String baseUrl;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configReader = new ConfigReader();
        identityBaseUrl = configReader.getIdentityBaseUrl();
        baseUrl = configReader.getBaseUrl();
    }

}
