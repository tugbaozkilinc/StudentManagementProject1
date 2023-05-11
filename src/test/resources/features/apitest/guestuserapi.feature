@api
Feature: Guest User List Api

  @Tc01_Guest_User_Validation
  Scenario: TC01_Post_And_Get_Validation
    When user sends the POST request to create a guest user account US02


  @Tc01_Guest_User_Delete_Validation
  Scenario: TC01_Delete_Validation
    When user sends the POST request to create a guest user account US02
    Then verifies user has created successfully US02
    And user sends the DELETE request US02
    Then user gets the response and do the assertion US02

