@lesson_DB_test
Feature: Lesson_Create_Database_Test

  Scenario: Validate_lesson_DataBase

    Given findlesson by id
    Then  Validate data lesson by id