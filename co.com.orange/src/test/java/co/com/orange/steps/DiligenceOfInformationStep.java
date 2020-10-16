package co.com.orange.steps;

import co.com.orange.pageobjects.*;
import co.com.orange.utils.models.EntityModel;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class DiligenceOfInformationStep {
    OrangePage orangePage;
    OrangeLoginPage orangeLoginPage;
    OrangeMenuPage orangeMenuPage;
    AddEmployeePage addEmployeePage;
    PersonalDetailsPage personalDetailsPage;


    @Step
    public void openPage(){
        orangePage.open();
    }
    @Step
    public void loginAction(){
        orangeLoginPage.eventLogin();
    }
    @Step
    public void actionAddEmployee(List<EntityModel> data){
        EntityModel entityModel = data.get(0);
        orangeMenuPage.eventMenu();
        addEmployeePage.eventAddEmployee(entityModel);
    }
    @Step
    public void actionAddPersonalDetails(List<EntityModel> data){
        EntityModel entityModel = data.get(0);
        personalDetailsPage.eventAddPersonalDetails(entityModel);
    }
}
