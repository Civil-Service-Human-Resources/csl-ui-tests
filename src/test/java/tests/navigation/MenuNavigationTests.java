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
        assertFalse(menuNavigationPage.isAdminLinkShown());
        menuNavigationPage.clickSignOutLink();
        assertTrue(menuNavigationPage.isAtLoginPage());
    }
}
