package com.mindtree.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentUtil {
private static ExtentReports extent;
	
	
	public static ExtentReports getInstance(){
					
			extent = new ExtentReports(System.getProperty("user.dir")+"\\extentreports\\extent.html",true,DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"\\resources\\ExtentConfig.xml"));
	
		return extent;
		
	}
}
