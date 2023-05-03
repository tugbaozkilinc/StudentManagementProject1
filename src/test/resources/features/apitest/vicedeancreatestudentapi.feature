@vice_dean_create_student_api
Feature: Vice Dean Student Creation

  Scenario: Vice Dean should be able to create student
    When user sends the POST request to create student as vice dean_US15
    Then user gets the response and do assertion_US15
    Then user sends GET request with userId to check if the student is created successfully_US15

























