
Feature: Parameterization scenarios
  @UserRegistration #tagging concept
  Scenario: To test the functionality of submit button
    Given I am on the Registration Page
    When I enter  below data
    |Shalini | Iruvuru | 9542817261 | shalini@gmail.com |
    And I click on the submit button
    Then user should be added

    #DataTable
  @Subscription
 Scenario Outline:To test the functionality of subscribe button
    Given I am on the subscription page
    When I enter <name>,<contact>,<gender>,<email>
    And click on subscribe button
    Then Subscription added
    Examples:
    | name | contact | gender | email |
    |Shalini|9542817261| F    | Shalini21@gmail.com|
    |Venki|9542817262| M   | Venki@gmail.com|
    |Sudeeksha|9542817361| F    | Sudeeksha@gmail.com|
    |Piya|9542812261| F    | Piya@gmail.com|

