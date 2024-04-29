package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.homePage;
import pageObject.loginPage;
import pageObject.pageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.testContextSetup;

public class userloginsteps {
	//public WebDriver driver;
	testContextSetup testcontextsetup;
	homePage homepage;
	
public userloginsteps(testContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.homepage=testcontextsetup.pageobjectmanager.loadinghomepage();
	}

	@Given("user is on the amazon home-page")
	public void user_is_on_the_amazon_home_page() throws IOException {
	
		
		//Assert.assertTrue(homepage.gettitle().equalsIgnoreCase("Amazon.com. Spend less. Smile more."));
		
		
	}
	@When("user clicked on sign-in option and signed in with valid credential")
	public void user_clicked_on_sign_in_option_and_signed_in_with_valid_credential() throws InterruptedException {
		try {
		Thread.sleep(3000);
		homepage.gotologin();
		loginPage lp=testcontextsetup.pageobjectmanager.loadingloginpage();
		lp.logging();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	
	}
	
	

	
}
