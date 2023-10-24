package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginParameter {
    WebDriver driver;
    @Given("^I am on the login page of billing$")
    public void i_am_on_the_login_page_of_billing() throws Throwable {
        System.out.println("I am on the login page");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://stock.amolujagare.com/");
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" for valid credentials$")
    public void i_enter_something_and_something_for_valid_credentials(String userName, String password) throws Throwable {
        System.out.println("When i enter userName and Password");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(password);

    }

    @Then("^I logged successfully$")
    public void i_logged_successfully() throws Throwable {
        System.out.println("I click on login button");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    @And("^I will click on Login button$")
    public void i_will_click_on_login_button() throws Throwable {
        System.out.println("i should landed on Home page");

    }

}

