@deanManagementAPI
Feature: Post Request Dean


  @createDeanAPI
  Scenario: TC01_Post_Dean_Api
    Given user sends post request for Dean
    Then user gets the dean post request response and assert "Dean Saved" and "CREATED"

  @createDeanDateOfBirthTest
  Scenario Outline: TC02_DateOfBirth_Api
    Given user sends a post request "<DateOfBirth>" the DateOfBirth field
    Then user gets the dean post request response and assert message "<message>" DateOfBirth
    Examples:
      | DateOfBirth | message                    |
      | 2200-11-11  | must be a past date        |
      |             | Please enter your birthday |


  @createDeanPasswordTest
  Scenario Outline: TC03_Password_Api
    Given user sends a post request "<password>" the password field
    Then user gets the dean post request response and assert message "Please enter your password as at least 8 characters" password
    Examples:
      | password |
      | 1234aaa  |
      |          |
      | #######  |


  @createDeanPhoneTest
  Scenario Outline: TC04_Phone_Api
    Given user sends a post request "<phone>" the phone field
    Then user gets the dean post request response and assert message "Please enter valid phone number"  or "Phone number should be exact 12 characters" SSN
    Examples:
      | phone         |
      | 123456789101  |
      | aaa-bbb-cccc  |
      | 321-bbb-21ab  |
      | 321-276-21690 |
      | 321-276-218   |
      |               |


  @createDeanSSNTest
  Scenario Outline: TC05_SSN_Api
    Given user sends a post request "<SSN>" the SSN field
    Then user gets the dean post request response and assert message "Please enter valid SSN number" SSN
    Examples:
      | SSN          |
      | 123456789101 |
      | aaa-bb-cccc  |
      | 321-bb-21ab  |
      |              |
      | 321-26-218   |






