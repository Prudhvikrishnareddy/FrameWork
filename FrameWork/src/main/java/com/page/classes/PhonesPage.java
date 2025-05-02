package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PhonesPage extends BaseClass {
	WebDriver driver;

	String selectMobile = "//img[@src='imgs/Lumia_1520.jpg']";
	//git
	

	public PhonesPage(WebDriver driver) {
		this.driver = driver;
	}


	public void cellphones() {
		driver.findElement(By.xpath(selectMobile)).click();

	}
}