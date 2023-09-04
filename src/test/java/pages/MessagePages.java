package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class MessagePages extends ElementHelper {

    AppiumDriver driver;
    WebDriverWait wait;

    public MessagePages(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    public void goToInboxPage(){
        click(NAV_BAR_INBOX);
    }

    public void verifyInboxPageTitle(){
        checkText(INBOX_TITLE,"Inbox");
    }

    public void verifyInboxOnlineStatus(){
        checkVisible(INBOX_ONLINE_STATUS);
    }

    public void checkInboxProfilePicture(){
        checkVisible(PROFILE_PICTURE);
    }

    public void verifyLiveStreamButtonInbox(){
        checkVisible(LIVESTREAM_BUTTON);
    }

    public void checkUserLevelBadge(){
        checkVisible(USER_LEVEL_BADGE);
    }

    public void checkInboxMessageDate(){
        checkVisible(INBOX_TIMESTAMP);
    }

    public void verifySuperliveOfficialAccount(){
        checkVisible(SUPERLIVE_OFFICIAL_ACCOUNT);
        click(SUPERLIVE_OFFICIAL_ACCOUNT);
        checkVisible(ANNOUNCEMENT_IMAGE);
        checkVisible(CONTINUE_BUTTON);
        checkVisible(MESSAGE_DATE);
        checkVisible(CHAT_TIMESTAMP);
        checkText(CONVERSATION_USER_NAME,"SuperLive Official");
        checkVisible(PROFILE_PICTURE);
        click(BACK_BUTTON);
    }

    public void verifyInboxModerationAccount(){
        setWait(1000);
        checkVisible(INBOX_MODERATION_ACCOUNT);
        click(INBOX_MODERATION_ACCOUNT);
        checkVisible(MESSAGE_DATE);
        checkText(CONVERSATION_USER_NAME,"Moderation");
        checkVisible(PROFILE_PICTURE);
        click(BACK_BUTTON);
    }

    public void verifyInboxSupportAccount() {
        setWait(1000);
        checkVisible(INBOX_SUPPORT_ACCOUNT);
        click(INBOX_SUPPORT_ACCOUNT);
        checkText(CONVERSATION_COIN_RECOVERY_TITLE,"Do you have trouble with purchasing coins?");
        checkVisible(CONVERSATION_COIN_RECOVERY_ARROW);
        checkVisible(CONVERSATION_USER_LAST_SEEN);
        checkVisible(SEND_MEDIA_BUTTON);
        checkVisible(SEND_TEXT_AREA);
        checkVisible(SEND_MESSAGE_BUTTON);
        click(BACK_BUTTON);
    }

    public void scrollInboxPage(){
        scrollPageDown(driver,0.5,0.2);
        scrollPageUp(driver,0.5,0.2);
    }

    public void goToChatPage(){
        click(INBOX_USER);
    }

    public void verifyPrivateCallButtons(){
        checkVisible(PRIVATE_CALL_VOICE_BUTTON);
        checkVisible(PRIVATE_CALL_VIDEO_BUTTON);
    }

    public void verifyLastSeen(){
        checkVisible(CONVERSATION_USER_LAST_SEEN);
    }

    public void verifyProfilePhotoAndUserName(){
        checkVisible(PROFILE_PICTURE);
        checkVisible(CONVERSATION_USER_NAME);
    }

    public void verifyUserOptionButton(){
        checkVisible(CHAT_USER_OPTION_BUTTON);
    }

    public void clickUserOptionButton(){
        click(CHAT_USER_OPTION_BUTTON);
    }

    public void checkUserOptionOverlay(){
        checkText(OVERLAY_VIEW_PROFILE_BUTTON,"View Profile");
        checkText(OVERLAY_MUTE_CALLS_BUTTON,"Mute Calls");
        checkText(OVERLAY_BLOCK_BUTTON,"Block");
        checkText(OVERLAY_REPORT_AND_BLOCK_BUTTON,"Report and Block");
        checkText(OVERLAY_DELETE_CONVERSATION_BUTTON,"Delete conversation");
        checkText(OVERLAY_CANCEL_BUTTON,"Cancel");
    }

    public void clickViewProfileButtonAndTurnBackToChatPage(){
        click(OVERLAY_VIEW_PROFILE_BUTTON);
        click(PROFILE_BACK_BUTTON);
    }

    public void sendTextMessage(){
        click(SEND_TEXT_AREA);
        sendKeys(SEND_TEXT_AREA,"Test1 - test2 - test3 - test4");
        click(SEND_MESSAGE_BUTTON);
    }
}
