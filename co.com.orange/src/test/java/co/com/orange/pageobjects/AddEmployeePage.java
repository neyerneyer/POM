package co.com.orange.pageobjects;

import co.com.orange.utils.models.EntityModel;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static co.com.orange.utils.SelectElement.selectDropdown;

public class AddEmployeePage extends PageObject {
    public static String validation;
    @FindBy(tagName = "h1")
    private WebElementFacade pimAddEmployeeForm;
    @FindBy(id = "firstName")
    private WebElementFacade firstName;
    @FindBy(id = "middleName")
    private WebElementFacade middleName;
    @FindBy(id = "lastName")
    private WebElementFacade lastName;
    @FindBy(id = "employeeId")
    private WebElementFacade employeeId;
    @FindBy(id = "photofile")
    private WebElementFacade photograph;
    @FindBy(id = "btnSave")
    private WebElementFacade btnSave;

    @FindBy(xpath = "//div[@class='select-wrapper initialized']/ul/li[not(@class='disabled ')]/span")
    private List<WebElementFacade> selectLocation;


    public void eventAddEmployee(EntityModel data) {
        pimAddEmployeeForm.waitUntilVisible();
        firstName.waitUntilClickable();
        firstName.sendKeys(data.getFirstName());
        middleName.sendKeys(data.getMiddleName());
        lastName.sendKeys(data.getLastName());
        validation = employeeId.getValue();
        //employeeId.sendKeys(data.getEmployeeId());
        photograph.sendKeys("C:\\CursoAutomatizacion\\POM\\co.com.orange\\src\\test\\resources\\img\\img.png");
        btnSave.waitUntilClickable();
        btnSave.click();

        //selectDropdown(selectLocation,data.getLocation());
        //btnSave.waitUntilClickable();
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        //javascriptExecutor.executeScript("arguments[0].click()",btnSave);
        //btnSave.click();
        //btnSave.waitUntilNotVisible();
    }
}
