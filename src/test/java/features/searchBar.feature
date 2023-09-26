@searchBar
Feature:SuperLive Mobile App Search Bar Operations

  Scenario: SuperLive Mobile Application Search Bar Process With Login Search by Name
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When click search bar button
    When write search bar something
    When show search result
    Then Check user layout
    When Close Search Bar
    When click Back Button
    Then Check Empty Discover Page

  Scenario: SuperLive Mobile Application Search Bar Process With Login Search by ID
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When click search bar button
    When write number search bar
    Then Check user layout
    When Close Search Bar
    When click Back Button
    Then Check Empty Discover Page


  Scenario: SuperLive Mobile Application Search Bar Process Follow and Unfollow
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When click search bar button
    When write number search bar
    When Found User and Follow
    Then Check Unfollow Button
    When same user unfollow
    Then Check Follow Button
    When Close Search Bar
    When click Back Button
    Then Check Empty Discover Page
  @1
  Scenario: SuperLive Mobile Application Search Bar Process With NonLogin Search
    When Notification permission is granted
    When Close login overlay
    When click search bar button
    When write search bar something
    When show search result
    When Found User and Follow
    When click canceled button on popup
    When Close Search Bar
    When click Back Button
    Then Check Empty Discover Page


  Scenario: SuperLive Mobile Application Search Bar Process Global User Search Turkish User
    When Notification permission is granted
    When the Email login button is clicked
    When the Email login button is clicked
    When Email information is entered
    When Password information for the Email is entered
    When the Login button is clicked
    When click search bar button
    When write nonglobal number search bar
    Then Check empty search view
    When Close Search Bar
    When click Back Button
    Then Check Empty Discover Page


