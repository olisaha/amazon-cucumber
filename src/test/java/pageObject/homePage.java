package pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	public WebDriver driver;
	public homePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By signinButton =By.xpath("//*[@id=\"nav-link-accountList\"]");
	By searchTextbox= By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	By continuebutton= By.xpath("//*[@id=\"nav-search-submit-button\"]");
	By allertdialogbox=By.xpath("//div[@role='alertdialog']");
	By dismissbutton= By.xpath("//input[@data-action-type='DISMISS']");
	
	public String gettitle() {
		return  driver.getTitle();

	}
public void gotologin() {
	driver.findElement(signinButton).click();
}
public void dismissalert() {
	//if (driver.findElement(allertdialogbox).) {
	driver.findElement(dismissbutton).click();
	}

public void searchproduct() throws IOException {
	FileInputStream fis= new FileInputStream("C:\\Users\\2303442\\eclipse-workspace\\amazon\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String product=prop.getProperty("product");
	
	driver.findElement(searchTextbox).sendKeys(product);
	
	driver.findElement(continuebutton).click();
}
}
