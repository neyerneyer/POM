package co.com.orange.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeMenuPage extends PageObject {
    @FindBy(xpath = "//li[@id='menu_pim_viewPimModule']/a")
    private WebElementFacade menuPIM;

    @FindBy(id = "menu_pim_addEmployee")
    private WebElementFacade menuPimAddEmployee;

    public void  eventMenu(){
        menuPIM.click();
        menuPimAddEmployee.click();
    }

}
