package pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	public WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By emailTextbox= By.cssSelector("input#ap_email");
	By continuebutton = By.xpath("//*[@class=\"a-button a-button-span12 a-button-primary\"]");
	By passwordTextbox = By.xpath("//*[@id=\"ap_password\"]");
	By loginbutton = By.cssSelector("input.a-button-input");
	
	public void logging() throws InterruptedException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\2303442\\eclipse-workspace\\amazon\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String email=prop.getProperty("emailid");
		String pass=prop.getProperty("password");
		driver.findElement(emailTextbox).sendKeys(email);
		driver.findElement(continuebutton).click();
		driver.findElement(passwordTextbox).sendKeys(pass);
		driver.findElement(loginbutton).click();
		 Thread.sleep(3000);
	}
}
