package co.com.orange.pageobjects;

import co.com.orange.utils.SelectElement;
import co.com.orange.utils.models.EntityModel;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class PersonalDetailsPage {
    @FindBy(id = "personal_details_tab")
    private WebElementFacade form;
    @FindBy(id = "otherId")
    private WebElementFacade otherId;
    @FindBy(id = "emp_birthday")
    private WebElementFacade birthday;
    @FindBy(xpath = "(//input[@class='select-dropdown'])[1]")
    private WebElementFacade maritalStatus;
    @FindBy(xpath = "div.select-wrapper.initialized.ng-dirty.ng-valid-parse.ng-not-empty.ng-empty-add ul.dropdown-content.select-dropdown > li")
    private List<WebElementFacade> selectMaritalStatus;

    public void eventAddPersonalDetails(EntityModel data){
        form.waitUntilEnabled();
        otherId.waitUntilVisible();
        otherId.sendKeys(data.getOtherId());
        birthday.sendKeys(data.getDateOfBirth());
        maritalStatus.click();
        SelectElement.selectDropdown(selectMaritalStatus,data.getMaritalStatus());

    }

}
