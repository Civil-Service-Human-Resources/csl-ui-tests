package tests.userAccess;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userAccess.LoginPage;
import tests.BaseTest;

import java.time.Duration;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void loadLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo(driver);
        assertTrue(loginPage.correctPageTitle(driver));
    }

}
