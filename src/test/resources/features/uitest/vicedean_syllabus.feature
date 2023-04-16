Feature: Vice dean should be see syllabus
  Scenario: TC01 Vice dean should be able to see syllabus
    Given user login as Vice Dean
    And user clicks the Menu button
    And user clicks the Lesson Management button on the menu
    Then user verifies that the Lesson Management page is displayed
    And user clicks Lesson Program on the page
    Then user verifies that the Lesson Program List is displayed
    And user closes the application
