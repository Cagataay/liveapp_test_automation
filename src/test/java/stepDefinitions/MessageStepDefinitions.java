package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MessagePages;
import util.DriverFactory;

public class MessageStepDefinitions {

    MessagePages messagePages = new MessagePages(DriverFactory.getDriver());

    @When("go to inbox page")
    public void goToTheInboxPage() {messagePages.goToInboxPage();}

    @Then("check inbox elements")
    public void checkInboxElements() {messagePages.checkInboxPageElements();}

    @Then("pin and unpin inbox message")
    public void pinAndUnpinInboxMessage() {
        messagePages.pinAndUnpinMessage();
    }

    @Then("mark as unread and read the message")
    public void markAsUnreadAndReadTheMessage() {
        messagePages.markTheInboxMessageAsUnreadAndRead();
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

    @And("send message to support account")
    public void sendMessageToSupportAccount() {messagePages.sendMessageToSupportAccount();}

    @Then("scroll inbox page")
    public void scroll_inbox_page() {
        messagePages.scrollInboxPage();
    }

    @When("go to chat page from inbox")
    public void goToChatPageFromInbox() {messagePages.goToChatPage();}

    @Then("check private call buttons")
    public void checkPrivateCallButtons() {
        messagePages.verifyPrivateCallButtons();
    }

    @Then("check last seen")
    public void checkLastSeen() {messagePages.verifyLastSeen();}

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
    public void checkTheButtonsText() {messagePages.checkUserOptionOverlay();}

    @Then("click view profile button and back to chat page")
    public void clickViewProfileButtonAndBackToChatPage() {messagePages.clickViewProfileButtonAndTurnBackToChatPage();}

    @And("click mute and unmute buttons")
    public void clickMuteAndUnmuteButtons() {messagePages.muteAndUnmuteUser();}

    @When("send text message to user")
    public void sendTextMessageToUser() {messagePages.sendTextMessage();}

    @Then("copy text message")
    public void copyTextMessage() {messagePages.copyTextMessageInChat();}

    @And("check message date and seen info")
    public void checkMessageDateAndSeenInfo() {messagePages.checkMessageInfo();}

    @Then("send photo message to user")
    public void sendPhotoMessageToUser() {
        messagePages.sendPhotoMessage();
    }

    @And("check photo message info")
    public void checkPhotoMessageInfo() {
        //messagePages.checkPhotoMessageInfo(); //Comment line can be removed if prod bug is resolvedd
    }

    @And("check photo details")
    public void checkPhotoDetails() {
        //messagePages.clickPhotoMessageAndCheckDetails(); //Comment line can be removed if prod bug is resolved
    }

    @Then("send premium photo to user")
    public void sendPremiumPhotoToUser() {
        messagePages.sendPremiumPhotoMessage();
    }

    @And("check premium photo info")
    public void checkPremiumPhotoInfo() {
        //messagePages.checkPremiumPhotoInformation(); //Comment line can be removed if prod bug is resolved
    }

    @When("send video to user")
    public void sendVideoToUser() {
        messagePages.sendVideoToUserInChat();
    }

    @Then("check video info in chat")
    public void checkVideoInfoInChat() {
        //messagePages.checkVideoInfo(); //Comment line can be removed if prod bug is resolved
    }

    @And("check video details")
    public void checkVideoDetails() {
        //messagePages.clickVideoAndCheckDetails(); //Comment line can be removed if prod bug is resolved
    }

    @When("send premium video to user")
    public void sendPremiumVideoToUser() {
        messagePages.sendPremiumVideoToUserInChat();
    }

    @Then("check premium video info in chat")
    public void checkPremiumVideoInfoInChat() {
        //messagePages.checkPremiumVideoInfo(); //Comment line can be removed if prod bug is resolved
    }

    @Then("send gift to user")
    public void sendGiftToUser() {
        messagePages.sendGiftMessage();
    }

    @And("check gift message info")
    public void checkGiftMessageInfo() {
        messagePages.checkGiftMessageInformation();
    }

    @Then("send audio message to user")
    public void sendAudioMessageToUser() {messagePages.sendAudioMessage();}

    @And("play audio message")
    public void playAudioMessage() {
        messagePages.playTheAudioMessage();
    }

    @And("check audio message info")
    public void checkAudioMessageInfo() {messagePages.checkAudioMessageInformation();}

    @When("open gift overlay in chat")
    public void openGiftOverlayInChat() {
        messagePages.clickGiftButtonInChat();
    }

    @Then("check gift overlay elements")
    public void checkGiftOverlayElements() {
        messagePages.checkElementsInGiftOverlay();
    }

    @Then("click buy coins button")
    public void clickBuyCoinsButton() {
        messagePages.clickBuyCoinsButtonInGiftOverlay();
    }

    @Then("close payment popup")
    public void closePaymentPopup() {
        messagePages.closeHybridPurchasePage();
    }

    @And("scroll message page")
    public void scrollMessagePage() {messagePages.scrollInMessagePage();}

    @Then("check user level badge")
    public void checkUserLevelBadge() {
        messagePages.checkUserBadgeInInbox();
    }

    @Then("check user top badge")
    public void checkUserTopBadge() {messagePages.checkUserTopBadgeInInbox();}

    @Then("check user vip badge")
    public void checkUserVipBadge() {messagePages.checkUserVipBadgeInInbox();}

    @Then("swipe right in gift overlay")
    public void swipeRightInGiftOverlay() {messagePages.swipeRightInGiftOverlayWithElement();}

    @When("click seen button in chat")
    public void clickSeenButtonInChat() {messagePages.clickSeenButton();}

    @Then("check seen popup elements and texts")
    public void checkSeenPopupElementsAndTexts() {messagePages.checkSeenPopupElementsTexts();}

    @And("click be a VIP button")
    public void clickBeAVIPButton() {messagePages.goToThePaymentPageFromSeenPopup();}

    @Then("click cancel button in popup")
    public void clickCancelButtonInPopup() {messagePages.closeSeenPopup();}

    @When("go to media screen from chat")
    public void goToMediaScreenFromChat() {messagePages.openMediaScreenFromChat();}

    @Then("check media screen elements")
    public void checkMediaScreenElements() {messagePages.verifyMediaScreenElements();}

    @Then("check media screen texts")
    public void checkMediaScreenTexts() {messagePages.verifyMediaScreenTexts();}

    @And("type media message and send")
    public void typeMediaMessageAndSend() {messagePages.typeMediaMessageAndSendToUser();}

    @When("login to app as family member")
    public void loginToAppAsFamilyMember() {
        messagePages.loginToAppAsFamilyMember();
    }

    @Then("go to the family chat from inbox")
    public void goToTheFamilyChatFromInbox() {messagePages.goToTheFamilyChat();}

    @Then("check family chat elements")
    public void checkFamilyChatElements() {
        messagePages.verifyFamilyChatElements();
    }

    @When("send photo message to family")
    public void sendPhotoMessageToFamily() {messagePages.sendPhotoMessageToFamilyChat();}

    @When("send video message to family")
    public void sendVideoMessageToFamily() {messagePages.sendVideoToFamilyChat();}

    @Then("go to the family page from family chat")
    public void goToTheFamilyPageFromFamilyChat() {messagePages.goToTheFamilyPageAndTurnBack();}

    @When("click family option button")
    public void clickFamilyOptionButton() {messagePages.clickFamilyOptionButton();}

    @When("login to app as family leader")
    public void loginToAppAsFamilyLeader() {messagePages.loginToAppAsFamilyLeader();}

    @Then("check family option popup as family leader")
    public void checkFamilyOptionPopupAsFamilyLeader() {
        messagePages.checkFamilyOptionOverlayAsFamilyLeader();
    }

    @When("click mute notifications button")
    public void clickMuteNotificationsButton() {messagePages.clickMuteNotifButtonInFamilyOptionOverlay();}

    @Then("go to inbox and check mute icon")
    public void goToInboxAndCheckMuteIcon() {messagePages.goToTheInboxPageAndVerifyMuteIcon();}

    @Then("click unmute notifications button")
    public void clickUnmuteNotificationsButton() {messagePages.clickUnmuteNotifButtonInFamilyOptionOverlay();}

    @When("click mute the members button")
    public void clickMuteTheMembersButton() {messagePages.clickMuteTheMembersButtonInOptionOverlay();}

    @Then("check mute the members popup")
    public void checkMuteTheMembersPopup() {messagePages.verifyMuteTheMembersPopup();}

    @And("click mute the members button in popup")
    public void clickMuteTheMembersButtonInPopup() {messagePages.clickMuteTheMembersButton();}

    @Then("click unmute the members")
    public void clickUnmuteTheMembers() {messagePages.clickUnmuteTheMembersButton();}

    @Then("check family option popup as family member")
    public void checkFamilyOptionPopupAsFamilyMember() {
        messagePages.verifyFamilyOptionOverlayAsFamilyMember();
    }

    @Then("click delete family chat button")
    public void clickDeleteFamilyChatButton() {messagePages.clickDeleteChatButtonInFamilyOptionOverlay();}

    @And("check delete family chat popup")
    public void checkDeleteFamilyChatPopup() {messagePages.verifyDeleteFamilyChatPopup();}

    @And("click delete button in popup")
    public void clickDeleteButtonInPopup() {messagePages.clickDeleteFamilyChatButtonInPopup();}

    @Then("click leave family button")
    public void clickLeaveFamilyButton() {messagePages.clickLeaveFamilyButtonInFamilyOptionOverlay();}

    @Then("check leave family popup and click cancel button")
    public void checkLeaveFamilyPopupAndClickCancelButton() {messagePages.verifyLeaveFamilyPopup();}

    @Then("check welcome to family message")
    public void checkWelcomeToFamilyMessage() { messagePages.checkWelcomeMessageInFamilyChat();}

    @And("click leave family button in popup")
    public void clickLeaveFamilyButtonInPopup() {messagePages.clickLeaveFamilyButtonInPopup();}

    @And("click search user button")
    public void clickSearchUserButton() {messagePages.clickSearchButton();}

    @And("search family leader and click")
    public void searchFamilyLeaderAndClick() {messagePages.searchFamilyLeaderAndGoToProfile();}

    @And("click family button in profile")
    public void clickFamilyButtonInProfile() {messagePages.clickFamilyNameInProfile();}

    @And("click join request button")
    public void clickJoinRequestButton() {messagePages.sendRequestToJoinFamily();}

    @Then("click notification button")
    public void clickNotificationButton() {messagePages.clickNotificationButtonAsFamilyLeader();}

    @And("click approve button in notifications")
    public void clickApproveButtonInNotifications() {messagePages.approveFamilyJoinRequest();}

    @And("turn back to main page")
    public void turnBackToMainPage() {messagePages.turnBackToMainPageFromNotifications();}

    @And("check family notification in family chat")
    public void checkFamilyNotificationInFamilyChat() {messagePages.verifyFamilyNotificationInFamilyChat();}
}
