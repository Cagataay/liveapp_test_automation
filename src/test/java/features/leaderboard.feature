@leaderboard
Feature:SuperLive Mobile App All LeaderBoard Operations

  Scenario: Navigating to User Profile in Streamers Tab from Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 24 Hours tab is selected
    When the first user in the list is clicked
    Then Verify that the profile of the relevant user is accessed

  Scenario: Navigating to User Profile in Streamers Tab from Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 7 Days tab is selected
    When the first user in the list is clicked
    Then Verify that the profile of the relevant user is accessed

  Scenario: Navigating to User Profile in Streamers Tab from Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the All Time tab is selected
    When the first user in the list is clicked
    Then Verify that the profile of the relevant user is accessed

  Scenario: Navigating to User Profile in Supporters Tab from Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 24 Hours tab is selected
    When the first user in the list is clicked
    Then Verify that the profile of the relevant user is accessed

  Scenario: Navigating to User Profile in Supporters Tab from Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 7 Days tab is selected
    When the first user in the list is clicked
    Then Verify that the profile of the relevant user is accessed

  Scenario: Navigating to User Profile in Supporters Tab from Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the All Time tab is selected
    When the first user in the list is clicked
    Then Verify that the profile of the relevant user is accessed

  Scenario: Navigating to the First Family in the Families Tab of the Leaderboard in SuperLive Mobile Application as an Anonymous User
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Families tab is selected
    When the first family in the list is clicked
    Then Verify that the relevant user is directed to the login

  Scenario: An Anonymous User Following the Top User in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 24 Hours tab is selected
    When the follow button of the top user in the list is clicked
    Then Verify that the relevant user is directed to the login

  Scenario: An Anonymous User Following the Top User in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 7 Days tab is selected
    When the follow button of the top user in the list is clicked
    Then Verify that the relevant user is directed to the login

  Scenario: An Anonymous User Following the Top User in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the All Time tab is selected
    When the follow button of the top user in the list is clicked
    Then Verify that the relevant user is directed to the login

  Scenario: An Anonymous User Following the Top User in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 24 Hours tab is selected
    When the follow button of the top user in the list is clicked
    Then Verify that the relevant user is directed to the login

  Scenario: An Anonymous User Following the Top User in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 7 Days tab is selected
    When the follow button of the top user in the list is clicked
    Then Verify that the relevant user is directed to the login

  Scenario: An Anonymous User Following the Top User in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the All Time tab is selected
    When the follow button of the top user in the list is clicked
    Then Verify that the relevant user is directed to the login

  Scenario: Clicking the Follow Button for the Top User in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 24 Hours tab is selected
    When the follow button of the top user in the list is clicked
    When the first user in the list is clicked
    Then Verify the follow status of the relevant user

  Scenario: Clicking the Follow Button for the Top User in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 7 Days tab is selected
    When the follow button of the top user in the list is clicked
    When the first user in the list is clicked
    Then Verify the follow status of the relevant user

  Scenario: Clicking the Follow Button for the Top User in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the All Time tab is selected
    When the follow button of the top user in the list is clicked
    When the first user in the list is clicked
    Then Verify the follow status of the relevant user

  Scenario: Clicking the Follow Button for the Top User in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 24 Hours tab is selected
    When the follow button of the top user in the list is clicked
    When the first user in the list is clicked
    Then Verify the follow status of the relevant user

  Scenario: Clicking the Follow Button for the Top User in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 7 Days tab is selected
    When the follow button of the top user in the list is clicked
    When the first user in the list is clicked
    Then Verify the follow status of the relevant user

  Scenario: Clicking the Follow Button for the Top User in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the All Time tab is selected
    When the follow button of the top user in the list is clicked
    When the first user in the list is clicked
    Then Verify the follow status of the relevant user

  Scenario: Scrolling in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 24 Hours tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the Last 7 Days tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Streamers Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Streamers tab is selected
    When the All Time tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 24 Hours
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 24 Hours tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the Last 7 Days tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Supporters Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Supporters tab is selected
    When the All Time tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Families Tab of the Leaderboard in SuperLive Mobile Application, Ranked in Month Contest
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Families tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Families Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Families tab is selected
    When the Last 7 Days tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Scrolling in the Families Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Families tab is selected
    When the All Time tab is selected
    When the page is scrolled down
    When the page is scrolled up and refreshed
    Then Verify that the refresh indicator is displayed

  Scenario: Clicking the Follow Button for the Top User in the Families Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the Last 7 Days
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Families tab is selected
    When the Last 7 Days tab is selected
    When the first family in the list is clicked
    Then Verify that the user is directed to the family page

  Scenario: Clicking the Follow Button for the Top User in the Families Tab of the Leaderboard in SuperLive Mobile Application, Ranked in the All Time
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When the Leaderboard tab is clicked
    When the Families tab is selected
    When the All Time tab is selected
    When the first family in the list is clicked
    Then Verify that the user is directed to the family page

  Scenario: Using the Country Selection Section in the Leaderboard of SuperLive Mobile Application
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Country selection button is clicked
    When the relevant country is searched in the Search section
    When the searched relevant country is selected
    When the Save button in the Country selection section is clicked
    Then Verify the selected country information

  Scenario: Checking Family System Information in the Families Option of the Leaderboard in SuperLive Mobile Application
    When Notification permission is granted
    When the Login overlay is closed
    When the Leaderboard tab is clicked
    When the Families tab is selected
    When the family LeaderBoard Info button is clicked
    Then Verify the family LeaderBoard Info details