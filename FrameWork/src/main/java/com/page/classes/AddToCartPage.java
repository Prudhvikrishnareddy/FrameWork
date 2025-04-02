package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartPage extends BaseClass{
	String addMobileCart = "//a[@onclick='addToCart(2)']";
	String addLaptopCart = "//a[@onclick='addToCart(9)']";
	String addMonitorCart = "//a[@onclick='addToCart(10)']";
	String addToCartIcon = "//a[@onclick='showcart()']";

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectAdd2Carts() {
		driver.findElement(By.xpath(addMobileCart)).click();
		//driver.findElement(By.xpath(addLaptopCart)).click();
		//driver.findElement(By.xpath(addMonitorCart)).click();
		driver.findElement(By.xpath(addToCartIcon)).click();

	}

}
