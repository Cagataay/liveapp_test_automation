package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.ElementLocator;

public class SignupPages extends ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public SignupPages(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,15);
        this.elementHelper = new ElementHelper(driver);
    }
    String userEmail="scorptest@scorptest.com";
    String userPassword="scorptestscorptest";
    String termsAndConditionsText="I hereby agree to the T&C and Privacy Policy";
    String userNameText="Scorp Test";
    String userNameTitleText="Username*";
    String userNameDescText="This is the name that will appear on SuperLive.";
    String birthdayTitleText="Birth Date*";
    String birthdayDescText="Superlive is not suitable for children. To use our app, you must be over the minimum age specified in the User Agreement.";
    String genderTitleText="Gender*";
    String femaleText="FEMALE";
    String maleText="MALE";
    String addProfilePhotoTitleText="Add Profile Photo";
    String addProfilePhotoDescText="To gain more attention, you can add a photo to your profile.";
    String signUpPasswordErrorText="Passwords do not match";
    String userEmailAlreadyRegisteredText="edtest@edtest.com";
    String signupEmailErrorText="The email address has already been assigned to an existing user.";
    String termsOfServiceText = "TERMS OF SERVICE";
    String privacyPolicyText="Privacy Policy";
    String termsOfServiceButtonText="Terms of Service";
    String textViewToolbarAboutUsText="About Us";

    public void performEmailSignup() {
        click(ElementLocator.BTN_SIGN_UP_WITH_EMAIL);
    }

    public void enterEmailForRegistration() {
        sendKeys(ElementLocator.EDIT_TEXT_SIGN_UP_MAIL,userEmail);
    }

    public void enterPasswordForEmailRegistration() {
        sendKeys(ElementLocator.EDIT_TEXT_SIGN_UP_PASSWORD,userPassword);
        sendKeys(ElementLocator.EDIT_TEXT_SIGN_UP_PASSWORD_AGAIN,userPassword);
        checkText(ElementLocator.TERMS_AND_CONDITIONS_TEXT,termsAndConditionsText);
    }

    public void clickSignupContinueButton() {
        click(ElementLocator.BTN_SIGN_UP);
    }

    public void enterUsernameInformation() {
        checkText(ElementLocator.USER_NAME_TITLE,userNameTitleText);
        checkText(ElementLocator.USER_NAME_DESC,userNameDescText);
        checkVisible(ElementLocator.LAYOUT_PROGRESS);
        sendKeys(ElementLocator.EDIT_TEXT_USER_NAME,userNameText);
    }

    public void clickContinueButton() {
        click(ElementLocator.BTN_SIGN_UP_CONTINUE);
    }

    public void selectBirthdate() {
        checkVisible(ElementLocator.LAYOUT_PROGRESS);
        checkVisible(ElementLocator.BTN_SIGN_UP_BACK);
        checkText(ElementLocator.SIGN_UP_BIRTHDAY_TITLE,birthdayTitleText);
        checkText(ElementLocator.SIGN_UP_BIRTHDAY_DESC,birthdayDescText);
        click(ElementLocator.SIGN_UP_BIRTHDAY);
        click(ElementLocator.SIGN_UP_MD_BUTTON_POSITIVE);
    }

    public void selectGenderInformation() {
        checkVisible(ElementLocator.LAYOUT_PROGRESS);
        checkVisible(ElementLocator.BTN_SIGN_UP_BACK);
        checkText(ElementLocator.SIGN_UP_GENDER_TITLE,genderTitleText);
        checkText(ElementLocator.BTN_FEMALE_TEXT,femaleText);
        checkText(ElementLocator.BTN_MALE_TEXT,maleText);
        click(ElementLocator.BTN_FEMALE);
        click(ElementLocator.BTN_MALE);
    }

    public void addUserProfilePhoto() {
        checkVisible(ElementLocator.LAYOUT_PROGRESS);
        checkVisible(ElementLocator.BTN_SIGN_UP_BACK);
        checkText(ElementLocator.SIGN_UP_BIRTHDAY_TITLE,addProfilePhotoTitleText);
        checkText(ElementLocator.SIGN_UP_BIRTHDAY_DESC,addProfilePhotoDescText);
        click(ElementLocator.SIGN_UP_INFO_PROFILE_PICTURE);
        click(ElementLocator.SIGN_UP_TAKE_A_PHOTO_BUTTON);
        click(ElementLocator.PERMISSION_ALLOW_FOREGROUND_ONLY_BUTTON);
        click(ElementLocator.CAMERA_SHOOT_BUTTON);
        click(ElementLocator.CAMERA_OK_BUTTON);
        setWait(5000);
        click(ElementLocator.CAMERA_IMAGE_MENU_CROP);
    }

    public void enterInvalidPasswordForRegisteredEmail() {
        sendKeys(ElementLocator.EDIT_TEXT_SIGN_UP_PASSWORD,userPassword);
        sendKeys(ElementLocator.EDIT_TEXT_SIGN_UP_PASSWORD_AGAIN,userNameText);
    }

    public void checkPasswordMismatchErrorMessage() {
        checkVisible(ElementLocator.SIGN_UP_PASSWORD_WARNING_ICON);
        checkVisible(ElementLocator.SIGN_UP_PASSWORD_AGAIN_WARNING_ICON);
        checkText(ElementLocator.SIGN_UP_PASSWORD_ERROR_TEXT,signUpPasswordErrorText);
    }

    public void previouslyRegisteredEmailAddress() {
        sendKeys(ElementLocator.EDIT_TEXT_SIGN_UP_MAIL,userEmailAlreadyRegisteredText);
    }

    public void checkEmailAlreadyRegisteredMessage() {
        checkVisible(ElementLocator.SIGN_UP_EMAIL_WARNING_ICON);
        checkText(ElementLocator.SIGN_UP_EMAIL_ERROR_TEXT,signupEmailErrorText);
    }

    public void clickOnTAndCAndPrivacyPolicyOption() {
        click(ElementLocator.TERMS_AND_CONDITIONS_TEXT);
    }

    public void accessPrivacyPolicyOption() {
        click(ElementLocator.BTN_PRIVACY_POLICY);
    }

    public void navigateBackFromTAndCAndPrivacyPolicyPage() {
        click(ElementLocator.BTN_BACK);
    }

    public void accessTermsOfServiceOption() {
        click(ElementLocator.BTN_TERMS_OF_SERVICE);
        checkText(ElementLocator.TERMS_OF_SERVICE_TEXT,termsOfServiceText);
    }

    public void checkTAndCAndPrivacyPolicyPage() {
        checkVisible(ElementLocator.BTN_BACK);
        checkText(ElementLocator.BTN_PRIVACY_POLICY,privacyPolicyText);
        checkText(ElementLocator.BTN_TERMS_OF_SERVICE,termsOfServiceButtonText);
        checkText(ElementLocator.TEXT_VIEW_TOOLBAR,textViewToolbarAboutUsText);
    }
}