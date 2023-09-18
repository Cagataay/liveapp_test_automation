package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;
import util.ElementLocator;

import java.util.concurrent.ExecutionException;


public class ProfilePages  extends ElementHelper{
    AppiumDriver driver;
    WebDriverWait wait;

    public ProfilePages(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,15);
    }
    String nonLoginUserText = "You must be logged in to view your profile.";
    String userFollowerText = "Followers";
    String userFollowingText = "Following";
    String earnedDiamondText = "Received";
    String sentCoinsText = "Sent";
    String defaultFamilyTitle = "Families";
    String coinPurchaseTitle = "Purchase Coins";
    String vipStoreTitle = "Make a Purchase";
    String goldVipTitle = "Upgrade Now";
    String userLevelTitle = "User Level";
    String topGiftersTitle = "Top Gifters";
    String agencyTitle = "Agency - Earn Extra Diamonds";
    String incomeTitle = "Earnings";
    String cashOutTitle= "Money Transfer";
    String linkedAccountsTitle = "Linked Accounts";
    String itemBagTitle = "Item Bag";
    String settingsTitle = "Settings";
    String bronzeVipBadge = " BRONZE VIP ";
    String silverVipBadge = " SILVER VIP ";
    String goldVipBadge = " GOLD VIP ";
    int receivedDiamonds = 0;
    String username = null;
    String userBiography = null;
    String userSharedId = null;

    public void clickOutsideLoginOverlayButton(){
        WebElement parentElement = driver.findElement(ElementLocator.LOGIN_OVERLAY);
        Point parentLocation = parentElement.getLocation();
        int parentX = parentLocation.getX();
        int parentY = parentLocation.getY();
        parentX += 50;
        parentY -= 50;
        new TouchAction(driver).tap(PointOption.point(parentX, parentY)).perform();
    }
    public void  clickNavigationProfileButton(){
        click(ElementLocator.NAVIGATION_PROFILE_BUTTON);
    }
    public void checkNonLoginUserImage(){
        checkVisible(ElementLocator.NON_LOGIN_USER_IMAGE);
    }
    public void checkNonLoginUserText(){
        checkText(ElementLocator.NON_LOGIN_USER_TEXT, nonLoginUserText);
    }
    public void checkProfileUserLoginButton(){
        checkVisible(ElementLocator.PROFILE_USER_LOGIN_BUTTON);
    }
    public void checkProfileHeaderImage(){checkVisible(ElementLocator.PROFILE_HEADER_IMAGE);}
    public void checkProfileEditButton(){checkVisible(ElementLocator.PROFILE_USER_EDIT_BUTTON);}
    public void checkProfileShareButton(){checkVisible(ElementLocator.PROFILE_SHARE_BUTTON);}
    public void checkProfilePreviewButton(){checkVisible(ElementLocator.SELF_PROFILE_PREVIEW_BUTTON);}
    public void checkProfileImage(){checkVisible(ElementLocator.PROFILE_IMAGE);}
    public void checkUserLocationContainer(){checkVisible(ElementLocator.PROFILE_USER_LOCATION_CONTAINER);}
    public void checkSharedId(){checkVisible(ElementLocator.PROFILE_USER_SHARED_ID);}
    public void checkUserLevel(){checkVisible(ElementLocator.PROFILE_USER_LEVEL);}
    public void checkUserName(){checkVisible(ElementLocator.PROFILE_USER_NAME);}
    public void checkUserFollower(){
        checkVisible(ElementLocator.PROFILE_USER_FOLLOWER);
        checkText(ElementLocator.PROFILE_USER_FOLLOWER_TEXT, userFollowerText);
    }
    public void checkUserFollowing(){
        checkVisible(ElementLocator.PROFILE_USER_FOLLOWING);
        checkText(ElementLocator.PROFILE_USER_FOLLOWING_TEXT,userFollowingText);
    }
    public void checkUserEarnedDiamonds(){
        checkVisible(ElementLocator.PROFILE_USER_EARNED_DIAMONDS);
        checkVisible(ElementLocator.PROFILE_USER_EARNED_DIAMONDS_IMAGE);
        checkText(ElementLocator.PROFILE_USER_EARNED_DIAMONDS_TEXT, earnedDiamondText);
        String receivedDiamondsText = findElement(ElementLocator.PROFILE_USER_EARNED_DIAMONDS).getText();
        if(receivedDiamondsText.contains("k"))
        {
            receivedDiamondsText = receivedDiamondsText.replace(".","");
            receivedDiamondsText = receivedDiamondsText.replace("k","");
            receivedDiamonds = Integer.parseInt(receivedDiamondsText) * 100;
        }
        else if(receivedDiamondsText.contains("M"))
        {
            receivedDiamondsText = receivedDiamondsText.replace(".","");
            receivedDiamondsText = receivedDiamondsText.replace("M","");
            receivedDiamonds = Integer.parseInt(receivedDiamondsText) * 100000;
        }
        else
        {
            receivedDiamonds = Integer.parseInt(receivedDiamondsText);
        }
    }
    public void checkUserSentCoins(){
        checkVisible(ElementLocator.PROFILE_USER_SENT_COINS);
        checkVisible(ElementLocator.PROFILE_USER_SENT_COINS_IMAGE);
        checkText(ElementLocator.PROFILE_USER_SENT_COINS_TEXT,sentCoinsText);
    }
    public void rightSwipeHeaderImage(){
        int headerImageCount;
        try{
            headerImageCount = getNumberOfElements(ElementLocator.PROFILE_HEADER_IMAGE_LINEAR_LAYOUT);
        } catch (Exception ex) {
            headerImageCount = 0;
        }
        if(headerImageCount == 1 || headerImageCount == 0)
        {
            return;
        }
        leftSwipe(ElementLocator.PROFILE_HEADER_IMAGE, 0.6,0.3,0.5);
        for(int i =0; i < headerImageCount - 1; i++)
        {
            rightSwipe(ElementLocator.PROFILE_HEADER_IMAGE,0.6,0.3,0.5);
        }
    }
    public void checkProfileUserAboutText() {checkVisible(ElementLocator.PROFILE_USER_ABOUT_TEXT);}
    public void checkFamilyButton() {
        boolean hasFamily = false;
        try
        {
            checkVisible(ElementLocator.PROFILE_DEFAULT_FAMILY_BUTTON);
        } catch (Exception ex){
            hasFamily = true;
        }
        if(hasFamily){
            checkVisible(ElementLocator.PROFILE_FAMILY_BUTTON);
            checkVisible(ElementLocator.PROFILE_FAMILY_IMAGE);
            checkVisible(ElementLocator.PROFILE_FAMILY_NAME);
            checkVisible(ElementLocator.PROFILE_FAMILY_RIGHT_ARROW);
        }
        else
        {
            checkVisible(ElementLocator.PROFILE_DEFAULT_FAMILY_IMAGE);
            checkText(ElementLocator.PROFILE_DEFAULT_FAMILY_TITLE,defaultFamilyTitle);
            checkVisible(ElementLocator.PROFILE_DEFAULT_FAMILY_RIGHT_ARROW);
        }
    }

    public void checkStartStreamButton() {checkVisible(ElementLocator.START_STREAM_BUTTON);}
    public void scrollProfilePage(){scrollPageDown(driver,0.8,0.2);}
    public void checkProfilePurchaseButton() {
        checkVisible(ElementLocator.PROFILE_COIN_PURCHASE_BUTTON);
        checkVisible(ElementLocator.PROFILE_COIN_PURCHASE_IMAGE);
        checkText(ElementLocator.PROFILE_COIN_PURCHASE_TITLE,coinPurchaseTitle);
        checkVisible(ElementLocator.PROFILE_COIN_PURCHASE_RIGHT_ARROW);
    }
    public void checkProfileVipStoreButton() {
        checkVisible(ElementLocator.PROFILE_VIP_STORE_BUTTON);
        checkVisible(ElementLocator.PROFILE_VIP_STORE_IMAGE);
        checkVisible(ElementLocator.PROFILE_VIP_STORE_TITLE_IMAGE);
        checkText(ElementLocator.PROFILE_VIP_STORE_TITLE_TEXT,vipStoreTitle);
        checkVisible(ElementLocator.PROFILE_VIP_STORE_RIGHT_ARROW);
    }
    public void checkProfileGoldVipButton() {
        checkVisible(ElementLocator.PROFILE_GOLD_VIP_BUTTON);
        checkVisible(ElementLocator.PROFILE_GOLD_VIP_IMAGE);
        checkVisible(ElementLocator.PROFILE_GOLD_VIP_TITLE_IMAGE);
        if(isDisplayed(ElementLocator.PROFILE_GOLD_VIP_TITLE_TEXT))
            checkText(ElementLocator.PROFILE_GOLD_VIP_TITLE_TEXT,goldVipTitle);
        checkVisible(ElementLocator.PROFILE_GOLD_VIP_RIGHT_ARROW);
    }

    public void checkProfileUserLevelButton() {
        checkVisible(ElementLocator.PROFILE_USER_LEVEL_BUTTON);
        checkVisible(ElementLocator.PROFILE_USER_LEVEL_BUTTON_IMAGE);
        checkText(ElementLocator.PROFILE_USER_LEVEL_TITLE,userLevelTitle);
        checkVisible(ElementLocator.PROFILE_USER_LEVEL_RIGHT_ARROW);
    }
    public void checkProfileMostSentGiftsButton() {
        checkVisible(ElementLocator.PROFILE_MOST_SENT_GIFTS_BUTTON);
        checkVisible(ElementLocator.PROFILE_MOST_SENT_GIFTS_IMAGE);
        checkText(ElementLocator.PROFILE_MOST_SENT_GIFTS_TITLE,topGiftersTitle);
        checkVisible(ElementLocator.PROFILE_MOST_SENT_GIFTS_RIGHT_ARROW);
    }
    public void checkProfileAgencyButton() {
        checkVisible(ElementLocator.PROFILE_AGENCY_BUTTON);
        checkVisible(ElementLocator.PROFILE_AGENCY_IMAGE);
        checkText(ElementLocator.PROFILE_AGENCY_TITLE,agencyTitle);
        checkVisible(ElementLocator.PROFILE_AGENCY_RIGHT_ARROW);
    }
    public void checkProfileIncomeButton() {
        if(receivedDiamonds >= 3750)
        {
            checkVisible(ElementLocator.PROFILE_INCOME_BUTTON);
            checkVisible(ElementLocator.PROFILE_INCOME_IMAGE);
            checkText(ElementLocator.PROFILE_INCOME_TITLE,incomeTitle);
            checkVisible(ElementLocator.PROFILE_INCOME_RIGHT_ARROW);
        }
        else
            return;
    }
    public void checkProfileCashOutButton() {

        if(receivedDiamonds >= 3750)
        {
            checkVisible(ElementLocator.PROFILE_CASH_OUT_BUTTON);
            checkVisible(ElementLocator.PROFILE_CASH_OUT_IMAGE);
            checkText(ElementLocator.PROFILE_CASH_OUT_TITLE,cashOutTitle);
            checkVisible(ElementLocator.PROFILE_CASH_OUT_RIGHT_ARROW);
        }
        else
            return;
    }
    public void checkProfileLinkedAccountButton() {
        checkVisible(ElementLocator.PROFILE_LINKED_ACCOUNT_BUTTON);
        checkVisible(ElementLocator.PROFILE_LINKED_ACCOUNT_IMAGE);
        checkText(ElementLocator.PROFILE_LINKED_ACCOUNT_TITLE,linkedAccountsTitle);
        checkVisible(ElementLocator.PROFILE_LINKED_ACCOUNT_RIGHT_ARROW);
    }
    public void checkProfileItemBagButton() {
        checkVisible(ElementLocator.PROFILE_ITEM_BAG_BUTTON);
        checkVisible(ElementLocator.PROFILE_ITEM_BAG_IMAGE);
        checkText(ElementLocator.PROFILE_ITEM_BAG_TITLE,itemBagTitle);
        checkVisible(ElementLocator.PROFILE_ITEM_BAG_RIGHT_ARROW);
    }
    public void checkProfileSettingsButton() {
        checkVisible(ElementLocator.PROFILE_SETTINGS_BUTTON);
        checkVisible(ElementLocator.PROFILE_SETTINGS_IMAGE);
        checkText(ElementLocator.PROFILE_SETTINGS_TITLE,settingsTitle);
        checkVisible(ElementLocator.PROFILE_SETTINGS_RIGHT_ARROW);
    }
    public void checkBronzeVipBadge(){
        checkVisible(ElementLocator.PROFILE_VIP_BADGE);
        checkText(ElementLocator.PROFILE_VIP_BADGE,bronzeVipBadge);
    }
    public void checkSilverVipBadge(){
        checkVisible(ElementLocator.PROFILE_VIP_BADGE);
        checkText(ElementLocator.PROFILE_VIP_BADGE,silverVipBadge);
    }
    public void checkGoldVipBadge(){
        checkVisible(ElementLocator.PROFILE_VIP_BADGE);
        checkText(ElementLocator.PROFILE_VIP_BADGE,goldVipBadge);
    }
    public void checkGoldVipImage(){checkVisible(ElementLocator.GOLD_LION_OVERLAY_IMAGE);}
    public void checkGoldVipOverlayLine(){checkVisible(ElementLocator.GOLD_PROFILE_OVERLAY_LINE);}
    public void setUsername(){
        username = getTextFromElement(ElementLocator.PROFILE_USER_NAME);
    }
    public void setUserBiography(){
        userBiography = getTextFromElement(ElementLocator.PROFILE_USER_ABOUT_TEXT).substring(7);
    }
    public void setUserSharedId(){
        userSharedId = getTextFromElement(ElementLocator.PROFILE_USER_SHARED_ID).substring(4);
    }
    public void clickUserProfileEditButton(){click(ElementLocator.USER_PROFILE_EDIT_BUTTON);}
    public void checkUsernameInProfileEdit(){
        checkText(ElementLocator.EDIT_PROFILE_NAME, username);
    }
    public void checkBiographyInProfileEdit(){
        checkText(ElementLocator.EDIT_PROFILE_BIO, userBiography);
    }
    public void checkSharedIdInProfileEdit(){
        checkText(ElementLocator.PROFILE_EDIT_SHARED_ID, userSharedId);
    }
    public void changeUsername(){
        driver.findElement(ElementLocator.EDIT_PROFILE_NAME).clear();
        sendKeys(ElementLocator.EDIT_PROFILE_NAME,"Test");
        username = "Test";

    }
    public void clickSaveButtonAndBackToProfilePage(){
        click(ElementLocator.TEXT_VIEW_SAVE);
    }
    public void checkUsernameChanging(){
        setWait(200);
        checkText(ElementLocator.PROFILE_USER_NAME,username);
    }

    public void changeBiography(){
        driver.findElement(ElementLocator.EDIT_PROFILE_BIO).clear();
        sendKeys(ElementLocator.EDIT_PROFILE_BIO,"Test");
        userBiography = "About: Test";
    }
    public void checkUserBiographyChanging(){
        setWait(200);
        checkText(ElementLocator.PROFILE_USER_ABOUT_TEXT,userBiography);
    }

    public void checkTopBadge(){checkVisible(ElementLocator.TOP_BADGE);}

}
