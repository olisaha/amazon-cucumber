package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.pageObjectManager;

public class testContextSetup {
public WebDriver driver;
public String searchedprodname;
public pageObjectManager pageobjectmanager;
public TestBase testbase;

public testContextSetup() throws IOException 
{   testbase=new TestBase();
	pageobjectmanager=new pageObjectManager(testbase.WebDriverManager());
}

}
