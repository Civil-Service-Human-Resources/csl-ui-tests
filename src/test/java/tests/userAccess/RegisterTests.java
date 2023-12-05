package tests.userAccess;

import org.testng.annotations.Test;
import pages.userAccess.CreateAccountPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends BaseTest {

    @Test(groups = {"register", "userAccess"})
    public void ac1_1_2_RegisterWithInvalidEmailAddress() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.goTo();
        createAccountPage.inputMatchingEmailAddresses("me");
        createAccountPage.clickContinueBtn();
        assertTrue(createAccountPage.validationShowingEmailAddressNotValid());
    }

    @Test(groups = {"register", "userAccess"})
    public void ac1_1_3_RegisterWithMismatchingEmailAddresses() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.goTo();
        createAccountPage.inputEmailAddress("me@cabinetoffice.gov.uk");
        createAccountPage.inputConfirmEmailAddress("you@cabinetoffice.gov.uk");
        createAccountPage.clickContinueBtn();
        assertTrue(createAccountPage.validationShowingEmailAddressesDoNotMatch());
    }

    @Test(groups = {"register", "userAccess"})
    public void ac1_1_5_RegisterWithMismatchingEmailAddressesWhereConfirmIsBlank() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.goTo();
        createAccountPage.inputEmailAddress("me@cabinetoffice.gov.uk");
        createAccountPage.inputConfirmEmailAddress("");
        createAccountPage.clickContinueBtn();
        assertTrue(createAccountPage.validationShowingEmailAddressesDoNotMatch());
        assertTrue(createAccountPage.validationShowingPleaseConfirmYourEmail());
    }

    @Test(groups = {"register", "userAccess"})
    public void ac1_1_6_RegisterWithNoEmailAddresses() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.goTo();
        createAccountPage.inputMatchingEmailAddresses("");
        createAccountPage.clickContinueBtn();
        assertTrue(createAccountPage.validationShowingPleaseConfirmYourEmail());
    }

    @Test(groups = {"register", "userAccess"})
    public void ac1_1_4_RegisterWithNonAcceptedEmailAddress() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.goTo();
        createAccountPage.inputMatchingEmailAddresses("me@me.com");
        createAccountPage.clickContinueBtn();
        assertTrue(createAccountPage.validationShowingYourOrganisationIsUnableToUseThisService());
    }
}
