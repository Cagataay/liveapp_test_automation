@message
  Feature: Check inbox and messages page
    Scenario: Check inbox page elements
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      Then check inbox elements

    Scenario: Inbox message pin and mark as read actions
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      Then pin and unpin inbox message
      Then mark as unread and read the message

    Scenario: Check superlive accounts in inbox
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When check superlive official account
      Then check moderation account
      Then check support account
      And send message to support account
      Then scroll inbox page

    Scenario: Check chat page buttons
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      Then check private call buttons
      Then check last seen
      Then check profile photo and user name
      Then check user option button

    Scenario: Check user option overlay
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When click user option button
      Then check the buttons text
      Then click view profile button and back to chat page
      Then click user option button
      And click mute and unmute buttons

    Scenario: Send text message to user and check
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When send text message to user
      Then copy text message
      And check message date and seen info

    Scenario: Send photo to user and check
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      Then send photo message to user
      And check photo message info
      And check photo details

    Scenario: Send premium photo to user and check
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      Then send premium photo to user
      And check premium photo info

    Scenario: Send video to user and check
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When send video to user
      Then check video info in chat
      And check video details

    Scenario: Send premium video to user and check
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When send premium video to user
      Then check premium video info in chat

    Scenario: Send gift to user and check
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      Then send gift to user
      And check gift message info

    Scenario: Send audio message to user and check
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      Then send audio message to user
      And play audio message
      And check audio message info

    Scenario: Check gift overlay in chat
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When open gift overlay in chat
      Then check gift overlay elements
      Then click buy coins button
      Then close payment popup
      And scroll message page

    Scenario: Check badges in inbox
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      Then check user level badge
      Then check user top badge
      Then check user vip badge

    Scenario: Swipe in the gift overlay
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When open gift overlay in chat
      Then swipe right in gift overlay

    Scenario: Check don't miss the chat popup
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When click seen button in chat
      Then check seen popup elements and texts
      And click be a VIP button
      Then close payment popup
      When click seen button in chat
      Then click cancel button in popup

    Scenario: Check media screen
      When Notification permission is granted
      When the Email login button is clicked
      When the Email login button is clicked
      When Email information is entered
      When Password information for the Email is entered
      When the Login button is clicked
      When go to inbox page
      When go to chat page from inbox
      When go to media screen from chat
      Then check media screen elements
      Then check media screen texts
      And type media message and send








