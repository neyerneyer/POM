package co.com.orange.pageobjects;

import co.com.orange.utils.models.EntityModel;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static co.com.orange.utils.SelectElement.selectDropdown;

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
    private List <WebElementFacade> selectLocation;
    @FindBy(xpath = "//*[@id='systemUserSaveBtn']")
    private WebElementFacade btnSave;

    public void eventAddEmployee(EntityModel data){
        pimAddEmployeeForm.waitUntilVisible();
        firstName.waitUntilClickable();
        firstName.sendKeys(data.getFirstName());
        middleName.sendKeys(data.getMiddleName());
        lastName.sendKeys(data.getLastName());
        location.click();
        selectDropdown(selectLocation,data.getLocation());
        btnSave.waitUntilClickable();
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        //javascriptExecutor.executeScript("arguments[0].click()",btnSave);
        //btnSave.click();
        btnSave.waitUntilNotVisible();
    }
}
