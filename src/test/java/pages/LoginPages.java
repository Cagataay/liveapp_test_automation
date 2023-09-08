package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.ElementLocator;

public class LoginPages extends ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public LoginPages(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,15);
        this.elementHelper = new ElementHelper(driver);
    }
    String userEmail="scorptest@scorp.com";
    String invalidUserEmail="scorp@scorpcom";
    String nonRegisteredEmailText="scorpscorptestscorp@scorp.com";
    String wrongPassword="scorpedtest54321";
    String userPassword="scorptest12345";
    String countryCodeTurkey = "TURKEY";
    String phoneNumber = "5522755758";
    String smsCode = "222222";
    String incorrectSmsCode = "987654";
    String serviceAgreementText = "By logging in, you accept the Service Agreement.";
    String userServiceAgreementText = "You must be over the minimum age stated in User Agreement.";
    String welcomeToSuperliveText = "Welcome to SuperLive!";
    String signupToSuperliveText = "Sign up and become a star";
    String welcomeToSuperliveOrText = "Or";
    String signInWithGoogleText = "Sign in with Google";
    String signInWithPhoneText = "Sign in with your Phone";
    String signInWithEmailText = "Sign in with E-Mail";
    String signUpWithEmailText = "Sign up with E-Mail";
    String signInWithTwitterText = "Sign in with Twitter";
    String emailOverlayDescText="Whether you are creating an account or signing back in, let's start with your e-mail";
    String doYouHaveAccountEmailText="Do You Have Account?";
    String loginWithEmailText="Login with E-Mail";
    String emailCouldNotBeSentText="The email could not be sent.";
    String isNotAValidEmailAddressText="The information you entered is not a valid email address.";
    String forgotPasswordTitle="Forgot Password";
    String enterYourEmailText="Enter your e-mail";
    String enterEmailAndPasswordText="Enter your e-mail and password";
    String nonRegisteredEmailErrorText="There are no registered users with this email.";
    String notCorrectPasswordErrorText="The password you entered is not correct.";
    String checkYourCodeText="Please check your code";
    public void clickOnEmailLoginButton() {
        setWait(1000);
        click(ElementLocator.BTN_SIGN_IN_WITH_EMAIL);
    }

    public void enterEmailInformation() {
        sendKeys(ElementLocator.EDIT_TEXT_LOGIN_MAIL,userEmail);
    }

    public void enterEmailPassword() {
        sendKeys(ElementLocator.EDIT_TEXT_LOGIN_PASSWORD,userPassword);
    }

    public void clickOnLoginButton() {
        click(ElementLocator.BTN_LOGIN);
    }

    public void checkIfReachedLiveScreen() {
        checkVisible(ElementLocator.IMAGE_VIEW_ICON);
    }

    public void allowNotificationPermission() {
        click(ElementLocator.PERMISSION_ALLOW_BUTTON);
    }

    public void clickOnGoogleLoginButton() {
        click(ElementLocator.BTN_SIGN_IN_WITH_GOOGLE);
    }

    public void clickOnRelatedGoogleAccount() {
        click(ElementLocator.BTN_ACCOUNT_NAME_GOOGLE);
    }

    public void clickOnPhoneLoginButton() {
        click(ElementLocator.BTN_SIGN_IN_WITH_PHONE);
    }

    public void clickOnPhoneCountryCodeSelectionButton() {
        click(ElementLocator.IMAGE_VIEW_ARROW_COUNTRY_CODE);
    }

    public void searchForRelatedPhoneCountryCode() { sendKeys(ElementLocator.EDIT_TEXT_SEARCH_COUNTRY_CODE,countryCodeTurkey);}

    public void selectRelatedPhoneCountryCode() { click(ElementLocator.TEXT_VIEW_COUNTRY_NAME);}

    public void enterRelatedPhoneNumber() {
        sendKeys(ElementLocator.EDIT_TEXT_PHONE_NUMBER,phoneNumber);
    }

    public void clickOnContinueOrVerifyButton() {
        click(ElementLocator.BTN_CONTINUE);
    }

    public void confirmRelatedPhoneNumber() {
        click(ElementLocator.BTN_CONFIRM);
    }

    public void enterVerificationCodeReceivedOnPhoneNumber() {
        setWait(20000);
        for (int i = 0; i < smsCode.length(); i++) {
            char digit = smsCode.charAt(i);
            String smsCodeLocator = "com.superlive.liveapp:id/" + getDigitName(i + 1) + "NumberOfSmsCode";
            By bySmsCodeLocator = MobileBy.id(smsCodeLocator);
            sendKeys(bySmsCodeLocator, String.valueOf(digit));
        }
        /*
        sendKeys(ElementLocator.FIRST_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        sendKeys(ElementLocator.SECOND_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        sendKeys(ElementLocator.THIRD_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        sendKeys(ElementLocator.FOURTH_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        sendKeys(ElementLocator.FIFTH_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        sendKeys(ElementLocator.SIXTH_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        */
    }

    public String getDigitName(int digit) {
        switch (digit) {
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
            case 5:
                return "fifth";
            case 6:
                return "sixth";
            default:
                return "UNKNOWN";
        }
    }
    public void verifyLoginOptionsText() {
        checkText(ElementLocator.WELCOME_TO_SUPERLIVE_TEXT,welcomeToSuperliveText);
        checkText(ElementLocator.SIGN_UP_WELCOME_TO_SUPERLIVE_TEXT,signupToSuperliveText);
        checkText(ElementLocator.WELCOME_TO_SUPERLIVE_OR_TEXT,welcomeToSuperliveOrText);
    }

    public void verifyGoogleLoginOptionText() {
        checkText(ElementLocator.BTN_SIGN_IN_WITH_GOOGLE,signInWithGoogleText);
    }

    public void verifyPhoneLoginOptionText() {
        checkText(ElementLocator.BTN_SIGN_IN_WITH_PHONE,signInWithPhoneText);
    }

    public void verifyEmailLoginOptionText() {
        checkText(ElementLocator.BTN_SIGN_IN_WITH_EMAIL,signInWithEmailText);
        click(ElementLocator.BTN_SIGN_IN_WITH_EMAIL);
        checkText(ElementLocator.EMAIL_OVERLAY_TITLE,signUpWithEmailText);
        checkText(ElementLocator.EMAIL_OVERLAY_DESC,emailOverlayDescText);
        checkText(ElementLocator.BTN_SIGN_UP_WITH_EMAIL,signUpWithEmailText);
        checkText(ElementLocator.BTN_SIGN_IN_WITH_EMAIL,loginWithEmailText);
        checkText(ElementLocator.SIGN_UP_WELCOME_TO_SUPERLIVE_TEXT,doYouHaveAccountEmailText);
        checkText(ElementLocator.SIGN_IN_USER_SERVICE_AGREEMENT_TEXT,serviceAgreementText);
        click(ElementLocator.BTN_EMAIL_OVERLAY_BACK);
    }

    public void verifyTwitterLoginOptionText() {
        checkText(ElementLocator.BTN_SIGN_IN_WITH_TWITTER,signInWithTwitterText);
    }

    public void checkUserAgreementTexts() {
        checkText(ElementLocator.SIGN_IN_USER_SERVICE_AGREEMENT_TEXT,serviceAgreementText);
        checkText(ElementLocator.SIGN_IN_USER_AGREEMENT_TEXT,userServiceAgreementText);
    }

    public void clickOnForgotPasswordSection() {
        click(ElementLocator.BTN_FORGOT_PASSWORD);
    }

    public void enterEmailAddressForForgotPasswordScreen() {
        sendKeys(ElementLocator.EDIT_TEXT_FORGOT_PASSWORD_EMAIL,userEmail);
    }

    public void checkForgotPasswordPageAlert() {
        checkText(ElementLocator.FORGOT_PASSWORD_EMAIL_ERROR_TEXT, emailCouldNotBeSentText);
        checkText(ElementLocator.TEXT_VIEW_TOOLBAR,forgotPasswordTitle);
        checkText(ElementLocator.TEXT_VIEW_DESC,enterYourEmailText);
        checkVisible(ElementLocator.BTN_BACK);
        checkVisible(ElementLocator.FORGOT_PASSWORD_EMAIL_WARNING_ICON);
    }

    public void clickOnContinueButtonForForgotPasswordScreen() {
        click(ElementLocator.BTN_CONTINUE_FORGOT_PASSWORD);
    }

    public void enterInvalidEmailAddressForForgotPasswordScreen() {
        sendKeys(ElementLocator.EDIT_TEXT_FORGOT_PASSWORD_EMAIL,invalidUserEmail);
    }

    public void checkForgotPasswordPageAlertForAnInvalidEmail() {
        checkText(ElementLocator.FORGOT_PASSWORD_EMAIL_ERROR_TEXT, isNotAValidEmailAddressText);
        checkText(ElementLocator.TEXT_VIEW_TOOLBAR,forgotPasswordTitle);
        checkText(ElementLocator.TEXT_VIEW_DESC,enterYourEmailText);
        checkVisible(ElementLocator.BTN_BACK);
        checkVisible(ElementLocator.FORGOT_PASSWORD_EMAIL_WARNING_ICON);
    }

    public void enterNonRegisteredEmailAddress() {
        sendKeys(ElementLocator.EDIT_TEXT_LOGIN_MAIL,nonRegisteredEmailText);
    }

    public void checkIncorrectEmailOnLoginPage() {
        checkVisible(ElementLocator.LOGIN_EMAIL_WARNING_ICON);
        checkVisible(ElementLocator.IMAGE_BUTTON_CLOSE);
        checkText(ElementLocator.SIGN_UP_TITLE,loginWithEmailText);
        checkText(ElementLocator.TEXT_VIEW_DESC,enterEmailAndPasswordText);
        checkText(ElementLocator.LOGIN_EMAIL_ERROR_TEXT,nonRegisteredEmailErrorText);
    }

    public void enterInvalidEmailAddress() {
        sendKeys(ElementLocator.EDIT_TEXT_LOGIN_MAIL,invalidUserEmail);
    }

    public void checkInvalidEmailOnLoginPage() {
        checkVisible(ElementLocator.LOGIN_EMAIL_WARNING_ICON);
        checkVisible(ElementLocator.IMAGE_BUTTON_CLOSE);
        checkText(ElementLocator.SIGN_UP_TITLE,loginWithEmailText);
        checkText(ElementLocator.TEXT_VIEW_DESC,enterEmailAndPasswordText);
        checkText(ElementLocator.LOGIN_EMAIL_ERROR_TEXT,isNotAValidEmailAddressText);
    }

    public void enterPasswordNotAssociatedWithEmail() {
        sendKeys(ElementLocator.EDIT_TEXT_LOGIN_PASSWORD,wrongPassword);
    }

    public void checkIncorrectPasswordOnLoginPage() {
        checkVisible(ElementLocator.LOGIN_PASSWORD_WARNING_ICON);
        checkVisible(ElementLocator.IMAGE_BUTTON_CLOSE);
        checkText(ElementLocator.SIGN_UP_TITLE,loginWithEmailText);
        checkText(ElementLocator.TEXT_VIEW_DESC,enterEmailAndPasswordText);
        checkText(ElementLocator.LOGIN_PASSWORD_ERROR_TEXT,notCorrectPasswordErrorText);
    }

    public void enterIncorrectCodeSMS() {
        setWait(20000);
        for (int i = 0; i < incorrectSmsCode.length(); i++) {
            char digit = incorrectSmsCode.charAt(i);
            String smsCodeLocator = "com.superlive.liveapp:id/" + getDigitName(i + 1) + "NumberOfSmsCode";
            By bySmsCodeLocator = MobileBy.id(smsCodeLocator);
            sendKeys(bySmsCodeLocator, String.valueOf(digit));
        }
    }

    public void checkIncorrectSMSCodeWarningMessages() {
        checkText(ElementLocator.TEXT_VIEW_VERIFY_ERROR,checkYourCodeText);
    }
}
