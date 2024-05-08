package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.testContextSetup;

public class Hooks {
	testContextSetup testcontextsetup;
	public Hooks(testContextSetup testcontextsetup) {
this.testcontextsetup=testcontextsetup;
}

@After
public void Afterscenario() throws IOException {
	testcontextsetup.testbase.WebDriverManager().quit();;
	
}
@AfterStep
public void AddScreenshot(Scenario scenario) throws IOException
{
	WebDriver driver =testcontextsetup.testbase.WebDriverManager();
	if(scenario.isFailed())
	{
	File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
	scenario.attach(fileContent, "image/png", "image");
	
	}

}
}
