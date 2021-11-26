package co.com.hospitals.definitions;

import co.com.hospitals.steps.AddRoomHospitalStep;
import co.com.hospitals.steps.PerformingTheRegistrationStep;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class MyStepdefs {
    @Steps
    PerformingTheRegistrationStep performingTheRegistrationStep;
    @Steps
    AddRoomHospitalStep addRoomHospitalStep;

    @Given("^Brandon wants to enter the website hospital$")
    public void brandon_wants_to_enter_the_website_hospital() {
        performingTheRegistrationStep.openPage();
    }

    @When("^you add a hospital room$")
    public void you_add_a_hospital_room(List<List<String>> dato) {
        addRoomHospitalStep.enterToAddHospitalRoom();
        addRoomHospitalStep.addTypeHospitalRoom(dato.get(0));
        //System.out.println(dato.get(0));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @Then("^check that the message of the added room \"([^\"]*)\"$")
    public void check_that_the_message_of_the_added_room(String arg1) {
        addRoomHospitalStep.verifyRoom(arg1);
    }
}
