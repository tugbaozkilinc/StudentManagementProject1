Feature: US08_Lessons_Add_Lessons

  #@positive_add_lesson
  Scenario:TC01 user should be able to create lesson

    Given user clicks on the login button
    And user enters the "vice_dean_username" in the username textbox on the login page
    And user enters the "vice_dean_password" in the password textbox on the login page
    And user clicks the login button on the login page
   # And user clicks the menu button
    And user clicks lesson management
    And user click lesson area
    And user enters a valid value "Python09" lesson name
    And user sign Compulsory choice
    And user enter valid value "4" credit score
    When User click Submit Button
    Then user verify "create lesson" caution

Scenario: TC02 lesson name area doesn't empty

  Given user clicks on the login button
  And user enters the "vice_dean_username" in the username textbox on the login page
  And user enters the "vice_dean_password" in the password textbox on the login page
  And user clicks the login button on the login page
  #And user clicks the menu button
  And User click lesson management
  And user click lesson area
  And User enters an empty value in the lesson name field
  And user sign Compulsory choice
  And User enters a valid value in the credit score field
  And user clicks on submit button
  Then displays the user warning text

  Scenario: TC03

    Given user clicks on the login button
    And user enters the "vice_dean_username" in the username textbox on the login page
    And user enters the "vice_dean_password" in the password textbox on the login page
    And user clicks the login button on the login page
    #And user clicks the menu button
    And User click lesson management
    And user click lesson area
    And user enters a valid value lesson name.
    And the user mark compulsory option.
    And The user enters a valid value in the credit score field.
    And The user clicks the submit button.
    Then The user sees that the course has been created.
Scenario: TC04

  Given user clicks on the login button
  And user enters the "vice_dean_username" in the username textbox on the login page
  And user enters the "vice_dean_password" in the password textbox on the login page
  And user clicks the login button on the login page
  #And user clicks the menu button
  And User click lesson management
  And user click lesson area
  And User enters a valid value in the lesson name field
  And User ticks compulsory
  And user leaves credit score field blank
  Then displays the user required warning
