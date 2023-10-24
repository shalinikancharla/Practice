package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataTableDemo {
    @Given("^I am on the subscription page$")
    public void i_am_on_the_subscription_page() throws Throwable {
        System.out.println("I am on the subscription page");
    }

    @When("^I enter (.+),(.+),(.+),(.+)$")
    public void i_enter_(String name, String contact, String gender, String email) throws Throwable {
        System.out.println("name:"+name);
        System.out.println("contact:"+contact);
        System.out.println("gender:"+gender);
        System.out.println("email:"+email);



    }
    @And("^click on subscribe button$")
    public void click_on_subscribe_button() throws Throwable {
        System.out.println("click on subscribe button");
    }

    @Then("^Subscription added$")
    public void subscription_added() throws Throwable {
        System.out.println("Subscription added");
    }


}

