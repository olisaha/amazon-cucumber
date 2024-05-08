package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Then;
import pageObject.mycartPage;
import pageObject.searchedProductPage;
import utils.TestBase;
import utils.testContextSetup;

public class mycartsteps extends TestBase {
	testContextSetup testcontextsetup;
	TestBase testbase;

	public mycartsteps(TestBase testbase, testContextSetup testcontextsetup) {
		this.testbase = testbase;
		this.testcontextsetup = testcontextsetup;

	}

	@Then("user check mycart to check if the selected product is succefully added to cart")
	public void user_check_mycart_to_check_if_the_selected_product_is_succefully_added_to_cart()
			throws InterruptedException, IOException {
		mycartPage mcp = testcontextsetup.pageobjectmanager.getmycartpage();

		mcp.clickmycartbutton();
		System.out.println(testcontextsetup.searchedprodname);
		ExtentCucumberAdapter.addTestStepLog("User comes to my cart page");
		mcp.validatemycartproduct();
		Assert.assertEquals(mcp.validatemycartproduct(), testcontextsetup.searchedprodname);
		//Assert.assertEquals(mcp.validatemycartproduct(), "xyz");
		ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "validating the selected product");
		mcp.proceedtopayment();

		mcp.deleteallproduct();

	}

}
