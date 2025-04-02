package com.shopping.application;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.page.classes.AddToCartPage;
import com.page.classes.BaseClass;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.PhonesPage;

public class FirstTest extends BaseClass{
	WebDriver driver = getDriver();
	
	LoginPage pageLogin = new LoginPage(driver);
	HomePage phone= new HomePage(driver);
	PhonesPage mobile = new PhonesPage(driver);
	AddToCartPage addcart=new AddToCartPage(driver);
	
	

	@Test
	public void addNokiaPhoneToCartTest() {
		pageLogin.login();
		phone.categories();
		mobile.cellphones();
		addcart.selectAdd2Carts();
		

	}

//  @Test
//  public void samsungTest() {
//	  application.login();
//	  //select phones for Nokia
//	  //add phone to cart
//	  
//  }

}
