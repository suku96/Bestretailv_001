package com.bestretail.qspiders.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomepage {
	WebDriver driver;

	public AdminHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[not(text()=' Catalog settings') and contains(.,'Catalog')]")
	private WebElement catalogOption;

	@FindBy(xpath = "//p[text()=' Products']")
	private WebElement productsButton;
	
	@FindBy(xpath = "//p[text()=' Manufacturers']")
	private WebElement manufacturersButton;
   
	public WebElement getCatalogOption() {
		return catalogOption;
	}

	public WebElement getProductsButton() {
		return productsButton;
	}

	public WebElement getManufacturersButton() {
		return manufacturersButton;
	}
}
