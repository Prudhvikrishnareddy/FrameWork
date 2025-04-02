package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceOrderPage extends BaseClass {
	String placeordericon = "//button[@class='btn btn-success']";
	String placeordername = "//input[@id='name']";
	String placeordercountry = "//input[@id='country']";
	String placeordercities = "//input[@id='city']";
	String placeordercardnumber = "//input[@id='card']";
	String placeordercardmonth = "//input[@id='month']";
	String placeordercardyear = "//input[@id='year']";
	String purchaseicon = "//button[@ionclick='purchaseOrder()']";

	public void placeorder() {
		
		driver.findElement(By.xpath(placeordericon)).click();
		driver.findElement(By.xpath(placeordername)).click();
		driver.findElement(By.xpath(placeordername)).sendKeys("Prudhvi Raj Reddy");
		driver.findElement(By.xpath(placeordercountry)).click();
		driver.findElement(By.xpath(placeordercountry)).sendKeys("India");
		driver.findElement(By.xpath(placeordercities)).click();
		driver.findElement(By.xpath(placeordercities)).sendKeys("Nellore");
		driver.findElement(By.xpath(placeordercardnumber)).click();
		driver.findElement(By.xpath(placeordercardnumber)).sendKeys("123456789");
		driver.findElement(By.xpath(placeordercardmonth)).click();
		driver.findElement(By.xpath(placeordercardmonth)).sendKeys("February");
		driver.findElement(By.xpath(placeordercardyear)).click();
		driver.findElement(By.xpath(placeordercardyear)).sendKeys("2030");
		driver.findElement(By.xpath(purchaseicon)).click();

	}

}
