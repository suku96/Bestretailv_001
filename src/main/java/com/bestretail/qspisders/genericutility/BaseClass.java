package com.bestretail.qspisders.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	public ExcelUtility excelUtils= new ExcelUtility();
	public FileUtility fileUtils=new FileUtility();
	public WebdriverUtility webdriverUtils=new WebdriverUtility();
	@BeforeSuite
	public void confiBeforeMethod() throws IOException {
		String browser = fileUtils.readDataFromPropertyFile("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtils.readDataFromPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterSuite
	public void confiAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
	

}
