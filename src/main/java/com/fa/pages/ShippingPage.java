package com.fa.pages;

import org.openqa.selenium.By;

import com.fa.enums.WaitStrategy;

public final class ShippingPage extends BasePage {
	
	private final By Firstname = By.id("shipping_first_name");
	private final By LastName = By.id("shipping_last_name");
	private final By Street1 = By.id("shipping_address_1");
	private final By Street2 = By.id("shipping_address_2");
	private final By Town = By.id("shipping_city");
	private final By Zip = By.id("shipping_postcode");
	private final By UpdateBilling = By.id("update_all_subscriptions_addresses");
	private final By SaveAddress = By.xpath("//button[normalize-space()='Save address']");

	public ShippingPage enterFirstName(String firstname)
	{
		clear(Firstname, firstname, WaitStrategy.PRESENSE, "Firstname Field");
		sendKeys(Firstname, firstname, WaitStrategy.PRESENSE, "Firstname Field");
		return this;
	}
	
	public ShippingPage enterLastName(String lastname)
	{
		clear(LastName, lastname, WaitStrategy.PRESENSE, "LastName Field");
		sendKeys(LastName, lastname, WaitStrategy.PRESENSE, "LastName Field");
		return this;
	}
	
	public ShippingPage enterStreet1(String street1)
	{
		clear(Street1, street1, WaitStrategy.PRESENSE, "Street1 Field");
		sendKeys(Street1, street1, WaitStrategy.PRESENSE, "Street1 Field");
		return this;
	}
	
	public ShippingPage enterStreet2(String street2)
	{
		clear(Street2, street2, WaitStrategy.PRESENSE, "Street2 Field");
		sendKeys(Street2, street2, WaitStrategy.PRESENSE, "Street2 Field");
		return this;
	}
	
	public ShippingPage enterTown(String town)
	{
		clear(Town, town, WaitStrategy.PRESENSE, "Town Field");
		sendKeys(Town, town, WaitStrategy.PRESENSE, "Town Field");
		return this;
	}
	
	public ShippingPage enterZip(String zip)
	{
		clear(Zip, zip, WaitStrategy.PRESENSE, "Zip Field");
		sendKeys(Zip, zip, WaitStrategy.PRESENSE, "Zip Field");
		return this;
	}
	

	public ShippingPage ClickonUpdateAddressCheckbox()
	{
		click(UpdateBilling, WaitStrategy.CLICKABLE, "UpdateBilling BillingTab");
		return this;
	}
	
	public ShippingPage ClickonSaveAddressBtn()
	{
		click(SaveAddress, WaitStrategy.CLICKABLE, "SaveAddress BillingTab");
		return this;
	}
}
