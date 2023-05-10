@vice_dean_created_by_admin_api @api
Feature: US23 Admin should be able to create vice dean account api

  @TC01_vice_dean_created_by_admin_api
  Scenario: Creating vice dean account by admin (api test)
    When user sends POST request and do the assertion for creating vice dean by admin

  @TC02_vice_dean_created_by_admin_api
  Scenario: Updating vice dean account by admin (api test)
    And user sends PUT request and do the assertion for creating vice dean by admin

  @TC03_vice_dean_created_by_admin_api
  Scenario: Deleting vice dean account by admin (api test)
    And user sends DELETE request and do the assertion for creating vice dean by admin

  @TC04_vice_dean_created_by_admin_api
  Scenario: Getting vice dean account by admin (api test)
    And user sends GET request and do the assertion for creating vice dean by admin