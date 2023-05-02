package com.bestretail.qspiders.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   
	 @FindBy(xpath = "//a[contains(.,'Add new')]")
	 private WebElement addNewButton;
	 
}
