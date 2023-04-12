Feature: US23 Admin should be able to create vice dean account

  @TC01_vice_dean_created_by_admin
  Scenario: TC01 Creating vice dean account by admin(positive test)
    Given user login as Admin
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user verifies that vice dean is created by dean
    And user closes the application

  @TC02_vice_dean_created_by_admin
  Scenario Outline: Verifying that the inputs cannot be left blank while admin creates vice dean
    Given user login as Admin
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the "<name>" in the name text box
    And user enters the "<surname>" in the surname text box
    And user enters the "<birth place>" in the birth place text box
    And user selects a gender
    And user enters the "<date of birth>" in date of birth text box
    And user enters the "<phone>" in the phone text box
    And user enters the "<ssn>" in the ssn text box
    And user enters the "<username>" in the username text box
    And user enters the "<password>" in the password text box
    And user clicks on submit button on vice dean management page
    Then user verifies that the required text under "<text box>" is visible on vice dean management page
    And user closes the application
    Examples:
      | name | surname | birth place | date of birth | phone        | ssn         | username   | password | text box |
      |      | Jessie  | France      | 17Mart        | 292-454-7222 | 209-59-4414 | TamiJessie | 12345678 | 0        |
      | Tami |         | France      | 17Mart        | 292-454-7222 | 209-59-4414 | TamiJessie | 12345678 | 1        |
      | Tami | Jessie  |             | 17Mart        | 292-454-7222 | 209-59-4414 | TamiJessie | 12345678 | 2        |
      | Tami | Jessie  | France      |               | 292-454-7222 | 209-59-4414 | TamiJessie | 12345678 | 3        |
      | Tami | Jessie  | France      | 17Mart        |              | 209-59-4414 | TamiJessie | 12345678 | 4        |
      | Tami | Jessie  | France      | 17Mart        | 292-454-7222 |             | TamiJessie | 12345678 | 5        |
      | Tami | Jessie  | France      | 17Mart        | 292-454-7222 | 209-59-4414 |            | 12345678 | 6        |
      | Tami | Jessie  | France      | 17Mart        | 292-454-7222 | 209-59-4414 | TamiJessie |          | 7        |

  @TC03_vice_dean_created_by_admin
  Scenario Outline: Verifying that the date of birth input does not accept invalid formats while admin creates vice dean
    Given user login as Admin
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the invalid values "<date of birth>" in date of birth text box
    And user enters the phone in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user sees the warning message "<message>"
    And user closes the application
    Examples:
      | date of birth | message                          |
      | 275760        | Cannot deserialize value of type |
      | 20281         | Cannot deserialize value of type |
      | 2080          | must be a past date              |