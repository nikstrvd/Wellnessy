package com.fa.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.fa.pages.AccountPage;
import com.fa.pages.BasePage;
import com.fa.pages.LoginPage;

public final class AccountPageTest extends BaseTest {
	
	private AccountPageTest()
	{
		
	}
	
	LoginPage lp = new LoginPage();
	AccountPage ap = new AccountPage();
	
	@Test
	public void UpdateDetailsInAccountsTab(Map<String, String> data)
	{
		AccountPage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		BasePage bp = new BasePage();
		lp.ClickonCokkiePopup();
		ap.ClickonAccountTab();
		bp.scroll2();
		ap.enterFirstName(data.get("firstname")).enterLastName(data.get("lastname")).enterEmail("email");
		bp.scroll();
		ap.enterCurrentPassword(data.get("currentpassword")).enterNewPassword(data.get("newpassword")).enterConfirmPassword(data.get("confirmpassword")).ClickonSaveButton();
	}
	
	@Test
	public void AccessAccountTab(Map<String, String> data)
	{
		AccountPage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		BasePage bp = new BasePage();
		lp.ClickonCokkiePopup();
		bp.scroll();
		ap.ClickonAccountTab();		
	}
	
	@Test
	public void AccessBillingTab(Map<String, String> data)
	{
		AccountPage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		BasePage bp = new BasePage();
		lp.ClickonCokkiePopup();
		bp.scroll();
		ap.ClickonBillingTab();		
	}
	
	@Test
	public void AccessShippingTab(Map<String, String> data)
	{
		AccountPage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		BasePage bp = new BasePage();
		lp.ClickonCokkiePopup();
		bp.scroll();
		ap.ClickonShippingTab();		
	}
	
	@Test
	public void AccessOrdersTab(Map<String, String> data)
	{
		AccountPage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		BasePage bp = new BasePage();
		lp.ClickonCokkiePopup();
		bp.scroll();
		ap.ClickonOrdersTab();		
	}
	
	@Test
	public void AccessSubscriptionsTab(Map<String, String> data)
	{
		AccountPage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		BasePage bp = new BasePage();
		lp.ClickonCokkiePopup();
		bp.scroll();
		ap.ClickSubscriptionTab();		
	}

}
