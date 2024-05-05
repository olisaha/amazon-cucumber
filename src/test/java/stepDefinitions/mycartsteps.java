package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import freemarker.log.Logger;
import io.cucumber.java.en.Then;
import pageObject.mycartPage;
import pageObject.searchedProductPage;
import utils.TestBase;
import utils.testContextSetup;

public class mycartsteps extends TestBase{
	testContextSetup testcontextsetup;
	TestBase testbase;
	public mycartsteps(TestBase testbase,testContextSetup testcontextsetup) 
	{
		this.testbase=testbase;
		this.testcontextsetup=testcontextsetup;

	}
	@Then("user check mycart to check if the selected product is succefully added to cart")
	public void user_check_mycart_to_check_if_the_selected_product_is_succefully_added_to_cart() throws InterruptedException, IOException {
		mycartPage mcp=testcontextsetup.pageobjectmanager.getmycartpage();
		logger.info("Going to mycart page");
		mcp.clickmycartbutton();
		System.out.println(testcontextsetup.searchedprodname);
		logger.info("Validating if the my-cart page product name equals to the searched product");
		mcp.validatemycartproduct();
		Assert.assertEquals(mcp.validatemycartproduct(), testcontextsetup.searchedprodname);
		logger.info("Proceeding to payment page");
		mcp.proceedtopayment();
		mcp.deleteallproduct();


	}


}
