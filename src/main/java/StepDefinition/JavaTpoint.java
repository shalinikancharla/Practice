package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTpoint {
    WebDriver driver;
    @Given("open the javaTpoint website")
    public void open_the_java_tpoint_website() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.javatpoint.com/");


 }
    @When("click on Java")
    public void click_on_java() throws InterruptedException {
        Thread.sleep(2000);
  driver.findElement(By.xpath("//div[@class='ddsmoothmenu']//ul//li//a[@href='java-tutorial'][normalize-space()='Java']")).click();

    }
    @Then("open java page")
    public void open_java_page() {
        System.out.println("Java page opened");

    }

}
