@addDeanAsAdmin
Feature: Admin Management Module

  Background:
    When user login as Admin
    And user clicks the Menu button
    And user clicks the Dean Management button on the menu


  @positiveAddDeanAsAdmin @smoke
  Scenario:TC01_Add_Dean_As_Admin

    And user enters the valid value in the name textbox on the Dean Management page
    And user enters the valid value in the surname textbox on the Dean Management page
    And user enters the valid value in the birth place textbox on the Dean Management page
    And user selects a gender on the Dean Management page
    And user enters the valid value in the date of birth on the Dean Management page
    And user enters the valid value in the phone textbox on the Dean Management page
    And user enters the valid value in the SSN textbox on the Dean Management page
    And user enters the valid value username textbox on the Dean Management page
    And user enters the valid value in the password textbox on the Dean Management page
    Given user clicks the submit button on the Dean Management page
    Then user verifies "Dean Saved" alert message

  @leavingTheFieldBlankOnDeanMan
  Scenario Outline:TC02_TC03_TC04_TC05_TC06_TC07_TC08_TC09_Check_Empty_Fields

    And user enters the "<name>" in the name textbox on the Dean Management page
    And user enters the "<surname>" in the surname textbox on the Dean Management page
    And user enters the "<birth place>" in the birth place textbox on the Dean Management page
    And user enters the "<phone>" in the phone textbox on the Dean Management page
    And user selects a gender
    And user enters the "<date of birth>" in the date of birth textbox on the Dean Management page
    And user enters the "<ssn>" in the ssn textbox on the Dean Management page
    And user enters the "<username>" in the username textbox on the Dean Management page
    And user enters the "<password>" in the password textbox on the Dean Management page
    And user clicks the submit button on the Dean Management page
    Then user verifies "Required" message

    Examples:
      | name | surname | birth place | phone        | date of birth | ssn         | username    | password  |
      |      | Smith   | Miami       | 766-565-7654 | 12121989      | 756-45-5465 | WillSmith01 | pass123*! |
      | Will |         | Miami       | 766-565-7654 | 12121989      | 756-45-5465 | WillSmith01 | pass123*! |
      | Will | Smith   |             | 766-565-7654 | 12121989      | 756-45-5465 | WillSmith01 | pass123*! |
      | Will | Smith   | Miami       |              | 12121989      | 756-45-5465 | WillSmith01 | pass123*! |
      | Will | Smith   | Miami       | 766-565-7654 |               | 756-45-5465 | WillSmith01 | pass123*! |
      | Will | Smith   | Miami       | 766-565-7654 | 12121989      |             | WillSmith01 | pass123*! |
      | Will | Smith   | Miami       | 766-565-7654 | 12121989      | 756-45-5465 |             | pass123*! |
      | Will | Smith   | Miami       | 766-565-7654 | 12121989      | 756-45-5465 | WillSmith01 |           |


  @phoneNumberLessThan12charOnDeanMan
  Scenario Outline:TC10_Invalid_Phone_LessThan12char

    And user enters the valid value in the name textbox on the Dean Management page
    And user enters the valid value in the surname textbox on the Dean Management page
    And user enters the valid value in the birth place textbox on the Dean Management page
    And user selects a gender on the Dean Management page
    And user enters the valid value in the date of birth on the Dean Management page
    And user enters the "<invalid value>" in the phone textbox on the Dean Management page
    And user enters the valid value in the SSN textbox on the Dean Management page
    And user enters the valid value username textbox on the Dean Management page
    And user enters the valid value in the password textbox on the Dean Management page
    And user clicks the submit button on the Dean Management page
    Then user verifies the "Minimum 12 character (XXX-XXX-XXXX)" message under the phone text box on the Dean Management page
    Examples:
      | invalid value |
      | abcdefghijk   |
      | 12345678901   |
      | abcdefgh123   |
      | asd-asd-aaa   |


  @phoneNumberMoreThan12charAndInvalidValueOnDeanMan
  Scenario Outline:TC11_TC12_Invalid_Phone_MoreThan12char_AndInvalidValue

    And user enters the valid value in the name textbox on the Dean Management page
    And user enters the valid value in the surname textbox on the Dean Management page
    And user enters the valid value in the birth place textbox on the Dean Management page
    And user selects a gender on the Dean Management page
    And user enters the valid value in the date of birth on the Dean Management page
    And user enters the "<invalid value>" in the phone textbox on the Dean Management page
    And user enters the valid value in the SSN textbox on the Dean Management page
    And user enters the valid value username textbox on the Dean Management page
    And user enters the valid value in the password textbox on the Dean Management page
    And user clicks the submit button on the Dean Management page
    Then user verifies "Phone number should be exact 12 characters" or "Please enter valid phone number" the alert message on the Dean Management page
    Examples:
      | invalid value |
      | abcdefghijklm |
      | 1234567890123 |
      | abcdefgh12345 |
      | asd-asd-aaaaa |
      | invalid phone |
      | abcdefghijkl  |
      | 123456789011  |
      | abcdefgh1234  |
      | abc-abc-abcd  |


  @invalidSSNOnDeanMan
  Scenario Outline:TC13_Invalid_SSN

    And user enters the valid value in the name textbox on the Dean Management page
    And user enters the valid value in the surname textbox on the Dean Management page
    And user enters the valid value in the birth place textbox on the Dean Management page
    And user selects a gender on the Dean Management page
    And user enters the valid value in the date of birth on the Dean Management page
    And user enters the valid value in the phone textbox on the Dean Management page
    And user enters the "<invalid value>" in the SSN textbox on the Dean Management page
    And user enters the valid value username textbox on the Dean Management page
    And user enters the valid value in the password textbox on the Dean Management page
    And user clicks the submit button on the Dean Management page
    Then user verifies the "Please enter valid SSN number" the alert message on the Dean Management page
    Examples:
      | invalid value |
      | abcdefghijklm |
      | abc-abc-aba   |
      | 92-723-1584   |
      | 1234-123-123  |
      | 123456789011  |
      | 7723-1-78345  |
      | #+#+#+#+#+#   |


  @passwordInvalidOnDeanMan
  Scenario: TC14_Invalid_Password_lessThan8Char

    And user enters the valid value in the name textbox on the Dean Management page
    And user enters the valid value in the surname textbox on the Dean Management page
    And user enters the valid value in the birth place textbox on the Dean Management page
    And user selects a gender on the Dean Management page
    And user enters the valid value in the date of birth on the Dean Management page
    And user enters the valid value in the phone textbox on the Dean Management page
    And user enters the valid value in the SSN textbox on the Dean Management page
    And user enters the valid value username textbox on the Dean Management page
    And user enters the "aa12345" in the password textbox on the Dean Management page
    And user clicks the submit button on the Dean Management page
    Then user verifies the "Minimum 8 character" message under the password text box on the Dean Management page

