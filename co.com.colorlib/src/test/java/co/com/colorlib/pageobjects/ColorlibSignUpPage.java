package co.com.colorlib.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.hamcrest.MatcherAssert.assertThat;

public class ColorlibSignUpPage extends PageObject {
    private static final Logger LOGGER = Logger.getLogger(ColorlibSignUpPage.class.getName());

    @FindBy(css = "input.form-control.top:nth-child(1)")
    public WebElementFacade inputUsername;

    @FindBy(xpath = "//div[@id='signup']//input[@type='email']")
    public WebElementFacade inputEmail;

    @FindBy(xpath = "//input[@placeholder='password']")
    public WebElementFacade inputPass;

    @FindBy(xpath ="//input[contains(@placeholder,'re-password')]")
    public  WebElementFacade inputRePass;

    @FindBy(xpath ="//button[contains(.,'Register')]")
    public  WebElementFacade buttonRegister;

    @FindBy(linkText ="Administrator")
    public  WebElementFacade messageValidation;

    public void fillData(){
        inputUsername.sendKeys("bquevedof");
        inputEmail.type("bquevedof@choucairtesting.com");
        inputPass.sendKeys("bquevedof");
        inputRePass.type("bquevedof");
        buttonRegister.click();
    }

    public void checkRegister(String message){
        String data = messageValidation.getText();
        LOGGER.log(Level.WARNING,data);
        assertThat(message, containsAllText(data));
    }
}
