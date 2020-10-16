package co.com.orange.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectElement {
    public static void selectDropdown(List<WebElementFacade> webElementFacades,String value){
       // System.out.println("cant element: "+ webElementFacades.size());
       // System.out.println("value: "+ value);

        for (int i=0; i<webElementFacades.size(); i++) {
            String s = webElementFacades.get(i).getText();
            //System.out.println(s);
            if (webElementFacades.get(i).getText().trim().equals(value.trim())){
            //    System.out.println(webElementFacades.get(i));
                webElementFacades.get(i).click();
            }
        }
    }
}
