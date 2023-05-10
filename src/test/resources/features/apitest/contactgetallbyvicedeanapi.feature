@vice_dean_message @api
Feature: Vice Dean Messages Visibility

  Scenario: Vice Dean should see all messages
    When user sends the POST request to send a message_US16
    And user sends the GET request to get the message by using email_US16
    Then user gets the response and do assertion to check if the sent message is visible to the vice dean_US16