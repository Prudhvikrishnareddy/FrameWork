package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}


	String phones = "//a[@onclick=\"byCat('phone')\"]";
	String laptops = "//a[@onclick=\"byCat('notebook')\"]";
	String monitors = "//a[@onclick=\"byCat('monitor')\"]";

	public void categories() {
		WebElement mobiles=driver.findElement(By.xpath(phones));
		mobiles.click();
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(laptops)).click();
		//driver.findElement(By.xpath(monitors)).click();

	}

}
