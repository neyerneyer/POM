package co.com.hospitals.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RegisterUserPage extends PageObject {
    @FindBy(xpath = "//input[contains(@placeholder,'Ingrese el nombre')]")
    private WebElementFacade fullName;

    @FindBy(xpath = "//input[contains(@placeholder,'Ingrese los apellidos')]")
    private WebElementFacade lastName;

    @FindBy(xpath = "//input[contains(@placeholder,'Ingrese el teléfono')]")
    private WebElementFacade telephone;

    @FindBy(xpath = "//select[contains(@class,'form-control')]")
    private WebElementFacade identificationType;

    @FindBy(xpath = "//input[contains(@placeholder,'Ingrese el documento de identidad')]")
    private WebElementFacade identification;

    @FindBy(linkText = "Guardar")
    private WebElementFacade save;

    public void fillOutInformation(List<String> data) {
        fullName.sendKeys(data.get(0));
        lastName.sendKeys(data.get(1));
        telephone.sendKeys(data.get(2));
        identificationType.select().byVisibleText(data.get(3));
        identification.sendKeys(data.get(4));
        save.click();
    }


}
