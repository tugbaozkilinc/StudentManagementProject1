@studentManagementAPI
Feature: POST Request ViceDean

  @createStudentAPI
  Scenario: TC01_Vice_Dean_Create_Student_Positive_Api
    Given user sends post request to create student as Vice Dean
    Then user gets the vice dean create student POST request response and assert "Student saved Successfully" message

  @createStudentWithoutAdvisorTeacherAPI
  Scenario: TC02_Vice_Dean_Blank_AdvisorTeacher_Api
    Given user sends a post request as vice dean to create student without "advisorTeacherId"
    Then user gets the vice dean create student POST request response and assert message "Please select advisor teacher" for advisorTeacherId

  @createStudentWithoutNameAPI
  Scenario: TC03_Vice_Dean_Blank_Name_Api
    Given user sends a post request as vice dean to create student without "name"
    Then user gets the vice dean create student POST request response and assert message "Please enter your name" for name

  @createStudentWithoutSurnameAPI
  Scenario: TC04_Vice_Dean_Blank_Surname_Api
    Given user sends a post request as vice dean to create student without "surname"
    Then user gets the vice dean create student POST request response and assert message "Please enter your surname" for surname

  @createStudentWithoutBirthPlaceAPI
  Scenario: TC05_Vice_Dean_Blank_BirthPlace_Api
    Given user sends a post request as vice dean to create student without "birthPlace"
    Then user gets the vice dean create student POST request response and assert message "Please enter your birth place" for birthPlace

  @createStudentWithoutEmailAPI
  Scenario: TC06_Vice_Dean_Blank_Email_Api
    Given user sends a post request as vice dean to create student without "email"
    Then user gets the vice dean create student POST request response and assert message "Please enter your email" for email

  @createStudentWithoutEmailAPI
  Scenario: TC07_Vice_Dean_Blank_PhoneNumber_Api
    Given user sends a post request as vice dean to create student without "phoneNumber"
    Then user gets the vice dean create student POST request response and assert message "Please enter your phone number" for phone number