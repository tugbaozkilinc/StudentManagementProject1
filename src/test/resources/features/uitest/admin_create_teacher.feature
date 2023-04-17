@admin_create_teacher @regression
Feature: admin_sohuld_be_create_teacher

  @possitive_test @smoke
  Scenario: TC01_Admin_should_be_able_to_create_teacher_possitive_test
    Given user login as Admin
    And user clicks the menu button
    And user clicks the Teacher Management
    And user chooses a lesson
    And user enters the valid value in the name textbox
    And user enters the valid value in the surname textbox
    And user enters the valid value in the Birth Place
    And user enters the valid value in the email textbox
    And user enters the valid value in the phone textbox
    And user enters the valid value in the Birth Place textbox
    And user chooses gender
    And user enters the valid value in the Date Of Birth
    And user enters the valid value in the ssn textbox
    And user enters the valid value in the And user Name textbox
    And user enters the valid value in the Password textbox
    And user clicks the register submit button
    Then user verifies that the creation is succesfull
  @tc02
  Scenario: TC02_Verifying_that_lesson_cannot_be_left_blank

    And user login as Admin
    And user clicks the menu button
    And user clicks the Teacher Management
    And user enters the valid value in the name textbox
    And user enters the valid value in the surname textbox
    And user enters the valid value in the Birth Place
    And user enters the valid value in the email textbox
    And user enters the valid value in the phone textbox
    And user chooses gender
    And user enters the valid value in the Date Of Birth
    And user enters the valid value in the ssn textbox
    And user enters the valid value in the And user Name textbox
    And user enters the valid value in the Password textbox
    And user clicks the register submit button
    Then user verifies that the creation is unsuccesfull

  @left_blank
  Scenario Outline: TC03_Verifying_that_"<field>"_cannot_be_left_blank

    And user login as Admin
    And user clicks the menu button
    And user clicks the Teacher Management
    And user enters the valid "<name>" value in the name textbox
    And user enters the valid "<surname>" value in the surname textbox
    And user enters the valid "<birth_place>" value in the Birth Place
    And user enters the valid "<email>" value in the email textbox
    And user enters the valid "<phone>" value in the phone textbox
    And user chooses gender
    And user enters the valid "<date_of_birth>" value in the Date Of Birth
    And user enters the valid "<ssn>" value in the ssn textbox
    And user enters the valid "<username>" value in the And user Name textbox
    And user enters the valid "<password>" value in the Password textbox
    And user clicks the register submit button
    Then user verifies that "<field>" Required is appeared
    Examples:
      | name | surname | birth_place | email         | phone        | date_of_birth | ssn         | username  | password   | field         |
      |      | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | name          |
      | Mr.  |         | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | surname       |
      | Mr.  | Okumus  |             | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | birth_place   |
      | Mr.  | Okumus  | St. Tropez  |               | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | email         |
      | Mr.  | Okumus  | St. Tropez  | jlo@gmail.com |              | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | phone         |
      | Mr.  | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 |               | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | date_of_birth |
      | Mr.  | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    |             | Mrs.Lopez | Jej_Lo1234 | ssn           |
      | Mr.  | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 |           | Jej_Lo1234 | username      |
      | Mr.  | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez |            | password      |

  @space
  Scenario Outline: TC04_Verifying_that_"<field>"_cannot_contain_only_space

    And user login as Admin
    And user clicks the menu button
    And user clicks the Teacher Management
    And user enters the valid "<name>" value in the name textbox space
    And user enters the valid "<surname>" value in the surname textbox space
    And user enters the valid "<birth_place>" value in the Birth Place space
    And user enters the valid "<email>" value in the email textbox
    And user enters the valid "<phone>" value in the phone textbox
    And user chooses gender
    And user enters the valid "<date_of_birth>" value in the Date Of Birth
    And user enters the valid "<ssn>" value in the ssn textbox
    And user enters the valid "<username>" value in the And user Name textbox space
    And user enters the valid "<password>" value in the Password textbox space
    And user clicks the register submit button
    Then user verifies that the creation "<field>" is unsuccesfull
    Examples:
      | name | surname | birth_place | email         | phone        | date_of_birth | ssn         | username  | password   | field       |
      |      | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | name        |
      | Mr.  |         | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | surname     |
      | Mr.  | Okumus  |             | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez | Jej_Lo1234 | birth_place |
      | Mr.  | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 |           | Jej_Lo1234 | username    |
      | Mr.  | Okumus  | St. Tropez  | jlo@gmail.com | 159-789-5456 | 11/11/2000    | 159-79-5456 | Mrs.Lopez |            | password    |

