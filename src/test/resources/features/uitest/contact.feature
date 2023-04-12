@contactFeature
  Feature: Contact Feature

    @PositiveContactTest

    Scenario: Send_A_Message_0n_Contact_Page

      Given user clicks on the Contact button
      And user enters a valid name value in the Your Name textbox on Contact Page
      And user enters a valid email value in the Your Email textbox on Contact Page
      And user enters a valid subject value in the Subject textbox on Contact Page
      And user enters a valid message in the Message textbox on Contact Page
      And user clicks the Send Message button
      Then user verifies the verification message


    @NegativeContactTest
    Scenario Outline: negative_test

      Given user clicks on the Contact button
      And user enters a "<name>" value in the Your Name textbox on Contact Page
      And user enters an "<email>" value in the your email textbox on Contact Page
      And user enters a "<subject>" value in the subject textbox on Contact Page
      And user enters a "<message>" in the message textbox on Contact Page
      And user clicks the Send Message button
      And user gets "<warning message>"


  Examples:
    | name |     email     | subject  |    message   | warning message   |
  ##  |      | t09@gmail.com | schedule | T09 Was Here |  bos birakilamamali                     |  name boş olunca kabul ediyor
   ## | John |               | schedule | T09 Was Here |  Boyut 5 - 80 Arası olmalı |
  ##  | John | t09@mail.com  |          | T09 Was Here |                       |    subject boş olunca kabul ediyor
  ##  | John | t09@gmail.com | schedule |              |                           |  message boş olunca kabul ediyor
    | John | t09.gmail.com | schedule | T09 Was Here |  Please enter valid email |
  ##  | John | t09@gmail     | schedule | T09 Was Here |  Please enter valid email | .com olmasa bile kabul ediyor
    | John | @gmail        | schedule | T09 Was Here |  Please enter valid email |

