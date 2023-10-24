Feature: Amazon order page
  In order to order page check my order details
  As a Registered user
  Ans specify the order details page
  Background:
    Given A registered user exists
    Given User is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on Login button
    Then user navigates to order page


  Scenario: Check previous order details
    When user clicks on order link
    Then user checks the previous order details

  Scenario: Check open order details
    When user clicks on open order link
    Then user checks the open order details
    And user go to cancelled order link


