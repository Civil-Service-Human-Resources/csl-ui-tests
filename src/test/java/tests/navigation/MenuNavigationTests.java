package tests.navigation;

import org.testng.annotations.Test;
import pages.navigation.HeaderFootersPage;
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
}
