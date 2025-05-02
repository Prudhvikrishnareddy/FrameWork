package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	String phones = "//div[@class= 'list-group']//a[contains(text(),'Phones')]";
	String laptops = "//div[@class= 'list-group']//a[contains(text(), 'Laptops')]";
	String monitors = "//a[@onclick=\"byCat('monitor')\"]";
	//Phone = driver.findElement(By.xpath(phones));

	public void categories() {

		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath")));
		
		 /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(phones)));
		  element.click();*/
		 
		 //new Actions(driver).moveToElement(driver.findElement(By.xpath(laptops))).click().perform();

		// driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(laptops)).click();
		// driver.findElement(By.xpath(monitors)).click();

	}

}
