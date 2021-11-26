package co.com.hospitals.steps;

import co.com.hospitals.pageobjects.RegisterHospitalPage;
import co.com.hospitals.pageobjects.RegistrationMenuPage;
import co.com.hospitals.pageobjects.SavesLogDataPage;
import co.com.hospitals.utils.models.EntityModel;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class DiligenceOfTheHospitalInformationStep {

    RegistrationMenuPage registrationMenuPage;
    RegisterHospitalPage registerHospitalPage;
    SavesLogDataPage savesLogDataPage;

    @Step
    public void withHospitalInformation(List<EntityModel> arg1){
        EntityModel data = arg1.get(0);
        registrationMenuPage.selectItemHospital();
        registerHospitalPage.fillOutTheHospitalInformation(data);
    }
    @Step
    public void checkMessageFeature(String message){
        savesLogDataPage.validationMessage(message);
    }
}
