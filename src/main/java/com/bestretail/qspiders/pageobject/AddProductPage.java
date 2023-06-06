package com.bestretail.qspiders.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
	WebDriver driver;

	public AddProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*
	 * product info options
	 */
	@FindBy(id = "Name")
	private WebElement productNameTextfield;

	@FindBy(id = "ShortDescription")
	private WebElement shortDescriptionTextarea;

	@FindBy(css = "body[data-id='FullDescription']")
	private WebElement fullDescription;

	@FindBy(id = "Sku")
	private WebElement skuTextfield;

	@FindBy(css = "input[aria-labelledby='SelectedCategoryIds_label']")
	private WebElement categoryTextfield;

	@FindBy(css = "input[aria-labelledby='SelectedManufacturerIds_label']")
	private WebElement manufacturesTextfield;

	@FindBy(xpath = "//div[.='Enter tags ...']")
	private WebElement productTagsTextfield;

	@FindBy(css = "input[id='Gtin']")
	private WebElement gtinTextfield;

	@FindBy(id = "ManufacturerPartNumber")
	private WebElement manufacturerPartNumberTextfield;

	@FindBy(id = "ShowOnHomepage")
	private WebElement showHomePageCheckBox;

	@FindBy(xpath = "//div[@id='pnlDisplayOrder']//input[@class='k-formatted-value k-input']")
	private WebElement displayOrderTextField;

	@FindBy(css = "select[id='ProductTypeId']")
	private WebElement productTypeSelectTag;

	@FindBy(css = "input[aria-labelledby='SelectedCustomerRoleIds_label']")
	private WebElement customerRoleTextField;

	@FindBy(css = "input[aria-labelledby='SelectedStoreIds_label']")
	private WebElement storeNameTextfield;

	@FindBy(id = "VendorId")
	private WebElement vendorDropdown;

	@FindBy(id = "AllowCustomerReviews")
	private WebElement allowCustomerReviewCheckbox;

	@FindBy(id = "AvailableStartDateTimeUtc")
	private WebElement availableStartDateTextfield;

	@FindBy(id = "AvailableEndDateTimeUtc")
	private WebElement availableEndDateTextfield;

	@FindBy(id = "AdminComment")
	private WebElement adminCommentTextarea;

	@FindBy(id = "MarkAsNew")
	private WebElement markAsNewCheckbox;

	@FindBy(id = "MarkAsNewStartDateTimeUtc")
	private WebElement markAsNewStartTime;

	@FindBy(id = "MarkAsNewEndDateTimeUtc")
	private WebElement markAsNewEndTime;

	@FindBy(xpath = "//div[text()='Prices']")
	private WebElement pricesOption;

	@FindBy(xpath = "//label[text()='Price']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement priceTextField;

	@FindBy(xpath = "//label[text()='Old price']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement oldPriceTextField;

	@FindBy(xpath = "//label[text()='Product cost']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement productCostTestField;

	@FindBy(id = "DisableBuyButton")
	private WebElement disableBuyCheckbox;

	@FindBy(id = "DisableWishlistButton")
	private WebElement disableWishListCheckbox;

	@FindBy(id = "AvailableForPreOrder")
	private WebElement availableForPreorderCheckbox;

	@FindBy(id = "CallForPrice")
	private WebElement callForPriceCheckbox;

	@FindBy(xpath = "//label[text()='Minimum amount']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement minimumCostTestField;

	@FindBy(xpath = "//label[text()='Maximum amount']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement maximumCostTestField;

	@FindBy(id = "CustomerEntersPrice")
	private WebElement customerEntersPriceCheckbox;

	@FindBy(id = "BasepriceEnabled")
	private WebElement basePriceEnabledCheckbox;

	@FindBy(xpath = "//label[text()='Amount in product']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement amountInProductTextField;

	@FindBy(id = "BasepriceUnitId")
	private WebElement basePriceUnitDropdown;

	@FindBy(xpath = "//label[text()='Reference amount']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement referenceAmountTextField;

	@FindBy(id = "BasepriceBaseUnitId")
	private WebElement referenceUnitDropdown;

	@FindBy(css = "input[aria-labelledby='SelectedDiscountIds_label']")
	private WebElement discountsTextfield;

	@FindBy(id = "IsTaxExempt")
	private WebElement taxExemptCheckBox;

	@FindBy(id = "TaxCategoryId")
	private WebElement taxCategoryDropDown;

	@FindBy(id = "IsTelecommunicationsOrBroadcastingOrElectronicServices")
	private WebElement telecommunicationsOrBroadcastingOrElectronicServicesCheckbox;
	/*
	 * prices options
	 */

	@FindBy(id="IsShipEnabled")
	private WebElement shippingOption;

	@FindBy(css = "input[id='IsShipEnabled']")
	private WebElement shippingCheckbox;

	@FindBy(xpath = "//label[text()='Weight']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement productWeightTextfield;

	@FindBy(xpath = "//label[text()='Length']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement productLengthTextfield;

	@FindBy(xpath = "//label[text()='Width']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement productWidthTextfield;

	@FindBy(xpath = "//label[text()='Height']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement productHeightTextfield;

	@FindBy(id = "IsFreeShipping")
	private WebElement freeShippingCheckbox;

	@FindBy(id = "ShipSeparately")
	private WebElement shipSeparatelyCheckbox;

	@FindBy(xpath = "//label[text()='Additional shipping charge']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement additionalShippingChargesTextfield;

	@FindBy(id = "DeliveryDateId")
	private WebElement deliveryDateDropdown;

	/*
	 * inventory details
	 * 
	 */
	@FindBy(xpath = "//div[text()='Inventory']")
	private WebElement inventoryOption;

	@FindBy(id = "ManageInventoryMethodId")
	private WebElement inventoryMethoddropdown;

	@FindBy(xpath = "//label[text()='Minimum cart qty']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement minimumCartQtyTextfield;

	@FindBy(xpath = "//label[text()='Maximum cart qty']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement maximumCartQtyTextfield;

	@FindBy(id = "AllowedQuantities")
	private WebElement allowedQuantites;

	@FindBy(id = "NotReturnable")
	private WebElement notReturnableCheckBox;
	/*
	 * save and save & continue button
	 */
	@FindBy(css = "button[name='save']")
	private WebElement saveButton;

	@FindBy(css = "button[name='save-continue']")
	private WebElement saveAndContinueButton;

	@FindBy(id = "FullDescription_ifr")
	private WebElement fullDesciframe;

	public WebElement getFullDesciframe() {
		return fullDesciframe;
	}

	public WebElement getProductNameTextfield() {
		return productNameTextfield;
	}

	public WebElement getShortDescriptionTextarea() {
		return shortDescriptionTextarea;
	}

	public WebElement getFullDescription() {
		return fullDescription;
	}

	public WebElement getSkuTextfield() {
		return skuTextfield;
	}

	public WebElement getCategoryTextfield() {
		return categoryTextfield;
	}

	public WebElement getManufacturesTextfield() {
		return manufacturesTextfield;
	}

	public WebElement getProductTagsTextfield() {
		return productTagsTextfield;
	}

	public WebElement getGtinTextfield() {
		return gtinTextfield;
	}

	public WebElement getManufacturerPartNumberTextfield() {
		return manufacturerPartNumberTextfield;
	}

	public WebElement getShowHomePageCheckBox() {
		return showHomePageCheckBox;
	}

	public WebElement getDisplayOrderTextField() {
		return displayOrderTextField;
	}

	public WebElement getProductTypeSelectTag() {
		return productTypeSelectTag;
	}

	public WebElement getCustomerRoleTextField() {
		return customerRoleTextField;
	}

	public WebElement getStoreNameTextfield() {
		return storeNameTextfield;
	}

	public WebElement getVendorDropdown() {
		return vendorDropdown;
	}

	public WebElement getAvailableStartDateTextfield() {
		return availableStartDateTextfield;
	}

	public WebElement getAvailableEndDateTextfield() {
		return availableEndDateTextfield;
	}

	public WebElement getAdminCommentTextarea() {
		return adminCommentTextarea;
	}

	public WebElement getMarkAsNewCheckbox() {
		return markAsNewCheckbox;
	}

	public WebElement getMarkAsNewStartTime() {
		return markAsNewStartTime;
	}

	public WebElement getMarkAsNewEndTime() {
		return markAsNewEndTime;
	}

	public WebElement getPricesOption() {
		return pricesOption;
	}

	public WebElement getPriceTextField() {
		return priceTextField;
	}

	public WebElement getOldPriceTextField() {
		return oldPriceTextField;
	}

	public WebElement getProductCostTestField() {
		return productCostTestField;
	}

	public WebElement getDisableBuyCheckbox() {
		return disableBuyCheckbox;
	}

	public WebElement getDisableWishListCheckbox() {
		return disableWishListCheckbox;
	}

	public WebElement getAvailableForPreorderCheckbox() {
		return availableForPreorderCheckbox;
	}

	public WebElement getCallForPriceCheckbox() {
		return callForPriceCheckbox;
	}

	public WebElement getMinimumCostTextField() {
		return minimumCostTestField;
	}

	public WebElement getMaximumCostTextField() {
		return maximumCostTestField;
	}

	public WebElement getBasePriceEnabledCheckbox() {
		return basePriceEnabledCheckbox;
	}

	public WebElement getCustomerEntersPriceCheckbox() {
		return customerEntersPriceCheckbox;
	}

	public WebElement getAmountInProductTextField() {
		return amountInProductTextField;
	}

	public WebElement getBasePriceUnitDropdown() {
		return basePriceUnitDropdown;
	}

	public WebElement getReferenceAmountTextField() {
		return referenceAmountTextField;
	}

	public WebElement getReferenceUnitDropdown() {
		return referenceUnitDropdown;
	}

	public WebElement getDiscountsTextfield() {
		return discountsTextfield;
	}

	public WebElement getTaxExemptCheckBox() {
		return taxExemptCheckBox;
	}

	public WebElement getTaxCategoryDropDown() {
		return taxCategoryDropDown;
	}

	public WebElement getTelecommunicationsOrBroadcastingOrElectronicServicesCheckbox() {
		return telecommunicationsOrBroadcastingOrElectronicServicesCheckbox;
	}

	public WebElement getShippingOption() {
		return shippingOption;
	}

	public WebElement getShippingCheckbox() {
		return shippingCheckbox;
	}

	public WebElement getProductWeightTextfield() {
		return productWeightTextfield;
	}

	public WebElement getProductLengthTextfield() {
		return productLengthTextfield;
	}

	public WebElement getProductWidthTextfield() {
		return productWidthTextfield;
	}

	public WebElement getProductHeightTextfield() {
		return productHeightTextfield;
	}

	public WebElement getFreeShippingCheckbox() {
		return freeShippingCheckbox;
	}

	public WebElement getShipSeparatelyCheckbox() {
		return shipSeparatelyCheckbox;
	}

	public WebElement getAdditionalShippingChargesTextfield() {
		return additionalShippingChargesTextfield;
	}

	public WebElement getDeliveryDateDropdown() {
		return deliveryDateDropdown;
	}

	public WebElement getInventoryOption() {
		return inventoryOption;
	}

	public WebElement getInventoryMethoddropdown() {
		return inventoryMethoddropdown;
	}

	public WebElement getMinimumCartQtyTextfield() {
		return minimumCartQtyTextfield;
	}

	public WebElement getMaximumCartQtyTextfield() {
		return maximumCartQtyTextfield;
	}

	public WebElement getAllowedQuantites() {
		return allowedQuantites;
	}

	public WebElement getNotReturnableCheckBox() {
		return notReturnableCheckBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSaveAndContinueButton() {
		return saveAndContinueButton;
	}

	public WebElement getAllowCustomerReviewCheckbox() {
		return allowCustomerReviewCheckbox;
	}

}
