Feature: US01_Register_Module

  @positive
  Scenario: TC01_User should be able to register (Positive Test)
    Given user clicks the register button
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    When user clicks the submit button
    Then user verifies that the registration is successful



