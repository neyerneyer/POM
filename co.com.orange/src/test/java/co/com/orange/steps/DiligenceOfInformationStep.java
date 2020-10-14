package co.com.orange.steps;

import co.com.orange.pageobjects.AddEmployeePage;
import co.com.orange.pageobjects.OrangeLoginPage;
import co.com.orange.pageobjects.OrangeMenuPage;
import co.com.orange.pageobjects.OrangePage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class DiligenceOfInformationStep {
    OrangePage orangePage;
    OrangeLoginPage orangeLoginPage;
    OrangeMenuPage orangeMenuPage;
    AddEmployeePage addEmployeePage;


    @Step
    public void openPage(){
        orangePage.open();
    }
    @Step
    public void loginAction(){
        orangeLoginPage.eventLogin();
    }
    @Step
    public void actionAddEmployee(List<String> data){
        orangeMenuPage.eventMenu();
        addEmployeePage.eventAddEmployee(data);
    }
}
