@vice_dean_create_student_api
Feature: US015_creating_student_api_(vice_dean)

  @vice_dean_create_student_positive_api
  Scenario: TC01_create_student_as_vice_dean_api_(Positive Test)
    When user sends a POST request as vice dean to create a student
    Then user verifies the result of student creation as vice dean

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

















