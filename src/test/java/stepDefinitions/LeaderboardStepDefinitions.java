package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LeaderboardPages;
import util.DriverFactory;

public class LeaderboardStepDefinitions {
    LeaderboardPages leaderboardPages=new LeaderboardPages(DriverFactory.getDriver());

    @When("the Login overlay is closed")
    public void theLoginOverlayIsClosed() { leaderboardPages.closeLoginOverlay();
    }

    @When("the Leaderboard tab is clicked")
    public void theLeaderboardTabIsClicked() { leaderboardPages.clickOnLeaderboardTab();
    }

    @Then("Verify that the profile of the relevant user is accessed")
    public void verifyThatTheProfileOfTheRelevantUserIsAccessed() { leaderboardPages.checkIfUserProfileOfRelatedUserIsAccessed();
    }

    @When("the Streamers tab is selected")
    public void theStreamersTabIsSelected() { leaderboardPages.selectStreamersTab();
    }

    @When("the first user in the list is clicked")
    public void theFirstUserInTheListIsClicked() { leaderboardPages.clickOnFirstUserInLeaderboard();
    }

    @When("the Supporters tab is selected")
    public void theSupportersTabIsSelected() {leaderboardPages.selectSupportersTab();
    }

    @When("the Last 24 Hours tab is selected")
    public void theLastHoursTabIsSelected() { leaderboardPages.selectLastTwentyFourHours();
    }

    @When("the Last 7 Days tab is selected")
    public void theLastDaysTabIsSelected() { leaderboardPages.selectSevenDays();
    }

    @When("the All Time tab is selected")
    public void theAllTimeTabIsSelected() { leaderboardPages.selectAllTime();
    }

    @When("the Families tab is selected")
    public void theFamiliesTabIsSelected() {leaderboardPages.selectFamiliesTab();
    }

    @When("the first family in the list is clicked")
    public void theFirstFamilyInTheListIsClicked() {leaderboardPages.clickOnFirstFamily();
    }

    @Then("Verify that the relevant user is directed to the login")
    public void verifyThatTheRelevantUserIsDirectedToTheLogin() { leaderboardPages.checkIfRelatedUserIsRedirectedToLogin();
    }

    @When("the follow button of the top user in the list is clicked")
    public void theFollowButtonOfTheTopUserInTheListIsClicked() { leaderboardPages.clickOnFollowButtonOfFirstUser();
    }

    @Then("Verify the follow status of the relevant user")
    public void verifyTheFollowStatusOfTheRelevantUser() { leaderboardPages.checkRelatedUserFollowStatus();
    }

    @When("the page is scrolled down")
    public void thePageIsScrolledDown() { leaderboardPages.scrollLeaderboardPageDown();
    }

    @When("the page is scrolled up and refreshed")
    public void thePageIsScrolledUpAndRefreshed() { leaderboardPages.scrollLeaderboardPageUp();
    }

    @Then("Verify that the refresh indicator is displayed")
    public void verifyThatTheRefreshIndicatorIsDisplayed() { leaderboardPages.checkLeaderboardPageRefreshIndicator();
    }


    @Then("Verify that the user is directed to the family page")
    public void verifyThatTheUserIsDirectedToTheFamilyPage() { leaderboardPages.verifyTheFamilyPage();
    }

    @When("the Country selection button is clicked")
    public void theCountrySelectionButtonIsClicked() { leaderboardPages.clickOnCountrySelectionButton();
    }

    @When("the relevant country is searched in the Search section")
    public void theRelevantCountryIsSearchedInTheSearchSection() { leaderboardPages.searchForRelatedCountryInSearchSection();
    }

    @When("the searched relevant country is selected")
    public void theSearchedRelevantCountryIsSelected() { leaderboardPages.selectSearchedCountry();
    }

    @When("the Save button in the Country selection section is clicked")
    public void theSaveButtonInTheCountrySelectionSectionIsClicked() { leaderboardPages.clickOnSaveButtonInCountrySelection();
    }

    @Then("Verify the selected country information")
    public void verifyTheSelectedCountryInformation() { leaderboardPages.checkSelectedCountryInformation();
    }

    @When("the family LeaderBoard Info button is clicked")
    public void theFamilyLeaderBoardInfoButtonIsClicked() { leaderboardPages.clickOnFamilyLeaderBoardInfoButton();
    }

    @Then("Verify the family LeaderBoard Info details")
    public void verifyTheFamilyLeaderBoardInfoDetails() { leaderboardPages.checkFamilyLeaderBoardInfo();
    }
}