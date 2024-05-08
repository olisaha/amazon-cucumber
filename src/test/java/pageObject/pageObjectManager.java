package pageObject;

import org.openqa.selenium.WebDriver;

import utils.utility;

public class pageObjectmanager {
	public homePage homepage;
	public loginPage loginpage;
	public searchedProductPage searchedproductpage;
	public mycartPage mycartpage;
	public WebDriver driver;
	utility utility;
	public pageObjectmanager(WebDriver driver,utility utility)
	{
		this.driver = driver;
		this.utility=utility;
	}

	
	public loginPage getloginpage()
	{
	
	 loginpage= new loginPage(driver);
	 return loginpage ;
	}
	public homePage gethomepage() {
		homepage=new homePage(driver,utility);
		return homepage;
	}
	
	public searchedProductPage getsearchedproductpage() {
		searchedproductpage=new searchedProductPage(driver,utility);
		return searchedproductpage;
	}
	public mycartPage getmycartpage() {
		mycartpage=new mycartPage(driver,utility);
		return mycartpage ;
	}

}
