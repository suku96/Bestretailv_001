package com.bestretail.qspisders.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Can execute basic Web driver functions
 * @author N.P.Sukumar
 *
 */
public class WebdriverUtility {
	/**
	 * implicitly add wait for specified seconds for find elements methods
	 * 
	 * @param driver
	 * @param seconds
	 */
	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/**
	 * explicitly add wait for specified seconds till the page title given got
	 * loaded
	 * 
	 * @param driver
	 * @param seconds
	 * @param pageTitle
	 * @return
	 * @throws IOException
	 */

	public Boolean waitforCompletePageTitle(WebDriver driver, String pageTitle) throws IOException {
		FileUtility fileUtils = new FileUtility();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean Response = wait.until(ExpectedConditions.titleIs(fileUtils.readDataFromPropertyFile(pageTitle)));
		return Response;
	}

	/**
	 * switch frame to given index
	 * 
	 * @param driver
	 * @param frameIndex
	 * @return
	 */
	public WebDriver switchingFrame(WebDriver driver, int frameIndex) {
		WebDriver newFrame = driver.switchTo().frame(frameIndex);
		return newFrame;
	}

	/**
	 * switch frame to given frame's name value or id value
	 * 
	 * @param driver
	 * @param framenameorid
	 * @return
	 */

	public WebDriver switchingFrame(WebDriver driver, String framenameorid) {
		WebDriver newFrame = driver.switchTo().frame(framenameorid);
		return newFrame;
	}

	/**
	 * switch frame to frame element reference
	 * 
	 * @param driver
	 * @param frameElement
	 * @return
	 */
	public WebDriver switchingFrame(WebDriver driver, WebElement frameElement) {
		WebDriver newFrame = driver.switchTo().frame(frameElement);
		return newFrame;
	}

	/**
	 * switch to parent frame
	 * 
	 * @param driver
	 * @return
	 */
	public WebDriver switchingToParentFrame(WebDriver driver) {
		WebDriver newFrame = driver.switchTo().parentFrame();
		return newFrame;
	}

	/**
	 * switch to default content of Web page
	 * 
	 * @param driver
	 * @return
	 */
	public WebDriver switchingTodefaultContant(WebDriver driver) {
		WebDriver newFrame = driver.switchTo().defaultContent();
		return newFrame;
	}
      public void explicitWaitVisibilityOftheElement(WebDriver driver,WebElement locator) {
    	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	  wait.until(ExpectedConditions.visibilityOf(locator));
      }
  	public Boolean waitforPartialPageTitle(WebDriver driver, String pageTitle) throws IOException {
		FileUtility fileUtils = new FileUtility();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean Response = wait.until(ExpectedConditions.titleContains(fileUtils.readDataFromPropertyFile(pageTitle)));
		return Response;
	}
    public void explicitWaittoElementToBeClickable(WebDriver driver,WebElement element) {
  	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
  	  wait.until(ExpectedConditions.elementToBeClickable(element));
    
    }
    public void explicitWaittoElementhasAttribute(WebDriver driver,WebElement locator,String attname,String value) {
    	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	  wait.until(ExpectedConditions.domAttributeToBe(locator, attname,value));
    	
      }
 
  /**
   * this method used to select the drop down option with visible text of the option
   * @param element
   * @param text
   */
    public void optionToSelectByText(WebElement element,String text) {
    	Select select=new Select(element);
    	select.selectByVisibleText(text);
    }
    
}
