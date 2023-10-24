package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
    WebDriver driver;

    @Given("open the w3Schools website")
    public void open_the_w3schools_website() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/");

    }
    @When("click on videos")
    public void click_on_videos() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button w3-hide-medium bar-item-hover w3-hide-small w3-padding-24 barex ws-hide-1200']")).click();


    }
    @Then("open videos page")
    public void open_videos_page() {
        System.out.println("Open videos page");

    }


}
