@student_create_by_vice_dean_api
Feature: US23 Admin should be able to create vice dean account api

  Scenario: Creating student by vice dean (api test)
    When user sends POST request and do the assertion for creating student by vice dean
    And user sends PUT request and do the assertion for updating student by vice dean
    And user sends DELETE request and do the assertion for deleting student by vice dean
    And user sends GET request and do the assertion for getting student by vice dean