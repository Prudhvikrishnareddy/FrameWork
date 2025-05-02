package com.shopping.application;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.page.classes.AddToCartPage;
import com.page.classes.BaseClass;
import com.page.classes.HomePage;
import com.page.classes.LaptopPage;
import com.page.classes.LoginPage;
import com.page.classes.PlaceOrderPage;

public class FirstTest extends BaseClass {
	WebDriver driver = getDriver();

	LoginPage pageLogin = new LoginPage(driver);
	HomePage sel_laptop = new HomePage(driver);

	LaptopPage sel_macbookpro = new LaptopPage(driver);
	AddToCartPage addToCart = new AddToCartPage(driver);
    PlaceOrderPage placeOrder=new PlaceOrderPage(driver);
	@Test
	public void addNokiaPhoneToCartTest() {
		pageLogin.login();
		driver.navigate().refresh();

		sel_laptop.categories();

		sel_macbookpro.laptops();
		addToCart.selectAdd2Carts();
		
		placeOrder.placeorder();
	}

//  @Test
//  public void samsungTest() {
//	  application.login();
//	  //select phones for Nokia
//	  //add phone to cart
//	  
//  }

}
