@admin_api
Feature: AdminCreateApi
  Scenario:TC01_admin_test1
    When user sends POST request and do the assertion admin page
    When user sends POST request as admin to create without name
    When user sends POST request as admin to create without surname
    Then user verifies the result of admin creation as adminnn



