package com.fa.pages;

<<<<<<< HEAD
public class AccountPage {

=======
import org.openqa.selenium.By;

import com.fa.enums.WaitStrategy;

public final class AccountPage extends BasePage {

	private final By account_tab = By.xpath("(//a[normalize-space()='Account'])[1]");
	private final By billing_tab = By.xpath("(//a[normalize-space()='Billing'])[1]");
	private final By shipping_tab = By.xpath("(//a[normalize-space()='Shipping'])[1]");
	private final By orders_tab = By.xpath("(//a[normalize-space()='Orders'])[1]");
	private final By subscriptions_tab = By.xpath("(//a[normalize-space()='Subscriptions'])[1]");
	private final By Firstname = By.id("account_first_name");
	private final By LastName = By.id("account_last_name");
	private final By Email = By.id("account_email");
	private final By CurrentPassword = By.id("password_current");
	private final By NewPassword = By.id("password_1");
	private final By ConfirmPassword = By.id("password_2");
	private final By Save = By.cssSelector(".dmtb60.woocommerce-Button.button");
	
	public AccountPage ClickonAccountTab()
	{
		click(account_tab, WaitStrategy.CLICKABLE, "Access AccountTab");
		return this;
	}
	
	public AccountPage enterFirstName(String firstname)
	{
		clear(Firstname, firstname, WaitStrategy.PRESENSE, "Firstname Field");
		sendKeys(Firstname, firstname, WaitStrategy.PRESENSE, "Firstname Field");
		return this;
	}
	
	public AccountPage enterLastName(String lastname)
	{
		clear(LastName, lastname, WaitStrategy.PRESENSE, "LastName Field");
		sendKeys(LastName, lastname, WaitStrategy.PRESENSE, "LastName Field");
		return this;
	}
	
	public AccountPage enterEmail(String email)
	{
		clear(Email, email, WaitStrategy.PRESENSE, "Email Field");
		sendKeys(Email, email, WaitStrategy.PRESENSE, "Email Field");
		return this;
	}
	
	public AccountPage enterCurrentPassword(String currentPassword)
	{
		clear(CurrentPassword, currentPassword, WaitStrategy.PRESENSE, "CurrentPassword Field");
		sendKeys(CurrentPassword, currentPassword, WaitStrategy.PRESENSE, "CurrentPassword Field");
		return this;
	}
	
	public AccountPage enterNewPassword(String newPassword)
	{
		clear(NewPassword, newPassword, WaitStrategy.PRESENSE, "NewPassword Field");
		sendKeys(NewPassword, newPassword, WaitStrategy.PRESENSE, "NewPassword Field");
		return this;
	}
	
	public AccountPage enterConfirmPassword(String confirmPassword)
	{
		clear(ConfirmPassword, confirmPassword, WaitStrategy.PRESENSE, "ConfirmPassword Field");
		sendKeys(ConfirmPassword, confirmPassword, WaitStrategy.PRESENSE, "ConfirmPassword Field");
		return this;
	}
	
	public AccountPage ClickonSaveButton()
	{
		click(Save, WaitStrategy.CLICKABLE, "Click to Save Form");
		return this;
	}
	
	public AccountPage ClickonBillingTab()
	{
		click(billing_tab, WaitStrategy.CLICKABLE, "Access BillingTab");
		return this;
	}
	
	public AccountPage ClickonShippingTab()
	{
		click(shipping_tab, WaitStrategy.CLICKABLE, "Access ShippingTab");
		return this;
	}
	
	public AccountPage ClickonOrdersTab()
	{
		click(orders_tab, WaitStrategy.CLICKABLE, "Access OrdersTab");
		return this;
	}
	
	public AccountPage ClickSubscriptionTab()
	{
		click(subscriptions_tab, WaitStrategy.CLICKABLE, "Access SubscriptionTab");
		return this;
	}
>>>>>>> 9d49c45 (new pages)
}
