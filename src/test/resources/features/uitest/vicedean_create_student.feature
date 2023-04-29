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


  @vice_dean_create_student_advisor_teacher_blank
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


  @vice_dean_create_student_name_blank
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
    Then user verifies that the warning "Required" text under name text box is visible


  @vice_dean_create_student_surname_blank
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
    Then user verifies that the warning "Required" text under surname text box is visible


  @vice_dean_create_student_birth_place_blank
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
    Then user verifies that the warning "Required" text under birth place text box is visible


  @vice_dean_create_student_email_blank
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
    Then user verifies that the warning "Required" text under email text box is visible


  @vice_dean_create_student_phone_blank
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
    Then user verifies that the warning "Required" text under phone text box is visible


  @vice_dean_create_student_date_of_birth_blank
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
    Then user verifies that the warning "Required" text under date of birth text box is visible


  @vice_dean_create_student_ssn_blank
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
    Then user verifies that the warning "Required" text under ssn text box is visible


  @vice_dean_create_student_username_blank
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
    Then user verifies that the warning "Required" text under username text box is visible


  @vice_dean_create_student_father_name_blank
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
    Then user verifies that the warning "Required" text under father name text box is visible


  @vice_dean_create_student_mother_name_blank
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
    Then user verifies that the warning "Required" text under mother name text box is visible


  @vice_dean_create_student_password_blank
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
    Then user verifies that the warning "Required" text under password text box is visible


  @vice_dean_create_student_automatically_generated_student_number_verification
  Scenario: TC14_automatically_generated_student_number_verification
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
    Then user verifies that the created student has an automatically generated student number


  @vice_dean_create_student_invalid_email_input_verification
  Scenario Outline: TC15_invalid_email_input_verification
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email "<email>" in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "Please enter valid email"


    Examples:
      | email             |
      | Abc.example.com   |
      | A@b@c@example.com |
      | emin z@gmail.com  |


  @vice_dean_create_student_invalid_phone_input_verification
  Scenario Outline: TC16_invalid_phone_input_verification
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the "<phone>" text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "Please enter valid phone number"


    Examples:
      | phone        |
      | abcdabcdabcd |
      | abc-abc-abab |
      | 12-123-12345 |
      | 1234-123-123 |
      | 123-12-12345 |
      | 123-1234-123 |
      | ?=)-?=)-..,, |


  @vice_dean_create_student_phone_min_character_verification
  Scenario: TC17_phone_min_character_verification
    And user enters the phone in the "123-123-123" text box
    Then user verifies that the warning "Minimum 12 character (XXX-XXX-XXXX)" text under phone text box is visible


  @vice_dean_create_student_phone_max_character_verification
  Scenario: TC18_phone_max_character_verification
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the "124-123-12345" in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "Phone number should be exact 12 characters"


  @vice_dean_create_student_date_of_birth_future_date_verification
  Scenario: TC19_date_of_birth_future_date_verification
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the future date in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "must be a past date"


  @vice_dean_create_student_date_of_birth_current_date_verification
  Scenario: TC20_date_of_birth_current_date_verification
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the current date in the date of birth text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "must be a past date"


  @vice_dean_create_student_invalid_ssn_input_verification
  Scenario Outline: TC21_invalid_ssn_input_verification
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the ssn in the "<ssn>" text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "Please enter valid SSN number"


    Examples:
      | ssn          |
      | abcdabcdabc  |
      | abc-abc-aba  |
      | 12-123-1234  |
      | 1234-123-123 |
      | 123-123-1234 |
      | 123-1-12345  |
      | ???-??-????  |

  @vice_dean_create_student_ssn_min_character_verification
  Scenario: TC17_phone_min_character_verification
    And user enters the ssn in the "123-12-123" text box
    Then user verifies that the warning "Minimum 11 character (XXX-XX-XXXX)" text under ssn text box is visible


  @vice_dean_create_student_ssn_max_character_verification
  Scenario: TC18_phone_max_character_verification
    And user selects the advisor teacher
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user enters the email in the email text box
    And user enters the phone in the phone text box
    And user selects a gender
    And user enters the date of birth in the date of birth text box
    And user enters the "558-554-5656" in the ssn text box
    And user enters the username in the username text box
    And user enters the father name in the father name text box
    And user enters the mother name in the mother name text box
    And user enters the password in the password text box
    And user clicks the create student submit button
    Then user verifies that the alert message says "Please enter valid SSN number"


  @vice_dean_create_student_password_min_character_verification
  Scenario: TC17_phone_min_character_verification
    And user enters the "Emin.12" in the password text box
    Then user verifies that the warning "Minimum 8 character" text under password text box is visible


  @vice_dean_create_student_automatically_generated_student_number_uniqueness_verification
  Scenario: TC17_automatically_generated_student_number_uniqueness_verification
    When user clicks the last page button in the pagination
    And user scrolls the page until sees the student list title
    Then user verifies that all the student numbers are unique in the student list
    







