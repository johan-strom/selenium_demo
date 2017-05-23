package se.iths.pages;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentPage {
	protected static WebDriver driver;

	protected WebElement getElementByXPath(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		return driver.findElement(By.xpath(xpath));
	
	}
	
	public ParentPage() {
		if (driver == null) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
}
