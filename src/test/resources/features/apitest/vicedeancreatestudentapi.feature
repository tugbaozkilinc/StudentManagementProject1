@vice_dean_create_student_api
Feature: US015_creating_student_api_(vice_dean)

  @vice_dean_create_student_positive_api
  Scenario: TC01_create_student_as_vice_dean_api_(Positive Test)
    When user sends a POST request as vice dean to create a student
    Then user verifies that the student creation is successfull as vice dean

  @vice_dean_create_student_advisor_teacher_blank_api
  Scenario: TC02_advisor_teacher_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without advisor teacher
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "advisorTeacherId" key and "Please select advisor teacher" message

  @vice_dean_create_student_name_blank_api
  Scenario: TC03_name_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without name
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "name" key and "Please enter your name" message

  @vice_dean_create_student_surname_blank_api
  Scenario: TC04_surname_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without surname
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "surname" key and "Please enter your surname" message

  @vice_dean_create_student_birth_place_blank_api
  Scenario: TC05_birth_place_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without birth place
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "birthPlace" key and "Please enter your birth place" message

  @vice_dean_create_student_phone_number_blank_api
  Scenario: TC06_phone_number_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without phone number
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "phoneNumber" key and "Please enter your phone number" message

  @vice_dean_create_student_email_blank_api
  Scenario: TC07_email_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without email
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "email" key and "Please enter your email" message

  @vice_dean_create_student_gender_blank_api
  Scenario: TC08_gender_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without gender
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "gender" key and "Please enter your gander" message

  @vice_dean_create_student_birthDay_blank_api
  Scenario: TC09_birthDay_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without birth day
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "birthDay" key and "Please enter your birthday" message

  @vice_dean_create_student_ssn_blank_api
  Scenario: TC10_ssn_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without ssn
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "ssn" key and "must not be null" message

  @vice_dean_create_student_username_blank_api
  Scenario: TC11_username_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without username
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "username" key and "Please enter your  username" message

  @vice_dean_create_student_fatherName_blank_api
  Scenario: TC12_fatherName_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without father name
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "fatherName" key and "Please enter father name" message

  @vice_dean_create_student_motherName_blank_api
  Scenario: TC13_motherName_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without mother name
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "motherName" key and "Please enter mother name" message

  @vice_dean_create_student_password_blank_api
  Scenario: TC14_password_cannot_be_left_blank_api
    When user sends a POST request as vice dean to create a student without password
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "password" key and "Please enter your password" message

  @vice_dean_create_student_invalid_email_api
  Scenario Outline: TC15_invalid_email_api
    When user sends a POST request as vice dean to create a student with an invalid email "<email>"
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "email" key and "Please enter valid email" message

    Examples:
      | email             |
      | Abc.example.com   |
      | A@b@c@example.com |
      | emin z@gmail.com  |

  @vice_dean_create_student_invalid_phone_api
  Scenario Outline: TC16_invalid_phone_api
    When user sends a POST request as vice dean to create a student with an invalid phone "<phone>"
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "phone" key and "Please enter valid phone number" message

    Examples:
      | phone        |
      | abcdabcdabcd |
      | abc-abc-abab |
      | 12-123-12345 |
      | 1234-123-123 |
      | 123-12-12345 |
      | 123-1234-123 |
      | ?=)-?=)-..,, |


  @vice_dean_create_student_future_date_of_birth_api
  Scenario: TC17_future_date_of_birth_api
    When user sends a POST request as vice dean to create a student with a future date
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "birthDay" key and "must be a past date" message

  @vice_dean_create_student_current_date_of_birth_api
  Scenario: TC18_current_date_of_birth_api
    When user sends a POST request as vice dean to create a student with the current date
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "birthDay" key and "must be a past date" message

  @vice_dean_create_student_invalid_ssn_api
  Scenario Outline: TC19_invalid_ssn_api
    When user sends a POST request as vice dean to create a student with an invalid ssn "<ssn>"
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "ssn" key and "Please enter valid SSN number" message

    Examples:
      | ssn          |
      | abcdabcdabc  |
      | 12-123-1234  |
      | abc-abc-aba  |
      | 1234-123-123 |
      | 123-123-1234 |
      | 123-1-12345  |
      | ???-??-????  |
      | 123-12-123   |
      | 123-12-12311 |


  @vice_dean_create_student_invalid_password_api
  Scenario: TC20_invalid_password_api
    When user sends a POST request as vice dean to create a student with an invalid password
    Then user verifies the message is "Validation failed for object='studentRequest'. Error count: 1" for student creation POST request
    Then user verifies the status code is "400" for student creation POST request
    Then user verifies the validations part has the "password" key and "Please enter your password as at least 8 characters" message

