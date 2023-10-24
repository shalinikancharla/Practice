Feature: Opening the Amazon page and dealing with Amazon WebSite
  As without Login details
  Background: user is on Amazon WebSite
    Given navigate to the Amazon Home Page

  Scenario:Open the Amazon page without login details
    Given user is on amazon home Page
    Then give the Assertion for Today's Deals Page
    When click on Today's deals
    And user is on Todays Deals page
    When click on Third Deal
    And click on Inner Third Deal
    Then open AddToCart Page
    When select minimum quantity as 2
    And click on AddToCart button
    Then verify the minimum Quantities added or not
  Scenario:Searching for mobiles

    Given user is on Mobile page
    When user search for mobile phones
    When select Last Displayed item
    And navigate to All
    And select on Mobiles and Computers
    And select on All Mobile Phones
    And switch to Parent window
    Then should be on parent window of mobilePage
