package com.myFirstJavaProjectV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	WebDriver driver;
	
	public AddNewCustomerPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkNewCustomer;
	
	@FindBy(name = "name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(name = "rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(name = "dob")
	@CacheLookup
	WebElement dtDOB;
	
	@FindBy(name = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(name = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(name = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(name = "pinno")
	@CacheLookup
	WebElement txtPIN;
	
	@FindBy(name = "telephoneno")
	@CacheLookup
	WebElement txtTelephone;
	
	@FindBy(name = "emailid")
	@CacheLookup
	WebElement txtEmailId;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void clickNewCustomer()
	{
		lnkNewCustomer.click();
	}
	
	public void setCustomerName(String custname)
	{
		txtCustomerName.sendKeys(custname);
	}
	
	public void selectGender(String gender)
	{
		rdGender.click();
	}
	
	public void setDateOfBirth(String dd, String mm, String yyyy)
	{
		dtDOB.sendKeys(dd);
		dtDOB.sendKeys(mm);
		dtDOB.sendKeys(yyyy);
	}
	
	public void setAddresss(String address)
	{
		txtAddress.sendKeys(address);
	}
	
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	public void setState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void setPIN(String pin)
	{
		txtPIN.sendKeys(pin);
	}
	
	public void setTelephone(String phone)
	{
		txtTelephone.sendKeys(phone);
	}
	
	public void setEmailId(String emailid)
	{
		txtEmailId.sendKeys(emailid);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
}
