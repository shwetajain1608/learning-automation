package com.practice.automation.search;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.practice.automation.base.GsmartBaseTest;

public class GsmartSearchTest extends GsmartBaseTest {
	@Test
	public void launchTest() {
		System.out.println("Launching Gsmart website");
		driver.get("https://www.mishoppingkart.com/gsmart/");
	}

	@Test(dependsOnMethods = "launchTest")
	public void searchTest() throws InterruptedException {
		System.out.println("search for laptop");
		driver.findElement(By.name("search")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods ="searchTest")

	public void navigateBack() throws InterruptedException {
		System.out.println("Navigate back to home page");
		driver.navigate().back();
		Thread.sleep(3000);

	}
}
