package com.bestretail.qspiders.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductPage {
WebDriver driver;
	
	public NewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Name")
	private WebElement productNameTextfield;
	
	@FindBy(id="ShortDescription")
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
	
	@FindBy(id = "input[id='Gtin']")
	private WebElement gtinTextfield;
	
	@FindBy(id="ManufacturerPartNumber")
	private WebElement manufacturerPartNumberTextfield;
	
	@FindBy(id="ShowOnHomepage")
	private WebElement showHomePageCheckBox;
	
	@FindBy(xpath = "//div[@id='pnlDisplayOrder']//input[@class='k-formatted-value k-input']")
	private WebElement displayOrderTextField;
	
	@FindBy(id = "select[id='ProductTypeId']")
	private WebElement productIdSelectTag;
	
	@FindBy(css = "input[aria-labelledby='SelectedCustomerRoleIds_label']")
	private WebElement customerRoleTextField;
	
	@FindBy(css = "input[aria-labelledby='SelectedStoreIds_label']")
	private WebElement storeNameTextfield;
	
	@FindBy(id = "VendorId")
	private WebElement vendorDropdown;
	
    @FindBy(id="AvailableStartDateTimeUtc")
    private WebElement availableStartDateTextfield;
    
    @FindBy(id="AvailableEndDateTimeUtc")
    private WebElement availableEndDateTextfield;
    
    @FindBy(id="AdminComment")
    private WebElement adminCommentTextarea;
    
    @FindBy(id="MarkAsNew")
    private WebElement markAsNewCheckbox;
    
    @FindBy(id="MarkAsNewStartDateTimeUtc")
    private WebElement markAsNewStartTime;
    
    @FindBy(id="MarkAsNewEndDateTimeUtc")
    private WebElement markAsNewEndTime;
    
	@FindBy(xpath = "//label[text()='Price']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement priceTextField;
	
	@FindBy(xpath = "//label[text()='Old price']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement oldPriceTextField;
	
	@FindBy(xpath = "//label[text()='Product cost']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement productCostTestField;
	
	@FindBy(id="DisableBuyButton")
	private WebElement disableBuyCheckbox;
	
	@FindBy(id="DisableWishlistButton")
	private WebElement disableWishListCheckbox;
	
	@FindBy(id="AvailableForPreOrder")
	private WebElement availableForPreorderCheckbox;
	
	@FindBy(id="CallForPrice")
	private WebElement callForPriceCheckbox;
	 
	@FindBy(xpath = "//label[text()='Minimum amount']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement   minimumCostTestField;
	
	@FindBy(xpath = "//label[text()='Maximum amount']/../../..//input[@class='k-formatted-value k-input']")
	private WebElement   maximumCostTestField;
	
	@FindBy(id="CustomerEntersPrice")
	private WebElement customerEntersPriceCheckbox;
	
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
	
	@FindBy(id="IsTaxExempt")
	private WebElement taxExemptCheckBox;
	
	@FindBy(id="TaxCategoryId")
	private WebElement taxCategoryDropDown;
	
	@FindBy(id="IsTelecommunicationsOrBroadcastingOrElectronicServices")
	private WebElement telecommunicationsOrBroadcastingOrElectronicServicesCheckbox;
	
	
	
	
	
	
	
}
