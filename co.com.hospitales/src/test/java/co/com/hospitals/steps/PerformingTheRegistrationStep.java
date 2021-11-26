package co.com.hospitals.steps;

import co.com.hospitals.pageobjects.HospitalsPage;
import co.com.hospitals.pageobjects.RegisterUserPage;
import co.com.hospitals.pageobjects.RegistrationMenuPage;
import co.com.hospitals.pageobjects.SavesLogDataPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class PerformingTheRegistrationStep {
    HospitalsPage hospitalsPage;
    RegistrationMenuPage registrationMenuPage;
    RegisterUserPage registerUserPage;
    SavesLogDataPage savesLogDataPage;

    @Step
    public void openPage(){
        hospitalsPage.open();
    }

    @Step
    public void selectMenu(String user){
        registrationMenuPage.selectItemMenu(user);

    }
    @Step
    public void recordInformation(List<String> arg2){
        registerUserPage.fillOutInformation(arg2);
    }
    @Step
    public void checkMessage(String message){
        savesLogDataPage.validationMessage(message);
    }
}
