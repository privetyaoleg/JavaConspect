package testing.bdd.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsExample {

    @Given("^Open \"([^\"]*)\" and start application$")
    public void openApp(String browser) throws Throwable {
        System.out.println("Opening " + browser);
    }


    @When("^some actions$")
    public void some_actions() throws Throwable {
        System.out.println("Some actions steps...");

    }

    @Then("^first assert$")
    public void firstAssert() throws Throwable {
        System.out.println("Asserts...1");
    }

    @Then("^second assert$")
    public void secondAssert() throws Throwable {
        System.out.println("Asserts...2");
    }

    @Given("^Open \"([^\"]*)\" and open \"([^\"]*)\"$")
    public void open_and_open(String browser, String site) throws Throwable {
        System.out.println("Open " + browser + " on " + site);
    }

    @When("^Page is loaded$")
    public void page_is_loaded() throws Throwable {
    }

    @Then("^Main page of application is open$")
    public void main_page_of_application_is_open() throws Throwable {
    }

}
