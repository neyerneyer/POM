package co.com.hospitals.steps;

import co.com.hospitals.pageobjects.RegistrationMenuPage;
import co.com.hospitals.pageobjects.SavesLogDataPage;
import co.com.hospitals.pageobjects.ScheduleAnAppointmentPage;
import com.codoid.products.exception.FilloException;
import net.thucydides.core.annotations.Step;

public class ScheduleAnAppointmentStep {
    RegistrationMenuPage registrationMenuPage;
    ScheduleAnAppointmentPage scheduleAnAppointmentPage;
    SavesLogDataPage savesLogDataPage;

    @Step
    public void enterAppointmentPage() throws FilloException {
        registrationMenuPage.scheduleAnAppointment();
        scheduleAnAppointmentPage.registerMedicalAppointment();
    }
    @Step
    public void checkTheScheduleOfAnAppointment(String message){
        savesLogDataPage.validationMessage(message);
    }
}
