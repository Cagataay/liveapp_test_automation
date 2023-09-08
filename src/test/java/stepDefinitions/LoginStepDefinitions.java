package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPages;
import util.DriverFactory;

public class LoginStepDefinitions {
    LoginPages loginPages=new LoginPages(DriverFactory.getDriver());

    @When("the Email login button is clicked")
    public void theEmailLoginButtonIsClicked() {loginPages.clickOnEmailLoginButton();
    }

    @When("Email information is entered")
    public void emailInformationIsEntered() {loginPages.enterEmailInformation();
    }

    @When("Password information for the Email is entered")
    public void passwordInformationForTheEmailIsEntered() {loginPages.enterEmailPassword();
    }

    @When("the Login button is clicked")
    public void theLoginButtonIsClicked() {loginPages.clickOnLoginButton();
    }

    @Then("Verify that access to the Live screen is achieved")
    public void verifyThatAccessToTheLiveScreenIsAchieved() {loginPages.checkIfReachedLiveScreen();
    }

    @When("Notification permission is granted")
    public void notificationPermissionIsGranted() {loginPages.allowNotificationPermission();
    }

    @When("the Google login button is clicked")
    public void theGoogleLoginButtonIsClicked() {loginPages.clickOnGoogleLoginButton();
    }

    @When("the relevant Google account is selected")
    public void theRelevantGoogleAccountIsSelected() {loginPages.clickOnRelatedGoogleAccount();
    }

    @When("the Phone login button is clicked")
    public void thePhoneLoginButtonIsClicked() {loginPages.clickOnPhoneLoginButton();
    }

    @When("the Select Country Code button is clicked")
    public void theSelectCountryCodeButtonIsClicked() {loginPages.clickOnPhoneCountryCodeSelectionButton();
    }

    @When("the relevant phone country code is searched")
    public void theRelevantPhoneCountryCodeIsSearched() {loginPages.searchForRelatedPhoneCountryCode();
    }

    @When("the relevant phone country code is selected")
    public void theRelevantPhoneCountryCodeIsSelected() {loginPages.selectRelatedPhoneCountryCode();
    }

    @When("the relevant phone number is entered")
    public void theRelevantPhoneNumberIsEntered() {loginPages.enterRelatedPhoneNumber();
    }

    @When("the Continue-Verify button is clicked")
    public void theContinueVerifyButtonIsClicked() {loginPages.clickOnContinueOrVerifyButton();
    }

    @When("the relevant phone number is verified")
    public void theRelevantPhoneNumberIsVerified() {loginPages.confirmRelatedPhoneNumber();
    }

    @When("the verification code sent to the phone number is entered")
    public void theVerificationCodeSentToThePhoneNumberIsEntered() {loginPages.enterVerificationCodeReceivedOnPhoneNumber();
    }

    @Then("Verify the text information in the Login Options section")
    public void verifyTheTextInformationInTheLoginOptionsSection() { loginPages.verifyLoginOptionsText();
    }

    @Then("Verify the text information for Google login option")
    public void verifyTheTextInformationForGoogleLoginOption() { loginPages.verifyGoogleLoginOptionText();
    }

    @Then("Verify the text information for Phone login option")
    public void verifyTheTextInformationForPhoneLoginOption() { loginPages.verifyPhoneLoginOptionText();
    }

    @Then("Verify the text information for Email login option")
    public void verifyTheTextInformationForEmailLoginOption() { loginPages.verifyEmailLoginOptionText();
    }

    @Then("Verify the text information for Twitter login option")
    public void verifyTheTextInformationForTwitterLoginOption() { loginPages.verifyTwitterLoginOptionText();
    }

    @Then("Verify the user agreement texts")
    public void verifyTheUserAgreementTexts() { loginPages.checkUserAgreementTexts();
    }

    @When("the Forgot password section is clicked")
    public void theForgotPasswordSectionIsClicked() { loginPages.clickOnForgotPasswordSection();
    }

    @Then("Verify that the Forgot password page displays a notification")
    public void verifyThatTheForgotPasswordPageDisplaysANotification() { loginPages.checkForgotPasswordPageAlert();
    }

    @When("on the Forgot password page, the relevant email is entered")
    public void onTheForgotPasswordPageTheRelevantEmailIsEntered() { loginPages.enterEmailAddressForForgotPasswordScreen();
    }

    @When("on the Forgot password page, the Continue button is clicked")
    public void onTheForgotPasswordPageTheContinueButtonIsClicked() { loginPages.clickOnContinueButtonForForgotPasswordScreen();
    }

    @When("on the Forgot password page, an invalid email address is entered")
    public void onTheForgotPasswordPageAnInvalidEmailAddressIsEntered() { loginPages.enterInvalidEmailAddressForForgotPasswordScreen();
    }

    @Then("Verify that the Forgot password page displays a notification for an invalid email")
    public void verifyThatTheForgotPasswordPageDisplaysANotificationForAnInvalidEmail() { loginPages.checkForgotPasswordPageAlertForAnInvalidEmail();
    }

    @When("a non-registered email address is entered")
    public void aNonRegisteredEmailAddressIsEntered() { loginPages.enterNonRegisteredEmailAddress();
    }

    @Then("Verify the screen for the case of an incorrect email address on the login page")
    public void verifyTheScreenForTheCaseOfAnIncorrectEmailAddressOnTheLoginPage() { loginPages.checkIncorrectEmailOnLoginPage();
    }

    @When("an invalid email address is entered")
    public void anInvalidEmailAddressIsEntered() { loginPages.enterInvalidEmailAddress();
    }

    @Then("Verify the screen for the case of an invalid email address on the login page")
    public void verifyTheScreenForTheCaseOfAnInvalidEmailAddressOnTheLoginPage() { loginPages.checkInvalidEmailOnLoginPage();
    }

    @When("an incorrect password is entered for an email address")
    public void anIncorrectPasswordIsEnteredForAnEmailAddress() { loginPages.enterPasswordNotAssociatedWithEmail();
    }

    @Then("Verify the screen for the case of an incorrect password on the login page")
    public void verifyTheScreenForTheCaseOfAnIncorrectPasswordOnTheLoginPage() { loginPages.checkIncorrectPasswordOnLoginPage();
    }

    @When("an incorrect code is entered of the SMS code")
    public void anIncorrectCodeIsEnteredOfTheSMSCode() { loginPages.enterIncorrectCodeSMS();
    }

    @Then("Verify warning messages indicating that the SMS code was entered incorrectly")
    public void verifyWarningMessagesIndicatingThatTheSMSCodeWasEnteredIncorrectly() { loginPages.checkIncorrectSMSCodeWarningMessages();
    }
}
