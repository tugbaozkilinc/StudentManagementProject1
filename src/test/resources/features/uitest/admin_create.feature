Feature:Admin_Create

  @admin_created
  Scenario:TC_01 Admin account must be created
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the submit button
    Then user verifies that the creation is succesfull
    And user closes the application











