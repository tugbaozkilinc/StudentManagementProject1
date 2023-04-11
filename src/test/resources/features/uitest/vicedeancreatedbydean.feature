Feature: US06 Dean should be able to create vice dean account

  @TC01_vice_dean_created_by_dean
  Scenario: TC01 Creating vice dean account by dean(positive test)
    Given user login as Dean
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user verifies that vice dean is created by dean
    And user closes the application

  @TC02_vice_dean_created_by_dean
  Scenario: Verifying that the name input cannot be left blank
    Given user login as Dean
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user verifies that the required text under name text box is visible on vice dean management page
    And user closes the application

  @TC03_vice_dean_created_by_dean
  Scenario: Verifying that the surname input cannot be left blank
    Given user login as Dean
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user verifies that the required text under surname text box is visible on vice dean management page
    And user closes the application

  @TC04_vice_dean_created_by_dean
  Scenario: Verifying that the birth place input cannot be left blank
    Given user login as Dean
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user verifies that the required text under birth place text box is visible on vice dean management page
    And user closes the application

  @TC06_vice_dean_created_by_dean
  Scenario: Verifying that the date of birth input cannot be left blank
    Given user login as Dean
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user verifies that the required text under date of birth text box is visible on vice dean management page
    And user closes the application

















