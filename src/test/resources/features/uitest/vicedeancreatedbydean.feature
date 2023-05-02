Feature: US06 Dean should be able to create vice dean account

  @TC01_vice_dean_created_by_dean
  Scenario: TC01 Creating vice dean account by dean(positive test)
    Given user login as Dean
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

  @TC02_vice_dean_created_by_dean
  Scenario Outline: TC02/TC03/TC04/TC06/TC07/TC08/TC09/TC10 Verifying that the inputs cannot be left blank
    Given user login as Dean
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

  @TC03_vice_dean_created_by_dean
  Scenario Outline: TC11 Verifying that the date of birth input does not accept invalid formats
    Given user login as Dean
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

  @TC04_vice_dean_created_by_dean
  Scenario: TC12 Verifying that the phone input does not accept invalid formats
    Given user login as Dean
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the invalid value phone in the phone text box and sees message under phone text box
      | phone       | message                             |
      | 11111111111 | Minimum 12 character (XXX-XXX-XXXX) |
    And user closes the application

  @TC05_vice_dean_created_by_dean
  Scenario Outline: TC13 Verifying that the phone input does not accept invalid formats
    Given user login as Dean
    And user is navigated to dean page
    When user clicks on menu button in dean page
    And user clicks on vice dean management button in main menu
    And user is navigated to vice dean management page
    And user enters the name in the name text box
    And user enters the surname in the surname text box
    And user enters the birth place in the birth place text box
    And user selects a gender
    And user enters the date of birth in date of birth text box
    And user enters the invalid values "<phone>" in the phone text box
    And user enters the ssn in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user sees the warning message "<message>" related to phone text box
    And user closes the application
    Examples:
      | phone        | message                         |
      | 333333333333 | Please enter valid phone number |
      | aaaaaaaaaaaa | Please enter valid phone number |
      | ++++++++++++ | Please enter valid phone number |
      | 111_111_1111 | Please enter valid phone number |

  @TC06_vice_dean_created_by_dean
  Scenario: TC14 Verifying that the ssn input does not accept invalid formats
    Given user login as Dean
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
    And user enters the invalid value ssn in the ssn text box and sees message under ssn text box
      | ssn        | message                            |
      | 5555555555 | Minimum 11 character (XXX-XX-XXXX) |
    And user closes the application

  @TC07_vice_dean_created_by_dean
  Scenario Outline: TC15 Verifying that the ssn input does not accept invalid formats
    Given user login as Dean
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
    And user enters the invalid values "<ssn>" in the ssn text box
    And user enters the username in the username text box
    And user enters the password in the password text box
    And user clicks on submit button on vice dean management page
    Then user sees the warning message "<message>" related to ssn text box
    And user closes the application
    Examples:
      | ssn          | message                       |
      | 123-00-21234 | Please enter valid SSN number |
      | 123/00/2123  | Please enter valid SSN number |
      | bbbbbbbbbbb  | Please enter valid SSN number |
      | ???????????  | Please enter valid SSN number |
      | 44444444444  | Please enter valid SSN number |

  @TC08_vice_dean_created_by_dean
  Scenario: TC16 Verifying that the password input does not accept invalid formats
    Given user login as Dean
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
    And user enters the invalid value password in the password text box and sees message under password text box
      | password | message             |
      | 1234567  | Minimum 8 character |
    And user closes the application







































