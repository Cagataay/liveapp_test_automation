package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void clickOnEmailLoginButton() {
        elementHelper.click(ElementLocator.BTN_SIGN_IN_WITH_EMAIL);
    }

    public void enterEmailInformation() {
        //elementHelper.sendKeys(ElementLocator.EDIT_TEXT_LOGIN_MAIL,"edtest@edtest.com");
        sendKeys(ElementLocator.EDIT_TEXT_LOGIN_MAIL,"edtest@edtest.com");
    }

    public void enterEmailPassword() {
        elementHelper.sendKeys(ElementLocator.EDIT_TEXT_LOGIN_PASSWORD,"edtestedtest");
    }

    public void clickOnLoginButton() {
        //wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.BTN_LOGIN)).click();
        click(ElementLocator.BTN_LOGIN);
    }

    public void checkIfReachedLiveScreen() {
        elementHelper.checkVisible(ElementLocator.IMAGE_VIEW_ICON);
    }

    public void allowNotificationPermission() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.PERMISSION_ALLOW_BUTTON)).click();
    }

    public void clickOnGoogleLoginButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.BTN_SIGN_IN_WITH_GOOGLE)).click();
    }

    public void clickOnRelatedGoogleAccount() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.BTN_ACCOUNT_NAME_GOOGLE)).click();
    }

    public void clickOnPhoneLoginButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.BTN_SIGN_IN_WITH_PHONE)).click();
    }

    public void clickOnPhoneCountryCodeSelectionButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.IMAGE_VIEW_ARROW_COUNTRY_CODE)).click();
    }

    public void searchForRelatedPhoneCountryCode() {
        elementHelper.sendKeys(ElementLocator.EDIT_TEXT_SEARCH_COUNTRY_CODE,"TURKEY");
    }

    public void selectRelatedPhoneCountryCode() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.TEXT_VIEW_COUNTRY_NAME)).click();
    }

    public void enterRelatedPhoneNumber() {
        elementHelper.sendKeys(ElementLocator.EDIT_TEXT_PHONE_NUMBER,"5522755758");
    }

    public void clickOnContinueOrVerifyButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.BTN_CONTINUE)).click();
    }

    public void confirmRelatedPhoneNumber() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator.BTN_CONFIRM)).click();
    }

    public void enterVerificationCodeReceivedOnPhoneNumber() {
        elementHelper.setWait(10000);
        elementHelper.sendKeys(ElementLocator.FIRST_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        elementHelper.sendKeys(ElementLocator.SECOND_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        elementHelper.sendKeys(ElementLocator.THIRD_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        elementHelper.sendKeys(ElementLocator.FOURTH_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        elementHelper.sendKeys(ElementLocator.FIFTH_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
        elementHelper.sendKeys(ElementLocator.SIXTH_NUMBER_OF_SMS_CODE_TEXT_BOX,"2");
    }
}
