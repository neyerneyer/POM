package co.com.hospitals.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationMenuPage extends PageObject {
    @FindBy(xpath = "//a[contains(.,'Agregar Doctor')]")
    private WebElementFacade addDoctor;

    @FindBy(xpath = "//a[@href='addPatient']")
    private WebElementFacade addPatient;

    @FindBy(css = "a.list-group-item:nth-child(6)")
    private WebElementFacade addAppointment;

    @FindBy(css = "a.list-group-item:nth-child(4)")
    private WebElementFacade addHospitals;

    @FindBy(css = "a.list-group-item:nth-child(3)")
    private WebElementFacade addRoom;



    public void selectItemMenu(String user){
        if(user.equals("Doctor")){
            addDoctor.click();
        }else {
            addPatient.click();
        }
    }

    public void scheduleAnAppointment(){
        addAppointment.click();
    }

    public void  selectItemHospital(){
        addHospitals.click();
    }
    public void addRoom(){
        addRoom.click();
    }
}
