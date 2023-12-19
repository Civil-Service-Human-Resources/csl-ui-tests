package tests.reporting;

import org.testng.annotations.Test;
import pages.admin.AdminIndexPage;
import pages.reporting.ReportingIndexPage;
import pages.userAccess.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class ReportingTests extends BaseTest {

    @Test(groups = {"reporting"})
    public void accessReportingAsAdmin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.loginWithCredentials(users.getAdminUsername(), users.getAdminUserPassword());
        ReportingIndexPage reportingIndexPage = new ReportingIndexPage(driver);
        reportingIndexPage.goTo();
        assertTrue(reportingIndexPage.correctPageTitle());
    }
}
