package se.iths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest extends SearchPage {
	
	//@Test
    public void testSearchCheese() {
		
		search("Cheese!");
        verifyResult("Cheese!");     
    }
	
	//@Test
    public void testSearchITHS() {
		search("iths");
		verifyResult("iths");
    }
    
}

