package com.myFirstJavaProjectV1.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myFirstJavaProjectV1.pageObjects.LoginPage;
import com.myFirstJavaProjectV1.utilities.XLUtils;

public class TC_LoginTestDataDriven_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void LoginTestDataDriven(String user, String pwd)
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("username entered");
		lp.setPassword(pwd);
		logger.info("password entered");
		lp.clickSubmit();
		
		if(isAlertPresent())
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("invalid login");
		}else {
			Assert.assertTrue(true);
			logger.info("Login Passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();		
		}
	}

	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String xlPath = System.getProperty("user.dir") + "/src/test/java/com/myFirstJavaProjectV1/testData/LoginData.xlsx";
		int rowCount = XLUtils.getRowCount(xlPath, "Sheet1");
		int colCount = XLUtils.getCellCount(xlPath, "Sheet1", 1);
		
		System.out.println(rowCount +" "+colCount);
		String data[][] = new String[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				data[i-1][j] = XLUtils.getCellData(xlPath, "Sheet1", i, j);
			}
		}
		return data;
	}
}
