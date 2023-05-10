@vicedean_create_teacher_api @api
Feature:Vicedean should be able to create a teacher


  Scenario: TC01_Vicedean create a Teacher
    Given user send to post request
    Then validate the response body
