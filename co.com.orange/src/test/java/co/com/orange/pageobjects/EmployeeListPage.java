package co.com.orange.pageobjects;

import co.com.orange.utils.SelectElement;
import co.com.orange.utils.models.EntityModel;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static co.com.orange.pageobjects.AddEmployeePage.validation;

public class EmployeeListPage extends PageObject {
    List<EntityModel>entityModels;
@FindBy(xpath = "(//tr[@class='odd'])[1]")
private WebElementFacade campo;
    @FindBy(id = "empsearch_id")
    private WebElementFacade id;
    @FindBy(id = "searchBtn")
    private WebElementFacade searchBtn;

    public void validateEmployee(){
        id.sendKeys(validation);
        searchBtn.click();
        SelectElement.scrollToElement(campo);
        MatcherAssert.assertThat(validation,containsAllText(SelectElement.consultarValorTabla()));

    }
}
