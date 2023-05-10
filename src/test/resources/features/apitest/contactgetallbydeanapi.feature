@contact_get_all_by_dean_api @api
Feature: US07 Dean should be able to see the messages the users sent api

  @TC01_contact_get_all_by_dean_api
  Scenario: Creating contact messages by dean (api test)
    When user sends POST request and do the assertion for reading contact messages by dean

  @TC02_contact_get_all_by_dean_api
  Scenario: Getting contact messages by dean (api test)
    When user sends GET request and do the assertion for reading contact messages by dean

