
  Feature:Contact Feature API

    @contact_validation_api
    Scenario: TC01_Send_A_Message_By_Api
      When user sends the POST request to send a message_US03
      Then user gets the response and do assertion_US03

    @contact_validation_by_email_api
    Scenario: TC02_Send_A_Message_By_Api
      When user sends the POST request to send a message_US03
      Then user gets the response and do assertion by email US03

    @contact_validation_by_subject_api
    Scenario: TC03_Send_A_Message_By_Api
      When user sends the POST request to send a message_US03
      Then user gets the response and do assertion by subject US03

    @contact_validation_by_empty_values_api
    Scenario Outline: TC04_Send_A_Message_By_Empty_Values_Api
      When user sends the POST request to send a message by empty "<values>" and sees the "<error message>" US03
      Examples:
        | values  | error message           |
        | name    | Please enter name       |
        | email   | Please enter your email |
        | subject | Please enter subject    |
        | message | Please enter message    |


    @contact_validation_by_invalid_mails_api
    Scenario Outline: TC05_Send_A_Message_By_"<invalid_mail>"_Api
      When user sends the POST request to send a message by invalid "<invalid_mail>" US03
      Then user gets the response and sees the "<error message>" US03

      Examples:
        | invalid_mail         | error message                              |
        |                      | Your email should be at least 5 characters |
        | mail_without_at_sign | Please enter valid email                   |
        | mail_without_dot     | Please enter valid email                   |
        | t09InvalidMail       | Please enter valid email                   |
        | @gmail.com           | Please enter valid email                   |
      ##  | şiüğç@gmail.com      | Please enter valid email              |
      ##  | abcd@gmail           | Please enter valid email                   |



