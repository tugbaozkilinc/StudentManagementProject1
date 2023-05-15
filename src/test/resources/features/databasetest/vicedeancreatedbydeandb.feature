@vice_dean_created_by_dean_db @db
Feature: US06 Dean should be able to create vice dean account db

  Scenario: Creating vice dean account by dean (db test)
    When user sends POST request and do the assertion for creating vice dean by admin
    When user sends the query with the id to the database by dean
    Then user verifies the vice dean account can be created by dean