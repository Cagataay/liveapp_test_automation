package util;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ElementLocator {
    public static final By BTN_SIGN_IN_WITH_EMAIL= MobileBy.id("com.superlive.liveapp:id/btnSignInWithEmail");
    public static final By EDIT_TEXT_LOGIN_MAIL=MobileBy.id("com.superlive.liveapp:id/editTextLoginMail");
    public static final By EDIT_TEXT_LOGIN_PASSWORD=MobileBy.id("com.superlive.liveapp:id/editTextLoginPassword");
    public static final By BTN_LOGIN=MobileBy.id("com.superlive.liveapp:id/loginButton");
    public static final By IMAGE_VIEW_ICON=MobileBy.id("com.superlive.liveapp:id/imageViewIcon");
    public static final By PERMISSION_ALLOW_BUTTON=MobileBy.id("com.android.permissioncontroller:id/permission_allow_button");
    public static final By BTN_SIGN_IN_WITH_GOOGLE=MobileBy.id("com.superlive.liveapp:id/btnSignInWithGoogle");
    public static final By BTN_ACCOUNT_NAME_GOOGLE=MobileBy.id("com.google.android.gms:id/account_name");
    public static final By BTN_SIGN_IN_WITH_PHONE=MobileBy.id("com.superlive.liveapp:id/btnSignInWithPhone");
    public static final By IMAGE_VIEW_ARROW_COUNTRY_CODE=MobileBy.id("com.superlive.liveapp:id/imageView_arrow");
    public static final By EDIT_TEXT_SEARCH_COUNTRY_CODE=MobileBy.id("com.superlive.liveapp:id/editText_search");
    public static final By TEXT_VIEW_COUNTRY_NAME=MobileBy.id("com.superlive.liveapp:id/textView_countryName");
    public static final By EDIT_TEXT_PHONE_NUMBER=MobileBy.id("com.superlive.liveapp:id/editTextPhoneNumber");
    public static final By BTN_CONTINUE=MobileBy.id("com.superlive.liveapp:id/continueButton");
    public static final By BTN_CONFIRM=MobileBy.id("com.superlive.liveapp:id/md_button_positive");
    public static final By FIRST_NUMBER_OF_SMS_CODE_TEXT_BOX=MobileBy.id("com.superlive.liveapp:id/firstNumberOfSmsCode");
    public static final By SECOND_NUMBER_OF_SMS_CODE_TEXT_BOX=MobileBy.id("com.superlive.liveapp:id/secondNumberOfSmsCode");
    public static final By THIRD_NUMBER_OF_SMS_CODE_TEXT_BOX=MobileBy.id("com.superlive.liveapp:id/thirdNumberOfSmsCode");
    public static final By FOURTH_NUMBER_OF_SMS_CODE_TEXT_BOX=MobileBy.id("com.superlive.liveapp:id/fourthNumberOfSmsCode");
    public static final By FIFTH_NUMBER_OF_SMS_CODE_TEXT_BOX=MobileBy.id("com.superlive.liveapp:id/fifthNumberOfSmsCode");
    public static final By SIXTH_NUMBER_OF_SMS_CODE_TEXT_BOX=MobileBy.id("com.superlive.liveapp:id/sixthNumberOfSmsCode");
}