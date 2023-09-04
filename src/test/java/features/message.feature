@message
  Feature: Check inbox and messages page
    Scenario: Check inbox page elements
      When go to inbox page
      Then check inbox page title
      Then check inbox online status
      Then check inbox profile picture
      Then check inbox livestream button
      Then check user level badge
      Then check inbox timestamp

    Scenario: Check superlive accounts in inbox
      When check superlive official account
      Then check moderation account
      Then check support account
      Then scroll inbox page

    Scenario: Check chat page buttons
      When go to chat page from inbox
      Then check private call buttons
      Then check last seen
      Then check profile photo and user name
      Then check user option button

    Scenario: Check user option overlay
      When click user option button
      Then check the buttons text
      Then click view profile button and back to chat page

    Scenario: Send message to user
      When send text message to user




