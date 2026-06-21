Feature: Call API for testing
  @API @Run
  Scenario: The first login
    Given User is redirect to mainPage and use Get Request
    And User checks presents of the entities 7 have 'Michael'
    And User put new name and job inside 'sorin' have 'toster'
    And User post new name and job inside 'sorin' have 'toster2'
    Then User delete all
