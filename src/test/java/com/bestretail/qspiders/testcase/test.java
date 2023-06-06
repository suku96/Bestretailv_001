package com.bestretail.qspiders.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bestretail.qspiders.pageobject.AddProductPage;
import com.bestretail.qspiders.pageobject.AdminHomepage;
import com.bestretail.qspiders.pageobject.LoginPage;
import com.bestretail.qspiders.pageobject.ProductsPage;
import com.bestretail.qspisders.genericutility.BaseClass;

public class test extends BaseClass {
	@Test
    public void test() throws InterruptedException {
    	webdriverUtils.implicitwait(driver);
		Reporter.log("Logging into the application", true);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.getLoginButton().submit();
		AdminHomepage adminpage = new AdminHomepage(driver);
		Reporter.log("clicking on catalog option", true);
		adminpage.getCatalogOption().click();
		Reporter.log("clicking on product button", true);
		adminpage.getProductsButton().click();
		ProductsPage product = new ProductsPage(driver);
		Reporter.log("clicking on Addproduct button", true);
		product.getAddNewButton().click();
		AddProductPage newproduct = new AddProductPage(driver);
		Reporter.log("Entering necesssary values to add a new product", true);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1400)");
		//action.scrollToElement(newproduct.getShippingCheckbox()).pause(500).build().perform();
		
		newproduct.getShippingCheckbox().click();
		Thread.sleep(10000);
    }
}
