package co.com.hospitals.definitions;

import co.com.hospitals.steps.PerformingTheRegistrationStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PerformingTheRegistrationDefinition {
    @Steps
    PerformingTheRegistrationStep performingTheRegistrationStep;
    @Given("^Carlos needs to register a medical application$")
    public void carlos_needs_to_register_a_medical_application() {
        performingTheRegistrationStep.openPage();
    }

    @When("^you register a \"([^\"]*)\" in the Hospital Administration application$")
    public void you_register_a_in_the_Hospital_Administration_application(String arg1, List<String> arg2) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        performingTheRegistrationStep.selectMenu(arg1);
        performingTheRegistrationStep.recordInformation(arg2);
    }

    @Then("^he checks that the message \"([^\"]*)\"$")
    public void he_checks_that_the_message(String arg1) {
        performingTheRegistrationStep.checkMessage(arg1);
    }
}
