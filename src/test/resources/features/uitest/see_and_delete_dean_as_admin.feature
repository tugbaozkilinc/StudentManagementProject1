@seeAndDeleteDeanAsAdmin
Feature:Admin Management Edit Module

  Background:
    When user login as Admin
    And user clicks the Menu button
    And user clicks the Dean Management button on the menu



  @verifyDeanManagementHeader
  Scenario:TC01_Verify_Headers

    And user adds dean with valid values
    Then user verifies Name Surname header on Dean List
    Then user verifies Gender header on Dean List
    Then user verifies Phone Number header on Dean List
    Then user verifies Ssn header on Dean List
    Then user verifies user Name header on Dean List


  @editNameOnDeanMan
  Scenario:TC02_EditName_DeanMan

    And user selects last Dean from Dean List
    And user clicks Edit button on Dean Management Page
    And user edits name field on the Edit Dean Page
    And user selects a gender on the Edit Dean Page
    And user enters Dean's password on the Edit Dean Page
    And user clicks submit button on the Edit Dean Page
    Then user verifies "Dean updated Successful" alert message


  @editSurnameOnDeanMan
  Scenario:TC03_EditSurname_DeanMan

    And user selects last Dean from Dean List
    And user clicks Edit button on Dean Management Page
    And user edits surname field on the Edit Dean Page
    And user selects a gender on the Edit Dean Page
    And user enters Dean's password on the Edit Dean Page
    And user clicks submit button on the Edit Dean Page
    Then user verifies "Dean updated Successful" alert message


  @editBirthPlaceOnDeanMan
  Scenario:TC04_EditBirthPlace_DeanMan

    And user selects last Dean from Dean List
    And user clicks Edit button on Dean Management Page
    And user edits birth place field on the Edit Dean Page
    And user selects a gender on the Edit Dean Page
    And user enters Dean's password on the Edit Dean Page
    And user clicks submit button on the Edit Dean Page
    Then user verifies "Dean updated Successful" alert message



  @editPhoneOnDeanMan
  Scenario:TC05_EditPhone_DeanMan

    And user selects last Dean from Dean List
    And user clicks Edit button on Dean Management Page
    And user edits phone field on the Edit Dean Page
    And user selects a gender on the Edit Dean Page
    And user enters Dean's password on the Edit Dean Page
    And user clicks submit button on the Edit Dean Page
    Then user verifies "Dean updated Successful" alert message


  @editSSNOnDeanMan
  Scenario:TC06_EditSSN_DeanMan

    And user selects last Dean from Dean List
    And user clicks Edit button on Dean Management Page
    And user edits ssn field on the Edit Dean Page
    And user selects a gender on the Edit Dean Page
    And user enters Dean's password on the Edit Dean Page
    And user clicks submit button on the Edit Dean Page
    Then user verifies "Dean updated Successful" alert message


  @editUserNameOnDeanMan
  Scenario:TC07_EditUsername_DeanMan

    And user selects last Dean from Dean List
    And user clicks Edit button on Dean Management Page
    And user edits username field on the Edit Dean Page
    And user selects a gender on the Edit Dean Page
    And user enters Dean's password on the Edit Dean Page
    And user clicks submit button on the Edit Dean Page
    Then user verifies "Dean updated Successful" alert message






