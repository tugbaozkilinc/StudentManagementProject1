@Us_17
Feature:Teacher_should_be_able_to_grade_students

  @TC_01
  Scenario:Add_Student_Info_page_should_be_displayed
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    Then User sees that the Student Info Management page is displayed

  @TC_02
  Scenario:
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

  @left_blank
  Scenario Outline: TC03_Verifying_that_"<field>"_cannot_be_left_blank

    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menuu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page
    And User choses the "<Lesson>" the Choose Lesson dropdown
    And User choses the "<Student>" the Choose Student dropdown
    And User choses the "<Education>"Term the Choose Education Term dropdown
    And User enters the "<Absentee>" in the Absentee textbox
    And User enters the "<MidTermExamvalue>" in the Midterm Exam textbox
    And User enters the "<FinalExamvalue>" in the Final Exam textbox
    And the user leaves the "<Info Note>" section blank
    And User clicks the Submit button
    Then user verifies that the red required "<field>" text is visible under the Final Exam textbox on the Add Student Info page
    Examples:
      | Lesson | Student | Education     | Absentee | MidTermExamvalue | FinalExamvalue | Info Note | field            |
      |        | Turan   | FALL_SEMESTER | 0        | 50               | 50             | 80        | Lesson           |
      | Static |         | FALL_SEMESTER | 0        | 50               | 50             | 80        | Student          |
      | Static | Turan   |               | 0        | 50               | 50             | 80        | Education        |
      | Static | Turan   | FALL_SEMESTER |          | 50               | 50             | 80        | Absentee         |
      | Static | Turan   | FALL_SEMESTER | 0        |                  | 50             | 80        | MidTermExamvalue |
      | Static | Turan   | FALL_SEMESTER | 0        | 50               |                | 80        | FinalExamvalue   |
      | Static | Turan   | FALL_SEMESTER | 0        | 50               | 50             |           | Info Note        |



