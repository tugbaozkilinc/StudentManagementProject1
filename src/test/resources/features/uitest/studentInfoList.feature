Feature: US18 The teacher should be able to see and update the grades given to the student.

  Scenario: TC_01 Teacher can access Add Student Info page
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page

  Scenario:TC_02 Teacher can sees that the the Student Info created

    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page
    And User choses the Lesson the Choose Lesson dropdown
    And User choses the Student the Choose Student dropdown
    And User choses the Education Term the Choose Education Term dropdown
    And User enters the Absentee in the Absentee textbox
    And User enters the value in the Midterm Exam textbox
    And User enters the value in the Final Exam textbox
    And User enters the value in the Info Note textbox
    And User clicks the Submit button
    Then User sees that the the Student Info created

  Scenario:TC_03 Teacher  can click the delete button
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page
    And User choses the Lesson the Choose Lesson dropdown
    And User choses the Student the Choose Student dropdown
    And User choses the Education Term the Choose Education Term dropdown
    And User enters the Absentee in the Absentee textbox
    And User enters the value in the Midterm Exam textbox
    And User enters the value in the Final Exam textbox
    And User enters the value in the Info Note textbox
    And User clicks the Submit button
    And User sees that the the Student Info created
    Then User click the delete button
    Then User sees that the Add Student Info is not displayed on the page

  Scenario:TC_03 Teacher  can click the delete button
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page
    And User choses the Lesson the Choose Lesson dropdown
    And User choses the Student the Choose Student dropdown
    And User choses the Education Term the Choose Education Term dropdown
    And User enters the Absentee in the Absentee textbox
    And User enters the value in the Midterm Exam textbox
    And User enters the value in the Final Exam textbox
    And User enters the value in the Info Note textbox
    And User clicks the Submit button
    And User sees that the the Student Info created
    Then User click the edit button
    Then User sees  the Edit Student Info page

  Scenario:TC_04 Verifying that Name Surname part is selected
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page
    And User choses the Lesson the Choose Lesson dropdown
    And User choses the Student the Choose Student dropdown
    And User choses the Education Term the Choose Education Term dropdown
    And User enters the Absentee in the Absentee textbox
    And User enters the value in the Midterm Exam textbox
    And User enters the value in the Final Exam textbox
    And User enters the value in the Info Note textbox
    And User clicks the Submit button
    And User sees that the the Student Info created
    Then User click the edit button
    Then User sees  the Name Surname is selected in Edit Student Info page


  Scenario Outline: TC_05 input cannot left blank
  STEPS
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page
    And User choses the Lesson the Choose Lesson dropdown
    And User choses the Student the Choose Student dropdown
    And User choses the Education Term the Choose Education Term dropdown
    And User enters the Absentee in the Absentee textbox
    And User enters the value in the Midterm Exam textbox
    And User enters the value in the Final Exam textbox
    And User enters the value in the Info Note textbox
    And User clicks the Submit button
    And User sees that the the Student Info created
    Then User click the edit button
    Then User leaves lesson "<Choose_Lesson>" textbox blank
    Then User leaves education "<Choose_Education_Term>" textbox blank
    Then User leaves absentee "<absentee>" textbox blank
    Then User leaves midExam "<MidTermExam>" textbox blank
    Then User leaves finalExam "<FinalExam>" textbox blank
    Then User leaves ınfoNote "<InfoNote>" textbox blank

    And User sees that student info does not edit
    Examples:
      | Choose_Lesson | Choose_Education_Term | absentee | MidTermExam | FinalExam | InfoNote |
      |               | FALL_SEMESTER         | 5        | 40          | 40        | 8        |
      | Static        |                       | 5        | 40          | 40        | 8        |
      | Static        | FALL_SEMESTER         |          | 40          | 40        | 8        |
      | Static        | FALL_SEMESTER         | 5        |             | 40        | 8        |
      | Static        | FALL_SEMESTER         | 5        | 40          |           | 8        |
      | Static        | FALL_SEMESTER         | 5        | 40          | 40        |          |