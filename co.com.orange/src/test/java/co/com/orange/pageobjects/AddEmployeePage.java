package co.com.orange.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class AddEmployeePage extends PageObject {
    @FindBy(id = "pimAddEmployeeForm")
    private WebElementFacade pimAddEmployeeForm;
    @FindBy(id = "firstName")
    private WebElementFacade firstName;
    @FindBy(id = "middleName")
    private WebElementFacade middleName;
    @FindBy(id = "lastName")
    private WebElementFacade lastName;
    @FindBy(id = "employeeId")
    private WebElementFacade employeeId;
    @FindBy(css = "div.select-wrapper.initialized > input.select-dropdown")
    private WebElementFacade location;
    @FindBy(xpath = "//div[@class='select-wrapper initialized']/ul/li[not(@class='disabled ')]/span")
    private WebElementFacade selectLocation;

    public void eventAddEmployee(List<String> data){
        pimAddEmployeeForm.waitUntilVisible();
        firstName.waitUntilClickable();
        firstName.sendKeys(data.get(0));
        middleName.sendKeys(data.get(1));
        lastName.sendKeys(data.get(2));
        location.click();
        System.out.println(selectLocation.getSelectOptions().size());
        for (int i=0; i<18; i++) {
            String s = selectLocation.getText();
            System.out.println(s);
        }
    }
}
