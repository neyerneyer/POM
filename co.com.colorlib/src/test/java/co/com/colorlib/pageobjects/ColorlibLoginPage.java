package co.com.colorlib.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.slf4j.Logger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public class ColorlibLoginPage extends PageObject {
    private static final Logger LOGGER = getLogger(ColorlibLoginPage.class.getName());

    //user field
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElementFacade inputUserName;
    //password field
    @FindBy(xpath = "//div[@id='login']//input[2]")
    public WebElementFacade inputPassword;

    //button Sign in
    @FindBy(css = "button.btn.btn-lg.btn-primary.btn-block")
    public WebElementFacade buttonSignIn;

    //message validation
    @FindBy(id = "bootstrap-admin-template")
    public WebElementFacade messageValidation;

    //Sign Up
    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    public WebElementFacade linkSignUp;


    public void setAccessData(String user, String password) {
        inputUserName.sendKeys(user);
        inputPassword.sendKeys(password);
        buttonSignIn.click();
    }
    public void checkLogin(String message){
        String data = messageValidation.getText();
        LOGGER.info(data);
        LOGGER.debug(data);
        LOGGER.error(data);
        LOGGER.warn(data);
        LOGGER.trace(data);
        assertThat(message, containsAllText(data));
    }

    public void link(){
        linkSignUp.click();
    }

}
