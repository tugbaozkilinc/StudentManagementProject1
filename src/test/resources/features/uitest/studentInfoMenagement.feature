@Us_17
Feature:Teacher_should_be_able_to_grade_students

  @TC_01
  Scenario:Add_Student_Info_page_should_be_displayed
    Given User navigates to the specified URL
    When User clicks on the Login button
    And User enters the teacher username in the username textbox
    And User enters the teacher password in the password textbox
    And User clicks the Login button
    And User clicks the Menu button
    And User clicks the Student Info Management button on the menu
    And User sees that the Student Info Management page is displayed
    Then User sees that the Add Student Info is displayed on the page

#
