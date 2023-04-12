@guestUserFeature
Feature: Guest User


  @guestUserListVerify
  Scenario: Guest_user_List_Verification

    Given user login as Admin
    And user clicks the Menu button
    And user clicks the Guest User button
    Then user verifies Name Surname header on Guest User List
    Then user verifies Phone Number header on Guest User List
    Then user verifies Ssn header on Guest User List
    Then user verifies And user Name header on Guest User List
    Then user closes the application

  @guestUserDelete
  Scenario: Guest_user_delete
    Given user login as Admin
    And user clicks the Menu button
    And user clicks the Guest User button
    And user clicks the Delete button on Guest User List
    Then user verifies "Guest User deleted Successful" text message
    Then user closes the application