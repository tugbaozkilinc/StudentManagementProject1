@vice_dean_student_creation
Feature: US015_creating_student_(vice_dean)

  @vice_dean_create_student_positive
  Scenario: TC01 User should be able to create student (Positive Test)
    When user login as Vice Dean
    And user clicks the menu button
    And user clicks the Student Management on the menu
    And user selects the advisor teacher
    And user enters the name in the name textbox
    And user enters the surname in the surname textbox
    And user enters the birth place in the birth place textbox
    And user enters the email in the email textbox
    And user enters the phone in the phone textbox
    And user selects a gender
    And user enters the date of birth in the date of birth textbox
    And user enters the ssn in the ssn textbox
    And user enters the username in the username textbox
    And user enters the father name in the father name textbox
    And user enters the mother name in the mother name textbox
    And user enters the password in the password textbox
    And user clicks the create student submit button
    Then user verifies that the student is created successfully