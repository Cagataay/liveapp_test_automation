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

    public static final By NAV_BAR_INBOX=MobileBy.id("com.superlive.liveapp:id/navigation_inbox");
    public static final By INBOX_TITLE=MobileBy.id("com.superlive.liveapp:id/textViewToolBar");
    public static final By INBOX_ONLINE_STATUS=MobileBy.id("com.superlive.liveapp:id/conversationOnlineStatus");
    public static final By PROFILE_PICTURE =MobileBy.id("com.superlive.liveapp:id/imgProfilePicture");
    public static final By LIVESTREAM_BUTTON=MobileBy.id("com.superlive.liveapp:id/fabButtonStartStream");
    public static final By USER_LEVEL_BADGE=MobileBy.id("com.superlive.liveapp:id/textViewLevel");
    public static final By INBOX_TIMESTAMP=MobileBy.id("com.superlive.liveapp:id/textViewTimestamp");
    public static final By SUPERLIVE_OFFICIAL_ACCOUNT=MobileBy.xpath("//android.widget.TextView[contains(@text, 'SuperLive Official')]");
    public static final By INBOX_MODERATION_ACCOUNT=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Moderation')]");
    public static final By BACK_BUTTON=MobileBy.id("com.superlive.liveapp:id/btnBack");
    public static final By ANNOUNCEMENT_IMAGE=MobileBy.id("com.superlive.liveapp:id/imgAnnouncement");
    public static final By CONTINUE_BUTTON=MobileBy.id("com.superlive.liveapp:id/btnContinue");
    public static final By MESSAGE_DATE=MobileBy.id("com.superlive.liveapp:id/messageDate");
    public static final By CHAT_TIMESTAMP=MobileBy.id("com.superlive.liveapp:id/date");
    public static final By CONVERSATION_USER_NAME=MobileBy.id("com.superlive.liveapp:id/conversationUserName");
    public static final By INBOX_SUPPORT_ACCOUNT=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Support Specialist')]"); //'VIP Support'
    public static final By CONVERSATION_COIN_RECOVERY_TITLE=MobileBy.id("com.superlive.liveapp:id/conversationCoinRecoveryTitle");
    public static final By CONVERSATION_COIN_RECOVERY_ARROW=MobileBy.id("com.superlive.liveapp:id/conversationCoinRecoveryArrow");
    public static final By CONVERSATION_USER_LAST_SEEN=MobileBy.id("com.superlive.liveapp:id/conversationUserLastSeen");
    public static final By SEND_MEDIA_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgCameraMessage");
    public static final By SEND_TEXT_AREA=MobileBy.id("com.superlive.liveapp:id/edtMessage");
    public static final By SEND_MESSAGE_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgSend");

    public static final By INBOX_USER=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Tester699')]"); //Text can be changed
    public static final By PRIVATE_CALL_VOICE_BUTTON=MobileBy.id("com.superlive.liveapp:id/voiceCallStartButton");
    public static final By PRIVATE_CALL_VIDEO_BUTTON=MobileBy.id("com.superlive.liveapp:id/videoCallStartButton");
    public static final By CHAT_USER_OPTION_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgDownArrow");
    public static final By OVERLAY_VIEW_PROFILE_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'View Profile')]");
    public static final By OVERLAY_MUTE_CALLS_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Mute Calls')]");
    public static final By OVERLAY_BLOCK_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Block')]");
    public static final By OVERLAY_REPORT_AND_BLOCK_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Report and Block')]");
    public static final By OVERLAY_DELETE_CONVERSATION_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Delete conversation')]");
    public static final By OVERLAY_CANCEL_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Cancel')]");
    public static final By PROFILE_BACK_BUTTON=MobileBy.id("com.superlive.liveapp:id/backButton");
}