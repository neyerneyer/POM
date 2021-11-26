package co.com.orange.definitions;

import co.com.orange.steps.DiligenceOfInformationStep;
import co.com.orange.utils.models.EntityModel;
import co.com.orange.utils.models.UserLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class DiligenceOfInformationDefinition {
    @Steps
    DiligenceOfInformationStep diligenceOfInformationStep;

    @Given("^Juan needs to create an employee at OrageHR$")
    public void juanNeedsToCreateAnEmployeeAtOrageHR(List<UserLogin> data) {
        diligenceOfInformationStep.openPage();
        diligenceOfInformationStep.loginAction(data);
    }

    @When("^he makes the registration entry in the application$")
    public void heMakesTheRegistrationEntryInTheApplication(List<EntityModel> dataTable) {
        diligenceOfInformationStep.actionAddEmployee(dataTable);
        diligenceOfInformationStep.actionAddPersonalDetails(dataTable);

    }

    @Then("^he displays the new employee in the application$")
    public void heDisplaysTheNewEmployeeInTheApplication() {
        diligenceOfInformationStep.actionEmployeeList();
    }

}
