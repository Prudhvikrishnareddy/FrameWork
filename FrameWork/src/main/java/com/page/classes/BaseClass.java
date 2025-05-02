package com.page.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	static WebDriver driver; 
	
	public static WebDriver getDriver() {
		driver = new EdgeDriver();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//qwertyuiokjhgfds
		//wertyuijuhgfd
		//sdrtyuiokjhvcder456ty
		//iuytresazsxdfghjnbvcxsedrtyhgfdsxcvytredsa
		//iuytresdfgyujhgfcx
		return driver;
	}

}
