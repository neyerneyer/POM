package co.com.orange.definitions;

import co.com.orange.steps.DiligenceOfInformationStep;
import co.com.orange.utils.models.UserLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class SuccessfulLoginDefinition {
    @Steps
    DiligenceOfInformationStep diligence;

    @Given("^Brandon wants to enter the colorlib website OrageHR$")
    public void brandonWantsToEnterTheColorlibWebsiteOrageHR() {
        diligence.openPage();
    }

    @When("^he authenticates with username and password$")
    public void heAuthenticatesWithUsernameAndPassword(List<UserLogin>userLogins) {
        diligence.loginAction(userLogins);
        System.out.println(userLogins.get(0).getUserName());
        //System.out.println(userLogins.get(1).getUserName());
        System.out.println(userLogins.get(0).getPassword());
       // System.out.println(userLogins.get(1).getPassword());
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @Then("^Then we verify that you entered the page by reviewing the message \"([^\"]*)\"$")
    public void thenWeVerifyThatYouEnteredThePageByReviewingTheMessage(String arg1) {
        diligence.verifyMessageLogin(arg1);
    }
}
