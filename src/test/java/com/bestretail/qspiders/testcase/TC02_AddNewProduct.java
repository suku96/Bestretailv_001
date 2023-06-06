package com.bestretail.qspiders.testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bestretail.qspiders.pageobject.AddProductPage;
import com.bestretail.qspiders.pageobject.AdminHomepage;
import com.bestretail.qspiders.pageobject.LoginPage;
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
		Reporter.log("Entering necesssary values to add a new product", true);
		newproduct.getProductNameTextfield().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 0, 2));
		newproduct.getShortDescriptionTextarea()
				.sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 1, 2));
		webdriverUtils.switchingFrame(driver, newproduct.getFullDesciframe());
		newproduct.getFullDescription().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 2, 2));
		webdriverUtils.switchingTodefaultContant(driver);
		newproduct.getSkuTextfield().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 3, 2));
		action.scrollByAmount(0, 250);
		action.sendKeys(newproduct.getCategoryTextfield(),
				excelUtils.readStringDataFromExcel("addproductdetails", 4, 2)).pause(500).sendKeys(Keys.ENTER)
				.pause(500).sendKeys(Keys.ESCAPE).pause(500).build().perform();
		action.sendKeys(newproduct.getManufacturesTextfield(),
				excelUtils.readStringDataFromExcel("addproductdetails", 5, 2)).pause(500).sendKeys(Keys.ENTER)
				.pause(500).sendKeys(Keys.ESCAPE).pause(500).build().perform();
		action.sendKeys(newproduct.getProductTagsTextfield(),
				excelUtils.readStringDataFromExcel("addproductdetails", 7, 2)).pause(500).sendKeys(Keys.ENTER)
				.pause(500).build().perform();
		newproduct.getGtinTextfield().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 8, 2));
		newproduct.getManufacturerPartNumberTextfield()
				.sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 9, 2));
		if (excelUtils.readStringDataFromExcel("addproductdetails", 10, 2).equals("yes")) {
			newproduct.getShowHomePageCheckBox().click();
		}
		newproduct.getDisplayOrderTextField().sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 11, 2));
		webdriverUtils.optionToSelectByText(newproduct.getProductTypeSelectTag(),
				excelUtils.readStringDataFromExcel("addproductdetails", 12, 2));
		action.scrollByAmount(0, 250);
		webdriverUtils.optionToSelectByText(newproduct.getVendorDropdown(),
				excelUtils.readStringDataFromExcel("addproductdetails", 14, 2));
		if (excelUtils.readStringDataFromExcel("addproductdetails", 15, 2).equals("yes")) {
			newproduct.getAllowCustomerReviewCheckbox().click();
		}
		// newproduct.getAvailableStartDateTextfield()
		// .sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 16, 2));
		action.moveToElement(
				driver.findElement(By.xpath("//span[@aria-controls='AvailableStartDateTimeUtc_dateview']"))).pause(400)
				.click().pause(500).sendKeys(Keys.ENTER).pause(400).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[@aria-controls='AvailableEndDateTimeUtc_dateview']")))
				.pause(400).click().pause(500).sendKeys(Keys.ENTER).pause(400).build().perform();
		newproduct.getAvailableEndDateTextfield()
				.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 17, 2));
		if (excelUtils.readStringDataFromExcel("addproductdetails", 18, 2).equals("yes")) {
			newproduct.getMarkAsNewCheckbox().click();
			newproduct.getMarkAsNewStartTime()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 19, 2));
			newproduct.getMarkAsNewEndTime().sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 20, 2));
		}
		newproduct.getAdminCommentTextarea().sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 21, 2));
		action.scrollByAmount(0, 300);
		action.scrollToElement(newproduct.getPriceTextField());
		action.scrollToElement(newproduct.getOldPriceTextField());
		newproduct.getPriceTextField().sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 22, 2));
		newproduct.getOldPriceTextField().sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 23, 2));
		newproduct.getProductCostTestField().sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 24, 2));
		if (excelUtils.readStringDataFromExcel("addproductdetails", 25, 2).equals("yes")) {
			newproduct.getDisableBuyCheckbox().click();
		}
		if (excelUtils.readStringDataFromExcel("addproductdetails", 26, 2).equals("yes")) {
			newproduct.getDisableWishListCheckbox().click();
		}
		if (excelUtils.readStringDataFromExcel("addproductdetails", 27, 2).equals("yes")) {
			newproduct.getAvailableForPreorderCheckbox().click();
		}
		if (excelUtils.readStringDataFromExcel("addproductdetails", 29, 2).equals("yes")) {
			newproduct.getCallForPriceCheckbox().click();
		}
		if (excelUtils.readStringDataFromExcel("addproductdetails", 30, 2).equals("yes")) {
			newproduct.getCustomerEntersPriceCheckbox().click();
			newproduct.getMaximumCostTextField()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 31, 2));
			newproduct.getMinimumCostTextField()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 32, 2));

		}
		if (excelUtils.readStringDataFromExcel("addproductdetails", 33, 2).equals("yes")) {
			newproduct.getBasePriceEnabledCheckbox().click();
			newproduct.getProductCostTestField()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 34, 2));
			webdriverUtils.optionToSelectByText(newproduct.getBasePriceUnitDropdown(),
					excelUtils.readStringDataFromExcel("addproductdetails", 35, 2));
			newproduct.getReferenceAmountTextField()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 36, 2));
			webdriverUtils.optionToSelectByText(newproduct.getReferenceUnitDropdown(),
					excelUtils.readStringDataFromExcel("addproductdetails", 37, 2));
		}
		action.sendKeys(newproduct.getDiscountsTextfield(),
				excelUtils.readStringDataFromExcel("addproductdetails", 38, 2)).pause(500).sendKeys(Keys.ENTER)
				.pause(500).sendKeys(Keys.ESCAPE).build().perform();
		if (excelUtils.readStringDataFromExcel("addproductdetails", 39, 2).equals("yes")) {
			newproduct.getTaxExemptCheckBox().click();
		} else {
			webdriverUtils.optionToSelectByText(newproduct.getTaxCategoryDropDown(),
					excelUtils.readStringDataFromExcel("addproductdetails", 40, 2));
		}
		newproduct.getTelecommunicationsOrBroadcastingOrElectronicServicesCheckbox().click();
		action.scrollByAmount(0, 300);
		if (excelUtils.readStringDataFromExcel("addproductdetails", 42, 2).equals("yes")) {
			newproduct.getShippingCheckbox().click();
			//Thread.sleep(5000);
			 action.scrollToElement(newproduct.getProductWeightTextfield());
			 action.scrollByAmount(0, 400);
			webdriverUtils.explicitWaittoElementToBeClickable(driver, newproduct.getProductWeightTextfield());
			newproduct.getProductWeightTextfield()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 43, 2));
			newproduct.getProductLengthTextfield()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 44, 2));
			newproduct.getProductWidthTextfield()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 45, 2));
			newproduct.getProductHeightTextfield()
					.sendKeys(excelUtils.readNumericDataFromExcel("addproductdetails", 46, 2));
			if (excelUtils.readStringDataFromExcel("addproductdetails", 47, 2).equals("yes")) {
				newproduct.getFreeShippingCheckbox().click();
			}
			if (excelUtils.readStringDataFromExcel("addproductdetails", 48, 2).equals("yes")) {
				newproduct.getShipSeparatelyCheckbox().click();
			}
			newproduct.getAdditionalShippingChargesTextfield()
					.sendKeys(excelUtils.readStringDataFromExcel("addproductdetails", 49, 2));
			webdriverUtils.optionToSelectByText(newproduct.getDeliveryDateDropdown(),
					excelUtils.readStringDataFromExcel("addproductdetails", 50, 2));
		}
		action.scrollToElement(newproduct.getSaveButton());
		action.moveToElement(newproduct.getSaveButton()).pause(500).click().build().perform();
	}
}
