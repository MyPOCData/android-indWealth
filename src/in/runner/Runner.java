package in.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import org.testng.annotations.Test;
import ui.app.testng.AppTesNgMethods;

@CucumberOptions(plugin = {"json:target/cucumber-report/cucumber-report-feature-composite.json",
    "pretty", "rerun:target/rerun.txt"}, features = {"user-files/feature-files"}, glue = {
    "in/steps"}, tags = {"@xstream", "~@wip"}, monochrome = true, strict = true)
public class Runner extends AppTesNgMethods {

  @Test(dataProvider = "scenarios",timeOut = 15*60*000)
  public void runScenarios(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature,
      String tagName, String testName, String attributes) throws Throwable {
    testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
  }
}
