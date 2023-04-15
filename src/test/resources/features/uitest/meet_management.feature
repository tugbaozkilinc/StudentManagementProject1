@MeetManagement
Feature: US19 Teacher should be able to add the meet

  Scenario: TC01_1_Meet_Management
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User sees that the Meet Management page is displayed
    Then User sees that the Add Meet section is displayed on the page