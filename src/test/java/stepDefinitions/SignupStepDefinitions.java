package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignupPages;
import util.DriverFactory;

public class SignupStepDefinitions {
    SignupPages signupPages=new SignupPages(DriverFactory.getDriver());

    @When("the Email signup button is clicked")
    public void theEmailSignupButtonIsClicked() { signupPages.performEmailSignup();
    }

    @When("the Email address to be registered is entered")
    public void theEmailAddressToBeRegisteredIsEntered() { signupPages.enterEmailForRegistration();
    }

    @When("the password for the registered email address is entered")
    public void thePasswordForTheRegisteredEmailAddressIsEntered() { signupPages.enterPasswordForEmailRegistration();
    }

    @When("the Signup continue button is clicked")
    public void theSignupContinueButtonIsClicked() { signupPages.clickSignupContinueButton();
    }

    @When("the username information is entered")
    public void theUsernameInformationIsEntered() { signupPages.enterUsernameInformation();
    }

    @When("the Continue button is clicked")
    public void theContinueButtonIsClicked() { signupPages.clickContinueButton();
    }

    @When("the date of birth is selected")
    public void theDateOfBirthIsSelected() { signupPages.selectBirthdate();
    }

    @When("the gender information is selected")
    public void theGenderInformationIsSelected() { signupPages.selectGenderInformation();
    }

    @When("the user's profile photo is added")
    public void theUserProfilePhotoIsAdded() { signupPages.addUserProfilePhoto();
    }


    @When("an invalid password is entered for the registered email address")
    public void anInvalidPasswordIsEnteredForTheRegisteredEmailAddress() { signupPages.enterInvalidPasswordForRegisteredEmail();
    }

    @Then("Verify the notification message indicating password mismatch")
    public void verifyTheNotificationMessageIndicatingPasswordMismatch() { signupPages.checkPasswordMismatchErrorMessage();
    }

    @When("the previously registered email address is entered")
    public void thePreviouslyRegisteredEmailAddressIsEntered() { signupPages.previouslyRegisteredEmailAddress();
    }

    @Then("Verify the notification message indicating that the email has been previously registered")
    public void verifyTheNotificationMessageIndicatingThatTheEmailHasBeenPreviouslyRegistered() { signupPages.checkEmailAlreadyRegisteredMessage();
    }

    @When("T&C and Privacy Policy option is clicked")
    public void tcAndPrivacyPolicyOptionIsClicked() { signupPages.clickOnTAndCAndPrivacyPolicyOption();
    }

    @When("the Privacy Policy option is accessed")
    public void thePrivacyPolicyOptionIsAccessed() { signupPages.accessPrivacyPolicyOption();
    }

    @When("returning from the T&C and Privacy Policy page")
    public void returningFromTheTCAndPrivacyPolicyPage() { signupPages.navigateBackFromTAndCAndPrivacyPolicyPage();
    }

    @When("the Terms of Service option is accessed")
    public void theTermsOfServiceOptionIsAccessed() { signupPages.accessTermsOfServiceOption();
    }

    @Then("Verify the T&C and Privacy Policy page")
    public void verifyTheTCAndPrivacyPolicyPage() { signupPages.checkTAndCAndPrivacyPolicyPage();
    }
}
