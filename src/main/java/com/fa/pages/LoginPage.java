package com.fa.pages;

import org.openqa.selenium.By;

import com.fa.enums.WaitStrategy;

public final class LoginPage extends BasePage{
	
	public final By textbox_username = By.id("forminator-field-text-1");
	public final By textbox_password = By.id("forminator-field-password-1");
	public final By btn_login = By.xpath("(//button[normalize-space()='Login'])[1]");
	public final By Link_forgetpassword = By.xpath("(//a[normalize-space()='Forgot password?'])[1]");
	public final By textbox_forgepassrod = By.name("username");
	public final By btn_logout = By.xpath("(//a[normalize-space()='Log out'])[1]");
	public final By cookie_popup = By.xpath("(//a[@class='cookie-btn cookie-accept-btn'])[1]");

	
	public LoginPage enterUsername(String username)
	{
		
		sendKeys(textbox_username, username, WaitStrategy.PRESENSE, "Username Field");
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		sendKeys(textbox_password, password, WaitStrategy.PRESENSE, "Username Field");
		return this;
	}
	
	public LoginPage ClickonForgetPasswordLink()
	{
		click(Link_forgetpassword, WaitStrategy.CLICKABLE, "ForgetPassword Link");
		return this;
	}
	
	public LoginPage enterFrogetPassword(String username)
	{
		sendKeys(textbox_forgepassrod, username, WaitStrategy.PRESENSE, "ForgetPassword Textbox Field");
		return this;
	}
	
	public AccountPage ClickLogin()
	{
		click(btn_login, WaitStrategy.CLICKABLE, "Login button");
		return new AccountPage();
	}
	
	public LoginPage ClickLogout()
	{
		click(btn_logout, WaitStrategy.CLICKABLE, "Logout button");
		return this;
	}
	
	public LoginPage ClickonCokkiePopup()
	{
		click(cookie_popup, WaitStrategy.CLICKABLE, "ClickonCokkiePopup");
		return this;
	}
	
	
	public String getTitle()
	{
		return getPageTitle();
	}
	
	
}
