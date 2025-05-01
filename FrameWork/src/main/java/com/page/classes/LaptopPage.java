package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopPage  {
	WebDriver driver;

	public LaptopPage(WebDriver driver) {
		this.driver = driver;
	}

	String selectLaptop = "//a[text()='MacBook Pro']";

	public void laptops() {
		
		driver.findElement(By.xpath(selectLaptop)).click();
	}
}