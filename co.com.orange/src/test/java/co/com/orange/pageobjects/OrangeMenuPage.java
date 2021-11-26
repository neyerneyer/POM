package co.com.orange.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

public class OrangeMenuPage extends PageObject {
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElementFacade menuPIM;

    @FindBy(id = "menu_pim_addEmployee")
    private WebElementFacade menuPimAddEmployee;

    @FindBy(tagName = "h1")
    private WebElementFacade txtDashboard;

    @FindBy(id = "menu_pim_viewEmployeeList")
    private WebElementFacade menuPimViewEmployeeList;


    public void  eventMenu(){
        menuPIM.click();
        menuPimAddEmployee.click();
    }
    public void  eventMenuListEmployee(){
        menuPIM.click();
        menuPimViewEmployeeList.click();
    }

    public void verifyLogin(String message){
        assertThat(message, containsAllText(txtDashboard.getText()));
    }

}
