@possitive_test
Feature: vice_dean_sohuld_be_create_teacher

  Scenario: TC01_Vice_dean_should_be_able_to_create_teacher_possitive_test

    Given user login as Vice Dean
    And user clicks the menu button
    And user clicks the Teacher Management
    And user chooses a lesson
    And user enters the valid value in the name textbox
    And user enters the valid value in the surname textbox
    And user enters the valid value in the Birth Place
    And user enters the valid value in the email textbox
    And user enters the valid value in the phone textbox
    And user enters the valid value in the Birth Place textbox
    And user chooses gender
    And user enters the valid value in the Date Of Birth
    And user enters the valid value in the ssn textbox
    And user enters the valid value in the And user Name textbox
    And user enters the valid value in the Password textbox
    And user clicks the register submit button
    Then user verifies that the creation is succesfull