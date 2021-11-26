package co.com.hospitals.steps;

import co.com.hospitals.pageobjects.AddRoomHospitalPage;
import co.com.hospitals.pageobjects.RegistrationMenuPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class AddRoomHospitalStep {
    RegistrationMenuPage registrationMenuPage;
    AddRoomHospitalPage addRoomHospitalPage;

    @Step
    public void enterToAddHospitalRoom(){
        registrationMenuPage.addRoom();
    }
    @Step
    public void addTypeHospitalRoom(List<String> strings){
        addRoomHospitalPage.selectRoom(strings.get(0));
    }
    @Step
    public void verifyRoom(String arg1){
        addRoomHospitalPage.verifyCreateRoom(arg1);
    }
}
