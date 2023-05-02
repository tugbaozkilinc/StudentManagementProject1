@us12
Feature: Vice dean should be able to create syllabus

  @viceDeanCreateSyllabusTest @smoke
  Scenario: TC01 Vice dean should create syllabus
    Given user login as Vice Dean
    And user clicks the Menu button
    And user clicks the Lesson Management button on the menu
    And user clicks Lesson Program on the page
    And user verifies that the Lesson Program List is displayed
    And selects a lesson from the Choose Lessons list
    And selects a term from the term list
    And selects a day for the lesson
    And selects a start and stop time for the lesson
    And user clicks on the Submit button
    Then user verifies that the Lesson added the program
    And user closes the application

  @viceDeanSeeLessonTest
  Scenario:TC02 Vice dean should be able to see lesson
    Given user login as Vice Dean
    And user clicks on the login button
    And user clicks the Menu button
    And user clicks the Lesson Management button on the menu
    And user click Lessons area
    And user enters a valid lesson name
    And user sign Compulsory choice
    And user enter valid credit score
    And user clicks submit lessons button
    And user clicks Lesson Program on the page
    Then user verifies the lesson from the Lesson Program List
    And user closes the application

  @selectTeacherPositiveTest
  Scenario: TC03 Vice dean should be able to select teacher
    Given user login as Vice Dean
    And user clicks on the login button
    And user clicks the Menu button
    And user clicks the Lesson Management button on the menu
    Then user clicks Lesson Program on the page
    And user select the lesson from Lesson Program Assignment list
    And user selects teacher from Choose Teacher list
    And user clicks submit button
    Then user verifies that the teacher added the lesson
    And user closes the application

  @selectTeacherNegativeTest
  Scenario: TC04 vice dean should be able to select teacher
    Given user login as Vice Dean
    And user clicks the Menu button
    And user clicks the Lesson Management button on the menu
    And user clicks Lesson Program on the page
    And user select the lesson from Lesson Program Assignment list
    And user clicks submit button
    Then user gets the warning message
    And user closes the application


  @selectTeacherNegativeTest2
  Scenario: TC05 vice dean should be able to select teacher
    Given user login as Vice Dean
    And user clicks the Menu button
    And user clicks the Lesson Management button on the menu
    And user clicks Lesson Program on the page
    And user selects teacher from Choose Teacher list
    And user clicks submit button
    Then user gets not found warning message
    And user closes the application
