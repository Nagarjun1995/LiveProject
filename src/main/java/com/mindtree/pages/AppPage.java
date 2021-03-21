package com.mindtree.pages;

import org.testng.Assert;

import com.mindtree.base.TestBase;
import com.mindtree.crm.CRMHomePage;

public class AppPage extends TestBase{
	
public CRMHomePage gotoCRM() throws InterruptedException{
		
		Thread.sleep(5000);
		reuse.click("crmlink_XPATH");
		
		return new CRMHomePage();
	}
	
}