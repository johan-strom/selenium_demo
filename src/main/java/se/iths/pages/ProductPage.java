package se.iths.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends ParentPage {
	public void addToCart() {
		
		WebElement button = this.getElementByXPath("//*[contains(text(), 'Add to cart')]") ;
		button.click();
	}

	public ProductPage() {
		super();
	}
}
