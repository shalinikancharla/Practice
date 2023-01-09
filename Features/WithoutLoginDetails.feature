
Feature:Open Amazon Website
  As without Login details
#Background: user is on Amazon page
# Given Launch the Amazon WebSite

Scenario:Open the Amazon page without login details
  Given Launch the Amazon WebSite
Given user is on amazon home Page
Then give the Assertion for Today's Deals Button
When clickOn Todays Deals Button
Then user is on Todays Deals page
When click on Third Deal
And click on Inner Third Deal
Then open AddToCart Page
When select minimum quantity
And click on AddToCart button
Then verify the minimum Quantities added or not
#  Scenario:Searching for mobiles
Given user is on Mobile page
When user search for mobile phones
When select Last Displayed item
And navigate to All
And select on Mobiles and Computers
And select on All Mobile Phones
And switch to Parent window
Then should be on parent window of mobilePage
