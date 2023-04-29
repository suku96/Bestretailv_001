package com.bestretail.qspiders.testcase;

import org.testng.annotations.Test;

import com.bestretail.qspiders.pageobject.LoginPage;
import com.bestretail.qspisders.genericutility.BaseClass;

public class TC01_LoginintoHomepage extends BaseClass{

	@Test
	public void logintoHomepage() throws Exception {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.getLoginButton().submit();
		Thread.sleep(8000);
	}
}
