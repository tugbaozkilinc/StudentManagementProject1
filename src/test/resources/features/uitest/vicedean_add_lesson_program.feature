@regression
Feature: US10 vice dean create lesson program
Background:
  Given user navigates to the specified URL
  And user clicks on the login button
  And user enters the "vice_dean_username" in the username textbox on the login page
  And user enters the "vice_dean_password" in the password textbox on the login page
  And user clicks the login button on the login page
   # And user clicks the menu button
  And User click lesson management
  And user click lesson program
  Scenario: TC01

    And user enter valid value choose lesson textbox
    And user click valid value choose Day
    And user choose education term
    And user enter start time
    And user enter stop time
  #  And user click submit button
    Then user see create lesson program
Scenario: TC02

  And user does not choose choose lesson textbox
  And user click valid value choose Day
  And user choose education term
  And user enter start time
  And user enter stop time
 # And user click submit button
  Then user see required message
Scenario: TC03

  And user select choose lesson textbox
  And user don't click valid value choose Day
  And user choose education term
  And user enter start time
  And user enter stop time
 # And user click submit button
  Then user see required message
Scenario: TC04

  And user select choose lesson textbox
  And user click valid value choose Day
  And user don't select choose education term
  And user enter start time
  And user enter stop time
  #And user click submit button
  Then user see required message
Scenario: TC05

  And user select choose lesson textbox
  And user click valid value choose Day
  And user select choose education term
  And user enter start time
  And user don't enter stop time
  #And user click submit button
  Then user see required message below stop time


