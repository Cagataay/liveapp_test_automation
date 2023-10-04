@followings
Feature:SuperLive Mobile App Followings Operations


  Scenario: SuperLive Mobile Application Followings Navigation Bar Nonlogin User
    When Notification permission is granted
    When Close login overlay
    When Click Followings Navbar
    Then Check followings login button


  Scenario: SuperLive Mobile Application Followings Navigation Bar Login User with Nonstream
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When click search bar button
    When write number search bar
    When Found User and Follow
    When Close Search Bar
    When click Back Button
    When Click Followings Navbar
    Then Check nonstream page


   Scenario: SuperLive Mobile Application Followings Navigation Bar Login User with Single Stream
     When Notification permission is granted
     When the Email login button is clicked
     When the Email login button is clicked
     When Email information is entered
     When Password information for the Email is entered
     When the Login button is clicked
     When Click Followings Navbar
     Then Check stream card


    Scenario: SuperLive Mobile Application Followings Navigation Bar Login User with 2 vs 2 PK
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Click Followings Navbar
      Then Check four person pk


  Scenario: SuperLive Mobile Application Followings Navigation Bar Login User with PK
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When Click Followings Navbar
    Then Check pk stream card


  Scenario: SuperLive Mobile Application Followings Navigation Bar Login User with MGS
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When Click Followings Navbar
    Then Check mgs stream card


  Scenario: SuperLive Mobile Application Followings Navigation Bar Login User with Premium Stream
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When Click Followings Navbar
    Then Check premium stream card

