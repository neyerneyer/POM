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

    @FindBy(css = "label[for=telephone]+input")
    private WebElementFacade telephone;

    @FindBy(css = "select.form-control")
    private WebElementFacade identificationType;

    @FindBy(xpath = "//input[contains(@placeholder,'Ingrese el documento de identidad')]")
    private WebElementFacade identification;

    @FindBy(linkText = "Guardar")
    private WebElementFacade save;

    public void fillOutInformation(List<String> arg2){
        fullName.sendKeys(arg2.get(0));
        lastName.sendKeys(arg2.get(1));
        telephone.sendKeys(arg2.get(2));
        identificationType.select().byVisibleText(arg2.get(3));
        identification.sendKeys(arg2.get(4));
        //save.click();
    }
}
