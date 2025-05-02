package com.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	String lnkLogin = "//a[@id='login2']";
	String userName = "//input[@id='loginusername']";
	String password = "//input[@id='loginpassword']";
	String btnLogin = "//button[@onclick='logIn()']";

	public void login() {
		driver.findElement(By.xpath(lnkLogin)).click();
		//if element exists only then enter text
		driver.findElement(By.xpath(userName)).sendKeys("pubbi");
		//verify username is entered successfully
		driver.findElement(By.xpath(password)).sendKeys("12345678");
		//verify password is entered successfully
		driver.findElement(By.xpath(btnLogin)).click();
		//verify login in successful

	}

}
