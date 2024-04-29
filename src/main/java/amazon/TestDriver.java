package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\2303442\\eclipse-workspace\\amazon\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("www.amazon.in");

	}

}
