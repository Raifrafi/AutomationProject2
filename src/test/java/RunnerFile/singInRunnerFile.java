package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features ="Features",
glue = "stepDefination",
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
	)
public class singInRunnerFile extends AbstractTestNGCucumberTests{

}
