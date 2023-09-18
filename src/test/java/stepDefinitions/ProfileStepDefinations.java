package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProfilePages;
import util.DriverFactory;

public class ProfileStepDefinations {
    ProfilePages profilePages = new ProfilePages(DriverFactory.getDriver());

    @When("Close login overlay")
    public void closeLoginOverlay() {
        profilePages.clickOutsideLoginOverlayButton();
    }

    @When("Go to profile page")
    public void goToProfilePage() {
        profilePages.clickNavigationProfileButton();
    }

    @Then("Check non-login image")
    public void checkNonLoginImage() {
        profilePages.checkNonLoginUserImage();
    }

    @Then("Check non-login text")
    public void checkNonLoginText() {
        profilePages.checkNonLoginUserText();
    }

    @Then("Check login button")
    public void checkLoginButton() {
        profilePages.checkProfileUserLoginButton();
    }

    @Then("Check profile header image")
    public void checkProfileHeaderImage() {
        profilePages.checkProfileHeaderImage();
    }

    @Then("Check profile edit button")
    public void checkProfileEditButton() {
        profilePages.checkProfileEditButton();
    }

    @Then("Check profile share button")
    public void checkProfileShareButton() {
        profilePages.checkProfileShareButton();
    }

    @Then("Check profile preview button")
    public void checkProfilePreviewButton() {
        profilePages.checkProfilePreviewButton();
    }

    @Then("Check profile image")
    public void checkProfileImage() {
        profilePages.checkProfileImage();
    }

    @Then("Check user location container")
    public void checkUserLocationContainer() {
        profilePages.checkUserLocationContainer();
    }

    @Then("Check user shared id")
    public void checkUserSharedId() {
        profilePages.checkSharedId();
    }

    @Then("Check user level")
    public void checkUserLevel() {
        profilePages.checkUserLevel();
    }

    @Then("Check username")
    public void checkUsername() {
        profilePages.checkUserName();
    }

    @Then("Check user follower")
    public void checkUserFollower() {
        profilePages.checkUserFollower();
    }

    @Then("Check user following")
    public void checkUserFollowing() {
        profilePages.checkUserFollowing();
    }

    @Then("Check user earned diamonds")
    public void checkUserEarnedDiamonds() {
        profilePages.checkUserEarnedDiamonds();
    }

    @Then("Check user sent coins")
    public void checkUserSentCoins() {
        profilePages.checkUserSentCoins();
    }

    @When("Right swipe header image")
    public void rightSwipeHeaderImage() {
        profilePages.rightSwipeHeaderImage();
    }

    @Then("Check user about text")
    public void checkUserAboutText() {
        profilePages.checkProfileUserAboutText();
    }

    @Then("Check family button")
    public void checkFamilyButton() {
        profilePages.checkFamilyButton();
    }

    @Then("Check start stream button")
    public void checkStartStreamButton() {
        profilePages.checkStartStreamButton();
    }

    @When("Scroll profile page")
    public void scrollProfilePage() {
        profilePages.scrollProfilePage();
    }

    @Then("Check profile coin purchase button")
    public void checkProfileCoinPurchaseButton() {
        profilePages.checkProfilePurchaseButton();
    }

    @Then("Check profile vip store button")
    public void checkProfileVipStoreButton() {
        profilePages.checkProfileVipStoreButton();
    }

    @Then("Check profile gold vip button")
    public void checkProfileGoldVipButton() {
        profilePages.checkProfileGoldVipButton();
    }

    @Then("Check profile user level button")
    public void checkProfileUserLevelButton() {
        profilePages.checkProfileUserLevelButton();
    }

    @Then("Check profile most sent gifts button")
    public void checkProfileMostSentGiftsButton() {
        profilePages.checkProfileMostSentGiftsButton();
    }


    @Then("Check profile agency button")
    public void checkProfileAgencyButton() {
        profilePages.checkProfileAgencyButton();
    }

    @Then("Check profile income button")
    public void checkProfileIncomeButton() {
        profilePages.checkProfileIncomeButton();
    }

    @Then("Check profile cash out button")
    public void checkProfileCashOutButton() {
        profilePages.checkProfileCashOutButton();
    }

    @Then("Check profile linked account button")
    public void checkProfileLinkedAccountButton() {
        profilePages.checkProfileLinkedAccountButton();
    }

    @Then("Check profile item bag button")
    public void checkProfileItemBagButton() {
        profilePages.checkProfileItemBagButton();
    }

    @Then("Check profile settings button")
    public void checkProfileSettingsButton() {
        profilePages.checkProfileSettingsButton();
    }

    @Then("Check bronze vip badge")
    public void checkBronzeVipBadge() {
        profilePages.checkBronzeVipBadge();
    }

    @Then("Check silver vip badge")
    public void checkSilverVipBadge() {
        profilePages.checkSilverVipBadge();
    }

    @Then("Check gold vip badge")
    public void checkGoldVipBadge() {
        profilePages.checkGoldVipBadge();
    }

    @Then("Check gold vip lion image")
    public void checkGoldVipLionImage() {
        profilePages.checkGoldVipImage();
    }

    @Then("Check gold vip overlay line")
    public void checkGoldVipOverlayLine() {
        profilePages.checkGoldVipOverlayLine();
    }

    @When("Click profile edit button")
    public void clickProfileEditButton() {
        profilePages.clickUserProfileEditButton();
    }

    @Then("Check username in profile edit")
    public void checkUsernameInProfileEdit() {
        profilePages.checkUsernameInProfileEdit();
    }

    @When("Get username")
    public void getUsername() {
        profilePages.setUsername();
    }

    @When("Get user biography")
    public void getUserBiography() {
        profilePages.setUserBiography();
    }

    @Then("Check user biography in profile edit")
    public void checkUserBiographyInProfileEdit() {
        profilePages.checkBiographyInProfileEdit();
    }

    @When("Get user shared id")
    public void getUserSharedId() {
        profilePages.setUserSharedId();
    }

    @Then("Check user shared id in profile edit")
    public void checkUserSharedIdInProfileEdit() {
        profilePages.checkSharedIdInProfileEdit();
    }

    @When("Change username")
    public void changeUsername() {
        profilePages.changeUsername();
    }


    @When("Click save button and back to profile page")
    public void clickSaveButtonAndBackToProfilePage() {
        profilePages.clickSaveButtonAndBackToProfilePage();
    }

    @Then("Check username changing")
    public void checkUsernameChanging() {
        profilePages.checkUsernameChanging();
    }

    @When("Change user biography")
    public void changeUserBiography() {
        profilePages.changeBiography();
    }

    @Then("Check biography changing")
    public void checkBiographyChanging() {
        profilePages.checkUserBiographyChanging();
    }

    @Then("Check top badge")
    public void checkTopBadge() {
        profilePages.checkTopBadge();
    }
}
