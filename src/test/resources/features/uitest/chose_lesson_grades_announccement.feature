Feature: student_chose_lesson_grades

  @TC01_Student_user_List_Verification
  Scenario:TC01_Confirmation of Teacher Day Start Time Stop Time display view
    Given user login as Student
    And user confirms that Teacher visible for the first element in the Choose lesson list
    And user confirms that Day visible for the first element in the Choose lesson list
    And user confirms that Start Day visible for the first element in the Choose lesson list
    And user confirms that Stop Day visible for the first element in the Choose lesson list


  @TC02_student_choosing_more_than_one_course
  Scenario: TC02_Confirmation of the student's choice of one courses
    Given user login as Student
    And The user activates the checkbox opposite the course to be selected from the choose lesson section
    And And user clicks Submit button
    Then user sees Lesson added to Student message on Chose lesson page

  @TC03_Verifying_a_students_selection_of_more_than_one_course
  Scenario: TC03_Confirmation of the students choice of one courses
    Given user login as Student
    And The user activates the checkboxes against the courses to be selected
    And And user clicks Submit button
    Then user sees Lesson added to Student message on Chose lesson page


  @TC04_Verification_about_not_being_able_to_choose_courses_that_come_on_the_same_day_and_time
  Scenario:TC04_choosing a lesson on the same day and at the same time
    Given user login as Student
    And The user chooses a second lesson on the same day and time as the first lesson from the choose lesson section
    And And user clicks Submit button



