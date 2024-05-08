package pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.utility;

public class homePage {
	public WebDriver driver;
	utility utility;
	public homePage(WebDriver driver,utility utility) {
		this.driver=driver;
		this.utility=utility;
		
	}
	By youraccountbutton=By.xpath("//a[text()='Your Account']");
	By signinButton =By.xpath("//*[@id=\"nav-link-accountList\"]");
	By searchTextbox= By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	By continuebutton= By.xpath("//*[@id=\"nav-search-submit-button\"]");
	By allertdialogbox=By.xpath("//div[@role='alertdialog']");
	By dismissbutton= By.xpath("//input[@data-action-type='DISMISS']");
	
	public String gettitle() {
		return  driver.getTitle();

	}
public void gotologin() throws InterruptedException {
utility.elementclickableexplicitwait(youraccountbutton);
		driver.findElement(youraccountbutton).click();	
utility.elementclickableexplicitwait(signinButton);		
		driver.findElement(signinButton).click();
	}



public void searchproduct() throws IOException {
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String product=prop.getProperty("product");

	driver.findElement(searchTextbox).sendKeys(product);
	
	driver.findElement(continuebutton).click();

}}
