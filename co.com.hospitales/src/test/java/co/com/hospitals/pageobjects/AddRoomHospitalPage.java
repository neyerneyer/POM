package co.com.hospitals.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;

public class AddRoomHospitalPage extends PageObject {
    @FindBy(name = "name")
    private WebElementFacade roomNumber;
    @FindBy(xpath = "//a[contains(text(),'Guardar')]")
    private WebElementFacade btnSave;
    @FindBy(xpath = "//p[contains(text(),'Datos guardados correctamente.')]")
    private WebElementFacade messageRoom;

    public void selectRoom(String s){
        roomNumber.sendKeys(s);
        btnSave.click();
    }
    public void verifyCreateRoom(String arg1){
        MatcherAssert.assertThat(arg1,containsAllText(messageRoom.getText()));
    }
}
