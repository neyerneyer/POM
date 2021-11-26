package co.com.hospitals.definitions;

import co.com.hospitals.steps.DiligenceOfTheHospitalInformationStep;
import co.com.hospitals.steps.PerformingTheRegistrationStep;
import co.com.hospitals.steps.ScheduleAnAppointmentStep;
import co.com.hospitals.utils.models.EntityModel;
import com.codoid.products.exception.FilloException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PerformingTheRegistrationDefinition {
    @Steps
    PerformingTheRegistrationStep performingTheRegistrationStep;

    @Steps
    ScheduleAnAppointmentStep scheduleAnAppointmentStep;

    @Steps
    DiligenceOfTheHospitalInformationStep diligenceOfTheHospitalInformationStep;

    @Given("^Carlos needs to register a medical application$")
    public void carlosNeedsToRegisterAMedicalApplication() {
        performingTheRegistrationStep.openPage();
    }


    @When("^you register a \"([^\"]*)\" in the hospital administration application$")
    public void youRegisterAInTheHospitalAdministrationApplication(String arg1, List<String> arg2) {
        performingTheRegistrationStep.selectMenu(arg1);
        performingTheRegistrationStep.recordInformation(arg2);
    }

    @Then("^he checks that the message \"([^\"]*)\"$")
    public void heChecksThatTheMessage(String arg1) {
        performingTheRegistrationStep.checkMessage(arg1);
    }


    @Given("^carlos needs to see the doctor$")
    public void carlosNeedsToSeeTheDoctor() {
        performingTheRegistrationStep.openPage();
    }


    @When("^he makes an appointment$")
    public void heMakesAnAppointment() throws FilloException {
        scheduleAnAppointmentStep.enterAppointmentPage();
    }

    @Then("^he checks that message$")
    public void heChecksThatMessage() {
        scheduleAnAppointmentStep.checkTheScheduleOfAnAppointment("Datos guardados correctamente");
    }

    @Given("^Carlos needs to register a new hospital$")
    public void carlosNeedsToRegisterANewHospital() {
        performingTheRegistrationStep.openPage();
    }


    @When("^he record hospital information$")
    public void heRecordHospitalInformation(List<EntityModel> arg1) {
        diligenceOfTheHospitalInformationStep.withHospitalInformation(arg1);
    }

    @Then("^check that the correct message \"([^\"]*)\"$")
    public void checkThatTheCorrectMessage(String arg1) {
        diligenceOfTheHospitalInformationStep.checkMessageFeature(arg1);
    }
}
