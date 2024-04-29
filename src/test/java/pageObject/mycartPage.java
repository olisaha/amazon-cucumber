package pageObject;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mycartPage {
	
public WebDriver driver;

	
	public  mycartPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By mycartbutton=By.xpath("//*[@id=\"nav-cart\"]");
	By prodname= By.xpath("//*[@class=\"a-truncate-cut\"]");
	By deletebutton=By.xpath("//input[@data-action='delete']");
	By proccedtopaymentbutton= By.xpath("//*[@value=\"Proceed to checkout\" ]");
	
	
	
	public void mycart() {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(mycartbutton));
		driver.findElement(mycartbutton).click();
	}
	public String validatemycartproduct() {
		String prod=driver.findElement(prodname).getText();
		System.out.println(prod);
		return prod;
		}
	
public void deleteallproduct() throws InterruptedException {

	Thread.sleep(5000);
	driver.navigate().back();
	
	//mywait.until(ExpectedConditions.titleContains("Amazon.com Shopping Cart"));
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	List<WebElement>productquantity=driver.findElements(deletebutton);
	for(int i=productquantity.size();i>0;i--) {
		Thread.sleep(3000);;
	 //  mywait.until(ExpectedConditions.visibilityOfAllElements(productquantity));
		driver.findElement(deletebutton).click();
		}
		
		}
public void proceedtopayment() {
	driver.findElement(proccedtopaymentbutton).click();
	}
}

