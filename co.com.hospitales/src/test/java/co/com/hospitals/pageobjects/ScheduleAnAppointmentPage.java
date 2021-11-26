package co.com.hospitals.pageobjects;

import co.com.hospitals.utils.ExcelManager;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class ScheduleAnAppointmentPage extends PageObject {

    ExcelManager ExcelManager;

    @FindBy(id = "datepicker")
    private WebElementFacade datepiker;
    @FindBy(css = "div.form-group:nth-child(2) > input.form-control:nth-child(2)")
    private WebElementFacade patientsIdentityCard;
    @FindBy(css = "div.form-group:nth-child(3) > input.form-control:nth-child(2)")
    private WebElementFacade doctorsIdCard;
    @FindBy(tagName = "textarea")
    private WebElementFacade textarea;
    @FindBy(linkText = "Guardar")
    private WebElementFacade save;

    public void registerMedicalAppointment() throws FilloException {
        this.ExcelManager = new ExcelManager();
        this.ExcelManager.strRutaArchivo("src/test/resources/datadriven/data.xlsx");
        String strQuery = "SELECT * FROM datos";
        Recordset objRecord = this.ExcelManager.leerExcel(strQuery);
        while (objRecord.next()){
            datepiker.sendKeys(objRecord.getField("datePicker"));
            datepiker.sendKeys(Keys.RETURN);
            patientsIdentityCard.sendKeys(objRecord.getField("patientsIdentityCard"));
            doctorsIdCard.sendKeys(objRecord.getField("doctorsIdCard"));
            textarea.sendKeys(objRecord.getField("textarea"));

        }
        save.click();
    }


}
