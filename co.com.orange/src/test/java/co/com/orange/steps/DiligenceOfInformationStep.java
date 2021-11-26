package co.com.orange.steps;

import co.com.orange.pageobjects.*;
import co.com.orange.utils.models.EntityModel;
import co.com.orange.utils.models.UserLogin;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class DiligenceOfInformationStep {
    OrangePage orangePage;
    OrangeLoginPage orangeLoginPage;
    OrangeMenuPage orangeMenuPage;
    AddEmployeePage addEmployeePage;
    PersonalDetailsPage personalDetailsPage;
    EmployeeListPage employeeListPage;


    @Step
    public void openPage(){
        orangePage.open();
    }
    @Step
    public void loginAction(List<UserLogin> userLogins){
        UserLogin model = userLogins.get(0);
        orangeLoginPage.eventLogin(model);
    }
    @Step
    public void verifyMessageLogin(String message) {
        orangeMenuPage.verifyLogin(message);
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
    @Step
    public void actionEmployeeList(){
        orangeMenuPage.eventMenuListEmployee();
        employeeListPage.validateEmployee();

    }
}
