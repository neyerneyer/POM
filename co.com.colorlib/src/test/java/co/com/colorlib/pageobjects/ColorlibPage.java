package co.com.colorlib.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibPage extends PageObject {
    private static final Logger LOGGER = getLogger(ColorlibPage.class.getName());
}
