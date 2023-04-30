@contactFeature
Feature: Contact Feature

  @PositiveContactTest @smoke
  Scenario: Send_A_Message_0n_Contact_Page
    Given User navigates to the specified URL
    When user clicks on the Contact button
    And user enters a valid name value in the Your Name textbox on Contact Page
    And user enters a valid email value in the Your Email textbox on Contact Page
    And user enters a valid subject value in the Subject textbox on Contact Page
    And user enters a valid message in the Message textbox on Contact Page
    And user clicks the Send Message button
    Then user verifies the verification message

  @invalid_mail_test_us03
  Scenario Outline: invalid_mail_test_with_"<email>"_value
    Given User navigates to the specified URL
    When user clicks on the Contact button
    And user enters a "<name>" value in the Your Name textbox on Contact Page
    And user enters an "<email>" value in the your email textbox on Contact Page
    And user enters a "<subject>" value in the subject textbox on Contact Page
    And user enters a "<message>" in the message textbox on Contact Page
    And user clicks the Send Message button
    And user gets "<warning message>"
    Examples:
      | name | email         | subject  | message      | warning message          |
      | John | t09.gmail.com | schedule | T09 Was Here | Please enter valid email |
      | John | @gmail        | schedule | T09 Was Here | Please enter valid email |
      ##  | John | t09@gmail        | schedule | T09 Was Here |  Please enter valid email |
     ##   | John | üğöı09@şmail.com | schedule | T09 Was Here |  Please enter valid email |
      ##3. Step gonna fail bcz using mail address without ".com" is acceptable!
      ##4. Step gonna fail bcz using mail address with non Ascii values is acceptable!


  ##  @empty_field_test_us03
  ##  Scenario Outline: negative_test

  ##  Given user clicks on the Contact button
  ##  And user enters a "<name>" value in the Your Name textbox on Contact Page
  ##  And user enters an "<email>" value in the your email textbox on Contact Page
  ##  And user enters a "<subject>" value in the subject textbox on Contact Page
  ##  And user enters a "<message>" in the message textbox on Contact Page
  ##  And user clicks the Send Message button
  ##  And user gets "<warning message>"

## Examples:
##   | name |     email     | subject  |    message   | warning message  |
##   |      | t09@gmail.com | schedule | T09 Was Here | can not be empty |
##   | John |               | schedule | T09 Was Here | can not be empty |
##   | John | t09@mail.com  |          | T09 Was Here | can not be empty |
##   | John | t09@gmail.com | schedule |              | can not be empty |

    ##1. , 3. and 4. steps gonna fail bcz sending a message with an empty field is acceptable!
    ##2. Step gonna fail bcz warning message is not relevant


   ## @boundary_test_us03
   ## Scenario: boundary_test
##
   ##   Given user clicks on the Contact button
   ##   And user enters a name value with 101 characters in the Your Name textbox on Contact Page
   ##   And user enters a email value in the Your Email textbox on Contact Page
   ##   And user enters a subject value with 101 characters in the Subject textbox on Contact Page
   ##   And user enters a message with 101 sentence in the Message textbox on Contact Page
   ##   And user clicks the Send Message button
   ##   Then user gets the warning message about boundary








