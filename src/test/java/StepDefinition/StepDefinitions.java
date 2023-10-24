package StepDefinition;

import Base.TestBase;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Functions.CommonFunctions.parentWindow;

//import static Hooks.baseHooks.driver;

public class StepDefinitions extends TestBase
{

LoginPage loginPage;
HomePage homePage;
AccountsPage accountsPage;
Order order;
PaymentPage paymentPage;
    @Given("^navigate to the Amazon Home Page$")
    public void navigate_to_the_amazon_home_page() throws Throwable {
        setUp();
         loginPage=new LoginPage();
         homePage=new HomePage();
         accountsPage=new AccountsPage();
         order=new Order();
         paymentPage=new PaymentPage();
    }

    @Given("user is on amazon home Page")
    public void user_is_on_amazon_home_page()
    {
        System.out.println("user_is_on_amazon_home_page");
        HomePage.verifyAmazonLogo();


    }
    @Then("give the Assertion for Today's Deals Page")
    public void give_the_assertion_for_today_s_deals_page() {
        HomePage.verifyTodaySDealsButton();
    }
    @When("click on Today's deals")
    public void click_on_today_s_deals() {
        HomePage.clickOnTodaySDeals();

    }
    @And("user is on Todays Deals page")
    public void user_is_on_todays_deals_page() {
        TodaysDeals.verifyTodaySDealsPage();

    }

    @When("click on Third Deal")
    public void click_on_third_deal() throws InterruptedException {
        Thread.sleep(2000);
        TodaysDeals.clickOnThirdDeal();
    }

    @When("click on Inner Third Deal")
    public void click_on_inner_third_deal() throws InterruptedException {  //ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']//li
        ////div[@data-normaliseheight='false']/div
        Thread.sleep(3000);

        TodaysDeals.clickOnInnerThirdDeal();

    }
    @Then("^open AddToCart Page$")
    public void open_addtocart_page() throws Throwable {
        System.out.println("open AddToCart page");
    }
    @When("^select minimum quantity as 2$")
    public void select_minimum_quantity_as_2() throws Throwable {

        TodaysDeals.selectMinimumQuantities();
    }



    @And("^click on AddToCart button$")
    public void click_on_addtocart_button() throws Throwable {
        TodaysDeals.clickOnAddToCartButton();
    }
    @Then("verify the minimum Quantities added or not")
    public void verify_the_minimum_quantities_added_or_not() {
        TodaysDeals.verifyCartMessage();

    }
    @Given("^user is on Mobile page$")
    public void user_is_on_mobile_page() throws Throwable
    {
        System.out.println("user_is_on_mobile_page");
        MobilePage.verifyMobilePage();
    }


    @When("user search for mobile phones")
    public void user_search_for_mobile_phones() throws InterruptedException
    {
        HomePage.searchForMobilePhones();
    }


    @When("^select Last Displayed item$")
    public void select_last_displayed_item() throws Throwable
    {
        System.out.println("select_last_displayed_item");
        Thread.sleep(2000);
        MobilePage.clickOnLastDispItem();
    }
    @And("^navigate to All$")
    public void navigate_to_all() throws Throwable {
        System.out.println("navigate to All");
        Thread.sleep(2000);
        MobilePage.clickOnNavigateToAll();
    }
    @And("^select on Mobiles and Computers$")
    public void select_on_mobiles_and_computers() throws Throwable {
        System.out.println("select on Mobiles and Computers");
        MobilePage.selectOnMobilesAndComputers();
    }
    @And("^select on All Mobile Phones$")
    public void select_on_all_mobile_phones() throws Throwable {
        System.out.println("select on All Mobile Phones");
        MobilePage.selectAllMobilePhones();

    }
    @And("^switch to Parent window$")
    public void switch_to_parent_window() throws Throwable {
        System.out.println("switch to Parent window");
        driver.navigate().back();
        driver.switchTo().window(parentWindow);
    }
    @Then("^should be on parent window of mobilePage$")
    public void should_be_on_parent_window_of_mobilepage() throws Throwable {
        HomePage.verifyParentWindow();
    }


    //WithLogin Details


    @When("^cursor move on signInButton$")
    public void cursor_move_on_signinbutton() throws Throwable {
        HomePage.verifysignInButton();


    }

    @And("^select Your Account$")
    public void select_your_account() throws Throwable {
        HomePage.selectYourAccount();
    }


    @Then("should land on Accounts Page")
    public void shouldLandOnAccountsPage() {
        AccountsPage.verifyAccountsPage();

    }

    @When("select on Login and Security")
    public void selectOnLoginAndSecurity() {
        AccountsPage.clickOnLoginAndSecurity();
    }
    @And("^enter  email$")
    public void enter_email() throws Throwable {
        System.out.println("enter email");
        loginPage.enterEmail();
    }

    @And("^click on Continue$")
    public void click_on_continue() throws Throwable {
        Thread.sleep(2000);
        loginPage.clickOnContinue();

        System.out.println("click on continue");

    }


    @And("enter PassWord")
    public void enterPassWord() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("enter password");
        loginPage.enterPassWord();
    }

    @And("click on Sign In")
    public void clickOnSignIn() {
        loginPage.clickOnSignInButton();
    }

    @Then("signIn with userName")
    public void signInWithUserName() {
        homePage.verifySignInPage();
    }

    @When("click on  Your Order")
    public void clickOnYourOrder() {
        accountsPage.clickOnYourOrder();

    }

    @Then("should be land on Your Orders page")
    public void shouldBeLandOnYourOrdersPage() {
        order.verifyOrderPage();

    }
    @When("select Previous year order")
    public void selectPreviousYearOrder() {
        order.selectPreviousOrder();

    }

    @Then("open order details")
    public void openOrderDetails() {
     order.verifyOrderDetails();
    }

    @When("click on return to your Account")
    public void clickOnReturnToYourAccount() {
        order.clickOnYourReturnAccount();

    }

    @And("landed on AccountPage and select Payment Option")
    public void landedOnAccountPageAndSelectPaymentOption() {
        accountsPage.selectPaymentOption();
    }

    @And("verify the payment page text")
    public void verifyThePaymentPageText() {
        paymentPage.verifyPaymentPage();
        paymentPage.verifyPaymentPageText();
    }

    @And("select on return to Your Account")
    public void selectOnReturnToYourAccount() {
        paymentPage.returnToYourAccount();

    }

    @When("select Your Address from Account page")
    public void selectYourAddressFromAccountPage() {

    }
}
