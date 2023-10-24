Feature: Sample Features

  Scenario: sample scenario
  Given I am on login page
    When i enter userName and password
    And I click on Login button
    Then i should land on Home page

   Scenario: To test the functionality of Login button with valid inputs
     Given I am on the login page of billing
     When I enter "admin" and "admin" for valid credentials
     And I will click on Login button
     Then I logged successfully

  Scenario: To test the functionality of Login button with invalid inputs
    Given I am on the login page of billing
    When I enter "admin" and "admin123" for valid credentials
    And I will click on Login button
    Then I logged successfully

  Scenario: To test the functionality of Login button with without credentials
    Given I am on the login page of billing
    When I enter "" and "" for valid credentials
    And I will click on Login button
    Then I logged successfully

