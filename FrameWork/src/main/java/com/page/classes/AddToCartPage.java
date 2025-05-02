package com.page.classes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage extends BaseClass{
	String addMobileCart = "//a[@onclick='addToCart(2)']";
	String btnaddToCart = "//a[@onclick='addToCart(15)']";
	String addMonitorCart = "//a[@onclick='addToCart(10)']";
	String btnCart = "//a[@id='cartur']";

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void selectAdd2Carts() {
		driver.findElement(By.xpath(btnaddToCart)).click();
		
//		 try {
//	            Thread.sleep(2000);  
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//		
////		Actions builder = new Actions(driver);
////		builder.keyDown(Keys.RETURN).keyUp(Keys.RETURN).build().perform();
//		
////		driver.findElement(By.tagName("body")).sendKeys(Keys.ENTER);
//		Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.ENTER).perform();
//        try {
//            Thread.sleep(3000);  
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//		 
//		
		 try {
	            // Wait until the alert is present
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.alertIsPresent());

	            // Switch to the alert
	            Alert alert = driver.switchTo().alert();

	            // Accept the alert (click "OK")
	            alert.accept();
	        } catch (Exception e) {
	            System.out.println("No alert appeared: " + e.getMessage());
	        }
		
		
		//driver.findElement(By.xpath(addLaptopCart)).click();
		//driver.findElement(By.xpath(addMonitorCart)).click();
		WebElement cartIcon=driver.findElement(By.xpath(btnCart));
		cartIcon.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", cartIcon);

	}

}
