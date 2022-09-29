package com.fa.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fa.constants.FrameworkConstants;
import com.fa.driver.DriverManager;
import com.fa.enums.WaitStrategy;

public class ExplicitWaitFactory {
	
	@SuppressWarnings("deprecation")
	public static WebElement performExplicitWait(WaitStrategy waitstrategy, By by)
	{
		WebElement element = null;
		if(waitstrategy == WaitStrategy.PRESENSE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait()).until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitstrategy == WaitStrategy.CLICKABLE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait()).until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitstrategy == WaitStrategy.VISIBLE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait()).until(ExpectedConditions.visibilityOfElementLocated(by));
			
		}
		else if(waitstrategy == WaitStrategy.NONE)
		{
			element = DriverManager.getDriver().findElement(by);
			System.out.println("Not doing Nothing");
		}
			return element;
	}

}
