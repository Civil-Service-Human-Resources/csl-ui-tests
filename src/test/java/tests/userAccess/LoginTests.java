package tests.userAccess;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.nonAdmin.HomePage;
import pages.userAccess.CreateAccountPage;
import pages.userAccess.ForgottenYourPasswordPage;
import pages.userAccess.LoginPage;
import tests.BaseTest;

import java.time.Duration;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test (groups = {"smoke", "login"})
    public void loadLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        assertTrue(loginPage.correctPageTitle());
    }

    @Test (groups = {"smoke", "login"})
    public void ac2_1_3_LogOnWithValidEmailAddressAndPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials("AutoUser@cabinetoffice.gov.uk", "Password123");
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.correctPageTitle());
    }

    @Test (groups = {"login"})
    public void loadCreateAccountPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.clickCreateAccount();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        assertTrue(createAccountPage.correctPageTitle());
    }

    @Test (groups = {"login"})
    public void loadForgottenYourPasswordPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.clickForgottenYourPassword();
        ForgottenYourPasswordPage forgottenYourPasswordPage = new ForgottenYourPasswordPage(driver);
        assertTrue(forgottenYourPasswordPage.correctPageTitle());
    }

    @Test (groups = {"smoke", "login"})
    public void ac3_2_1_SignOut() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials("AutoUser@cabinetoffice.gov.uk", "Password123");
        HomePage homePage = new HomePage(driver);
        homePage.clickSignOut();
        assertTrue(loginPage.correctPageTitle());
    }
}
