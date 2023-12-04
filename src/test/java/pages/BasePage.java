package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;

public class BasePage {

    protected WebDriver driver;
    protected ConfigReader configReader;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configReader = new ConfigReader();
    }

}
