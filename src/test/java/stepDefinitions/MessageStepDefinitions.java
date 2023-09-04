package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MessagePages;
import util.DriverFactory;

public class MessageStepDefinitions {

    MessagePages messagePages = new MessagePages(DriverFactory.getDriver());

    @When("go to inbox page")
    public void go_to_inbox_page() {
        messagePages.goToInboxPage();
    }

    @Then("check inbox page title")
    public void check_inbox_page_title() {
       messagePages.verifyInboxPageTitle();
    }

    @Then("check inbox online status")
    public void check_inbox_online_status() {
        messagePages.verifyInboxOnlineStatus();
    }

    @Then("check inbox profile picture")
    public void check_inbox_profile_picture() {
        messagePages.checkInboxProfilePicture();
    }

    @Then("check inbox livestream button")
    public void checkInboxLivestreamButton() {
        messagePages.verifyLiveStreamButtonInbox();
    }

    @Then("check user level badge")
    public void check_user_level_badge() {
        messagePages.checkUserLevelBadge();
    }

    @Then("check inbox timestamp")
    public void checkInboxTimestamp() {
        messagePages.checkInboxMessageDate();
    }

    @When("check superlive official account")
    public void checkSuperliveOfficialAccount() {
        messagePages.verifySuperliveOfficialAccount();
    }

    @Then("check moderation account")
    public void checkModerationAccount() {
        messagePages.verifyInboxModerationAccount();
    }

    @Then("check support account")
    public void checkSupportAccount() {
        messagePages.verifyInboxSupportAccount();
    }

    @Then("scroll inbox page")
    public void scroll_inbox_page() {
        messagePages.scrollInboxPage();
    }

    @When("go to chat page from inbox")
    public void goToChatPageFromInbox() {
        messagePages.goToChatPage();
    }

    @Then("check private call buttons")
    public void checkPrivateCallButtons() {
        messagePages.verifyPrivateCallButtons();
    }

    @Then("check last seen")
    public void checkLastSeen() {
        messagePages.verifyLastSeen();
    }

    @Then("check profile photo and user name")
    public void checkProfilePhotoAndUserName() {
        messagePages.verifyProfilePhotoAndUserName();
    }

    @Then("check user option button")
    public void checkUserOptionButton() {
        messagePages.verifyUserOptionButton();
    }

    @When("click user option button")
    public void clickUserOptionButton() {
        messagePages.clickUserOptionButton();
    }

    @Then("check the buttons text")
    public void checkTheButtonsText() {
        messagePages.checkUserOptionOverlay();
    }

    @Then("click view profile button and back to chat page")
    public void clickViewProfileButtonAndBackToChatPage() {
        messagePages.clickViewProfileButtonAndTurnBackToChatPage();
    }

    @When("send text message to user")
    public void sendTextMessageToUser() {
        messagePages.sendTextMessage();
    }
}
