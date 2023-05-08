@deanManagementEdit @api
Feature:Put Request Dean

  Background:
    When user sends post request for Dean
    Then user gets the dean post request response and assert "Dean Saved" and "CREATED"


  @editDeanNameAPI
  Scenario:TC01_Put_Dean_Name_Api
    Given user sends put request for Dean name "edited name"
    Then user gets the dean request response and assert "Dean updated Successful"


  @editDeanUsernameAPI
  Scenario:TC03_Put_Dean_Username_Api
    Given user sends put request for Dean Username "edited Username"
    Then user gets the dean request response and assert "Dean updated Successful"


  @editDeanSurnameAPI
  Scenario:TC04_Put_Dean_Surname_Api
    Given user sends put request for Dean Surname "edited Surname"
    Then user gets the dean request response and assert "Dean updated Successful"


  @editDeanBirthdayAPI
  Scenario:TC05_Put_Dean_Birthday_Api
    Given user sends put request for Dean Birthday "1999-10-10"
    Then user gets the dean request response and assert "Dean updated Successful"


  @deleteDean
  Scenario: TC05_delete_dean
    Given user sends delete request for dean
    Then user gets the dean request response and assert "Dean Deleted"
