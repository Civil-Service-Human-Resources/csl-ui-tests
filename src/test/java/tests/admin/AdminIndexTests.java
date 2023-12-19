package tests.admin;

import org.testng.annotations.Test;
import pages.admin.AdminIndexPage;
import pages.admin.QuizAdmin.ManageQuizPage;
import pages.admin.courseAdmin.AddCourseVisibilityPage;
import pages.admin.organisationAdmin.ManageOrganisationsPage;
import pages.userAccess.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class AdminIndexTests extends BaseTest {

    @Test(groups = {"admin"})
    public void accessAdminAreaAsAdmin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        AdminIndexPage adminIndexPage = new AdminIndexPage(driver);
        adminIndexPage.goTo();
        assertTrue(adminIndexPage.correctPageTitle());
    }

    @Test(groups = {"admin"})
    public void accessAdminAreaAsNonAdmin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getNonAdminUsername(), users.getNonAdminUserPassword());
        AdminIndexPage adminIndexPage = new AdminIndexPage(driver);
        adminIndexPage.goTo();
        assertFalse(adminIndexPage.correctPageTitle());
    }

    @Test(groups = {"admin", "navigation"})
    public void adminAddNewCourseLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        AdminIndexPage adminIndexPage = new AdminIndexPage(driver);
        adminIndexPage.goTo();
        adminIndexPage.clickAddNewCourseLink();
        AddCourseVisibilityPage addCourseVisibilityPage = new AddCourseVisibilityPage(driver);
        assertTrue(addCourseVisibilityPage.correctPageTitle());
    }

    @Test(groups = {"admin", "navigation"})
    public void adminManageOrganisationsLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        AdminIndexPage adminIndexPage = new AdminIndexPage(driver);
        adminIndexPage.goTo();
        adminIndexPage.clickManageOrganisationsLink();
        ManageOrganisationsPage manageOrganisationsPage = new ManageOrganisationsPage(driver);
        assertTrue(manageOrganisationsPage.correctPageTitle());
    }

    @Test(groups = {"admin", "navigation"})
    public void adminManageQuizLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        AdminIndexPage adminIndexPage = new AdminIndexPage(driver);
        adminIndexPage.goTo();
        adminIndexPage.clickManageQuizLink();
        ManageQuizPage manageQuizPage = new ManageQuizPage(driver);
        assertTrue(manageQuizPage.correctPageTitle());
    }
}
