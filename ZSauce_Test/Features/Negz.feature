Feature: User tries to login with invalid credentials

  Scenario Outline: User enters invalid Username and Password
    Given User navigates to URL
    And user enters Wrong "<username>" and "<password>"
    Then User clicks on login
    And User should see an error message

    Examples: 
      | Username       | Password     |
      | standarduser   | secret_sauce |
      | standard_user1 | secret_sauce |
      | standard_user  | secret_auce  |
      | standard_user  | secret_sauce |
