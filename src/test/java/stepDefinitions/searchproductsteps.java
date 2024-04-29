package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObject.homePage;
import pageObject.searchedProductPage;
import utils.testContextSetup;

public class searchproductsteps {
	public WebDriver driver;
	public String searchedprodname;
	testContextSetup testcontextsetup;
	searchedProductPage sp;
	
	public searchproductsteps(testContextSetup testcontextsetup) 
	{
		this.testcontextsetup=testcontextsetup;
		this.sp=testcontextsetup.pageobjectmanager.loadingsearchpage();
	}
	
	@When("user searched PRODUCT in the search-box")
	public void user_searched_in_the_search_box() throws IOException {
		try {
		homePage hp= testcontextsetup.pageobjectmanager.loadinghomepage();
		//hp.dismissalert();
		hp.searchproduct();	
	}
		catch(Exception e) {
			e.printStackTrace();}
		}

	@When("user sorted the  price and selected the lowest price")
	public void user_sorted_the_price_and_selected_the_lowest_price() throws InterruptedException {
		try {
	   sp.dollartoINR();
	   sp.sortingansselectingproduct();
	}
		catch(Exception e) {
			e.printStackTrace();}
		}

	@When("user clicked on add to cart")
	public void user_clicked_on_add_to_cart() {
		
		try {
			Thread.sleep(3000);
			sp.selectingprod();
			Thread.sleep(5000);
			testcontextsetup.searchedprodname=sp.getmobilename();
			System.out.println(testcontextsetup.searchedprodname +" is extracted from Home page");
	     
	}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		}


}
