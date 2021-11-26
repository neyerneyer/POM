package co.com.hospitals;

import co.com.hospitals.utils.excel.BeforeSuite;
import co.com.hospitals.utils.excel.DataToFeature;
import co.com.hospitals.utils.excel.RunnerPersonalizado;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.io.IOException;

public class RunnerTags {
    @Before
    public void test() {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
            case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(CRunnerPedido.class);
    }

    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(features = "src/test/resources/features/hospital_administration.feature",
            tags = {"@addRoom"},
           glue = "co.com.hospitals.definitions"
    )
    public static class CRunnerPedido {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/features/hospital_administration.feature");
        }
    }
}