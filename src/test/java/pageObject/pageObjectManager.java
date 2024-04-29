package pageObject;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	public homePage homepage;
	public loginPage loginpage;
	public searchedProductPage searchpage;
	public mycartPage mycartpage;
	public WebDriver driver;
	
	public pageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public homePage loadinghomepage() {
		homepage= new homePage(driver);
		return homepage;
	}
   public loginPage loadingloginpage() {
	   loginpage=new loginPage(driver);
	   return loginpage;
}
   public searchedProductPage loadingsearchpage() {
	   searchpage=new searchedProductPage(driver);
	   return searchpage;
}
   public mycartPage loadingmycartpage() {
	  mycartpage=new mycartPage(driver);
	  return mycartpage;
	  
}
  
}
