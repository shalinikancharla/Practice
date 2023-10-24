Feature: Opening the Amazon page and dealing with Amazon WebSite
  As with Login details
  Background: user is on Amazon Website
    Given navigate to the Amazon Home Page
    Scenario:Login to the account
    When cursor move on signInButton
    And select Your Account
    Then should land on Accounts Page
    When select on Login and Security
    And enter  email
     And click on Continue
    And enter PassWord
      And click on Sign In
      Then signIn with userName
      Scenario:Click On Your Order
        When click on  Your Order
        Then should be land on Your Orders page
        When select Previous year order
        Then open order details
        When click on return to your Account
        And landed on AccountPage and select Payment Option
        And verify the payment page text
        And select on return to Your Account
        When select Your Address from Account page



