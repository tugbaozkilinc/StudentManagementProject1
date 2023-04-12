@vice_dean_create_student
Feature: US015_creating_student_(vice_dean)

  Background:
    When user login as Vice Dean
    And user clicks the menu button
    And user clicks the Student Management on the menu

  @vice_dean_create_student_positive
  Scenario: TC01_create_student_as_vice_dean_(Positive Test)
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the student is created successfully
    When user closes the application

  @vice_dean_create_student_negative_advisor_teacher_blank
  Scenario: TC02_advisor_teacher_cannot_be_left_blank
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "Please select advisor teacher"
    When user closes the application

  @vice_dean_create_student_negative_name_blank
  Scenario: TC03_name_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under name text box is visible
    When user closes the application


  @vice_dean_create_student_negative_surname_blank
  Scenario: TC04_surname_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under surname text box is visible
    When user closes the application


  @vice_dean_create_student_negative_birth_place_blank
  Scenario: TC05_birth_place_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under birth place text box is visible
    When user closes the application

  @vice_dean_create_student_negative_email_blank
  Scenario: TC06_email_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under email text box is visible
    When user closes the application


  @vice_dean_create_student_negative_phone_blank
  Scenario: TC07_phone_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under phone text box is visible
    When user closes the application


  @vice_dean_create_student_negative_date_of_birth_blank
  Scenario: TC08_date_of_birth_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under date of birth text box is visible
    When user closes the application


  @vice_dean_create_student_negative_ssn_blank
  Scenario: TC09_ssn_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under ssn text box is visible
    When user closes the application


  @vice_dean_create_student_negative_username_blank
  Scenario: TC010_username_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under username text box is visible
    When user closes the application

  @vice_dean_create_student_negative_father_name_blank
  Scenario: TC011_father_name_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under father name text box is visible
    When user closes the application

  @vice_dean_create_student_negative_mother_name_blank
  Scenario: TC012_mother_name_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the required text under mother name text box is visible
    When user closes the application

  @vice_dean_create_student_negative_password_blank
  Scenario: TC013_password_cannot_be_left_blank
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user clicks the create student submit button
    Then user verifies that the required text under password text box is visible
    When user closes the application





