Feature: Opening the Amazon page and dealing with Amazon WebSite
  As with Login details
#  Background: user is on Amazon Website
#    Given navigate to the Amazon Home Page
  Scenario Outline:Login to the account
    Given navigate to the Amazon Home Page
    When cursor move on signInButton
    Then select Your Account
    Then should land on Accounts Page
    When select on Login and Security
    And enter  email
    And click on Continue
    And enter PassWord
    And click on Sign In
    Then signIn with userName
    When click on  Your Order
    Then should be land on Your Orders page
    When select Previous year order
    Then open order details
    When click on return to your Account
    And landed on AccountPage and select Payment Option
    And verify the payment page text
    And select on return to Your Account
    When select Your Address from Account page
    And select Add Address
    Then should land on AddressPage
#    When enter these details "<FullName>","<PinCode>","<Address>","<MobileNumber>","<Area>","<Landmark>"
    When enter fullname "<FullName>"
    And enter mobile number "<MobileNumber>"
    And enter pincode "<PinCode>"
    And enter Address <Address>
    And enter Area "<Area>"
    And enter  Landmark "<Landmark>"
    When select default Address
    And select an Address type
    And select Add Address Button
    Then should add the address details
    Examples:
      | FullName       |MobileNumber| PinCode | Address         |  Area      | Landmark |
      | ShaliniIruvuru |9542817261  |500089  |  BRC A block-702| Puppalaguda | Nursery narsing main road |
