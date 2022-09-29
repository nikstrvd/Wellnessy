package com.fa.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
	
	private ExtentManager()
	{
		
	}

private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();
	
	static ExtentTest getExtentTest()
	{
		return extTest.get();
	}
	
	static void setExtenetTest(ExtentTest test)
	{
		extTest.set(test);
	}
	
	static void unload()
	{
		extTest.remove();
	}
}