package co.com.orange.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddEmployeePage extends PageObject {
    @FindBy(id = "pimAddEmployeeForm")
    private WebElementFacade pimAddEmployeeForm;
    @FindBy(id = "firstName")
    private WebElementFacade firstName;
    @FindBy(id = "middleName")
    private WebElementFacade middleName;
    @FindBy(id = "lastName")
    private WebElementFacade lastName;
    @FindBy(id = "employeeId")
    private WebElementFacade employeeId;
    @FindBy(css = "div.select-wrapper.initialized > input.select-dropdown")
    private WebElementFacade location;
    @FindBy(xpath = "//div[@class='select-wrapper initialized']/ul/li[not(@class='disabled ')]/span")
    private List <WebElementFacade> selectLocation;

    public void eventAddEmployee(List<String> data){
        pimAddEmployeeForm.waitUntilVisible();
        firstName.waitUntilClickable();
        firstName.sendKeys(data.get(0));
        middleName.sendKeys(data.get(1));
        lastName.sendKeys(data.get(2));
        location.click();

        System.out.println(selectLocation.size());
        for (int i=0; i<selectLocation.size(); i++) {
            String s = selectLocation.get(i).getText();
            System.out.println(s);
            if (selectLocation.get(i).getText().trim().equals(data.get(4).trim())){
                System.out.println(selectLocation.get(i));
                selectLocation.get(i).click();
            }

        }
    }
}
