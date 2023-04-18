Feature:Admin_Create


  @TC01_adminCreate_positive @smoke
  Scenario:TC01 Admin account must be created
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the admin is created successfully
    And user closes the application


  @TC02_name_blank
  Scenario:TC02 Leaving The Name Field Blank
    Given user login as Admin
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under name text box is visible
    And user closes the application


  @TC03_surname_blank
  Scenario:TC03_Leaving The Surname Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under surname text box is visible
    And user closes the application


  @TC04_birth_place
  Scenario:TC04 Leaving The Birth Place Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under birth place text box is visible
    And user closes the application


  @TC05_gender_blank
  Scenario:TC05 Leaving The Gender Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under gender radio button is visible
    And user closes the application


  @TC06_date_of_birth_blank
  Scenario:TC06_Leaving The Date Of Birth Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under data of birth text box is visible
    And user closes the application

  @TC07_phone_blank
  Scenario:TC07_Leaving The Phone Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under phone text box is visible
    And user closes the application

  @TC08_ssn_blank
  Scenario:TC08 Leaving The Ssn Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under ssn text box is visible
    And user closes the application

  @TC09_username_blank
  Scenario:TC09 Leaving The User Name Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the phone in the phone text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    Then user verifies that the required text under username text box is visible
    And user closes the application

  @TC10_password_blank
  Scenario:TC10 Leaving The Password Field Blank
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user clicks the create admin submit button
    Then user verifies that the required text under password text box is visible
    And user closes the application

  @TC11_enter_password_7_characters
  Scenario:TC11 enter password 7 characters
    Given user login as Admin
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And User enters password 7 characters in the password text box
    And user clicks the create admin submit button
    Then user verifies that the Minimum 8 character text under password text box is visible
    And user closes the application

  @TC12_name_space
  Scenario:TC12 name textbox should not only accept space characters
    Given user login as Admin
    And the user enters a space character in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks the create admin submit button
    And user closes the application














