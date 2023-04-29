Feature:US09 vice_dean should be see lesson list

  Background:
    Given user navigates to the specified URL
    And user clicks on the login button
    And user enters the "vice_dean_username" in the username textbox on the login page
    And user enters the "vice_dean_password" in the password textbox on the login page
    And user clicks the login button on the login page
   # And user clicks the menu button
    And User click lesson management

  Scenario: TC01
    And user click lesson area
    And user sees lesson list
    Then The user sees the name, credit score and compulsory of the course added from the lesson list section.

  Scenario: TC02
    And user click lesson area
    And user sees lesson list
    And The user sees the delete button next to the course list
    And user clicks delete button
    And user sees warning message
    Then user user receives an information message that the course has been deleted

  Scenario: TC03
    And user click lesson area
    And user sees lesson list
    Then The user sees the edit button next to the lecture list.

