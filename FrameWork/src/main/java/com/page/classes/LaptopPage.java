package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopPage extends BaseClass {
	String Laptoselection = "//img[@src='imgs/sony_vaio_5.jpg']";

	public void laptops() {
		
		driver.findElement(By.xpath(Laptoselection)).click();
	}
}