package co.com.colorlib.steps;

import co.com.colorlib.pageobjects.ColorlibLoginPage;
import co.com.colorlib.pageobjects.ColorlibPage;
import co.com.colorlib.pageobjects.ColorlibSignUpPage;
import net.thucydides.core.annotations.Step;

public class PopupValidationStep {
    ColorlibPage colorlibPage;
    ColorlibLoginPage colorlibLoginPage;
    ColorlibSignUpPage colorlibSignUpPage;

    @Step
    public void openUrl() {
        colorlibPage.open();
    }
    @Step
    public void loginColorlib(String user, String password) {
        // Enter data
        colorlibLoginPage.setAccessData(user, password);
    }
    @Step
    public void verifyMessage(String message) {
        colorlibLoginPage.checkLogin(message);
    }
    @Step
    public void fillOutForm() {
        colorlibLoginPage.link();
        colorlibSignUpPage.fillData();
    }
    @Step
    public void verifyRegister(String message) {
        colorlibSignUpPage.checkRegister(message);
    }
}
