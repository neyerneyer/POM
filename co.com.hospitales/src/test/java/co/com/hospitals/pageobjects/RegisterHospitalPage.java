package co.com.hospitals.pageobjects;

import co.com.hospitals.utils.models.EntityModel;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterHospitalPage extends PageObject {
    @FindBy(css = "div.form-group:nth-child(1) > input")
    private WebElementFacade code;
    @FindBy(css = "div.form-group:nth-child(2) > input")
    private WebElementFacade fullName;
    @FindBy(css = "div.form-group:nth-child(3) > input")
    private WebElementFacade address;
    @FindBy(css = "div.form-group:nth-child(4) > input")
    private WebElementFacade phone;
    @FindBy(id = "department")
    private WebElementFacade department;
    @FindBy(id = "municipality")
    private WebElementFacade municipality;
    @FindBy(linkText = "Guardar")
    private WebElementFacade save;

    public void fillOutTheHospitalInformation(EntityModel data){
        code.sendKeys(data.getCode());
        fullName.sendKeys(data.getFullName());
        address.sendKeys(data.getAddress());
        phone.sendKeys(data.getPhone());
        department.select().byVisibleText(data.getDepartment());
        municipality.select().byVisibleText(data.getMunicipality());
        save.click();

    }

}
