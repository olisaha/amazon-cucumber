package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	WebDriver driver;
	WebDriverWait wait;

	public utility(WebDriver driver) {
		this.driver = driver;
	}

	public void explicitwait(By xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	}
	public void elementclickableexplicitwait(By xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(xpath));
	}
	
public void pageloadexplicitwait(String title) {
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.titleContains(title));

}
}