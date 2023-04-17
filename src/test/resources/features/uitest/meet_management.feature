@US19
Feature: US19 Teacher should be able to add the meet

  Background:
    Given user login as Teacher
    And User clicks the Menuu button
    And User clicks the Meet Management button on the menu

  @TC01
  Scenario: TC01_1_Meet_Management
    And User sees that the Meet Management page is displayed
    Then User sees that the Add Meet section is displayed on the page

  @TC02
  Scenario: TC02
    And User choses the Student from the Choose Student dropdown
    And User enters the "Date" in the Date of Meet textbox
    And User enters the "start time" in the start time textbox
    And User enters the "stop time" in the start stop textbox
    And User enters the "description" in the Description textbox
    And User clicks the Submit button on the menu
    And User sees that the green confirmation "Meet saved successfully" text appeared on the page
    Then User sees that the created student is visible on the Meet List section on the page

  @Left_blank_TC03
  Scenario Outline: TC03 TC03_Verifying_that_"<field>"_cannot_be_left_blank
    And User choses the "<Student>" from the Choose Student dropdown
    And User enters the "<Date>" in the Date of Meet textbox
    And User enters the "<start time>" in the start time textbox
    And User enters the "<stop time>" in the start stop textbox
    And User leaves blank in the "<Description>" textbox
    And User clicks the Submit button
    Then user verifies that the red required "<field>" text is visible under the Final Exam textbox on the Add Student Info page
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
    And User choses the Student from the Choose Student dropdown
    And User enters the "Date" in the Date of Meet textbox
    And User enters the "start time" in the start time textbox
    And User leaves blank in the stop time textbox
    And User enters the "Description" in the Description textbox
    And User clicks the Submit button on the menu
    Then User sees that the the add meet not created


  @US20_TC01
  Scenario: TC01
    And User sees that the Meet Management page is displayed
    Then User sees that the Meet List section is displayed on the page


  @US20_TC03
  Scenario: TC03
    And User click edit button of any meet in Meet List
    And User enter new start time in the start time box
    And User clicks the Submit button
    Then User sees success saved message


  @US20_TC04
  Scenario: TC04
    And User click edit button of any meet in Meet List
    And User enter new stop time in the stop time box
    And User clicks the Submit button
    Then User sees success saved message


  @US20_TC05
  Scenario: TC05
    And User click edit button of any meet in Meet List
    And User enters new Description in the Description
    And User clicks the Submit button
    Then User sees success saved message


  @US20_TC06
  Scenario: TC06
    And User click delete button of any meet in Meet List
    Then User sees success saved message


  @US20_TC07
  Scenario: TC07
    And User click edit button of any meet in Meet List
    And User enter invalid new start time in the start time box
    And User clicks the Submit button
    Then User sees that the the edit meet not created


  @US20_TC08
  Scenario: TC08
    And User sees that the Meet List section is displayed on the page
    And User click edit button of any meet in Meet List
    And User enter invalid new Date in the Date box
    And User clicks the Submit button
    Then User sees that the the edit meet not created

