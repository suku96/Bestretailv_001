package com.bestretail.qspiders.testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bestretail.qspiders.pageobject.AddProductPage;
import com.bestretail.qspiders.pageobject.AdminHomepage;
import com.bestretail.qspiders.pageobject.LoginPage;
import com.bestretail.qspiders.pageobject.NewProductPage;
import com.bestretail.qspiders.pageobject.ProductsPage;
import com.bestretail.qspisders.genericutility.BaseClass;

public class TC02_AddNewProduct extends BaseClass {
	@Test
	public void addNewProduct() throws InterruptedException, EncryptedDocumentException, IOException {
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
		newproduct.getProductNameTextfield().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 0, 2));
		newproduct.getShortDescriptionTextarea()
				.sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 1, 2));
		webdriverUtils.switchingFrame(driver, newproduct.getFullDesciframe());
		newproduct.getFullDescription().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 2, 2));
		webdriverUtils.switchingTodefaultContant(driver);
		newproduct.getSkuTextfield().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 3, 2));
		action.sendKeys(newproduct.getCategoryTextfield(),
				excelUtils.readStringDataFromExcel("addproductdetails", 4, 2)).pause(500).sendKeys(Keys.ENTER)
				.pause(500).sendKeys(Keys.ESCAPE).pause(500).build().perform();
		action.sendKeys(newproduct.getManufacturesTextfield(),
				excelUtils.readStringDataFromExcel("addproductdetails", 5, 2)).pause(500).sendKeys(Keys.ENTER)
				.pause(500).sendKeys(Keys.ESCAPE).pause(500).build().perform();
		Thread.sleep(10000);
	}
}
