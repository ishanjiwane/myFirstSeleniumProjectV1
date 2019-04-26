package com.myFirstJavaProjectV1.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.myFirstJavaProjectV1.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("url launched");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("username value entered");
		
		lp.setPassword(password);
		logger.info("password entered");
		
		lp.clickSubmit();
		logger.info("user clicked on Login button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreenshot(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
