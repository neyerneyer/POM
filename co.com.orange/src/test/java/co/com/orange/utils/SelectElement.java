package co.com.orange.utils;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectElement {
    public static void selectDropdown(List<WebElementFacade> webElementFacades, String value) {
        // System.out.println("cant element: "+ webElementFacades.size());
        // System.out.println("value: "+ value);

        for (int i = 0; i < webElementFacades.size(); i++) {
            String s = webElementFacades.get(i).getText();
            //System.out.println(s);
            if (webElementFacades.get(i).getText().trim().equals(value.trim())) {
                //    System.out.println(webElementFacades.get(i));
                webElementFacades.get(i).click();
            }
        }
    }

    public static void scrollToElement(WebElementFacade element) {
        Actions actions = new Actions(Serenity.getWebdriverManager().getWebdriver());
        actions.moveToElement(element);
        actions.perform();
        WebDriverWait wait = new WebDriverWait(Serenity.getWebdriverManager().getWebdriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static String consultarValorTabla() {

        WebDriver driver = Serenity.getWebdriverManager().getWebdriver();

        WebElement tabla = driver.findElement(By.tagName("table"));

        WebElement fila = tabla.findElement(By.xpath("//tbody//tr[1]"));
        WebElement celdaNecesitada = tabla.findElement(By.xpath("//tbody/tr[1]/td[2]"));
        List contenedorEmpresas = tabla.findElements(By.xpath("//tbody/tr/td[2]"));
        String s = null;
        for (int i = 0; i < contenedorEmpresas.size(); i++) {
            fila = tabla.findElement(By.xpath("//tbody//tr[" + (i + 1) + "]"));
            System.out.println("Empresa #" + (i + 1) + " - " + tabla.findElement(By.xpath("//tbody/tr[" + (i + 1) + "]/td[2]")).getText());
            s = tabla.findElement(By.xpath("//tbody/tr[" + (i + 1) + "]/td[2]")).getText();
            if ("0257".equals(s)) {
                break;
            }
        }
        System.out.println("Cantidad de empresas " + contenedorEmpresas.size());
        System.out.println("Datos de la fila 1 " + fila.getText());
        System.out.println("Celda necesitada " + s);
        return s;
    }
}
