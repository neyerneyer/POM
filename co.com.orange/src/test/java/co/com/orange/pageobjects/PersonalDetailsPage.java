package co.com.orange.pageobjects;

import co.com.orange.utils.SelectElement;
import co.com.orange.utils.models.EntityModel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PersonalDetailsPage extends PageObject {
    @FindBy(xpath = "//h1[contains(text(),'Personal Details')]")
    private WebElementFacade form;
    @FindBy(id = "btnSave")
    private WebElementFacade btnEditSavePersonalDetails;
    @FindBy(id = "personal_txtOtherID")
    private WebElementFacade otherId;
    @FindBy(id = "personal_DOB")
    private WebElementFacade birthday;
    @FindBy(id = "personal_cmbMarital")
    private WebElementFacade maritalStatus;


//    @FindBy(xpath = "div.select-wrapper.initialized.ng-dirty.ng-valid-parse.ng-not-empty.ng-empty-add ul.dropdown-content.select-dropdown > li")
//    private List<WebElementFacade> selectMaritalStatus;

    public void eventAddPersonalDetails(EntityModel data) {
        form.waitUntilVisible();
        SelectElement.scrollToElement(btnEditSavePersonalDetails);
        btnEditSavePersonalDetails.waitUntilClickable().click();
        otherId.waitUntilClickable().sendKeys(data.getOtherId());
        birthday.clear();
        birthday.sendKeys(data.getDateOfBirth(), Keys.ENTER);
        maritalStatus.selectByVisibleText(data.getMaritalStatus());
        Serenity.getWebdriverManager().getWebdriver().findElement(By.xpath("//label[contains(text(),'"+data.getGender()+"')]")).click();
        //SelectElement.selectDropdown(selectMaritalStatus,data.getMaritalStatus());
        btnEditSavePersonalDetails.click();

    }

}
