Feature: User adds item to cart

  Background: User should login before adding to cart
    Given User enters Username
    And User enters Password
    And User clicks on Login
    Then User able to see PRODUCTS

  Scenario: User adds T-Shirt to cart
    Given User clicks add to cart
    When User clicks cart button
    And User clicks on checkout
    And User enters first name
    And User enters last name
    And User enters zip code
    And User clicks on Continue
    Then User clicks on finish
    And User should see "THANK YOU FOR YOUR ORDER"