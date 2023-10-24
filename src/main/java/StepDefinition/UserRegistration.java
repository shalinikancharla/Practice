package StepDefinition;

import dev.failsafe.internal.util.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistration {
    @Given("^I am on the Registration Page$")
    public void i_am_on_the_registration_page() throws Throwable {
        System.out.println("I am on the Registration Page");
    }

    @When("^I enter  below data$")
    public void i_enter_below_data(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.asLists();//asLists() retrieve the data  from the scenario.
        System.out.println("FirstName:" + data.get(0).get(0));
        System.out.println("LastName:" + data.get(0).get(1));
        System.out.println("Phone Number:" + data.get(0).get(2));
        System.out.println("Email ID:" + data.get(0).get(3));


    }

    @Then("^user should be added$")
    public void user_should_be_added() throws Throwable {
        System.out.println("user should be added");

    }

    @And("^I click on the submit button$")
    public void i_click_on_the_submit_button() throws Throwable {
        System.out.println("i click on the submit button");
    }

}