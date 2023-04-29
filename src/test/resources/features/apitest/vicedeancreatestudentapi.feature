#@studentManagementAPI
#Feature: POST Request ViceDean
#
#  @createStudentAPI
#  Scenario: TC01_Vice_Dean_Create_Student_Positive_Api
#    Given user sends post request to create student as Vice Dean
#    Then user gets the vice dean create student POST request response and assert "Student saved Successfully" message
#
#  @createStudentWithoutAdvisorTeacherAPI
#  Scenario: TC02_Vice_Dean_Create_Student_With_Blank_AdvisorTeacher_Api
#    Given user sends a post request as vice dean to create student without "advisorTeacherId"
#    Then user gets the vice dean create student POST request response and assert message "Please select advisor teacher" for advisorTeacherId
#
#  @createStudentWithoutNameAPI
#  Scenario: TC03_Vice_Dean_Create_Student_With_Blank_Name_Api
#    Given user sends a post request as vice dean to create student without "name"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your name" for name
#
#  @createStudentWithoutSurnameAPI
#  Scenario: TC04_Vice_Dean_Create_Student_With_Blank_Surname_Api
#    Given user sends a post request as vice dean to create student without "surname"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your surname" for surname
#
#  @createStudentWithoutBirthPlaceAPI
#  Scenario: TC05_Vice_Dean_Create_Student_With_Blank_BirthPlace_Api
#    Given user sends a post request as vice dean to create student without "birthPlace"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your birth place" for birthPlace
#
#  @createStudentWithoutEmailAPI
#  Scenario: TC06_Vice_Dean_Create_Student_With_Blank_Email_Api
#    Given user sends a post request as vice dean to create student without "email"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your email" for email
#
#  @createStudentWithoutEmailAPI
#  Scenario: TC07_Vice_Dean_Create_Student_With_Blank_PhoneNumber_Api
#    Given user sends a post request as vice dean to create student without "phoneNumber"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your phone number" for phone number
#
#  @createStudentWithoutGenderAPI
#  Scenario: TC08_Vice_Dean_Create_Student_With_Blank_Gender_Api
#    Given user sends a post request as vice dean to create student without "gender"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your gander" for gender
#
#  @createStudentWithoutGenderAPI
#  Scenario: TC09_Vice_Dean_Create_Student_With_Blank_BirthDay_Api
#    Given user sends a post request as vice dean to create student without "birthDay"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your birthday" for birthday
#
#  @createStudentWithoutGenderAPI
#  Scenario: TC10_Vice_Dean_Create_Student_With_Blank_Ssn_Api
#    Given user sends a post request as vice dean to create student without "ssn"
#    Then user gets the vice dean create student POST request response and assert message "must not be null" for ssn
#
#  @createStudentWithoutGenderAPI
#  Scenario: TC11_Vice_Dean_Create_Student_With_Blank_Username_Api
#    Given user sends a post request as vice dean to create student without "username"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your  username" for username
#
#  @createStudentWithoutGenderAPI
#  Scenario: TC12_Vice_Dean_Create_Student_With_Blank_FatherName_Api
#    Given user sends a post request as vice dean to create student without "fatherName"
#    Then user gets the vice dean create student POST request response and assert message "Please enter father name" for father name
#
#  @createStudentWithoutGenderAPI
#  Scenario: TC13_Vice_Dean_Create_Student_With_Blank_MotherName_Api
#    Given user sends a post request as vice dean to create student without "motherName"
#    Then user gets the vice dean create student POST request response and assert message "Please enter mother name" for mother name
#
#  @createStudentWithoutGenderAPI
#  Scenario: TC14_Vice_Dean_Create_Student_With_Blank_Password_Api
#    Given user sends a post request as vice dean to create student without "password"
#    Then user gets the vice dean create student POST request response and assert message "Please enter your password" for password
#
#  @createStudentWithInvalidEmailAPI
#  Scenario Outline: TC15_Vice_Dean_Create_Student_With_Invalid_Email_Api
#    Given user sends a post request as vice dean to create student with invalid data "<data>" for email
#    Then user gets the vice dean create student POST request response and assert message "Please enter valid email" for email
#
#    Examples:
#      | data              |
#      | Abc.example.com   |
#      | A@b@c@example.com |
#      | emin z@gmail.com  |
#
#  @createStudentWithInvalidPhoneAPI
#  Scenario Outline: TC16_Vice_Dean_Create_Student_With_Invalid_Phone_Api
#    Given user sends a post request as vice dean to create student with invalid data "<data>" for phone number
#    Then user gets the vice dean create student POST request response and assert message "Please enter valid phone number" for phone number
#
#    Examples:
#      | data         |
#      | abcdabcdabcd |
#      | abc-abc-abab |
#      | 12-123-12345 |
#      | 1234-123-123 |
#      | 123-12-12345 |
#      | 123-1234-123 |
#      | ?=)-?=)-..,, |
#
#  @student_create_by_vice_dean_api_2
#  Scenario: Creating student by vice dean (api test)
#    When user sends POST request and do the assertion for creating student by vice dean
#    And user sends PUT request and do the assertion for updating student by vice dean
#    And user sends DELETE request and do the assertion for deleting student by vice dean
#    And user sends GET request and do the assertion for getting student by vice dean
#
#
#
#
#
#



@vice_dean_create_student_api
Feature: Vice Dean Create Student API

  Scenario: vice dean creates student api
    When user sends the POST request to create student as vice dean
    Then user do assertion as vice dean to verify student creation




























