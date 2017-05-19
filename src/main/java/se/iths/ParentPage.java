package se.iths;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentPage {
	protected static WebDriver driver;
	
	//@Before
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 System.out.println("In setup...............................");
	}
}
