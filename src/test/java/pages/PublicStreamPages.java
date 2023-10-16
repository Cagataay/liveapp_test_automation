package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.an.E;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.ElementLocator;

import javax.swing.*;

public class PublicStreamPages extends ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public PublicStreamPages(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
        this.elementHelper = new ElementHelper(driver);

    }

    String Name = "All is wheel";
    String WheelOptions1 = "PHOTO";
    String WheelOptions2 = "VİDEO";
    String BattleInvitations = "Battle Invitations";
    String GroupLivestreamInvites = "Group Livestream Invites";
    String BattleDuration = "Battle Duration";
    String TurnOnGiftVolume = "Turn on gift volume";
    String TargetBarTitle = "Target Bar";
    String TargetAmount = "10000";
    String StartingAmount = "2000";
    String Chat = "SELAM YAYINLAR AÇILDI MI";




    public void clickStartStreamButton() {
        click(ElementLocator.START_STREAM);
    }
    public void acceptCameraPermission(){
        click(ElementLocator.ACCEPT_CAMERA_PERMISSION);
    }
    public void acceptMicrophonePermission(){
        click(ElementLocator.ACCEPT_MICROPHONE_PERMISSION);
    }
    public void acceptNearDevicePermission(){
        click(ElementLocator.ACCEPT_NEAR_DEVICE_PERMISSION);
    }
    public void clickTermsUsage(){
        click(ElementLocator.TERMS_USAGE_BUTTON);
    }
    public void checkTermsUsage(){
        checkVisible(ElementLocator.ACCEPT_TERMS_USAGE_BUTTON);
    }
    public void clickAcceptTermsButton(){
        click(ElementLocator.ACCEPT_TERMS_USAGE_BUTTON);
    }
    public void checkPublicStreamContainer(){
        checkVisible(ElementLocator.PUBLIC_STREAM_CONTAINER);
    }
    public void startPublicStreamingButton(){
        click(ElementLocator.START_PUBLIC_STREAM);
        setWait(5000);
    }
    public void checkStartPkButton(){
        checkVisible(ElementLocator.PK_WAR_BUTTON);
    }
    public void clickCreateWheel(){
        click(ElementLocator.CREATE_WHEEL);
    }
    public void writeWheelName(){

        sendKeys(ElementLocator.WRITE_WHEEL_NAME,Name);
    }
    public void clickSelectGiftButton(){
        click(ElementLocator.WHEEL_GIFT_BUTTON);
    }
    public void selectGiftForWheel(){
        click(ElementLocator.SELECT_GIFT_FOR_WHEEL);
    }
    public void clickContinueButton(){
        click(ElementLocator.CONTINUE_BUTTON_FOR_GIFT);
    }
    public void writeSomethingWheelOptions1(){

        sendKeys(ElementLocator.WHEEL_OPTIONS_1,WheelOptions1);
    }
    public void writeSomethingWheelOptions2(){

        sendKeys(ElementLocator.WHEEL_OPTIONS_2,WheelOptions2);
    }
    public void continueAndPreviewButton(){
        click(ElementLocator.CONTINUE_PREVIEW_BUTTON);
    }
    public void checkPreviewWheel(){
        checkVisible(ElementLocator.PREVIEW_WHEEL);
    }
    public void clickAcceptAndCreateWheelButton(){
        click(ElementLocator.ACCEPT_AND_CREATE_WHEEL_BUTTON);
    }
    public void checkWheelInStream(){
        checkVisible(ElementLocator.SHOW_WHEEL_IN_STREAM);
    }
    public void clickHamburgerButton(){
        click(ElementLocator.HAMBURGER_MENU_BUTTON);
    }
    public void closePkSettingsTutorial(){
        click(ElementLocator.CLOSE_PK_SETTINGS_TUTORIAL);
    }
    public void closeStickerTutorial(){
        click(ElementLocator.CLOSE_STICKER_TUTORIAL);
    }
    public void clickCloseMicrophoneButton(){
        click(ElementLocator.MICROPHONE_CLOSE_BUTTON);
    }
    public void touchOutsideInStream(){
        click(ElementLocator.TOUCH_OUTSIDE_IN_STREAM);
    }
    public void checkMicrophoneOffImage(){
        checkVisible(ElementLocator.MICROPHONE_OFF_IMAGE);
    }
    public void clickTurnCameraButton(){
        click(ElementLocator.CAMERA_SWITCH_BUTTON);
    }
    public void checkTurnCameraButton(){
        checkVisible(ElementLocator.CAMERA_SWITCH_BUTTON);
    }
    public void clickCameraOffButton(){
        click(ElementLocator.CAMERA_OFF_BUTTON);
    }
    public void checkAvatarCircular(){
        checkVisible(ElementLocator.CIRCULAR_AVATAR);
    }
    public void closeMirrorButton(){
        click(ElementLocator.MIRROR_BUTTON);
    }
    public void checkMirrorButton(){
        checkVisible(ElementLocator.MIRROR_BUTTON);
    }
    public void clickBeautyFilter(){
        click(ElementLocator.BEAUTY_FILTER);
    }
    public void checkBeautyFilter(){
        checkVisible(ElementLocator.BEAUTY_FILTER);
    }
    public void clickHamburgerSettingsButton(){
        click(ElementLocator.HAMBURGER_SETTINGS);
    }
    public void checkHamburgerSettingsOverlay(){
        checkText(ElementLocator.PK_SETTINGS_TEXT,BattleInvitations);
        checkText(ElementLocator.GROUP_STREAM_SETTINGS_TEXT,GroupLivestreamInvites);
        checkText(ElementLocator.PK_LENGTH_SETTINGS_TEXT,BattleDuration);
    }
    public void clickTurnOffGiftVolume(){
        click(ElementLocator.TURN_OFF_GIFT_VOLUME);
    }
    public void checkTurnOnGiftVolume(){
        checkText(ElementLocator.TURN_ON_GIFT_VOLUME_TEXT,TurnOnGiftVolume);
    }
    public void clickTargetBarButton(){
        click(ElementLocator.TARGET_BAR_BUTTON);
    }
    public void writeTitleOnTargetBar(){
        sendKeys(ElementLocator.TARGET_BAR_TITLE,TargetBarTitle);
    }
    public void writeTargetAmount(){
        sendKeys(ElementLocator.TARGET_AMOUNT,TargetAmount);
    }
    public void writeStartingAmount(){
        sendKeys(ElementLocator.STARTING_AMOUNT,StartingAmount);
    }
    public void pickEndDate(){
        click(ElementLocator.TARGET_END_TIME);
        click(ElementLocator.CALENDER_DATE_CHOOSE);
    }
    public void clickSaveButton(){
        click(ElementLocator.TARGET_BAR_SAVE_BUTTON);
    }
    public void checkPreviewTargetBar(){
        checkVisible(ElementLocator.TARGET_BAR_PREVIEW);
    }
    public void checkTargetBarInStream(){
        checkVisible(ElementLocator.TARGET_BAR_IN_STREAM);
    }
    public void clickChatSettingsButton(){
        click(ElementLocator.CHAT_SETTINGS_IN_STREAM);
    }
    public void checkChatSettingsOverlay(){
        checkVisible(ElementLocator.INSIDE_CHAT_SETTINGS);
    }
    public void clickGiftStickerButton(){
        click(ElementLocator.GIFT_STICKER);
    }
    public void selectGiftForSticker(){
        click(ElementLocator.GIFT_FOR_STICKER);
    }
    public void clickNextButton(){
        click(ElementLocator.SELECT_STICKER_GIFT);
    }
    public void checkPreviewSticker(){
        checkVisible(ElementLocator.PREVIEW_STICKER);
    }
    public void clickCompletedButton(){
        click(ElementLocator.COMPLETED_STICKER_BUTTON);
    }
    public void checkStickerInStream(){
        checkVisible(ElementLocator.STICKER_IN_STREAM);
    }
    public void clickDiamondCountArea(){
        click(ElementLocator.DIAMOND_COUNT);
    }
    public void checkTopGiftersOverlay(){
        checkVisible(ElementLocator.TOP_GIFTERS_OVERLAY);
    }
    public void checkDiamondCount(){
        checkVisible(ElementLocator.DIAMOND_COUNT);
    }
    public void clickViewerCountArea(){
        click(ElementLocator.VIEWER_COUNT_AREA);
    }
    public void checkViewersContainer(){
        checkVisible(ElementLocator.VIEWERS_CONTAINER);
    }
    public void clickStatsButton(){
        click(ElementLocator.STATS_BUTTON);
    }
    public void checkInStats(){
        checkVisible(ElementLocator.STATS_OVERLAY);
    }
    public void checkViewersCount(){
        checkVisible(ElementLocator.VIEWER_COUNT_AREA);
    }
    public void clickProfilPhoto(){
        click(ElementLocator.PROFIL_PHOTO_AREA);
    }
    public void checkProfilPhotoInOverlay(){
        checkVisible(ElementLocator.PROFIL_PHOTO_IN_OVERLAY);
    }
    public void checkProfilOverlayInfo(){
        checkVisible(ElementLocator.PROFIL_OVERLAY_INFO);
    }
    public void clickStreamChat(){
        click(ElementLocator.STREAM_CHAT);
    }
    public void writeStreamChat(){
        sendKeys(ElementLocator.WRITE_CHAT_BAR,Chat);
    }
    public void clickSendButton(){
        click(ElementLocator.SEND_CHAT_MESSAGE);
    }
    public void checkStreamMessageArea(){
        checkVisible(ElementLocator.CHECK_STREAM_MESSAGE);
    }
    public void touchOutsideInMessage(){
        click(ElementLocator.MESSAGE_OUTSIDE);
    }
    public void clickPkWarButton(){
        click(ElementLocator.PK_WAR_BUTTON);
    }
    public void checkPkWarOverlay(){
        checkVisible(ElementLocator.PK_WAR_OVERLAY);
    }
    public void clickGuestButton(){
        click(ElementLocator.GUEST_BUTTON);
    }
    public void checkGuestOverlay(){
        checkVisible(ElementLocator.GUEST_OVERLAY);
    }
    public void clickPremiumStreamButton(){
        click(ElementLocator.PREMIUM_STREAM_BUTTON);
    }
    public void selectGiftForPremiumStream(){
        click(ElementLocator.PREMIUM_STREAM_GIFT);
    }
    public void continuePremiumStream(){
        click(ElementLocator.CONTINUE_PREMIUM_STREAM);
    }
    public void checkPremiumStreamBadge(){
        checkVisible(ElementLocator.PREMIUM_STREAM_BADGE);
    }
    public void clickShareStreamButton(){
        click(ElementLocator.SHARE_STREAM);
    }
    public void checkShareStreamOverlay(){
        checkVisible(ElementLocator.SHARE_STREAM_OVERLAY);
    }
    public void clickStreamCloseButton(){
        click(ElementLocator.CLOSE_STREAM_BUTTON);
    }
    public void clickEndStreamButton(){
        click(ElementLocator.END_STREAM_BUTTON);
    }
    public void checkLivestreamEndedPage(){
        checkVisible(ElementLocator.LIVESTREAM_ENDED_PAGE);
    }














}