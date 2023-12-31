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
    public static final By BTN_SIGN_IN_WITH_TWITTER=MobileBy.id("com.superlive.liveapp:id/btnSignInWithTwitter");
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
    public static final By BTN_SIGN_UP_WITH_EMAIL=MobileBy.id("com.superlive.liveapp:id/btnSignUpWithEmail");
    public static final By EDIT_TEXT_SIGN_UP_MAIL=MobileBy.id("com.superlive.liveapp:id/editTextSignUpMail");
    public static final By EDIT_TEXT_SIGN_UP_PASSWORD=MobileBy.id("com.superlive.liveapp:id/editTextPassword");
    public static final By EDIT_TEXT_SIGN_UP_PASSWORD_AGAIN=MobileBy.id("com.superlive.liveapp:id/editTextPasswordAgain");
    public static final By BTN_SIGN_UP=MobileBy.id("com.superlive.liveapp:id/signUpButton");
    public static final By EDIT_TEXT_USER_NAME=MobileBy.id("com.superlive.liveapp:id/etUserName");
    public static final By USER_NAME_TITLE=MobileBy.id("com.superlive.liveapp:id/userNameTitle");
    public static final By USER_NAME_DESC=MobileBy.id("com.superlive.liveapp:id/nameDesc");
    public static final By LAYOUT_PROGRESS=MobileBy.id("com.superlive.liveapp:id/layout_progress");
    public static final By BTN_SIGN_UP_CONTINUE=MobileBy.id("com.superlive.liveapp:id/btnContinue");
    public static final By TERMS_AND_CONDITIONS_TEXT=MobileBy.id("com.superlive.liveapp:id/termsAndConditionsText");
    public static final By BTN_SIGN_UP_BACK=MobileBy.id("com.superlive.liveapp:id/btnBack");
    public static final By SIGN_UP_BIRTHDAY_TITLE=MobileBy.id("com.superlive.liveapp:id/birthdayTitle");
    public static final By SIGN_UP_BIRTHDAY_DESC=MobileBy.id("com.superlive.liveapp:id/birthdayDesc");
    public static final By SIGN_UP_BIRTHDAY=MobileBy.id("com.superlive.liveapp:id/birthday");
    public static final By SIGN_UP_MD_BUTTON_POSITIVE=MobileBy.id("com.superlive.liveapp:id/md_button_positive");
    public static final By SIGN_UP_GENDER_TITLE=MobileBy.id("com.superlive.liveapp:id/genderTitle");
    public static final By BTN_FEMALE=MobileBy.id("com.superlive.liveapp:id/btnFemale");
    public static final By BTN_FEMALE_TEXT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
    public static final By BTN_MALE=MobileBy.id("com.superlive.liveapp:id/btnMale");
    public static final By BTN_MALE_TEXT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
    public static final By SIGN_UP_INFO_PROFILE_PICTURE=MobileBy.id("com.superlive.liveapp:id/signUpInfoProfilePicture");
    public static final By PERMISSION_ALLOW_FOREGROUND_ONLY_BUTTON=MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public static final By SIGN_UP_TAKE_A_PHOTO_BUTTON=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
    public static final By CAMERA_SHOOT_BUTTON=MobileBy.id("com.sec.android.app.camera:id/normal_center_button");
    public static final By CAMERA_OK_BUTTON=MobileBy.id("com.sec.android.app.camera:id/okay");
    public static final By CAMERA_IMAGE_MENU_CROP=MobileBy.id("com.superlive.liveapp:id/crop_image_menu_crop");
    public static final By SIGN_IN_USER_SERVICE_AGREEMENT_TEXT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[3]");
    public static final By SIGN_IN_USER_AGREEMENT_TEXT=MobileBy.id("com.superlive.liveapp:id/signUpUserAgreement");
    public static final By BTN_BACK=MobileBy.id("com.superlive.liveapp:id/imgBack");
    public static final By TERMS_OF_SERVICE_TEXT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView");
    public static final By WELCOME_TO_SUPERLIVE_TEXT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]");
    public static final By SIGN_UP_WELCOME_TO_SUPERLIVE_TEXT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
    public static final By WELCOME_TO_SUPERLIVE_OR_TEXT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
    public static final By TEXT_VIEW_TOOLBAR=MobileBy.id("com.superlive.liveapp:id/textViewToolBar");
    public static final By SIGN_UP_PASSWORD_WARNING_ICON=MobileBy.id("com.superlive.liveapp:id/signUpPasswordWarningIcon");
    public static final By SIGN_UP_PASSWORD_AGAIN_WARNING_ICON=MobileBy.id("com.superlive.liveapp:id/signUpPasswordAgainWarningIcon");
    public static final By SIGN_UP_PASSWORD_ERROR_TEXT=MobileBy.id("com.superlive.liveapp:id/signUpPasswordErrorText");
    public static final By SIGN_UP_EMAIL_WARNING_ICON=MobileBy.id("com.superlive.liveapp:id/signUpEmailWarningIcon");
    public static final By SIGN_UP_EMAIL_ERROR_TEXT=MobileBy.id("com.superlive.liveapp:id/signUpEmailErrorText");
    public static final By BTN_PRIVACY_POLICY=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    public static final By BTN_TERMS_OF_SERVICE=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
    public static final By BTN_EMAIL_OVERLAY_BACK=MobileBy.id("com.superlive.liveapp:id/emailOverlayBack");
    public static final By EMAIL_OVERLAY_TITLE=MobileBy.id("com.superlive.liveapp:id/emailOverlayTitle");
    public static final By EMAIL_OVERLAY_DESC=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]");
    public static final By BTN_FORGOT_PASSWORD=MobileBy.id("com.superlive.liveapp:id/forgotPasswordButton");
    public static final By EDIT_TEXT_FORGOT_PASSWORD_EMAIL=MobileBy.id("com.superlive.liveapp:id/editTextForgotPasswordMail");
    public static final By FORGOT_PASSWORD_EMAIL_ERROR_TEXT=MobileBy.id("com.superlive.liveapp:id/forgotPasswordEmailErrorText");
    public static final By FORGOT_PASSWORD_EMAIL_WARNING_ICON=MobileBy.id("com.superlive.liveapp:id/forgotPasswordEmailWarningIcon");
    public static final By BTN_CONTINUE_FORGOT_PASSWORD=MobileBy.id("com.superlive.liveapp:id/forgotPasswordContinueButton");
    public static final By TEXT_VIEW_DESC=MobileBy.id("com.superlive.liveapp:id/textViewDescription");
    public static final By IMAGE_BUTTON_CLOSE=MobileBy.id("com.superlive.liveapp:id/imageButtonClose");
    public static final By LOGIN_EMAIL_WARNING_ICON=MobileBy.id("com.superlive.liveapp:id/loginEmailWarningIcon");
    public static final By LOGIN_PASSWORD_WARNING_ICON=MobileBy.id("com.superlive.liveapp:id/loginPasswordWarningIcon");
    public static final By SIGN_UP_TITLE=MobileBy.id("com.superlive.liveapp:id/signUpTitle");
    public static final By LOGIN_EMAIL_ERROR_TEXT=MobileBy.id("com.superlive.liveapp:id/loginEmailErrorText");
    public static final By LOGIN_PASSWORD_ERROR_TEXT=MobileBy.id("com.superlive.liveapp:id/loginPasswordErrorText");
    public static final By TEXT_VIEW_VERIFY_ERROR=MobileBy.id("com.superlive.liveapp:id/textViewVerifyError");
    public static final By NAV_BAR_INBOX=MobileBy.id("com.superlive.liveapp:id/navigation_inbox");
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
    public static final By INBOX_SUPPORT_ACCOUNT=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Support Specialist')]");
    public static final By INBOX_VIP_SUPPORT=MobileBy.xpath("//android.widget.TextView[contains(@text, 'VIP Support')]");
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
    public static final By OVERLAY_UNMUTE_CALLS_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Unmute Calls')]");
    public static final By OVERLAY_BLOCK_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Block')]");
    public static final By OVERLAY_REPORT_AND_BLOCK_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Report and Block')]");
    public static final By OVERLAY_DELETE_CONVERSATION_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Delete conversation')]");
    public static final By OVERLAY_CANCEL_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Cancel')]");
    public static final By PROFILE_BACK_BUTTON=MobileBy.id("com.superlive.liveapp:id/backButton");
    public static final By INBOX_PIN_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Pin')]");
    public static final By INBOX_UNPIN_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Unpin')]");
    public static final By MARK_AS_UNREAD_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Mark as unread')]");
    public static final By MARK_AS_READ_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Mark as read')]");
    public static final By CAMERA_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Camera')]");
    public static final By ALLOW_WHILE_USING_THE_APP=MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public static final By PHOTO_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Photo')]");
    public static final By VIDEO_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Video')]");
    public static final By TAKE_A_PHOTO_BUTTON=MobileBy.id("com.android.camera2:id/shutter_button");
    public static final By CONFIRM_PHOTO_BUTTON=MobileBy.id("com.android.camera2:id/done_button");
    public static final By SEND_TO_PERSON_BUTTON=MobileBy.id("com.superlive.liveapp:id/sendButton");
    public static final By SEND_MEDIA_TO_USER=MobileBy.id("com.superlive.liveapp:id/sendButtonLayout");
    public static final By GIFT_PRICE_ELEMENT=MobileBy.xpath("//android.widget.TextView[contains(@text, '8')]");
    public static final By CHAT_GIFT_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgGift");
    public static final By AUDIO_MESSAGE_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgAudioMessage");
    public static final By PLAY_BUTTON=MobileBy.id("com.superlive.liveapp:id/btnPlay");
    public static final By MESSAGE_SEEN_STATE=MobileBy.id("com.superlive.liveapp:id/ivMessageSeenState");
    public static final By MESSAGE_SEEN_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Sent')]");
    public static final By PHOTO_NUMBER_ELEMENT=MobileBy.id("com.superlive.liveapp:id/txtPhotoNumber");
    public static final By PHOTO_MESSAGE_ELEMENT=MobileBy.id("com.superlive.liveapp:id/imgPhotoMessage");
    public static final By SEND_GIFT_IMAGE=MobileBy.id("com.superlive.liveapp:id/imgSendGift");
    public static final By COIN_IMAGE=MobileBy.id("com.superlive.liveapp:id/imgCoin");
    public static final By GIFT_IN_CHAT=MobileBy.id("com.superlive.liveapp:id/imgGiftThumbnail");
    public static final By GIFT_PRICE_IN_CHAT=MobileBy.id("com.superlive.liveapp:id/tvGiftPrice");
    public static final By AUDIO_MESSAGE_BAR=MobileBy.id("com.superlive.liveapp:id/seekBar");
    public static final By AUDIO_MESSAGE_TIMER=MobileBy.id("com.superlive.liveapp:id/tvTime");
    public static final By INBOX_PIN_IMAGE=MobileBy.id("com.superlive.liveapp:id/messagePinImage");
    public static final By VIP_GIFT_BUTTON=MobileBy.id("com.superlive.liveapp:id/vipBadgeVipFilterType");
    public static final By TOTAL_COIN_AMOUNT=MobileBy.id("com.superlive.liveapp:id/messageSendGiftTotalCoin");
    public static final By COIN_ICON_IN_OVERLAY=MobileBy.id("com.superlive.liveapp:id/messageSendGiftCoinIcon");
    public static final By BUY_COINS_BUTTON_IN_OVERLAY=MobileBy.id("com.superlive.liveapp:id/messageSendGiftPurchaseCoin");
    public static final By HYBRID_PURCHASE_CLOSE_BUTTON=MobileBy.id("com.superlive.liveapp:id/hybridPurchaseClose");
    public static final By CONFIRM_POPUP_BUTTON=MobileBy.id("android:id/button1");
    public static final By TOUCH_OUTSIDE_AREA=MobileBy.id("com.superlive.liveapp:id/touch_outside");
    public static final By PHOTO_MESSAGE_TITLE=MobileBy.id("com.superlive.liveapp:id/tvTitle");
    public static final By MEDIA_MESSAGE_DETAIL =MobileBy.id("com.superlive.liveapp:id/tvTitleDetail");
    public static final By MEDIA_IN_DETAIL =MobileBy.id("com.superlive.liveapp:id/ivAlbumMedia");
    public static final By DETAIL_BACK_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgBack");
    public static final By TEXT_VIDEO_NUMBER=MobileBy.id("com.superlive.liveapp:id/txtVideoNumber");
    public static final By TOP_BADGE=MobileBy.id("com.superlive.liveapp:id/badgeText");
    public static final By VIP_BADGE=MobileBy.id("com.superlive.liveapp:id/vipText");
    public static final By VIDEO_MESSAGE_ICON=MobileBy.id("com.superlive.liveapp:id/imgVideoMessage");
    public static final By COPY_MESSAGE_ELEMENT=MobileBy.id("com.superlive.liveapp:id/title");
    public static final By TEXT_MESSAGE_IN_CHAT=MobileBy.id("com.superlive.liveapp:id/messageText");
    public static final By SEEN_POPUP_ICON=MobileBy.id("com.superlive.liveapp:id/seenIcon");
    public static final By SEEN_POPUP_TITLE=MobileBy.id("com.superlive.liveapp:id/dialogTitle");
    public static final By SEEN_INFO_DESCRIPTION=MobileBy.id("com.superlive.liveapp:id/seenInfoDescription");
    public static final By CONFIRM_BUTTON_IN_POPUP=MobileBy.id("com.superlive.liveapp:id/btnConfirm");
    public static final By CANCEL_BUTTON_IN_POPUP=MobileBy.id("com.superlive.liveapp:id/bntCancel");
    public static final By MEDIA_PREVIEW_IN_MEDIA_SCREEN=MobileBy.id("com.superlive.liveapp:id/imgMediaThumbnail3");
    public static final By SUGGESTED_GIFT_BUTTON=MobileBy.id("com.superlive.liveapp:id/livestreamGiftSuggestedInfo");
    public static final By PREMIUM_CONTENT_HEADER=MobileBy.id("com.superlive.liveapp:id/txtPremiumContentHeader");
    public static final By PREMIUM_CONTENT_DESCRIPTION=MobileBy.id("com.superlive.liveapp:id/txtPremiumContentDescription");
    public static final By MEDIA_SIZE_ELEMENT=MobileBy.id("com.superlive.liveapp:id/tvMediaSize");
    public static final By NAVIGATION_PROFILE_BUTTON = MobileBy.id("com.superlive.liveapp:id/navigation_profile");
    public static final By NON_LOGIN_USER_IMAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView");
    public static final By NON_LOGIN_USER_TEXT = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
    public static final By PROFILE_USER_LOGIN_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileUserLogin");
    public static final By LOGIN_OVERLAY = MobileBy.id("com.superlive.liveapp:id/linearLayoutBlur");
    public static final By PROFILE_HEADER_IMAGE = MobileBy.id("com.superlive.liveapp:id/profileHeaderImage");
    public static final By PROFILE_USER_EDIT_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileUserEdit");
    public static final By PROFILE_SHARE_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileShareUser");
    public static final By SELF_PROFILE_PREVIEW_BUTTON = MobileBy.id("com.superlive.liveapp:id/selfProfilePreview");
    public static final By PROFILE_IMAGE = MobileBy.id("com.superlive.liveapp:id/profileHalfOverlayPicture");
    public static final By PROFILE_USER_LOCATION_CONTAINER = MobileBy.id("com.superlive.liveapp:id/profileUserLocationContainer");
    public static final By PROFILE_USER_SHARED_ID= MobileBy.id("com.superlive.liveapp:id/profileUserSharedId");
    public static final By PROFILE_USER_LEVEL= MobileBy.id("com.superlive.liveapp:id/profileUserLevel");
    public static final By PROFILE_USER_NAME= MobileBy.id("com.superlive.liveapp:id/profileUserName");
    public static final By PROFILE_USER_FOLLOWER= MobileBy.id("com.superlive.liveapp:id/profileUserFollower");
    public static final By PROFILE_USER_FOLLOWER_TEXT= MobileBy.id("com.superlive.liveapp:id/profileUserFollowerSubtext");
    public static final By PROFILE_USER_FOLLOWING= MobileBy.id("com.superlive.liveapp:id/profileUserFollowing");
    public static final By PROFILE_USER_FOLLOWING_TEXT= MobileBy.id("com.superlive.liveapp:id/profileUserFollowingSubtext");
    public static final By PROFILE_USER_EARNED_DIAMONDS= MobileBy.id("com.superlive.liveapp:id/profileUserEarnedDiamonds");
    public static final By PROFILE_USER_EARNED_DIAMONDS_IMAGE= MobileBy.id("com.superlive.liveapp:id/profileUserImageReceivedGifts");
    public static final By PROFILE_USER_EARNED_DIAMONDS_TEXT= MobileBy.id("com.superlive.liveapp:id/profileUserReceivedGiftsSubtext");
    public static final By PROFILE_USER_SENT_COINS= MobileBy.id("com.superlive.liveapp:id/profileUserSentGifts");
    public static final By PROFILE_USER_SENT_COINS_IMAGE= MobileBy.id("com.superlive.liveapp:id/profileUserImageSentGifts");
    public static final By PROFILE_USER_SENT_COINS_TEXT= MobileBy.id("com.superlive.liveapp:id/profileUserSentGiftsSubtext");
    public static final By PROFILE_HEADER_IMAGE_LINEAR_LAYOUT = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout");
    public static final By PROFILE_USER_ABOUT_TEXT = MobileBy.id("com.superlive.liveapp:id/profileUserAboutText");
    public static final By PROFILE_DEFAULT_FAMILY_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileDefaultFamily");
    public static final By PROFILE_DEFAULT_FAMILY_IMAGE = MobileBy.id("com.superlive.liveapp:id/familyDefaultPic");
    public static final By PROFILE_DEFAULT_FAMILY_TITLE = MobileBy.id("com.superlive.liveapp:id/familyTitle");
    public static final By PROFILE_DEFAULT_FAMILY_RIGHT_ARROW = MobileBy.id("com.superlive.liveapp:id/familyDefaultRightArrow");
    public static final By START_STREAM_BUTTON = MobileBy.id("com.superlive.liveapp:id/fabButtonStartStream");
    public static final By PROFILE_COIN_PURCHASE_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileCoinPurchase");
    public static final By PROFILE_COIN_PURCHASE_IMAGE = MobileBy.id("com.superlive.liveapp:id/profileCoinPurchaseItemCircularLogo");
    public static final By PROFILE_COIN_PURCHASE_TITLE = MobileBy.id("com.superlive.liveapp:id/profileCoinPurchaseItemTitle");
    public static final By PROFILE_COIN_PURCHASE_RIGHT_ARROW = MobileBy.id("com.superlive.liveapp:id/profileCoinPurchaseItemRightArrow");
    public static final By PROFILE_VIP_STORE_BUTTON = MobileBy.id("com.superlive.liveapp:id/vipStore");
    public static final By PROFILE_VIP_STORE_IMAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[4]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By PROFILE_VIP_STORE_TITLE_IMAGE = MobileBy.id("com.superlive.liveapp:id/icVipStoreBlue");
    public static final By PROFILE_VIP_STORE_TITLE_TEXT = MobileBy.id("com.superlive.liveapp:id/profileVipStoreItemShopping");
    public static final By PROFILE_VIP_STORE_RIGHT_ARROW = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[3]/android.widget.ImageView[2]");
    public static final By PROFILE_GOLD_VIP_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileGold");
    public static final By PROFILE_GOLD_VIP_IMAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[5]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By PROFILE_GOLD_VIP_TITLE_IMAGE = MobileBy.id("com.superlive.liveapp:id/profileGoldVipItemTitle");
    public static final By PROFILE_GOLD_VIP_TITLE_TEXT = MobileBy.id("com.superlive.liveapp:id/profileGoldVipItemUpgradeNow");
    public static final By PROFILE_GOLD_VIP_RIGHT_ARROW = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[4]/android.widget.ImageView");
    public static final By PROFILE_USER_LEVEL_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileUserLevelLayout");
    public static final By PROFILE_USER_LEVEL_BUTTON_IMAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[6]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By PROFILE_USER_LEVEL_TITLE = MobileBy.id("com.superlive.liveapp:id/profileUserLevelItemTitle");
    public static final By PROFILE_USER_LEVEL_RIGHT_ARROW = MobileBy.id("com.superlive.liveapp:id/profileUserLevelItemRightArrow");
    public static final By PROFILE_MOST_SENT_GIFTS_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileMostSentGifts");
    public static final By PROFILE_MOST_SENT_GIFTS_IMAGE = MobileBy.id("com.superlive.liveapp:id/mostSentGiftsCircularLogo");
    public static final By PROFILE_MOST_SENT_GIFTS_TITLE = MobileBy.id("com.superlive.liveapp:id/mostSentGiftsText");
    public static final By PROFILE_MOST_SENT_GIFTS_RIGHT_ARROW = MobileBy.id("com.superlive.liveapp:id/mostSentGiftsRightArrow");
    public static final By PROFILE_AGENCY_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileAgency");
    public static final By PROFILE_AGENCY_IMAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[8]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By PROFILE_AGENCY_TITLE = MobileBy.id("com.superlive.liveapp:id/profileAgencyItemTitle");
    public static final By PROFILE_AGENCY_RIGHT_ARROW = MobileBy.id("com.superlive.liveapp:id/profileAgencyItemRightArrow");
    public static final By PROFILE_INCOME_BUTTON= MobileBy.id("com.superlive.liveapp:id/profileIncome");
    public static final By PROFILE_INCOME_IMAGE= MobileBy.id("com.superlive.liveapp:id/profileMyIncomeItemCircularLogo");
    public static final By PROFILE_INCOME_TITLE= MobileBy.id("com.superlive.liveapp:id/profileMyIncomeItemTitle");
    public static final By PROFILE_INCOME_RIGHT_ARROW= MobileBy.id("com.superlive.liveapp:id/profileMyIncomeItemRightArrow");
    public static final By PROFILE_CASH_OUT_BUTTON= MobileBy.id("com.superlive.liveapp:id/profileCashOut");
    public static final By PROFILE_CASH_OUT_IMAGE= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[10]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By PROFILE_CASH_OUT_TITLE= MobileBy.id("com.superlive.liveapp:id/profileCashOutItemTitle");
    public static final By PROFILE_CASH_OUT_RIGHT_ARROW= MobileBy.id("com.superlive.liveapp:id/profileCashOutItemRightArrow");
    public static final By PROFILE_LINKED_ACCOUNT_BUTTON= MobileBy.id("com.superlive.liveapp:id/profileAddAccount");
    public static final By PROFILE_LINKED_ACCOUNT_IMAGE= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[11]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By PROFILE_LINKED_ACCOUNT_TITLE= MobileBy.id("com.superlive.liveapp:id/profileLinkAccountItemTitle");
    public static final By PROFILE_LINKED_ACCOUNT_RIGHT_ARROW= MobileBy.id("com.superlive.liveapp:id/profileLinkAccountItemRightArrow");
    public static final By PROFILE_ITEM_BAG_BUTTON= MobileBy.id("com.superlive.liveapp:id/profileItemBag");
    public static final By PROFILE_ITEM_BAG_IMAGE= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[12]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By PROFILE_ITEM_BAG_TITLE= MobileBy.id("com.superlive.liveapp:id/profileItemBagTitle");
    public static final By PROFILE_ITEM_BAG_RIGHT_ARROW= MobileBy.id("com.superlive.liveapp:id/profileItemBagRightArrow");
    public static final By PROFILE_SETTINGS_BUTTON= MobileBy.id("com.superlive.liveapp:id/profileSettings");
    public static final By PROFILE_SETTINGS_IMAGE= MobileBy.id("com.superlive.liveapp:id/profileSettingsItemCircularLogo");
    public static final By PROFILE_SETTINGS_TITLE= MobileBy.id("com.superlive.liveapp:id/profileSettingsItemTitle");
    public static final By PROFILE_SETTINGS_RIGHT_ARROW= MobileBy.id("com.superlive.liveapp:id/profileSettingsItemRightArrow");
    public static final By PROFILE_FAMILY_BUTTON= MobileBy.id("com.superlive.liveapp:id/familyBgShadow");
    public static final By PROFILE_FAMILY_IMAGE= MobileBy.id("com.superlive.liveapp:id/familyPic");
    public static final By PROFILE_FAMILY_NAME= MobileBy.id("com.superlive.liveapp:id/familyName");
    public static final By PROFILE_FAMILY_RIGHT_ARROW= MobileBy.id("com.superlive.liveapp:id/familyRightArrow");
    public static final By PROFILE_VIP_BADGE = MobileBy.id("com.superlive.liveapp:id/profileUserGoldVip");
    public static final By GOLD_PROFILE_OVERLAY_LINE = MobileBy.id("com.superlive.liveapp:id/goldProfileOverlayLine");
    public static final By GOLD_LION_OVERLAY_IMAGE = MobileBy.id("com.superlive.liveapp:id/goldLionOverlayPicture");
    public static final By USER_PROFILE_EDIT_BUTTON = MobileBy.id("com.superlive.liveapp:id/profileUserEdit");
    public static final By EDIT_PROFILE_NAME= MobileBy.id("com.superlive.liveapp:id/editProfileName");
    public static final By EDIT_PROFILE_BIO= MobileBy.id("com.superlive.liveapp:id/editProfileBio");
    public static final By PROFILE_EDIT_SHARED_ID= MobileBy.id("com.superlive.liveapp:id/editProfileId");
    public static final By TEXT_VIEW_SAVE= MobileBy.id("com.superlive.liveapp:id/textViewSave");
    public static final By SEARCH_BAR_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgSearch");
    public static final By SEARCH_BAR_LABEL=MobileBy.id("com.superlive.liveapp:id/searchEditText");
    public static final By SEARCH_RESULT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
    public static final By SEARCH_BAR_FOLLOW=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageButton");
    public static final By SEARCH_BAR_CLOSE=MobileBy.id("com.superlive.liveapp:id/closeSearchImageButton");
    public static final By LOGIN_POPUP_CLOSE=MobileBy.id("com.superlive.liveapp:id/md_button_negative");
    public static final By SEARCH_BAR_UNFOLLOW=MobileBy.id("com.superlive.liveapp:id/imgFollowed");
    public static final By UNFOLLOW_POPUP=MobileBy.id("com.superlive.liveapp:id/customDialogPositive");
    public static final By SEARCH_BAR_USER_LAYOUT=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    public static final By EMPTY_SEARCH_VIEW=MobileBy.id("com.superlive.liveapp:id/emptySearchView");
    public static final By EMPTY_DISCOVER_PAGE=MobileBy.id("com.superlive.liveapp:id/discoverEmptyView");
    public static final By FAMILY_CHAT_PHOTO =MobileBy.id("com.superlive.liveapp:id/familyImageCircle");
    public static final By FAMILY_CHAT_MEMBER_COUNT=MobileBy.id("com.superlive.liveapp:id/familyNameMemberCount");
    public static final By FAMILY_MORE_BUTTON=MobileBy.id("com.superlive.liveapp:id/imgMore");
    public static final By FAMILY_CHAT_USER_PROFILE_PICTURE=MobileBy.id("com.superlive.liveapp:id/profilePic");
    public static final By FAMILY_OPTION_POPUP_TITLE=MobileBy.id("com.superlive.liveapp:id/md_text_title");
    public static final By MUTE_NOTIF_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Mute Notifications')]");
    public static final By UNMUTE_NOTIF_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Unmute Notifications')]");
    public static final By DELETE_FAMILY_CHAT_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Delete chat')]");
    public static final By MUTE_MEMBERS_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Mute the members')]");
    public static final By UNMUTE_MEMBERS_BUTTON=MobileBy.xpath("//android.widget.TextView[contains(@text, 'Unmute Members')]");
    public static final By INBOX_FAMILY_MUTE_ICON=MobileBy.id("com.superlive.liveapp:id/ic_conversation_muted");
    public static final By ALERT_TITLE=MobileBy.id("com.superlive.liveapp:id/alertTitle");
    public static final By ALERT_MESSAGE=MobileBy.id("android:id/message");
    public static final By ALERT_CANCEL_BUTTON=MobileBy.id("android:id/button2");
    public static final By LEAVE_FAMILY_BTN_IN_POPUP=MobileBy.xpath("//android.widget.TextView[contains(@text, 'leave family')]");
    public static final By FAMILY_NAME_IN_CHAT=MobileBy.id("com.superlive.liveapp:id/userName");
    public static final By LISTED_FAMILY_LEADER = MobileBy.xpath("//android.widget.TextView[contains(@text, 'tester052')]");
    public static final By JOIN_FAMILY_REQUEST_BUTTON = MobileBy.id("com.superlive.liveapp:id/btnJoinText");
    public static final By NOTIFICATION_BUTTON = MobileBy.id("com.superlive.liveapp:id/imageButtonNotifications");
    public static final By NOTIFICATION_APPROVE_BUTTON = MobileBy.id("com.superlive.liveapp:id/approve");
    public static final By FAMILY_NOTIFICATION_IN_CHAT = MobileBy.id("com.superlive.liveapp:id/tvNotification");
    public static final By NAVIGATION_LEADER_BOARD_BUTTON= MobileBy.id("com.superlive.liveapp:id/navigation_leader_board");
    public static final By NAVIGATION_PREMIUM_LEADER_BOARD_BUTTON= MobileBy.id("com.superlive.liveapp:id/imageButtonLeaderBoards");
    public static final By FIRST_PROFILE_NAME_LEADER_BOARD= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[2]");
    public static final By STREAMERS_TAB_LEADER_BOARD= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Streamers\"]");
    public static final By SUPPORTERS_TAB_LEADER_BOARD= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Supporters\"]");
    public static final By LAST_24_HOURS_TAB_LEADER_BOARD= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Last 24 Hours\"]");
    public static final By LAST_7_DAYS_TAB_LEADER_BOARD= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Last 7 Days\"]");
    public static final By ALL_TIME_TAB_LEADER_BOARD= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"All Time\"]");
    public static final By FAMILIES_TAB_LEADER_BOARD= MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Families\"]");
    public static final By FIRST_FAMILY_NAME_LEADER_BOARD= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[2]");
    public static final By FIRST_PROFILE_FOLLOW_BUTTON_LEADER_BOARD= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.ImageView");
    public static final By FOLLOW_BUTTON_TEXT_PROFILE= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.TextView");
    public static final By CUSTOM_DIALOG_POSITIVE= MobileBy.id("com.superlive.liveapp:id/customDialogPositive");
    public static final By CUSTOM_DIALOG_NEGATIVE= MobileBy.id("com.superlive.liveapp:id/customDialogNegative");
    public static final By LEADER_BOARD_COUNTRY_SELECTION_BUTTON= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup");
    public static final By FIRST_OPTION_COUNTRY_LEADER_BOARD= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    public static final By SEARCH_TEXT_BOX_LEADER_BOARD= MobileBy.id("com.superlive.liveapp:id/search_src_text");
    public static final By SAVE_BUTTON= MobileBy.id("com.superlive.liveapp:id/btnSave");
    public static final By SECOND_OPTION_DISCOVER_COUNTRY_TEXT= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
    public static final By FAMILY_LEADER_BOARD_INFO_BUTTON= MobileBy.id("com.superlive.liveapp:id/familyLeaderBoardInfoButton");

    public static final By FOLLOWING_NAVBAR = MobileBy.id("com.superlive.liveapp:id/navigation_following");
    public static final By BUTTON_LOGIN = MobileBy.id("com.superlive.liveapp:id/buttonLogin");
    public static final By FOLLOWINGS_NONSTREAM = MobileBy.id("com.superlive.liveapp:id/tvNoAvailableStreamMessage");
    public static final By STREAM_CARD = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.GridView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout");
    public static final By PK_BADGE_TEXT = MobileBy.id("com.superlive.liveapp:id/streamBadgeText");
    public static final By MGS_BADGE_TEXT = MobileBy.id("com.superlive.liveapp:id/groupStreamBadge");
    public static final By PREMIUM_BADGE = MobileBy.id("com.superlive.liveapp:id/ivPremium");
    public static final By MESSAGE_NAVBAR = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.ImageView");
    public static final By START_STREAM = MobileBy.id("com.superlive.liveapp:id/fabButtonStartStream");
    public static final By ACCEPT_CAMERA_PERMISSION = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public static final By ACCEPT_MICROPHONE_PERMISSION = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public static final By ACCEPT_NEAR_DEVICE_PERMISSION = MobileBy.id("com.android.permissioncontroller:id/permission_allow_button");
    public static final By TERMS_USAGE_BUTTON = MobileBy.id("com.superlive.liveapp:id/cbTermsOfUsage");
    public static final By ACCEPT_TERMS_USAGE_BUTTON = MobileBy.id("com.superlive.liveapp:id/btnAcceptTerms");
    public static final By PUBLIC_STREAM_CONTAINER = MobileBy.id("com.superlive.liveapp:id/startPublicStreamContainer");
    public static final By START_PUBLIC_STREAM = MobileBy.id("com.superlive.liveapp:id/btnStartStreaming");
    public static final By PK_WAR_BUTTON = MobileBy.id("com.superlive.liveapp:id/livestreamStartPk");
    public static final By CREATE_WHEEL = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.ImageButton");
    public static final By WRITE_WHEEL_NAME = MobileBy.id("com.superlive.liveapp:id/wheelNameEditText");
    public static final By WHEEL_GIFT_BUTTON = MobileBy.id("com.superlive.liveapp:id/selectGiftLayoutText");
    public static final By SELECT_GIFT_FOR_WHEEL = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[8]/android.view.ViewGroup/android.widget.ImageView");
    public static final By CONTINUE_BUTTON_FOR_GIFT = MobileBy.id("com.superlive.liveapp:id/continueButton");
    public static final By WHEEL_OPTIONS_1 = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText");
    public static final By WHEEL_OPTIONS_2 = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");
    public static final By CONTINUE_PREVIEW_BUTTON = MobileBy.id("com.superlive.liveapp:id/continueAndPreviewButton");
    public static final By PREVIEW_WHEEL = MobileBy.id("com.superlive.liveapp:id/spinningWheel");
    public static final By ACCEPT_AND_CREATE_WHEEL_BUTTON = MobileBy.id("com.superlive.liveapp:id/acceptAndCreateButton");
    public static final By SHOW_WHEEL_IN_STREAM = MobileBy.id("com.superlive.liveapp:id/showSpinningWheelButton");
    public static final By HAMBURGER_MENU_BUTTON = MobileBy.id("com.superlive.liveapp:id/livestreamStreamerHamburgerMenu");
    public static final By CLOSE_PK_SETTINGS_TUTORIAL = MobileBy.id("com.superlive.liveapp:id/imgClosePkSettingsTutorial");
    public static final By CLOSE_STICKER_TUTORIAL = MobileBy.id("com.superlive.liveapp:id/imgCloseStickerTutorial");
    public static final By MICROPHONE_CLOSE_BUTTON = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.ImageButton");
    public static final By TOUCH_OUTSIDE_IN_STREAM = MobileBy.id("com.superlive.liveapp:id/touch_outside");
    public static final By MICROPHONE_OFF_IMAGE = MobileBy.id("com.superlive.liveapp:id/streamerMicrophoneOffImage");
    public static final By CAMERA_OFF_BUTTON = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.ImageButton");
    public static final By CIRCULAR_AVATAR = MobileBy.id("com.superlive.liveapp:id/streamerCircularAvatar");
    public static final By CAMERA_SWITCH_BUTTON = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.ImageButton");
    public static final By MIRROR_BUTTON = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[5]/android.widget.ImageButton");
    public static final By BEAUTY_FILTER = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[6]/android.widget.ImageButton");
    public static final By HAMBURGER_SETTINGS = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[7]/android.widget.ImageButton");
    public static final By PK_SETTINGS_TEXT = MobileBy.id("com.superlive.liveapp:id/tvStreamPkSetting");
    public static final By GROUP_STREAM_SETTINGS_TEXT = MobileBy.id("com.superlive.liveapp:id/tvGroupStreamSetting");
    public static final By PK_LENGTH_SETTINGS_TEXT = MobileBy.id("com.superlive.liveapp:id/tvPkLengthSetting");
    public static final By TURN_OFF_GIFT_VOLUME = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[9]/android.widget.ImageButton");
    public static final By TURN_ON_GIFT_VOLUME_TEXT = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[9]/android.widget.TextView");
    public static final By TARGET_BAR_BUTTON = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[8]/android.widget.ImageButton");
    public static final By TARGET_BAR_TITLE = MobileBy.id("com.superlive.liveapp:id/targetBarTitleEditText");
    public static final By TARGET_AMOUNT = MobileBy.id("com.superlive.liveapp:id/targetAmountEditText");
    public static final By STARTING_AMOUNT = MobileBy.id("com.superlive.liveapp:id/startAmountEditText");
    public static final By TARGET_END_TIME = MobileBy.id("com.superlive.liveapp:id/tvTargetEndTime");
    public static final By TARGET_BAR_SAVE_BUTTON = MobileBy.id("com.superlive.liveapp:id/tvTargetBarSaveButton");
    public static final By CALENDER_DATE_CHOOSE = MobileBy.id("android:id/button1");
    public static final By TARGET_BAR_PREVIEW = MobileBy.id("com.superlive.liveapp:id/customTargetBar");
    public static final By TARGET_BAR_IN_STREAM = MobileBy.id("com.superlive.liveapp:id/targetBarProgress");
    public static final By CHAT_SETTINGS_IN_STREAM = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[10]/android.widget.ImageButton");
    public static final By INSIDE_CHAT_SETTINGS = MobileBy.id("com.superlive.liveapp:id/chatSettingsDescTV");
    public static final By GIFT_STICKER = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[11]/android.widget.ImageButton");
    public static final By GIFT_FOR_STICKER = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView[2]");
    public static final By SELECT_STICKER_GIFT = MobileBy.id("com.superlive.liveapp:id/btnSelectStickerGift");
    public static final By PREVIEW_STICKER = MobileBy.id("com.superlive.liveapp:id/costContainer");
    public static final By COMPLETED_STICKER_BUTTON = MobileBy.id("com.superlive.liveapp:id/btnStickerEditComplete");
    public static final By STICKER_IN_STREAM = MobileBy.id("com.superlive.liveapp:id/stickerGiftStreamViewContainer");
    public static final By DIAMOND_COUNT = MobileBy.id("com.superlive.liveapp:id/livestreamDiamondsCount");
    public static final By TOP_GIFTERS_OVERLAY = MobileBy.id("com.superlive.liveapp:id/linearLayoutEmptyView");
    public static final By VIEWER_COUNT_AREA = MobileBy.id("com.superlive.liveapp:id/livestreamViewersCount");
    public static final By VIEWERS_CONTAINER = MobileBy.id("com.superlive.liveapp:id/viewersContainer");
    public static final By STATS_BUTTON = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView");
    public static final By STATS_OVERLAY = MobileBy.id("com.superlive.liveapp:id/viewersContainer");
    public static final By PROFIL_PHOTO_AREA = MobileBy.id("com.superlive.liveapp:id/livestreamStreamerPicture");
    public static final By PROFIL_PHOTO_IN_OVERLAY = MobileBy.id("com.superlive.liveapp:id/profilePictureRoundedOverlay");
    public static final By PROFIL_OVERLAY_INFO = MobileBy.id("com.superlive.liveapp:id/profileOverlayInfoContainer");
    public static final By STREAM_CHAT = MobileBy.id("com.superlive.liveapp:id/livestreamChat");
    public static final By WRITE_CHAT_BAR = MobileBy.id("com.superlive.liveapp:id/livestreamMessageText");
    public static final By SEND_CHAT_MESSAGE = MobileBy.id("com.superlive.liveapp:id/livestreamMessageSend");
    public static final By CHECK_STREAM_MESSAGE = MobileBy.id("com.superlive.liveapp:id/livestreamMessagesRv");
    public static final By MESSAGE_OUTSIDE = MobileBy.id("com.superlive.liveapp:id/announcementContainerView");
    public static final By PK_WAR_OVERLAY = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup");
    public static final By GUEST_BUTTON = MobileBy.id("com.superlive.liveapp:id/livestreamStreamerGuestRequest");
    public static final By GUEST_OVERLAY = MobileBy.id("com.superlive.liveapp:id/guestAcceptOverlayEmpty");
    public static final By PREMIUM_STREAM_BUTTON = MobileBy.id("com.superlive.liveapp:id/livestreamStreamerStartPrivateLivestream");
    public static final By PREMIUM_STREAM_GIFT = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[8]/android.widget.ImageView");
    public static final By CONTINUE_PREMIUM_STREAM = MobileBy.id("com.superlive.liveapp:id/btnStartStreaming");
    public static final By PREMIUM_STREAM_BADGE = MobileBy.id("com.superlive.liveapp:id/livestreamPremiumIcon");
    public static final By SHARE_STREAM = MobileBy.id("com.superlive.liveapp:id/livestreamShareStreamer");
    public static final By SHARE_STREAM_OVERLAY = MobileBy.id("android:id/sem_chooser_recycler_direct_share");
    public static final By CLOSE_STREAM_BUTTON = MobileBy.id("com.superlive.liveapp:id/livestreamCloseBtn");
    public static final By END_STREAM_BUTTON = MobileBy.id("com.superlive.liveapp:id/finishStreamDialogEndStream");
    public static final By LIVESTREAM_ENDED_PAGE = MobileBy.id("com.superlive.liveapp:id/imgAvatarBlurred");

























































}


