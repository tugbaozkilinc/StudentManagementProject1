@admin_create_student_api
Feature: Admin Student Creation

  Scenario: Admin should create student
    When user sends the POST request to create student as admin_US25
    Then user gets the response and do assertion_US25
    Then user sends GET request with userId to check if the student is created successfully_US25

























