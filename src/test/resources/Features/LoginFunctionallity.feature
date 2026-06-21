Feature: Login functionality

#  @UI @Run
  Scenario:Valid login functionality
    Given user insert username "Admin"
    And user insert password "admin123"
    When user clicks on Login button
    Then user is redirect to homepage
    And user clicks on LogOut button
    And insert username
    And insert password
    And user clicks on Login button
    And user is redirect to homepage

  Scenario:Invalid login functionality