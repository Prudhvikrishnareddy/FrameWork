package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}


	String login1 = "//a[@id='login2']";
	String Username = "//input[@id='loginusername']";
	String Password = "//input[@id='loginpassword']";
	String select12 = "//button[@onclick='logIn()']";

	public void login() {
		
		
		
		driver.findElement(By.xpath(login1)).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Username)).click();
		//driver.findElement(By.xpath(Username)).click();
		driver.findElement(By.xpath(Username)).sendKeys("pubbi");
		driver.findElement(By.xpath(Password)).click();
		driver.findElement(By.xpath(Password)).sendKeys("12345678");
		driver.findElement(By.xpath(select12)).click();

	}

}
