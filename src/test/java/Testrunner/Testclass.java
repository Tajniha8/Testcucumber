package Testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="Feature//Test.feature",
					glue="Stepdefinition",
					dryRun=true,
					monochrome=true,
					plugin= {"pretty", "html:target/HtmlReports.html"})
public class Testclass {

}
