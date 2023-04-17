@admin_create_student @emin @regression
Feature: US25_creating_student_(admin)

  Background:
    When user login as Admin
    And user clicks the menu button
    And user clicks the Student Management on the menu

  @admin_create_student_positive @smoke
  Scenario: TC01_create_student_as_admin_(Positive Test)
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


  @required_text_verification
  Scenario Outline: TC02_"<textBoxName>"required_text_verification
    And user enters the valid "<name>" value in the name textbox
    And user enters the valid "<surname>" value in the surname textbox
    And user enters the valid "<birth_place>" value in the Birth Place
    And user enters the valid "<email>" value in the email textbox
    And user enters the valid "<phone>" value in the phone textbox
    And user enters the valid "<date_of_birth>" value in the Date Of Birth
    And user enters the valid "<ssn>" value in the ssn textbox
    And user enters the valid "<username>" value in the And user Name textbox
    And user enters the father name "<father_name>" in the father name text box
    And user enters the mother name "<mother_name>" in the mother name text box
    And user enters the valid "<password>" value in the Password textbox
    And user clicks the create student submit button
    Examples:
      | name | surname | birth_place | email              | phone        | date_of_birth | ssn         | username | father_name | mother_name | password | textBoxName   |
      |      | Z       | Ankara      | eminzeee@gmail.com | 156-897-5641 | 12122000      | 127-64-7894 | eminz123 | Ali         | Veli        | 12345678 | name          |
      | Emin |         | Ankara      | eminzeee@gmail.com | 156-897-5641 | 12122000      | 127-64-7894 | eminz123 | Ali         | Veli        | 12345678 | surname       |
      | Emin | Z       |             | eminzeee@gmail.com | 156-897-5641 | 12122000      | 127-64-7894 | eminz123 | Ali         | Veli        | 12345678 | birth_place   |
      | Emin | Z       | Ankara      |                    | 156-897-5641 | 12122000      | 127-64-7894 | eminz123 | Ali         | Veli        | 12345678 | email         |
      | Emin | Z       | Ankara      | eminzeee@gmail.com |              | 12122000      | 127-64-7894 | eminz123 | Ali         | Veli        | 12345678 | phone         |
      | Emin | Z       | Ankara      | eminzeee@gmail.com | 156-897-5641 |               | 127-64-7894 | eminz123 | Ali         | Veli        | 12345678 | date_of_birth |
      | Emin | Z       | Ankara      | eminzeee@gmail.com | 156-897-5641 | 12122000      |             | eminz123 | Ali         | Veli        | 12345678 | ssn           |
      | Emin | Z       | Ankara      | eminzeee@gmail.com | 156-897-5641 | 12122000      |             |          | Ali         | Veli        | 12345678 | username      |
      | Emin | Z       | Ankara      | eminzeee@gmail.com | 156-897-5641 | 12122000      |             | eminz123 |             | Veli        | 12345678 | father_name   |
      | Emin | Z       | Ankara      | eminzeee@gmail.com | 156-897-5641 | 12122000      |             | eminz123 | Ali         |             | 12345678 | mother_name   |
      | Emin | Z       | Ankara      | eminzeee@gmail.com | 156-897-5641 | 12122000      |             | eminz123 | Ali         | Veli        |          | password      |


  @admin_create_student_advisor_teacher_blank
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

    #!!!Buraya gender ile ilgili ayni TC'yi yaz!!! Vice Dean icinde yap

  @admin_create_student_automatically_generated_student_number_verification
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


  @admin_create_student_invalid_email_input_verification
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


  @admin_create_student_invalid_phone_input_verification
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


  @admin_create_student_phone_min_character_verification
  Scenario: TC17_phone_min_character_verification
    And user enters the phone in the "123-123-123" text box
    Then user verifies that the warning "Minimum 12 character (XXX-XXX-XXXX)" text under phone text box is visible


  @admin_create_student_phone_max_character_verification
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


  @admin_create_student_date_of_birth_future_date_verification
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


  @admin_create_student_date_of_birth_current_date_verification
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


  @admin_create_student_invalid_ssn_input_verification
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

  @admin_create_student_ssn_min_character_verification
  Scenario: TC17_phone_min_character_verification
    And user enters the ssn in the "123-12-123" text box
    Then user verifies that the warning "Minimum 11 character (XXX-XX-XXXX)" text under ssn text box is visible


  @admin_create_student_ssn_max_character_verification
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


  @admin_create_student_password_min_character_verification
  Scenario: TC17_phone_min_character_verification
    And user enters the "Emin.12" in the password text box
    Then user verifies that the warning "Minimum 8 character" text under password text box is visible


  @admin_create_student_automatically_generated_student_number_uniqueness_verification
  Scenario: TC17_automatically_generated_student_number_uniqueness_verification
    When user clicks the last page button in the pagination
    And user scrolls the page until sees the student list title
    Then user verifies that all the student numbers are unique in the student list
    