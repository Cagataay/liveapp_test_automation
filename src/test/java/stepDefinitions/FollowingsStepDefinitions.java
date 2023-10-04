package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FollowingsPages;
import util.DriverFactory;

public class FollowingsStepDefinitions {
    FollowingsPages followings = new FollowingsPages(DriverFactory.getDriver());

    @When("Click Followings Navbar")
    public void clickFollowingsNavbar() {
        followings.clickFollowingsNavbar();
    }

    @Then("Check followings login button")
    public  void checkFollowingsLoginButton(){followings.checkFollowingsLoginButton();}

    @Then("Check nonstream page")
    public void checkNonstreamPage(){followings.checkNonstreamPage();}

    @Then("Check stream card")
    public void checkStreamCard(){followings.checkStreamCard();}

    @Then("Check four person pk")
    public void checkFourPersonPK(){followings.checkFourPersonPK();}

    @Then("Check pk stream card")
    public void checkPkStreamCard(){followings.checkPkStreamCard();}

    @Then("Check mgs stream card")
    public void checkMgsStreamCard(){followings.checkMgsStreamCard();}

    @Then("Check premium stream card")
    public void checkPremiumStreamCard(){followings.checkPremiumStreamCard();}
}