@grid_test
Feature: title test

  @chromegrid
  Scenario: TC01_title_test_chrome
    Given user is on the homepage "http://139.59.159.36:3000/" by chrome
    Then verify title is "Managementon Schools"
    And close the remote driver
@edgegrid
  Scenario: TC01_title_test_edge
    Given user is on the homepage "http://139.59.159.36:3000/" by edge
    Then verify title is "Managementon Schools"
    And close the remote driver

@firefoxgrid
  Scenario: TC01_title_test_firefox
    Given user is on the homepage "http://139.59.159.36:3000/" by mozilla
    Then verify title is "Managementon Schools"
    And close the remote driver