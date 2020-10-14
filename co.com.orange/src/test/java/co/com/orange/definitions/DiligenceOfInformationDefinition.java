package co.com.orange.definitions;

import co.com.orange.steps.DiligenceOfInformationStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class DiligenceOfInformationDefinition {
    @Steps
    DiligenceOfInformationStep diligenceOfInformationStep;

    @Given("^Juan needs to create an employee at OrageHR$")
    public void juanNeedsToCreateAnEmployeeAtOrageHR() {
        diligenceOfInformationStep.openPage();
        diligenceOfInformationStep.loginAction();
    }

    @When("^he makes the registration entry in the application$")
    public void heMakesTheRegistrationEntryInTheApplication(List<String> dataTable) {
        diligenceOfInformationStep.actionAddEmployee(dataTable);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @Then("^he displays the new employee in the application$")
    public void heDisplaysTheNewEmployeeInTheApplication() {

    }
}
