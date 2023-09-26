package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchBarPages;
import util.DriverFactory;

public class SearchBarStepDefinitions {
    SearchBarPages searchBar = new SearchBarPages(DriverFactory.getDriver());

    @When("click search bar button")
    public void clickSearchBarButton() {
        searchBar.clickSearchBarButton();
    }

    @When("write search bar something")
    public void writeSearchBarButton() {
        searchBar.writeSearchBarButton();
    }

    @When("show search result")
    public void showSearchResult() {
        searchBar.showSearchResult();
    }

    @When("Found User and Follow")
    public void foundUserFollow(){
        searchBar.foundUserFollow();
    }
    @When("Close Search Bar")
    public void closeSearchBar(){
        searchBar.closeSearchBar();
    }
    @When("write number search bar")
    public void writeNumberSearchBar() {
        searchBar.writeNumberSearchBar();
    }


    @When("click canceled button on popup")
    public void clickCanceledButtonPopup(){
        searchBar.clickCanceledButtonPopup();
    }
    @When("same user unfollow")
    public void sameUserUnfollow(){
        searchBar.sameUserUnfollow();
    }
    @When("write nonglobal number search bar")
    public void writeNonglobalNumberSearchbar(){
        searchBar.writeNonglobalNumberSearchbar();
    }
    @Then("Check Unfollow Button")
    public void checkUnfollowButton(){
        searchBar.checkUnfollowButton();
    }
    @Then("Check Follow Button")
    public void checkFollowButton(){
        searchBar.checkFollowButton();
    }
    @Then("Check user layout")
    public void checkUserLayout(){
        searchBar.checkUserLayout();
    }
    @Then("Check empty search view")
    public void checkEmptySearchView(){
        searchBar.checkEmptySearchView();
    }


    @When("click Back Button")
    public void clickBackButton(){
        searchBar.clickBackButton();
    }
    @Then("Check Empty Discover Page")
    public void checkEmptyDiscoverPage(){
        searchBar.checkEmptyDiscoverPage();
    }
}
