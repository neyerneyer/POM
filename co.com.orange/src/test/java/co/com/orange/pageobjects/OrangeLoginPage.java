package co.com.orange.pageobjects;

import co.com.orange.utils.models.UserLogin;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeLoginPage extends PageObject {
    @FindBy(id = "txtUsername")
    private WebElementFacade inputUsername;
    @FindBy(id = "txtPassword")
    private WebElementFacade inputPassword;
    @FindBy(id = "btnLogin")
    private WebElementFacade btnLogin;

    public void eventLogin(UserLogin model){
        inputUsername.sendKeys(model.getUserName());
        inputPassword.type(model.getPassword());
        btnLogin.click();
    }
}
