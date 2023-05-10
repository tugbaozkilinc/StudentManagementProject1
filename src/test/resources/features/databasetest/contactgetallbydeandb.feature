@contact_get_all_by_dean_db @db @api
Feature: US07 Dean should be able to see the messages the users sent db

  Scenario: Creating contact messages by dean (db test)
    When user sends POST request and do the assertion for reading contact messages by dean
    When user sends the query with the email to the database
    Then user verifies the contact messages can be read by dean