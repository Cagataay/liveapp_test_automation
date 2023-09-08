@signup
Feature:SuperLive Mobile App All Signup Operations

  Scenario:SuperLive Mobile Application Email Signup Process
    When Notification permission is granted
    When the Email login button is clicked
    When the Email signup button is clicked
    When the Email address to be registered is entered
    When the password for the registered email address is entered
    When the Signup continue button is clicked
    When the username information is entered
    When the Continue button is clicked
    When the date of birth is selected
    When the Continue button is clicked
    When the gender information is selected
    When the Continue button is clicked
    When the user's profile photo is added
    When the Continue button is clicked
    Then Verify that access to the Live screen is achieved

  Scenario:SuperLive Mobile Application Google Signup Process
    When Notification permission is granted
    When the Google login button is clicked
    When the relevant Google account is selected
    When the username information is entered
    When the Continue button is clicked
    When the date of birth is selected
    When the Continue button is clicked
    When the gender information is selected
    When the Continue button is clicked
    When the user's profile photo is added
    When the Continue button is clicked
    Then Verify that access to the Live screen is achieved
    Then Verify that access to the Live screen is achieved

  Scenario:SuperLive Mobile Application Phone Signup Process
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
    When the username information is entered
    When the Continue button is clicked
    When the date of birth is selected
    When the Continue button is clicked
    When the gender information is selected
    When the Continue button is clicked
    When the user's profile photo is added
    When the Continue button is clicked
    Then Verify that access to the Live screen is achieved

  Scenario:SuperLive Mobile Application Email Signup Process - Password Mismatch Case
    When Notification permission is granted
    When the Email login button is clicked
    When the Email signup button is clicked
    When the Email address to be registered is entered
    When an invalid password is entered for the registered email address
    When the Signup continue button is clicked
    Then Verify the notification message indicating password mismatch

  Scenario:SuperLive Mobile Application Email Signup Process - Previously Registered Email
    When Notification permission is granted
    When the Email login button is clicked
    When the Email signup button is clicked
    When the previously registered email address is entered
    When the password for the registered email address is entered
    When the Signup continue button is clicked
    Then Verify the notification message indicating that the email has been previously registered

  Scenario:Accessing Privacy Policy Screen During Signup Process in SuperLive Mobile Application
    When Notification permission is granted
    When the Email login button is clicked
    When the Email signup button is clicked
    When T&C and Privacy Policy option is clicked
    When the Privacy Policy option is accessed
    When returning from the T&C and Privacy Policy page
    When the Terms of Service option is accessed
    When returning from the T&C and Privacy Policy page
    Then Verify the T&C and Privacy Policy page