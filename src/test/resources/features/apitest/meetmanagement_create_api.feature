@meetmanagement_create

  Feature: US_19_meetmanagement_create

    Scenario: Post_meet_create
      Given user sends a POST request as teacher_advisor to create a meet
      Then user verifies the result of meet creation as teacher_advisor