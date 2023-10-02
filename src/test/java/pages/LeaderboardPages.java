package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import util.ElementHelper;
import util.ElementLocator;


public class LeaderboardPages extends ElementHelper{
    AppiumDriver driver;

    public LeaderboardPages(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }
    String leaderBoardUserNameText,leaderBoardFamilyNameText;
    String countryText="Turkey";
    String leaderboardText="Leaderboard";
    String leaderboardTitleText="About the Family System";
    int startIndex = 1;
    int endIndex = 14;
    String[] questionList = new String[14];
    String firstQuestion="1. What is the Family System? \uF078";
    String secondQuestion="2. What are the conditions for setting up a family? \uF078";
    String thirdQuestion="3. Family Competitions \uF078";
    String fourthQuestion="4. Joining/Leaving a Family \uF078";
    String fifthQuestion= "5. Definition of Family Rank \uF078";
    String sixthQuestion="6. Getting Kicked out of the Family \uF078";
    String seventhQuestion="Can I change family permanently? \uF078";

    public void closeLoginOverlay() {
        backWithoutKey();
    }

    public void clickOnLeaderboardTab() {
        if(isDisplayed(ElementLocator.NAVIGATION_LEADER_BOARD_BUTTON)){
            click(ElementLocator.NAVIGATION_LEADER_BOARD_BUTTON);
        }else{
            click(ElementLocator.NAVIGATION_PREMIUM_LEADER_BOARD_BUTTON);
        }
        checkText(ElementLocator.TEXT_VIEW_TOOLBAR,leaderboardText);
    }
    public void selectStreamersTab() {
        click(ElementLocator.STREAMERS_TAB_LEADER_BOARD);
    }
    public void clickOnFirstUserInLeaderboard() {
        if(isDisplayed(FIRST_PROFILE_NAME_LEADER_BOARD)){
            leaderBoardUserNameText=getTextFromElement(ElementLocator.FIRST_PROFILE_NAME_LEADER_BOARD);
            click(ElementLocator.FIRST_PROFILE_NAME_LEADER_BOARD);
        }else{
            Assert.fail("There are no users in the Leaderboard.");
        }
    }

    public void checkIfUserProfileOfRelatedUserIsAccessed() {
        checkText(ElementLocator.PROFILE_USER_NAME,leaderBoardUserNameText);
    }

    public void selectSupportersTab() {
        click(ElementLocator.SUPPORTERS_TAB_LEADER_BOARD);
    }

    public void selectLastTwentyFourHours() {
        click(ElementLocator.LAST_24_HOURS_TAB_LEADER_BOARD);
    }

    public void selectSevenDays() {
        click(ElementLocator.LAST_7_DAYS_TAB_LEADER_BOARD);
    }

    public void selectAllTime() {
        click(ElementLocator.ALL_TIME_TAB_LEADER_BOARD);
    }

    public void selectFamiliesTab() {
        click(ElementLocator.FAMILIES_TAB_LEADER_BOARD);
    }

    public void clickOnFirstFamily() {
        if(isDisplayed(FIRST_FAMILY_NAME_LEADER_BOARD)){
            leaderBoardFamilyNameText=getTextFromElement(ElementLocator.FIRST_FAMILY_NAME_LEADER_BOARD);
            click(ElementLocator.FIRST_FAMILY_NAME_LEADER_BOARD);
        }else{
            Assert.fail("There are no families in the Leaderboard.");
        }
    }

    public void checkIfRelatedUserIsRedirectedToLogin() {
        checkVisible(ElementLocator.SIGN_UP_MD_BUTTON_POSITIVE);
    }

    public void clickOnFollowButtonOfFirstUser() {
        if (isDisplayed(FIRST_PROFILE_FOLLOW_BUTTON_LEADER_BOARD)){
            click(ElementLocator.FIRST_PROFILE_FOLLOW_BUTTON_LEADER_BOARD);
        }else{
            Assert.fail("There are no users in the Leaderboard.");
        }

        if(isDisplayed(ElementLocator.CUSTOM_DIALOG_POSITIVE)){
            click(ElementLocator.CUSTOM_DIALOG_NEGATIVE);
        }
    }

    public void checkRelatedUserFollowStatus() {
        checkText(ElementLocator.FOLLOW_BUTTON_TEXT_PROFILE,"FOLLOWING");
    }

    public void scrollLeaderboardPageDown() {
        scrollPageDown(driver,0.8,0.01);
    }

    public void scrollLeaderboardPageUp() {
        scrollPageUp(driver,0.8,0.4);
        scrollPageUp(driver,0.8,0.4);
    }

    public void checkLeaderboardPageRefreshIndicator() {
        if(isDisplayed(ElementLocator.FIRST_PROFILE_NAME_LEADER_BOARD)){
            checkVisible(ElementLocator.FIRST_PROFILE_NAME_LEADER_BOARD);
        }else if(isDisplayed(ElementLocator.FIRST_FAMILY_NAME_LEADER_BOARD)){
            checkVisible(ElementLocator.FIRST_FAMILY_NAME_LEADER_BOARD);
        }else {
            Assert.fail("There are no users in the Leaderboard.");
        }
    }

    public void verifyTheFamilyPage() {
        checkText(ElementLocator.PROFILE_FAMILY_NAME,leaderBoardFamilyNameText);
    }

    public void clickOnCountrySelectionButton() {
        click(ElementLocator.LEADER_BOARD_COUNTRY_SELECTION_BUTTON);
    }

    public void searchForRelatedCountryInSearchSection() {
        sendKeys(ElementLocator.SEARCH_TEXT_BOX_LEADER_BOARD,countryText);
    }

    public void selectSearchedCountry() {
        click(ElementLocator.FIRST_OPTION_COUNTRY_LEADER_BOARD);
    }

    public void clickOnSaveButtonInCountrySelection() {
        click(ElementLocator.SAVE_BUTTON);
    }

    public void checkSelectedCountryInformation() {
        click(ElementLocator.LEADER_BOARD_COUNTRY_SELECTION_BUTTON);
        checkText(ElementLocator.SECOND_OPTION_DISCOVER_COUNTRY_TEXT,countryText);
    }

    public void clickOnFamilyLeaderBoardInfoButton() {
        click(ElementLocator.FAMILY_LEADER_BOARD_INFO_BUTTON);
    }
    public void checkFamilyLeaderBoardInfo() {
        questionList[1] = firstQuestion;
        questionList[3] = secondQuestion;
        questionList[5] = thirdQuestion;
        questionList[7] = fourthQuestion;
        questionList[9] = fifthQuestion;
        questionList[11] = sixthQuestion;
        questionList[13] = seventhQuestion;
        setWait(10000);
        checkText(ElementLocator.PHOTO_MESSAGE_TITLE,leaderboardTitleText);
        checkVisible(ElementLocator.BTN_BACK);

        for (int i = startIndex; i <= endIndex; i+=2) {
            String questionXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[" + i + "]/android.view.View/android.widget.Button";
            MobileElement element = (MobileElement) driver.findElement(By.xpath(questionXpath));
            By question = By.xpath(questionXpath);
            checkText(question,questionList[i]);
            element.click();
            setWait(5000);
            element.click();

        }
    }
}