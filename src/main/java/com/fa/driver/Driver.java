package com.fa.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.fa.constants.FrameworkConstants;
import com.fa.enums.ConfigProperties;
import com.fa.utils.PropertyUtils;

public final class Driver {
	
	private Driver()
	{
		
	}
	
	public static void initDriver(String browser) throws Exception 
	{
		if (Objects.isNull(DriverManager.getDriver()))
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
				DriverManager.setDriver(new ChromeDriver());
				DriverManager.getDriver().manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", FrameworkConstants.getFirefoxDriverPath());
				DriverManager.setDriver(new FirefoxDriver());
				DriverManager.getDriver().manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", FrameworkConstants.getIEDriverPath());
				DriverManager.setDriver(new InternetExplorerDriver());
				DriverManager.getDriver().manage().window().maximize();
			}
			
			else if(browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", FrameworkConstants.getEdgeDriverPath());
				DriverManager.setDriver(new EdgeDriver());
				DriverManager.getDriver().manage().window().maximize();
			}
		
				DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
		}
	}
	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
