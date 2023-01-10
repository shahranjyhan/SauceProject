Feature: User able to log in with valid credentials

  Scenario: User browse to the URL
    Given User enters Username
    And User enters Password
    And User clicks on Login
    Then User able to see PRODUCTS
