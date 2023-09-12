package pages;

import io.appium.java_client.AppiumDriver;
import util.ElementHelper;

public class MessagePages extends ElementHelper {

    AppiumDriver driver;

    public MessagePages(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void goToInboxPage() {
        click(NAV_BAR_INBOX);
    }

    public void checkInboxPageElements() {
        checkText(INBOX_TITLE, "Inbox");
        checkVisible(INBOX_ONLINE_STATUS);
        checkVisible(PROFILE_PICTURE);
        checkVisible(LIVESTREAM_BUTTON);
        checkVisible(USER_LEVEL_BADGE);
        checkVisible(INBOX_TIMESTAMP);
    }

    public void pinAndUnpinMessage() {
        holdTheElement(INBOX_USER);
        setWait(2000);
        click(INBOX_PIN_BUTTON);
        setWait(2000);
        checkVisible(INBOX_PIN_IMAGE);
        holdTheElement(INBOX_USER);
        setWait(2000);
        click(INBOX_UNPIN_BUTTON);
        setWait(2000);
    }

    public void markTheInboxMessageAsUnreadAndRead() {
        holdTheElement(INBOX_USER);
        setWait(2000);
        click(MARK_AS_UNREAD_BUTTON);
        setWait(2000);
        holdTheElement(INBOX_USER);
        setWait(2000);
        click(MARK_AS_READ_BUTTON);
    }

    public void verifySuperliveOfficialAccount() {
        checkVisible(SUPERLIVE_OFFICIAL_ACCOUNT);
        click(SUPERLIVE_OFFICIAL_ACCOUNT);
        checkVisible(ANNOUNCEMENT_IMAGE);
        checkVisible(CONTINUE_BUTTON);
        checkVisible(MESSAGE_DATE);
        checkVisible(CHAT_TIMESTAMP);
        checkText(CONVERSATION_USER_NAME, "SuperLive Official");
        checkVisible(PROFILE_PICTURE);
        click(BACK_BUTTON);
    }

    public void verifyInboxModerationAccount() {
        setWait(2000);
        checkVisible(INBOX_MODERATION_ACCOUNT);
        click(INBOX_MODERATION_ACCOUNT);
        checkVisible(MESSAGE_DATE);
        checkText(CONVERSATION_USER_NAME, "Moderation");
        checkVisible(PROFILE_PICTURE);
        click(BACK_BUTTON);
    }

    public void verifyInboxSupportAccount() {
        setWait(1000);
        if(isDisplayed(INBOX_SUPPORT_ACCOUNT)){
            checkVisible(INBOX_SUPPORT_ACCOUNT);
            click(INBOX_SUPPORT_ACCOUNT);
        }
        else {
            checkVisible(INBOX_VIP_SUPPORT);
            click(INBOX_VIP_SUPPORT);
        }

        checkText(CONVERSATION_COIN_RECOVERY_TITLE, "Do you have trouble with purchasing coins?");
        checkVisible(CONVERSATION_COIN_RECOVERY_ARROW);
        checkVisible(CONVERSATION_USER_LAST_SEEN);
        checkVisible(SEND_MEDIA_BUTTON);
        checkVisible(SEND_TEXT_AREA);
        checkVisible(SEND_MESSAGE_BUTTON);
    }

    public void sendMessageToSupportAccount() {
        click(SEND_TEXT_AREA);
        sendKeys(SEND_TEXT_AREA, "I'm sending a text message for purchasing coins problems");
        click(SEND_MESSAGE_BUTTON);
        setWait(1000);
        click(BACK_BUTTON);
    }

    public void scrollInboxPage() {
        scrollPageDown(driver, 0.5, 0.2);
        scrollPageUp(driver, 0.5, 0.2);
    }

    public void goToChatPage() {
        setWait(3000);
        click(INBOX_USER);
    }

    public void verifyPrivateCallButtons() {
        checkVisible(PRIVATE_CALL_VOICE_BUTTON);
        checkVisible(PRIVATE_CALL_VIDEO_BUTTON);
    }

    public void verifyLastSeen() {
        setWait(1000);

        if (isDisplayed(CONVERSATION_USER_LAST_SEEN)) {
            checkVisible(CONVERSATION_USER_LAST_SEEN);
        } else {
            System.out.println("Last seen element is not exist");
        }
    }

    public void verifyProfilePhotoAndUserName() {
        checkVisible(PROFILE_PICTURE);
        checkVisible(CONVERSATION_USER_NAME);
    }

    public void verifyUserOptionButton() {
        checkVisible(CHAT_USER_OPTION_BUTTON);
    }

    public void clickUserOptionButton() {
        click(CHAT_USER_OPTION_BUTTON);
    }

    public void checkUserOptionOverlay() {
        checkText(OVERLAY_VIEW_PROFILE_BUTTON, "View Profile");
        checkText(OVERLAY_MUTE_CALLS_BUTTON, "Mute Calls");
        checkText(OVERLAY_BLOCK_BUTTON, "Block");
        checkText(OVERLAY_REPORT_AND_BLOCK_BUTTON, "Report and Block");
        checkText(OVERLAY_DELETE_CONVERSATION_BUTTON, "Delete conversation");
        checkText(OVERLAY_CANCEL_BUTTON, "Cancel");
    }

    public void clickViewProfileButtonAndTurnBackToChatPage() {
        click(OVERLAY_VIEW_PROFILE_BUTTON);
        setWait(2000);
        click(PROFILE_BACK_BUTTON);
    }

    public void muteAndUnmuteUser() {
        click(OVERLAY_MUTE_CALLS_BUTTON);
        setWait(1000);
        click(CHAT_USER_OPTION_BUTTON);
        click(OVERLAY_UNMUTE_CALLS_BUTTON);
    }

    public void sendTextMessage() {
        click(SEND_TEXT_AREA);
        sendKeys(SEND_TEXT_AREA, "I'm sending a text message to user");
        click(SEND_MESSAGE_BUTTON);
    }

    public void copyTextMessageInChat(){
        setWait(2000);
        holdTheElement(TEXT_MESSAGE_IN_CHAT);
        click(COPY_MESSAGE_ELEMENT);
    }

    public void checkMessageInfo() {
        checkVisible(MESSAGE_DATE);
        checkVisible(MESSAGE_SEEN_STATE);
    }

    public void sendPhotoMessage() {
        click(SEND_MEDIA_BUTTON);
        click(CAMERA_BUTTON);

        if (isDisplayed(ALLOW_WHILE_USING_THE_APP)) {
            click(ALLOW_WHILE_USING_THE_APP);
            click(PHOTO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        } else {
            click(PHOTO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        }
    }

    public void checkPhotoMessageInfo() {
        checkVisible(PHOTO_NUMBER_ELEMENT);
        checkVisible(PHOTO_MESSAGE_ELEMENT);
    }

    public void clickPhotoMessageAndCheckDetails() {
        click(PHOTO_MESSAGE_ELEMENT);
        setWait(2000);
        checkVisible(PHOTO_MESSAGE_TITLE);
        checkText(MEDIA_MESSAGE_DETAIL, "1 Photo");
        checkVisible(MEDIA_IN_DETAIL);
        click(DETAIL_BACK_BUTTON);
    }

    public void sendPremiumPhotoMessage() {
        click(SEND_MEDIA_BUTTON);
        click(CAMERA_BUTTON);

        if (isDisplayed(ALLOW_WHILE_USING_THE_APP)) {
            click(ALLOW_WHILE_USING_THE_APP);
            click(PHOTO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(GIFT_PRICE_ELEMENT);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        } else {
            click(PHOTO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(GIFT_PRICE_ELEMENT);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        }
    }

    public void checkPremiumPhotoInformation() {
        checkVisible(SEND_GIFT_IMAGE);
        checkVisible(COIN_IMAGE);
    }

    public void sendVideoToUserInChat() {
        click(SEND_MEDIA_BUTTON);
        click(CAMERA_BUTTON);

        if (isDisplayed(ALLOW_WHILE_USING_THE_APP)) {
            click(ALLOW_WHILE_USING_THE_APP);
            click(VIDEO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            setWait(4000);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        } else {
            click(VIDEO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            setWait(4000);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        }
    }

    public void checkVideoInfo() {
        setWait(2000);
        checkText(TEXT_VIDEO_NUMBER, "1 Video");
        checkVisible(VIDEO_MESSAGE_ICON);
    }

    public void clickVideoAndCheckDetails() {
        click(VIDEO_MESSAGE_ICON);
        setWait(2000);
        checkText(MEDIA_MESSAGE_DETAIL, "1 Video");
        checkVisible(MEDIA_IN_DETAIL);
        click(DETAIL_BACK_BUTTON);
    }

    public void sendPremiumVideoToUserInChat() {
        click(SEND_MEDIA_BUTTON);
        click(CAMERA_BUTTON);

        if (isDisplayed(ALLOW_WHILE_USING_THE_APP)) {
            click(ALLOW_WHILE_USING_THE_APP);
            click(VIDEO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            setWait(4000);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(GIFT_PRICE_ELEMENT);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        } else {
            click(VIDEO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            setWait(4000);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
            click(GIFT_PRICE_ELEMENT);
            click(SEND_MEDIA_TO_USER);
            setWait(5000);
        }
    }

    public void checkPremiumVideoInfo() {
        checkVisible(VIDEO_MESSAGE_ICON);
        checkVisible(SEND_GIFT_IMAGE);
        checkVisible(COIN_IMAGE);
    }

    public void sendGiftMessage() {
        click(CHAT_GIFT_BUTTON);
        setWait(1000);
        click(GIFT_PRICE_ELEMENT);
    }

    public void checkGiftMessageInformation() {
        checkVisible(GIFT_IN_CHAT);
        checkVisible(GIFT_PRICE_IN_CHAT);
    }

    public void sendAudioMessage() {
        holdTheElement(AUDIO_MESSAGE_BUTTON);

        if (isDisplayed(ALLOW_WHILE_USING_THE_APP)) {
            click(ALLOW_WHILE_USING_THE_APP);
            holdTheElement(AUDIO_MESSAGE_BUTTON);
            setWait(6000);
        }
        setWait(1000);
        releaseTheElement(AUDIO_MESSAGE_BUTTON);
        setWait(2000);
    }

    public void playTheAudioMessage() {
        click(PLAY_BUTTON);
    }

    public void checkAudioMessageInformation() {
        checkVisible(AUDIO_MESSAGE_BAR);
        checkVisible(AUDIO_MESSAGE_TIMER);
    }

    public void clickGiftButtonInChat() {
        click(CHAT_GIFT_BUTTON);
    }

    public void checkElementsInGiftOverlay() {
        checkVisible(VIP_GIFT_BUTTON);
        checkVisible(TOTAL_COIN_AMOUNT);
        checkVisible(COIN_ICON_IN_OVERLAY);
        click(VIP_GIFT_BUTTON);
    }

    public void clickBuyCoinsButtonInGiftOverlay() {
        click(BUY_COINS_BUTTON_IN_OVERLAY);
    }

    public void closeHybridPurchasePage() {
        setWait(14000);
        click(HYBRID_PURCHASE_CLOSE_BUTTON);
        click(CONFIRM_POPUP_BUTTON);
    }

    public void scrollInMessagePage() {
        scrollPageUp(driver, 0.5, 0.2);
        scrollPageDown(driver, 0.5, 0.2);
    }

    public void checkUserBadgeInInbox(){
        if(isDisplayed(USER_LEVEL_BADGE)){
            checkVisible(USER_LEVEL_BADGE);
        }
    }

    public void checkUserTopBadgeInInbox(){
        if(isDisplayed(TOP_BADGE)) {
            checkVisible(TOP_BADGE);
        }
    }

    public void checkUserVipBadgeInInbox() {
        if (isDisplayed(VIP_BADGE)) {
            checkVisible(VIP_BADGE);
        }
    }

    public void swipeRightInGiftOverlayWithElement(){
        dragThisCoordinate(GIFT_PRICE_ELEMENT,-200,100);
        setWait(1500);
    }

    public void clickSeenButton(){
        click(MESSAGE_SEEN_BUTTON);
    }

    public void checkSeenPopupElementsTexts(){
        checkVisible(SEEN_POPUP_ICON);
        checkText(SEEN_POPUP_TITLE,"Don’t Miss the Chat");
        checkText(SEEN_INFO_DESCRIPTION,"You must be a GOLD VIP to see when messages have been read.");
    }

    public void goToThePaymentPageFromSeenPopup(){
        click(CONFIRM_BUTTON_IN_POPUP);
    }

    public void closeSeenPopup(){
        click(CANCEL_BUTTON_IN_POPUP);
    }

    public void openMediaScreenFromChat(){
        click(SEND_MEDIA_BUTTON);
        click(CAMERA_BUTTON);

        if (isDisplayed(ALLOW_WHILE_USING_THE_APP)) {
            click(ALLOW_WHILE_USING_THE_APP);
            click(PHOTO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
        } else {
            click(PHOTO_BUTTON);
            click(TAKE_A_PHOTO_BUTTON);
            click(CONFIRM_PHOTO_BUTTON);
            click(SEND_TO_PERSON_BUTTON);
            setWait(1000);
        }
    }

    public void verifyMediaScreenElements(){
        checkVisible(MEDIA_PREVIEW_IN_MEDIA_SCREEN);
        checkVisible(SUGGESTED_GIFT_BUTTON);
        checkVisible(VIP_GIFT_BUTTON);
    }

    public void verifyMediaScreenTexts(){
        checkText(TEXT_VIEW_TOOLBAR,"Media");
        checkText(SEND_TEXT_AREA,"Mention the content you posted, Share interesting details…");
        checkText(PREMIUM_CONTENT_HEADER,"Set Premium Content Fee");
        checkText(PREMIUM_CONTENT_DESCRIPTION,"You can request a gift for the content you send.\n" +
                "When you choose a gift, the photo/video you send will be locked and will only be displayed in exchange for a gift.");
        checkText(MEDIA_SIZE_ELEMENT,"1 Photo");
    }

    public void typeMediaMessageAndSendToUser(){
        sendKeys(SEND_TEXT_AREA,"I'm writing a media message");
        click(SEND_MEDIA_TO_USER);
    }
}
