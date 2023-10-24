package StepDefinition;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;
    @Given("I am on login page")
    public void i_am_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am on the login page");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://stock.amolujagare.com/");

    }
    @When("i enter userName and password")
    public void i_enter_user_name_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When i enter userName and Password");
       driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");


    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click on login button");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }
    @Then("i should land on Home page")
    public void i_should_land_on_Home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i should landed on Home page");


    }
}
