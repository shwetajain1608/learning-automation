package com.practice.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmartBaseTest {
	
	public WebDriver driver;

	@BeforeSuite
	public void init() {
		System.out.println("Launch the Browser");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
	}
	@AfterSuite
	public void cleanUp() {
		System.out.println("closing the base test");
		driver.close();
	}
	
	
	

}
