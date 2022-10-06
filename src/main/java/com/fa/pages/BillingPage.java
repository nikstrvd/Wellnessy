package com.fa.pages;

import org.openqa.selenium.By;

import com.fa.enums.WaitStrategy;

public final class BillingPage extends BasePage {
	
	private final By Firstname = By.id("billing_first_name");
	private final By LastName = By.id("billing_last_name");
	private final By Street1 = By.id("billing_address_1");
	private final By Street2 = By.id("billing_address_2");
	private final By Town = By.id("billing_city");
	private final By Zip = By.id("billing_postcode");
	private final By Phone = By.id("billing_phone");
	private final By Email = By.id("billing_email");
	private final By UpdateBilling = By.id("update_all_subscriptions_addresses");
	private final By SaveAddress = By.xpath("//button[normalize-space()='Save address']");

	public BillingPage enterFirstName(String firstname)
	{
		clear(Firstname, firstname, WaitStrategy.PRESENSE, "Firstname Field");
		sendKeys(Firstname, firstname, WaitStrategy.PRESENSE, "Firstname Field");
		return this;
	}
	
	public BillingPage enterLastName(String lastname)
	{
		clear(LastName, lastname, WaitStrategy.PRESENSE, "LastName Field");
		sendKeys(LastName, lastname, WaitStrategy.PRESENSE, "LastName Field");
		return this;
	}
	
	public BillingPage enterStreet1(String street1)
	{
		clear(Street1, street1, WaitStrategy.PRESENSE, "Street1 Field");
		sendKeys(Street1, street1, WaitStrategy.PRESENSE, "Street1 Field");
		return this;
	}
	
	public BillingPage enterStreet2(String street2)
	{
		clear(Street2, street2, WaitStrategy.PRESENSE, "Street2 Field");
		sendKeys(Street2, street2, WaitStrategy.PRESENSE, "Street2 Field");
		return this;
	}
	
	public BillingPage enterTown(String town)
	{
		clear(Town, town, WaitStrategy.PRESENSE, "Town Field");
		sendKeys(Town, town, WaitStrategy.PRESENSE, "Town Field");
		return this;
	}
	
	public BillingPage enterZip(String zip)
	{
		clear(Zip, zip, WaitStrategy.PRESENSE, "Zip Field");
		sendKeys(Zip, zip, WaitStrategy.PRESENSE, "Zip Field");
		return this;
	}
	
	public BillingPage enterPhone(String phone)
	{
		clear(Phone, phone, WaitStrategy.PRESENSE, "Phone Field");
		sendKeys(Phone, phone, WaitStrategy.PRESENSE, "Phone Field");
		return this;
	}
	
	public BillingPage enterEmail(String email)
	{
		clear(Email, email, WaitStrategy.PRESENSE, "Email Field");
		sendKeys(Email, email, WaitStrategy.PRESENSE, "Email Field");
		return this;
	}
	
	public BillingPage ClickonUpdateAddressCheckbox()
	{
		click(UpdateBilling, WaitStrategy.CLICKABLE, "UpdateBilling BillingTab");
		return this;
	}
	
	public BillingPage ClickonSaveAddressBtn()
	{
		click(SaveAddress, WaitStrategy.CLICKABLE, "SaveAddress BillingTab");
		return this;
	}
}
