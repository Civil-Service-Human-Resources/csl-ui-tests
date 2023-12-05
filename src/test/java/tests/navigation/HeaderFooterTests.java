package tests.navigation;

import org.testng.annotations.Test;
import pages.navigation.HeaderFootersPage;
import pages.userAccess.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class HeaderFooterTests extends BaseTest{
    @Test(groups = {"navigation"})
    public void cookiesBannerLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickCookiesBanner();
        assertTrue(headerFootersPage.isAtCookiesPage());
    }

    @Test(groups = {"navigation"})
    public void govUkink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickGovUkIcon();
        assertTrue(headerFootersPage.isAtGovUkPage());
    }

    @Test(groups = {"navigation"})
    public void cslHeaderink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickCookiesLink();
        headerFootersPage.clickCslHomeLink();
        assertTrue(headerFootersPage.isAtCslHomePage());
    }

    @Test(groups = {"navigation"})
    public void feedbackLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickFeedbackLink();
        assertTrue(headerFootersPage.isAtFeedbackPage());
    }

    @Test(groups = {"navigation"})
    public void cookiesLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickCookiesLink();
        assertTrue(headerFootersPage.isAtCookiesPage());
    }

    @Test(groups = {"navigation"})
    public void privacyLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickPrivacyLink();
        assertTrue(headerFootersPage.isAtPrivacyPage());
    }

    @Test(groups = {"navigation"})
    public void contactUsLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickContactUsLink();
        assertTrue(headerFootersPage.isAtContactUsPage());
    }

    @Test(groups = {"navigation"})
    public void accessibilityStatementLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickAccessibilityStatementLink();
        assertTrue(headerFootersPage.isAtAccessibilityStatementPage());
    }

    @Test(groups = {"navigation"})
    public void builtByCslPlatformLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickBuiltByCslPlatformLink();
        assertTrue(headerFootersPage.isAtCslHomePage());
    }

    @Test(groups = {"navigation"})
    public void openGovernmentLicenceLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickOpenGovernmentLicenceLink();
        assertTrue(headerFootersPage.isAtOpenGovernmentLicencePage());
    }

    @Test(groups = {"navigation"})
    public void crownCopyrightLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        HeaderFootersPage headerFootersPage = new HeaderFootersPage(driver);
        headerFootersPage.clickCrownCopyrightLink();
        assertTrue(headerFootersPage.isAtCrownCopyrightPage());
    }
}
