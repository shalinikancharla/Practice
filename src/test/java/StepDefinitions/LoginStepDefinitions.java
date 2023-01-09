package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class LoginStepDefinitions {
    public  WebDriver driver;
    HomePage homePage;
    AccountsPage accountsPage;
    LoginPage loginPage;
    OrderPage orderPage;
    PaymentPage paymentPage;
    AddressPage addressPage;
    @Given("navigate to the Amazon Home Page")
    public void navigate_to_the_amazon_home_page() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        homePage=new HomePage(driver);
        accountsPage=new AccountsPage(driver);
        loginPage=new LoginPage(driver);
        orderPage=new OrderPage(driver);
        paymentPage=new PaymentPage(driver);
        addressPage=new AddressPage(driver);
    }
    @When("cursor move on signInButton")
    public void cursor_move_on_sign_in_button() {
        homePage.verifySignInHomePage();
        homePage.clickOnSignIn();

    }
    @When("select Your Account")
    public void select_your_account() {
        homePage.clickOnYourAccount();

    }
    @Then("should land on Accounts Page")
    public void should_land_on_accounts_page() {
        accountsPage.verifyAccountspage();

    }
    @When("select on Login and Security")
    public void select_on_login_and_security() {
        accountsPage.selectSignInSecurity();
    }
    @When("enter  email")
    public void enter_email() {
        loginPage.enterEmail("kancharla574@gmail.com");

    }
    @When("click on Continue")
    public void click_on_continue() {
        loginPage.clickContinue();

    }
    @When("enter PassWord")
    public void enter_pass_word() {
        loginPage.enterPassWord("Kancharla@574");

    }
    @When("click on Sign In")
    public void click_on_sign_in() {
     loginPage.clickSignInBtn();
    }
    @Then("signIn with userName")
    public void sign_in_with_user_name() {
        loginPage.verifyUser();
     //homePage.verifySignInPage();
    }
    @When("click on  Your Order")
    public void click_on_your_order() {
     accountsPage.selectYourOrder();
    }

    @Then("should be land on Your Orders page")
    public void should_be_land_on_your_orders_page() {

       orderPage.verifyOrderPage();
    }

    @When("select Previous year order")
    public void select_previous_year_order() {
   orderPage.selectPreviousOrder();
    }

    @Then("open order details")
    public void open_order_details() {
        orderPage.isOrderDisplayed();

    }

    @When("click on return to your Account")
    public void click_on_return_to_your_account() {
        orderPage.clickOnReturnYourAccount();
    }

    @When("landed on AccountPage and select Payment Option")
    public void landed_on_account_page_and_select_payment_option() {
      accountsPage.selectPaymentOption();
    }

    @When("verify the payment page text")
    public void verify_the_payment_page_text() {
        paymentPage.verifyPaymentPage();
        paymentPage.verifyPaymentPagesText();
    }

    @When("select on return to Your Account")
    public void select_on_return_to_your_account() {
    paymentPage.returnToYourAccount();
    }

    @When("select Your Address from Account page")
    public void select_your_address_from_account_page() {
        accountsPage.selectYourAddress();

    }
    @And("^select Add Address$")
    public void select_add_address() throws Throwable {
        addressPage.selectAddAddress();
    }
    @Then("^should land on AddressPage$")
    public void should_land_on_addresspage() throws Throwable {
        addressPage.verifyAddressPage();
    }
//    @When("^enter (.+),(.+),(.+),(.+),(.+),(.+)$")
//
//    public void enter_(String fullName, String mobileNumber, String pinCode, String address, String area, String landmark) throws Throwable {
//        addressPage.addressPageDetails(fullName,mobileNumber,pinCode,address,area,landmark);
//        System.out.println(fullName);
//        System.out.println(mobileNumber);
//        System.out.println(pinCode);
//        System.out.println(address);
//        System.out.println(area);
//        System.out.println(landmark);
//
//
//    }
//@When("enter these details {string},{string},{string},{string},{string},{string}")
//public void enterTheseDetails(String fullName, String mobileNo, String pinCode, String address, String area, String landMark) throws InterruptedException {
//          addressPage.addressPageDetails(fullName,mobileNo,pinCode,address,area,landMark);
//
//
//}
@When("enter fullname {string}")
public void enter_fullname(String fullname) {
        addressPage.enterFullName(fullname);

}
    @When("enter mobile number {string}")
    public void enter_mobile_number(String mobileNo) {
        addressPage.enterMobileNumber(mobileNo);

    }
    @When("enter pincode {string}")
    public void enter_pincode(String pin) {
        addressPage.enterPinCode(pin);
   }
//    @When("enter Address\"BRC,A block-{int}\"")
//    public void enter_address_brc_a_block(Integer flat) {
//        addressPage.enterAddress(String.valueOf(flat));
//   }
@And("^enter Address (.+)$")
public void enter_address(String addressess) throws Throwable {
        addressPage.enterAddress(addressess);

}


    @When("enter Area {string}")
    public void enter_area(String areaTown) {
        addressPage.enterArea(areaTown);

    }
    @When("enter  Landmark {string}")
    public void enter_landmark(String landMarkArea) {
        addressPage.enterLandMark(landMarkArea);

    }


    @When("^select default Address$")
    public void select_default_address() throws Throwable {
     //addressPage.selectDefaultAddress();
    }

    @And("^select an Address type$")
    public void select_an_address_type() throws Throwable {
        addressPage.selectAnAddressType();
    }

    @And("^select Add Address Button$")
    public void select_add_address_button() throws Throwable {
      addressPage.addAddressButton();
    }
    @Then("^should add the address details$")
    public void should_add_the_address_details() throws Throwable {
        //addressPage.verifyAddNewAddressPage();
    }


}
