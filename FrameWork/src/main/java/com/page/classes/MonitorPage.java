package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonitorPage extends BaseClass {

	String selectMonitor = "//img[@src='imgs/apple_cinema.jpg']";

	public void laptops() {
		
		driver.findElement(By.xpath(selectMonitor)).click();
	}
}