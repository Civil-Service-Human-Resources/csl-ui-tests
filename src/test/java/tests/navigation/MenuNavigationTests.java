package tests.navigation;

import org.testng.annotations.Test;
import pages.navigation.AdminMenuNavigationPage;
import pages.navigation.MenuNavigationPage;
import pages.userAccess.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class MenuNavigationTests extends BaseTest {

    @Test(groups = {"navigation"})
    public void nonAdminMenuNavigationFromHome() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        browser.setCustomBrowserWaitTime(2);
        assertFalse(menuNavigationPage.isAdminLinkShown());
        browser.restoreDefaultBrowserWaitTime();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void adminMenuNavigationFromHome() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        menuNavigationPage.clickAdminLink();
        assertTrue(menuNavigationPage.isAtAdminPage());
        driver.navigate().back();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void nonAdminMenuNavigationFromSuggestionsForYou() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        browser.setCustomBrowserWaitTime(2);
        assertFalse(menuNavigationPage.isAdminLinkShown());
        browser.restoreDefaultBrowserWaitTime();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void adminMenuNavigationFromSuggestionsForYou() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        menuNavigationPage.clickAdminLink();
        assertTrue(menuNavigationPage.isAtAdminPage());
        driver.navigate().back();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void nonAdminMenuNavigationFromLearningRecord() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        browser.setCustomBrowserWaitTime(2);
        assertFalse(menuNavigationPage.isAdminLinkShown());
        browser.restoreDefaultBrowserWaitTime();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void adminMenuNavigationFromLearningRecord() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        menuNavigationPage.clickAdminLink();
        assertTrue(menuNavigationPage.isAtAdminPage());
        driver.navigate().back();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void nonAdminMenuNavigationFromProfile() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        browser.setCustomBrowserWaitTime(2);
        assertFalse(menuNavigationPage.isAdminLinkShown());
        browser.restoreDefaultBrowserWaitTime();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void adminMenuNavigationFromProfile() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        menuNavigationPage.clickAdminLink();
        assertTrue(menuNavigationPage.isAtAdminPage());
        driver.navigate().back();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void nonAdminMenuNavigationFromSkills() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        browser.setCustomBrowserWaitTime(2);
        assertFalse(menuNavigationPage.isAdminLinkShown());
        browser.restoreDefaultBrowserWaitTime();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void adminMenuNavigationFromSkills() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        menuNavigationPage.clickHomeLink();
        assertTrue(menuNavigationPage.isAtHomePage());
        driver.navigate().back();
        menuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(menuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        menuNavigationPage.clickLearningRecordLink();
        assertTrue(menuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        menuNavigationPage.clickProfileLink();
        assertTrue(menuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        menuNavigationPage.clickSkillsLink();
        assertTrue(menuNavigationPage.isAtSkillsPage());
        menuNavigationPage.clickAdminLink();
        assertTrue(menuNavigationPage.isAtAdminPage());
        driver.navigate().back();
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void adminMenuNavigationFromAdmin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickAdminLink();
        assertTrue(menuNavigationPage.isAtAdminPage());
        AdminMenuNavigationPage adminMenuNavigationPage = new AdminMenuNavigationPage(driver);
        adminMenuNavigationPage.clickHomeLinkFromAdmin();
        assertTrue(adminMenuNavigationPage.isAtHomePage());
        driver.navigate().back();
        adminMenuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(adminMenuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickLearningRecordLink();
        assertTrue(adminMenuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickProfileLink();
        assertTrue(adminMenuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        adminMenuNavigationPage.clickSkillsLink();
        assertTrue(adminMenuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickReportingLink();
        assertTrue(adminMenuNavigationPage.isAtReportingPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickAdminLink();
        assertTrue(adminMenuNavigationPage.isAtAdminPage());
        adminMenuNavigationPage.clickSignOutLink();
        assertTrue(adminMenuNavigationPage.isAtLoginPage());
    }

    @Test(groups = {"navigation"})
    public void adminMenuNavigationFromReporting() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.clickAdminLink();
        assertTrue(menuNavigationPage.isAtAdminPage());
        AdminMenuNavigationPage adminMenuNavigationPage = new AdminMenuNavigationPage(driver);
        adminMenuNavigationPage.clickReportingLink();
        assertTrue(adminMenuNavigationPage.isAtReportingPage());
        adminMenuNavigationPage.clickHomeLinkFromReporting();
        assertTrue(adminMenuNavigationPage.isAtHomePage());
        driver.navigate().back();
        adminMenuNavigationPage.clickSuggestionsForYouLink();
        assertTrue(adminMenuNavigationPage.isAtSuggestionsForYouPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickLearningRecordLink();
        assertTrue(adminMenuNavigationPage.isAtLearningRecordPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickProfileLink();
        assertTrue(adminMenuNavigationPage.isAtProfilePage());
        driver.navigate().back();
        adminMenuNavigationPage.clickSkillsLink();
        assertTrue(adminMenuNavigationPage.isAtSkillsPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickAdminLink();
        assertTrue(adminMenuNavigationPage.isAtAdminPage());
        driver.navigate().back();
        adminMenuNavigationPage.clickReportingLink();
        assertTrue(adminMenuNavigationPage.isAtReportingPage());
        adminMenuNavigationPage.clickSignOutLink();
        assertTrue(adminMenuNavigationPage.isAtLoginPage());
    }
}
