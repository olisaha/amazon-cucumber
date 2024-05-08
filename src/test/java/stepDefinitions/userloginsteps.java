package stepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.homePage;
import pageObject.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DataReader;
import utils.TestBase;
import utils.testContextSetup;

public class userloginsteps {
	public WebDriver driver;
	List<HashMap<String, String>> datamap; // Data driven
	testContextSetup testcontextsetup;

	public userloginsteps(testContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}

	@Given("user is on the amazon home-page")
	public void user_is_on_the_amazon_home_page() throws IOException {

		// Assert.assertTrue(homepage.gettitle().equalsIgnoreCase("Amazon.com. Spend
		// less. Smile more."));

	}

	@When("user sign-in by passing email-id and password with excel row {string}")
	public void user_signin_by_passing_emailid_and_password_with_excel_data(String rows) throws InterruptedException {
		try {
			homePage hp = testcontextsetup.pageobjectmanager.gethomepage();
			ExtentCucumberAdapter.addTestStepLog("User in on the amazon home-page");
			hp.gotologin();
			loginPage lp = testcontextsetup.pageobjectmanager.getloginpage();
			datamap = DataReader.data(System.getProperty("user.dir") + "\\test-data\\excel_amazon.xlsx", "Sheet1");

			int index = Integer.parseInt(rows) - 1;
			String email = datamap.get(index).get("username");
			String pwd = datamap.get(index).get("password");
			lp.passingemailid(email);
			lp.passingpassword(pwd);
			ExtentCucumberAdapter.addTestStepLog("user has suuccessfully logged-in");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
