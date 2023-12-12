package tests.userAccess;

import org.testng.annotations.Test;
import pages.userAccess.ForgottenYourPasswordPage;
import pages.userAccess.LoginPage;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTest {

    @Test(groups = {"forgotPassword", "userAccess"})
    public void resetPasswordWithInvalidEmailAddress() {
        ForgottenYourPasswordPage forgottenYourPasswordPage = new ForgottenYourPasswordPage(driver);
        forgottenYourPasswordPage.goTo();
        forgottenYourPasswordPage.inputEmailAndContinue("myemailaddress");
        assertTrue(forgottenYourPasswordPage.emailValidationDisplayed());
    }

}
