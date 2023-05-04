
  Feature:Contact Feature API

    @contact_verification_api
    Scenario: TC01_Send_A_Message_By_Api
      When user sends the POST request to send a message_US03
      Then user gets the response and do assertion_US03