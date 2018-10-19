package testing.bdd.cucumber.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/testing/bdd/cucumber/features",
                 glue = {"testing/bdd/cucumber/steps"})
public class CucumberRunner {


}


// https://cucumber.io