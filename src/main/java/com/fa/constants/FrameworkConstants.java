package com.fa.constants;

import java.time.Duration;

import com.fa.enums.ConfigProperties;
import com.fa.utils.PropertyUtils;

public final class FrameworkConstants {
	
	private FrameworkConstants() {}
	
private static final String RESOURCEPATH = System.getProperty("user.dir")+"/src/test/resources";
	
	private static final String CHROMEDRIVERPATH = RESOURCEPATH +"/executables/chromedriver.exe";
	private static final String FIREFOXDRIVERPATH = RESOURCEPATH +"/executables/geckodriver.exe";
	private static final String IEDRIVERPATH = RESOURCEPATH +"/executables/IEDriverServer.exe";
	private static final String EDGEDRIVERPATH = RESOURCEPATH +"/executables/msedgedriver.exe";
	private static final String CONFIGFILEPATH= RESOURCEPATH + "/config/config.properties";
	private static final String JSONCONFIGFILEPATH= RESOURCEPATH + "/config/config.json";
	private static final Duration EXPLICITWAIT = Duration.ofSeconds(10);
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+ "/extent-test-output/";
	private static String EXTENTREPORTFILEPATH = "";
	private static final String EXCELPATH= RESOURCEPATH+"/excel/testdata.xlsx";
	private static final String RUNMANAGERSHEET = "RUNMANAGER";
	private static final String ITERATIONDATASHEET = "DATA";
	
	
	public static String getJsonConfigFilePath() {
		return JSONCONFIGFILEPATH;
	}
	
	public static String getFirefoxDriverPath() {
		return FIREFOXDRIVERPATH;
	}

	public static String getIEDriverPath() {
		return IEDRIVERPATH;
	}

	public static String getEdgeDriverPath() {
		return EDGEDRIVERPATH;
	}


	
	
	public static String getRunManagerSheet() {
		return RUNMANAGERSHEET;
	}

	public static String getIterationDataSheet() {
		return ITERATIONDATASHEET;
	}

	public static String getExcelPath() {
		return EXCELPATH;
	}

	public static String getExtentReportFilePath() throws Exception {
		if(EXTENTREPORTFILEPATH.isEmpty())
		{
			EXTENTREPORTFILEPATH = createReportPath();
		}
		return EXTENTREPORTFILEPATH;
	}
	
	private static String createReportPath() throws Exception
	{
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")
				) {
			return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
		}
		else
		{
			return EXTENTREPORTFOLDERPATH+"/index.html";
		}
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static Duration getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static Duration getExplicitWait() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
