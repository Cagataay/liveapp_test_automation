@login
Feature:SuperLive Mobile App All Login Operations

  Scenario: SuperLive Mobile Application Email Login Process
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    Then Verify that access to the Live screen is achieved

  Scenario: SuperLive Mobile Application Google Login Process
    When Notification permission is granted
    When the Google login button is clicked
    When the relevant Google account is selected
    Then Verify that access to the Live screen is achieved

  Scenario: SuperLive Mobile Application Phone Login Process
    When Notification permission is granted
    When the Phone login button is clicked
    When the Select Country Code button is clicked
    When the relevant phone country code is searched
    When the relevant phone country code is selected
    When the relevant phone number is entered
    When the Continue-Verify button is clicked
    When the relevant phone number is verified
    When the verification code sent to the phone number is entered
    When the Continue-Verify button is clicked
    Then Verify that access to the Live screen is achieved

  Scenario: Verification of Texts for Login Options in SuperLive Mobile Application
    When Notification permission is granted
    Then Verify the text information in the Login Options section
    Then Verify the text information for Google login option
    Then Verify the text information for Phone login option
    Then Verify the text information for Email login option
    Then Verify the text information for Twitter login option
    Then Verify the user agreement texts

  Scenario: Checking for Notification of Email Not Being Sent on the Forgot Password Screen in the SuperLive Mobile Application
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When the Forgot password section is clicked
    When on the Forgot password page, the relevant email is entered
    When on the Forgot password page, the Continue button is clicked
    Then Verify that the Forgot password page displays a notification

  Scenario: Checking for an Invalid Email Notification During the Email Login Process on the Forgot Password Screen in the SuperLive Mobile Application
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When the Forgot password section is clicked
    When on the Forgot password page, an invalid email address is entered
    When on the Forgot password page, the Continue button is clicked
    Then Verify that the Forgot password page displays a notification for an invalid email

  Scenario: Email Login with Non-Registered Email in SuperLive Mobile Application
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When a non-registered email address is entered
    When Password information for the Email is entered
    When the Login button is clicked
    Then Verify the screen for the case of an incorrect email address on the login page

  Scenario: Email Login with Invalid Email in SuperLive Mobile Application
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When an invalid email address is entered
    When Password information for the Email is entered
    When the Login button is clicked
    Then Verify the screen for the case of an invalid email address on the login page

  Scenario: Email Login with Incorrect Password in SuperLive Mobile Application
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When an incorrect password is entered for an email address
    When the Login button is clicked
    Then Verify the screen for the case of an incorrect password on the login page

  Scenario: Verifying Incorrect SMS Code Entry for Phone Login in SuperLive Mobile Application
    When Notification permission is granted
    When the Phone login button is clicked
    When the Select Country Code button is clicked
    When the relevant phone country code is searched
    When the relevant phone country code is selected
    When the relevant phone number is entered
    When the Continue-Verify button is clicked
    When the relevant phone number is verified
    When an incorrect code is entered of the SMS code
    When the Continue-Verify button is clicked
    Then Verify warning messages indicating that the SMS code was entered incorrectly