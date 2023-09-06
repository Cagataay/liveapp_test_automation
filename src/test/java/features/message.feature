
  Feature: Check inbox and messages page
    Scenario: Check inbox page elements
      When go to inbox page
      Then check inbox elements

    Scenario: Inbox message pin and mark as read actions
      Then pin and unpin inbox message
      Then mark as unread and read the message

    Scenario: Check superlive accounts in inbox
      When check superlive official account
      Then check moderation account
      Then check support account
      And send message to support account
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

    Scenario: Send text message to user and check
      When send text message to user
      And check message date and seen info

    Scenario: Send photo to user and check
      Then send photo message to user
      And check photo message info

    Scenario: Send premium photo to user and check
      Then send premium photo to user
      And check premium photo info

    Scenario: Send gift to user and check
      Then send gift to user
      And check gift message info

    Scenario: Send audio message to user and check
      Then send audio message to user
      And play audio message
      And check audio message info

    @message
    Scenario: Check gift overlay in chat
      When open gift overlay in chat
      Then check gift overlay elements
      Then click buy coins button
      Then close payment popup
      And scroll message page







