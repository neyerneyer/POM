package co.com.orange.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeLoginPage extends PageObject {
    @FindBy(id = "btnLogin")
    private WebElementFacade btnLogin;

    public void eventLogin(){
        btnLogin.click();
    }
}
