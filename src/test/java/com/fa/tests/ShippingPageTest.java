package com.fa.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.fa.pages.AccountPage;
import com.fa.pages.BasePage;
import com.fa.pages.BillingPage;
import com.fa.pages.LoginPage;
import com.fa.pages.ShippingPage;

public class ShippingPageTest extends BaseTest{
	
	private ShippingPageTest() {}
	
	LoginPage lp = new LoginPage();
	AccountPage ap = new AccountPage();
	BillingPage bi = new BillingPage();
	ShippingPage sp = new ShippingPage();
	
	
	@Test
	public void UpdateShippingDetailsTab(Map<String, String> data)
	{
		AccountPage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		BasePage bp = new BasePage();
		lp.ClickonCokkiePopup();
		bp.scroll();
		ap.ClickonShippingTab();	
		bp.scroll2();
		sp.enterFirstName(data.get("firstname")).enterLastName(data.get("lastname")).enterStreet1(data.get("street1"))
		.enterStreet2(data.get("street2")).enterTown(data.get("town")).enterZip(data.get("zip")).ClickonSaveAddressBtn();
	}

}
