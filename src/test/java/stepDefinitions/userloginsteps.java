package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestBase;
import utils.testContextSetup;

public class userloginsteps {
	public WebDriver driver;
	
	testContextSetup testcontextsetup;
public userloginsteps(testContextSetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
}

	@Given("user is on the amazon home-page")
	public void user_is_on_the_amazon_home_page() throws IOException {


		//Assert.assertTrue(homepage.gettitle().equalsIgnoreCase("Amazon.com. Spend less. Smile more."));


	}
	@When("user clicked on sign-in option and signed in with valid credential")
	public void user_clicked_on_sign_in_option_and_signed_in_with_valid_credential() throws InterruptedException {
		try {
			homePage hp=testcontextsetup.pageobjectmanager.gethomepage();
			Thread.sleep(3000);
			hp.gotologin();
			loginPage lp=testcontextsetup.pageobjectmanager.getloginpage();
			lp.logging();
		}catch(Exception e) {
			e.printStackTrace();
		}



	}




}
