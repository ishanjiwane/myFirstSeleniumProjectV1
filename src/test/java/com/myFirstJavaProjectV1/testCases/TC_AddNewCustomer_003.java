package com.myFirstJavaProjectV1.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myFirstJavaProjectV1.pageObjects.AddNewCustomerPage;
import com.myFirstJavaProjectV1.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddNewCustomer_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		logger.info("Login details entered...");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddNewCustomerPage custPage = new AddNewCustomerPage(driver);
		custPage.clickNewCustomer();
		custPage.setCustomerName("Test Customer");
		custPage.selectGender("male");
		custPage.setDateOfBirth("01", "01", "1990");
		
		Thread.sleep(3000);
		
		custPage.setAddresss("Test Address");
		custPage.setCity("Test City");
		custPage.setState("Test State");
		custPage.setPIN("123456");
		custPage.setTelephone("1234567890");
		custPage.setEmailId(randomString(8)+"@mail.com");
		custPage.setPassword("TestPassword");
		logger.info("Customer details entered...");
		custPage.clickSubmit();
		
		Thread.sleep(3000);
		
		if(driver.getPageSource().contains("Customer Registered Successfully!!!"))
		{
			Assert.assertTrue(true);
			logger.info("Test case Passed...");
		}
		else
		{
			captureScreenshot(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.warn("Test case Failed...!!!");
		}
	}
}
