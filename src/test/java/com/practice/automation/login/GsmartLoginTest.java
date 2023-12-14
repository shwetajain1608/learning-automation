package com.practice.automation.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.practice.automation.base.GsmartBaseTest;

public class GsmartLoginTest extends GsmartBaseTest {
	@Test
	public void launchTest() {
		System.out.println("Launching Gsmart Application");
		driver.get("https://www.mishoppingkart.com/gsmart/");
	}

	@Test(dependsOnMethods = "launchTest")
	public void loginTest() throws InterruptedException {
		System.out.println("open login page");
		driver.findElement(By.linkText("login")).click();
		
	
	}
	@Test(dependsOnMethods ="loginTest")

	public void navigateBackToHome() throws InterruptedException {
		System.out.println("Navigate back to home page");
		driver.navigate().back();
		Thread.sleep(3000);

	}

}
