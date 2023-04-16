@US19
Feature: US19 Teacher should be able to add the meet

  @TC01
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

  @TC02
  Scenario: TC02
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User choses the Student from the Choose Student dropdown
    And User enters the "Date" in the Date of Meet textbox
    And User enters the "start time" in the start time textbox
    And User enters the "stop time" in the start stop textbox
    And User enters the "description" in the Description textbox
    And User clicks the Submit button on the menu
    And User sees that the green confirmation "Meet saved successfully" text appeared on the page
    Then User sees that the created student is visible on the Meet List section on the page

  @TC03
  Scenario Outline: TC03
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User choses the "<Student>" from the Choose Student dropdown
    And User enters the "<Date>" in the Date of Meet textbox
    And User enters the "<start time>" in the start time textbox
    And User enters the "<stop time>" in the start stop textbox
    And User leaves blank in the "<Description>" textbox
    And User clicks the Submit button on the menu
    Then User sees that the the add meet not created
    Examples:
      | Student | Date       | start time | stop time | Description |
      |         | 01.06.2023 | 11.00      | 12.00     | good        |
      | Selcuk  |            | 11.00      | 12.00     | good        |
      | Selcuk  | 01.06.2023 |            | 12.00     | good        |
      | Selcuk  | 01.06.2023 | 11.00      |           | good        |
      | Selcuk  | 01.06.2023 | 11.00      | 12.00     |             |
      | Selcuk  | 01.06.2023 | 11.00      | 12.00     | good        |

  @TC04
  Scenario: TC04
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User choses the Student from the Choose Student dropdown
    And User enters the "Date" in the Date of Meet textbox
    And User enters the "start time" in the start time textbox
    And User leaves blank  in the stop time textbox
    And User enters the "Description" in the Description textbox
    And User clicks the Submit button on the menu
    Then User sees that the the add meet not created


  @US20

  Scenario: TC01
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User sees that the Meet Management page is displayed
    Then User sees that the Meet List section is displayed on the page

  Scenario: TC02

    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User sees that the Meet Management page is displayed
    And User sees that the Meet List section is displayed on the page
    And User click edit button of any meet in Meet List
    And User enter new Date in the Date box
    And User click Submit button
    Then User sees success saved message

  Scenario: TC03
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User click edit button of any meet in Meet List
    And User enter new start time in the start time box
    And User click Submit button
    Then User sees success saved message

  Scenario: TC04
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User click edit button of any meet in Meet List
    And User enter new stop time in the stop time box
    And User click Submit button
    Then User sees success saved message

  Scenario: TC05
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User click edit button of any meet in Meet List
    And User enters new Description in the Description
    And User click Submit button
    Then User sees success saved message

  Scenario: TC06
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User click delete button of any meet in Meet List
    Then User sees success saved message

  Scenario: TC07
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User click edit button of any meet in Meet List
    And User enter invalid new start time in the start time box
    And User click Submit button
    Then User sees that the the edit meet not created

  Scenario: TC08
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the "teacher username" in the username textbox
    And User enters the "teacher password" in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Meet Management button on the menu
    And User sees that the Meet Management page is displayed
    And User sees that the Meet List section is displayed on the page
    And User click edit button of any meet in Meet List
    And User enter invalid new Date in the Date box
    And User click Submit button
    Then User sees that the the edit meet not created

