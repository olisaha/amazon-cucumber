package pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestBase;

public class loginPage {
	public WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By emailTextbox= By.cssSelector("input#ap_email");
	By continuebutton = By.xpath("//*[@class=\"a-button a-button-span12 a-button-primary\"]");
	By passwordTextbox = By.xpath("//*[@id=\"ap_password\"]");
	By loginbutton = By.cssSelector("input.a-button-input");
	
	public void passingemailid(String emailid) throws InterruptedException, IOException {
	//	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
	//	Properties prop=new Properties();
	//	prop.load(fis);
//		String email=prop.getProperty("emailid");
//		String pass=prop.getProperty("password");
		driver.findElement(emailTextbox).sendKeys(emailid);
		driver.findElement(continuebutton).click();
	}
		public void passingpassword(String password) {
		driver.findElement(passwordTextbox).sendKeys(password);
		driver.findElement(loginbutton).click();
		 
	}
}
