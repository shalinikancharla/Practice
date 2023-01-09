package StepDefinitions;

import BaseTest.BaseTest;
import Hooks.baseHooks;
import Pages.CartPage;
import Pages.HomePage;
import Pages.MobilePage;
import Pages.TodaySDeals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import static testUtil.utility.parentWindow;

public class StepDefinitions  {
   public  WebDriver driver;
    HomePage homePage;
    TodaySDeals todaySDeals;
    CartPage cartPage;
   MobilePage mobilePage;
//    public StepDefinitions() throws IOException {
//        super();
//    }

    @Given("^Launch the Amazon WebSite$")
    public void launch_the_amazon_website() throws Throwable {
        //initialization();
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
           //setUp();
        homePage=new HomePage(driver);
        todaySDeals=new TodaySDeals(driver);
        cartPage=new CartPage(driver);
        mobilePage=new MobilePage(driver);

    }
    @Given("user is on amazon home Page")
    public void user_is_on_amazon_home_page()
    {
        System.out.println("user_is_on_amazon_home_page");
        homePage.verifyAmazonLogo();


    }
    @Then("give the Assertion for Today's Deals Button")
    public void give_the_assertion_for_today_s_deals_Button() {
        homePage.verifyTodaySDealsButton();
    }

   @When("clickOn Todays Deals Button")
    public void click_on_todays_deals_button() {
        homePage.clickOnTodaySDeals();

}
    @Then("user is on Todays Deals page")
    public void user_is_on_todays_deals_page() {
       String title= todaySDeals.verifyTodaySDealPage();
        Assert.assertEquals(title,"Amazon.in - Today's Deals");

    }
    @When("click on Third Deal")
    public void click_on_third_deal() throws IOException {
     todaySDeals.clickOnThirdDeal();
    }
    @When("click on Inner Third Deal")
    public void click_on_inner_third_deal() {
        todaySDeals.clickOnThirdDealInnerProduct();

    }
    @Then("open AddToCart Page")
    public void open_add_to_cart_page() {
        System.out.println("open Add To cart page");

    }
    @When("select minimum quantity")
    public void select_minimum_quantity() throws InterruptedException {
        todaySDeals.selectQuantityPage();

    }
    @When("click on AddToCart button")
    public void click_on_add_to_cart_button() throws InterruptedException {
        todaySDeals.addToCartProduct();

    }
    @Then("verify the minimum Quantities added or not")
    public void verify_the_minimum_quantities_added_or_not() {
        homePage.clickOnCart();
        cartPage.verifyCartPage();

    }

    //Search for mobiles
    @Given("user is on Mobile page")
    public void user_is_on_mobile_page() {
      homePage.verifySearchBarFunctionalityPage();
    }
    @When("user search for mobile phones")
    public void user_search_for_mobile_phones() {
        homePage.searchMobile();

    }
    @When("select Last Displayed item")
    public void select_last_displayed_item() throws InterruptedException {

mobilePage.selectLastDisplayedItem();

    }
    @When("navigate to All")
    public void navigate_to_all() {
        mobilePage.selectNavigateToAll();

    }
    @When("select on Mobiles and Computers")
    public void select_on_mobiles_and_computers() throws InterruptedException {
        mobilePage.selectMobilesAndComputers();
    }
    @When("select on All Mobile Phones")
    public void select_on_all_mobile_phones() throws InterruptedException {
        mobilePage.selectAllMobilePhones();

    }
    @When("switch to Parent window")
    public void switch_to_parent_window() {
        System.out.println("switch to Parent window");
        driver.navigate().back();
        driver.switchTo().window(parentWindow);

    }
    @Then("should be on parent window of mobilePage")
    public void should_be_on_parent_window_of_mobile_page() {
        mobilePage.verifyParentWindow();

    }




}
