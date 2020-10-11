package co.com.colorlib.definitions;

import co.com.colorlib.steps.PopupValidationStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
    @Steps
    PopupValidationStep popupValidationStep;

    @Given("^brandon wants to enter the colorlib website$")
    public void brandonWantsToEnterTheColorlibWebsite() {
        popupValidationStep.openUrl();
    }

    @When("^he authenticates with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void heAuthenticatesWithUsernameAndPassword(String user, String pass) {
        popupValidationStep.loginColorlib(user, pass);
    }

    @Then("^Then we verify that you entered the page by reviewing the message \"([^\"]*)\"$")
    public void thenWeVerifyThatYouEnteredThePageByReviewingTheMessage(String messageFeature) {
        popupValidationStep.verifyMessage(messageFeature);
    }

    @Given("^that Brandon wants to register with Colorlib$")
    public void thatBrandonWantsToRegisterWithColorlib() {
        popupValidationStep.openUrl();
    }

    @When("^he has completed the form$")
    public void heHasCompletedTheForm() {
        popupValidationStep.fillOutForm();
    }

    @Then("^he verify the successful entry reviewing the message \"([^\"]*)\"$")
    public void heVerifyTheSuccessfulEntryReviewingTheMessage(String message) {
        popupValidationStep.verifyRegister(message);
    }

}

