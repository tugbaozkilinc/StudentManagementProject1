@deanDB @db @api
Feature: Validate_Dean_DB

  Scenario: TC01_CheckDean
    Given user sends post request for Dean
    Then user gets the dean post request response and assert "Dean Saved" and "CREATED"
    When user send the query with the user id to the database
    Then user verifies the dean data