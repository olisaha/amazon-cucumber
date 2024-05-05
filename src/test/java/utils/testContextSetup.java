package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.pageObjectmanager;



public class testContextSetup {
	public WebDriver driver;
	public String searchedprodname;
	public pageObjectmanager pageobjectmanager;
	public TestBase testbase;
	public utility utility;

	public testContextSetup() throws IOException {
		testbase = new TestBase();
		utility = new utility(testbase.WebDriverManager());
		pageobjectmanager=new pageObjectmanager(testbase.WebDriverManager(),utility);
		
	}

}
