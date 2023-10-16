package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ja.但し;
import pages.PublicStreamPages;
import pages.SearchBarPages;
import util.DriverFactory;

public class PublicStreamStepDefinitions {
    PublicStreamPages publicStream = new PublicStreamPages(DriverFactory.getDriver());

    @When("click start stream button")
    public void clickStartStreamButton() { publicStream.clickStartStreamButton();}
    @When("Accept camera permission")
    public void acceptCameraPermission(){ publicStream.acceptCameraPermission();}
    @When("Accept microphone permission")
    public void acceptMicrophonePermission(){ publicStream.acceptMicrophonePermission();}
    @When("Accept near device permission")
    public void acceptNearDevicePermission(){ publicStream.acceptNearDevicePermission();}
    @When("click terms of usage button")
    public void clickTermsUsage(){ publicStream.clickTermsUsage();}
    @Then("check Accept Terms button")
    public void checkTermsUsage(){ publicStream.checkTermsUsage();}
    @When("click Accept Terms button")
    public void clickAcceptTermsButton(){ publicStream.clickAcceptTermsButton();}
    @Then("check public stream container")
    public void checkPublicStreamContainer(){ publicStream.checkPublicStreamContainer();}
    @When("Start public streaming button")
    public void startPublicStreamingButton(){ publicStream.startPublicStreamingButton();}
    @Then("Check Start PK Button")
    public void checkStartPkButton(){ publicStream.checkStartPkButton();}
    @When("click create wheel")
    public void clickCreateWheel(){ publicStream.clickCreateWheel();}
    @When("Write wheel name")
    public void writeWheelName(){ publicStream.writeWheelName();}
    @When("click select gift button")
    public void clickSelectGiftButton(){ publicStream.clickSelectGiftButton();}
    @When("Select gift for wheel")
    public void selectGiftForWheel(){ publicStream.selectGiftForWheel();}
    @When("click continue button")
    public void clickContinueButton(){ publicStream.clickContinueButton();}
    @When("write something wheel options 1")
    public void writeSomethingWheelOptions1(){ publicStream.writeSomethingWheelOptions1();}
    @When("write something wheel options 2")
    public void writeSomethingWheelOptions2(){ publicStream.writeSomethingWheelOptions2();}
    @When("Continue and preview button")
    public void continueAndPreviewButton(){ publicStream.continueAndPreviewButton();}
    @Then("check preview wheel")
    public void checkPreviewWheel(){ publicStream.checkPreviewWheel();}
    @When("click accept and create wheel button")
    public void clickAcceptAndCreateWheelButton(){ publicStream.clickAcceptAndCreateWheelButton();}
    @Then("check wheel in stream")
    public void checkWheelInStream(){ publicStream.checkWheelInStream();}
    @When("click hamburger button")
    public void clickHamburgerButton(){ publicStream.clickHamburgerButton();}
    @When("close PK settings Tutorial")
    public void closePkSettingsTutorial(){ publicStream.closePkSettingsTutorial();}
    @When("close sticker tutorial")
    public void closeStickerTutorial(){ publicStream.closeStickerTutorial();}
    @When("click close microphone button")
    public void clickCloseMicrophoneButton(){ publicStream.clickCloseMicrophoneButton();}
    @When("touch outside in stream")
    public void touchOutsideInStream(){ publicStream.touchOutsideInStream();}
    @Then("check microphone off image")
    public void checkMicrophoneOffImage(){ publicStream.checkMicrophoneOffImage();}
    @When("click turn camera button")
    public void clickTurnCameraButton(){ publicStream.clickTurnCameraButton();}
    @Then("check turn camera button")
    public void checkTurnCameraButton(){ publicStream.checkTurnCameraButton();}
    @When("click camera off button")
    public void clickCameraOffButton(){ publicStream.clickCameraOffButton();}
    @Then("check avatar circular")
    public void checkAvatarCircular(){ publicStream.checkAvatarCircular();}
    @When("close mirror button")
    public void closeMirrorButton(){ publicStream.closeMirrorButton();}
    @Then("check mirror button")
    public void checkMirrorButton(){ publicStream.checkMirrorButton();}
    @When("click beauty filter")
    public void clickBeautyFilter(){ publicStream.clickBeautyFilter();}
    @Then("check beauty filter")
    public void checkBeautyFilter(){ publicStream.checkBeautyFilter();}
    @When("click hamburger settings button")
    public void clickHamburgerSettingsButton(){ publicStream.clickHamburgerSettingsButton();}
    @Then("check hamburger settings overlay")
    public void checkHamburgerSettingsOverlay(){ publicStream.checkHamburgerSettingsOverlay();}
    @When("click turn off gift volume")
    public void clickTurnOffGiftVolume(){ publicStream.clickTurnOffGiftVolume();}
    @Then("check turn on gift volume")
    public void checkTurnOnGiftVolume(){ publicStream.checkTurnOnGiftVolume();}
    @When("click target bar button")
    public void clickTargetBarButton(){ publicStream.clickTargetBarButton();}
    @When("write title on target bar")
    public void writeTitleOnTargetBar(){ publicStream.writeTitleOnTargetBar();}
    @When("write target amount")
    public void writeTargetAmount(){ publicStream.writeTargetAmount();}
    @When("write starting amount")
    public void writeStartingAmount(){ publicStream.writeStartingAmount();}
    @When("pick end date")
    public void pickEndDate(){ publicStream.pickEndDate();}
    @When("click save button")
    public void clickSaveButton(){ publicStream.clickSaveButton();}
    @Then("check preview target bar")
    public void checkPreviewTargetBar(){ publicStream.checkPreviewTargetBar();}
    @Then("check target bar in stream")
    public void checkTargetBarInStream(){ publicStream.checkTargetBarInStream();}
    @When("click chat settings button")
    public void clickChatSettingsButton(){ publicStream.clickChatSettingsButton();}
    @Then("check chat settings overlay")
    public void checkChatSettingsOverlay(){ publicStream.checkChatSettingsOverlay();}
    @When("click gift sticker button")
    public void clickGiftStickerButton(){ publicStream.clickGiftStickerButton();}
    @When("select gift for sticker")
    public void selectGiftForSticker(){ publicStream.selectGiftForSticker();}
    @When("click next button")
    public void clickNextButton(){ publicStream.clickNextButton();}
    @Then("check preview sticker")
    public void checkPreviewSticker(){ publicStream.checkPreviewSticker();}
    @When("click completed button")
    public void clickCompletedButton(){ publicStream.clickCompletedButton();}
    @Then("check sticker in stream")
    public void checkStickerInStream(){ publicStream.checkStickerInStream();}
    @When("click diamond count area")
    public void clickDiamondCountArea(){ publicStream.clickDiamondCountArea();}
    @Then("check Top gifters overlay")
    public void checkTopGiftersOverlay(){ publicStream.checkTopGiftersOverlay();}
    @Then("check diamond count")
    public void checkDiamondCount(){ publicStream.checkDiamondCount();}
    @When("click viewer count area")
    public void clickViewerCountArea(){ publicStream.clickViewerCountArea();}
    @Then("check viewers container")
    public void checkViewersContainer(){ publicStream.checkViewersContainer();}
    @When("click Stats button")
    public void clickStatsButton(){ publicStream.clickStatsButton();}
    @Then("check in stats")
    public void checkInStats(){ publicStream.checkInStats();}
    @Then("check viewers count")
    public void checkViewersCount(){ publicStream.checkViewersCount();}
    @When("click profil photo")
    public void clickProfilPhoto(){ publicStream.clickProfilPhoto();}
    @Then("Check profil photo in overlay")
    public void checkProfilPhotoInOverlay(){ publicStream.checkProfilPhotoInOverlay();}
    @Then("Check profil overlay info")
    public void checkProfilOverlayInfo(){ publicStream.checkProfilOverlayInfo();}
    @When("click stream chat")
    public void clickStreamChat(){ publicStream.clickStreamChat();}
    @When("write stream chat")
    public void writeStreamChat(){ publicStream.writeStreamChat();}
    @When("click send button")
    public void clickSendButton(){ publicStream.clickSendButton();}
    @Then("check stream message area")
    public void checkStreamMessageArea(){ publicStream.checkStreamMessageArea();}
    @When("touch outside in message")
    public void touchOutsideInMessage(){ publicStream.touchOutsideInMessage();}
    @When("click pk war button")
    public void clickPkWarButton(){ publicStream.clickPkWarButton();}
    @Then("check pk war overlay")
    public void checkPkWarOverlay(){ publicStream.checkPkWarOverlay();}
    @When("click guest button")
    public void clickGuestButton(){ publicStream.clickGuestButton();}
    @Then("check guest overlay")
    public void checkGuestOverlay(){ publicStream.checkGuestOverlay();}
    @When("click premium stream button")
    public void clickPremiumStreamButton(){ publicStream.clickPremiumStreamButton();}
    @When("select gift for premium stream")
    public void selectGiftForPremiumStream(){ publicStream.selectGiftForPremiumStream();}
    @When("continue premium stream")
    public void continuePremiumStream(){publicStream.continuePremiumStream();}
    @Then("check premium stream badge")
    public void checkPremiumStreamBadge(){ publicStream.checkPremiumStreamBadge();}
    @When("click share stream button")
    public void clickShareStreamButton(){ publicStream.clickShareStreamButton();}
    @Then("check share stream overlay")
    public void checkShareStreamOverlay(){ publicStream.checkShareStreamOverlay();}
    @When("click stream close button")
    public void clickStreamCloseButton(){ publicStream.clickStreamCloseButton();}
    @When("click end stream button")
    public void clickEndStreamButton(){ publicStream.clickEndStreamButton();}
    @Then("check livestream ended page")
    public void checkLivestreamEndedPage(){ publicStream.checkLivestreamEndedPage();}







}