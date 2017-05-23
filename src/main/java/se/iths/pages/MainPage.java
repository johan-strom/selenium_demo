package se.iths.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPage extends ParentPage{
	
	//WebDriver driver;
	
	public void goToFirstPage() {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		// verify that the correct page is visible
		assertEquals("Shopizer Demo - Default store", driver.getTitle());
	}
	
	public void goToProductPage(String bookName) {
		WebElement book = driver.findElement(By.xpath(  "//*[contains(@src, '" + bookName + "')]" ));
		book.click();
	}
	
	public MainPage(){
		super();
	}
}
