@studentmanagemente2e @e2e @ui @api
Feature: StudentManagementEndToEnd

  Scenario: StudentManagementEndToEnd
    When user login as Vice Dean
    And user clicks the menu button
    And user clicks the Student Management on the menu
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
    When user gets the last generated student info
    And user sends the query with the student number to the database_US15_US25
    Then user do the assertion_US15_US25
    Then user do GET request with studentUserID to check if the student is created successfully