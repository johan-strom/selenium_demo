package se.iths;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

import org.junit.Before;

public class ShopTest {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}

	@Test
	public void testGoToDefaultStore() throws InterruptedException {
		
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/product/the-big-switch.html");
		WebElement storeLink = driver.findElement( By.linkText("Default store")   );
		storeLink.click();
		
		// need to wait since it takes a while for Firefox to load the page. Sleep is the ugly way.
		//Thread.sleep(2000);
		// this is a nicer way to wait for the page to load since it doesn't wait longer than needed.
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("shopizer");
            }
        });
		
		assertEquals("Shopizer Demo - Default store", driver.getTitle());
		driver.close();
	}
}
