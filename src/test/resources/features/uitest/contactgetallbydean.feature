@regression
Feature: US07 Dean should be able to see the messages the users sent

  Background: User is navigated to contact message page
    Given user login as Dean
    Given user is navigated to dean page
    And user clicks on menu button in dean page
    And user clicks on contact get all button in main menu
    And user is navigated to contact message page

  @TC01_contact_get_all_by_dean @PositiveContactTest
  Scenario Outline: TC01/TC02/TC03/TC04/TC05 Verifying that the dean can scan the "<title>" information users sent under "<title>" title
    And user sees "<title>" title at "<index>"
    Then user verifies that the information "<index>" is under title
    Examples:
      | title   | index |
      | Name    | 0     |
      | Email   | 1     |
      | Date    | 2     |
      | Subject | 3     |
      | Message | 4     |















