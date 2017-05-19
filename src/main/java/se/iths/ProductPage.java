package se.iths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends ParentPage{
	public static void addToCart() {
		WebElement button = driver.findElement(By.xpath("//*[contains(text(), 'Add to cart')]"));
		button.click(); 
	}
}
