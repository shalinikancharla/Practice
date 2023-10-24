package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features/IntegrationFeature.feature"},
        glue={"StepDefinition"} ,
        tags= "@tag1 or @tag2",
        plugin = {"pretty",
        "junit:target/MyReports/report.json"}


)
public class TestRunner
{
    //"html:target/report.html"
    //html:target/cucumber.html
    //json:target/cucumber.json
    //junit:target/MyReports/report.xml


}

