@vice_dean_created_by_admin_db @db
Feature: US23 Admin should be able to create vice dean account db

  Scenario: Creating vice dean account by admin (db test)
    When user sends POST request and do the assertion for creating vice dean by admin
    When user sends the query with the id to the database
    Then user verifies the vice dean account can be created by admin