package pageObject;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.testContextSetup;
import utils.utility;

public class mycartPage {

	public WebDriver driver;
	utility utility;

	public mycartPage(WebDriver driver, utility utility) {
		this.driver = driver;
		this.utility = utility;
	}

	By mycartbutton = By.xpath("//*[@id=\"nav-cart\"]");
	By prodname = By.xpath("//*[@class=\"a-truncate-cut\"]");
	By deletebutton = By.xpath("//input[@data-action='delete']");
	By proccedtopaymentbutton = By.xpath("//*[@value=\"Proceed to checkout\" ]");

	public void clickmycartbutton() throws InterruptedException {
		utility.elementclickableexplicitwait(mycartbutton);
		Thread.sleep(5000);
		driver.findElement(mycartbutton).click();
	}

	public String validatemycartproduct() {
		String prod = driver.findElement(prodname).getText();
		System.out.println(prod);
		return prod;
	}

	public void deleteallproduct() throws InterruptedException {

		utility.pageloadexplicitwait("Amazon.com Checkout");;
		driver.navigate().back();
		utility.pageloadexplicitwait("Amazon.com Shopping Cart");
		utility.explicitwait(deletebutton);
		List<WebElement> productquantity = driver.findElements(deletebutton);
		for (int i = productquantity.size(); i > 0; i--) {
			utility.explicitwait(deletebutton);
			driver.findElement(deletebutton).click();

		}

	}

	public void proceedtopayment() {

		driver.findElement(proccedtopaymentbutton).click();
	}
}
