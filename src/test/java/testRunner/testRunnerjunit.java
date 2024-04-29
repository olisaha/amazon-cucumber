package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features\\amazon.feature", glue="stepDefinitions", monochrome=true,dryRun=true)
public class testRunnerjunit {

}
