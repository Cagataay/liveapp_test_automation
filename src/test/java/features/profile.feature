@profile
  Feature: Superlive App Profile Page
    Scenario: Check Non-Login User Profile Page
      When Notification permission is granted
      When Close login overlay
      When Go to profile page
      Then Check non-login image
      Then Check non-login text
      Then Check login button

    @profilePage
    Scenario: Check User Profile Page
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      When Right swipe header image
      Then Check profile header image
      Then Check profile edit button
      Then Check profile share button
      Then Check profile preview button
      Then Check profile image
      Then Check user location container
      Then Check user shared id
      Then Check user level
      Then Check username
      Then Check user follower
      Then Check user following
      Then Check user earned diamonds
      Then Check user sent coins
      Then Check user about text
      Then Check family button
      Then Check start stream button
      When Scroll profile page
      Then Check profile coin purchase button
      Then Check profile vip store button
      Then Check profile gold vip button
      Then Check profile user level button
      Then Check profile most sent gifts button
      Then Check profile agency button
      Then Check profile income button
      Then Check profile cash out button
      Then Check profile linked account button
      Then Check profile item bag button
      Then Check profile settings button

    @bronzeVip
    Scenario: Check Bronze VIP User Profile Page
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      Then Check bronze vip badge

    @silverVip
    Scenario: Check Silver VIP User Profile Page
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      Then Check silver vip badge

    @goldVip
    Scenario: Check Gold VIP User Profile Page
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      Then Check gold vip badge
      Then Check gold vip lion image
      Then Check gold vip overlay line

    @checkTopBadge
    Scenario: Check Top-Badge in SuperLive Mobile App
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      Then Check top badge

    @profileEdit
    Scenario: Check Profile Edit Page
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      When Get username
      When Get user biography
      When Get user shared id
      When Click profile edit button
      Then Check username in profile edit
      Then Check user biography in profile edit
      Then Check user shared id in profile edit

    @changeUserName
    Scenario: Change Username in SuperLive Mobile App
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      When Click profile edit button
      When Change username
      When Click save button and back to profile page
      Then Check username changing

    @changeUserBiography
    Scenario: Change Biography in SuperLive Mobile App
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When Go to profile page
      When Click profile edit button
      When Change user biography
      When Click save button and back to profile page
      Then Check biography changing