package co.com.orange;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/orange.feature",
        //tags = "@Regression",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
