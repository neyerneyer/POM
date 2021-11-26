package co.com.hospitals.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

public class SavesLogDataPage extends PageObject {
    @FindBy(css= "div.panel-body p")
    private WebElementFacade message;

    public void validationMessage(String messageFeature){
        assertThat(messageFeature,containsText(message.getText()));
        //assertThat(messageFeature,containsString(message.getText()));
    }
}
