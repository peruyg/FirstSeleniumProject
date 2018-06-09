package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {

		
		
System.setProperty("webdriver.gecko.driver", "/Users/gerardomolla/Documents/Selenium Dependencies/drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cybertekschool.com");
	
		
		
		
		
	}

}
