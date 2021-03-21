package com.mindtree.crm;

import com.mindtree.base.TestBase;

public class CreateLeads extends TestBase {
	
	public void createLeads(String companyname,String firstname,String lastname) throws InterruptedException
	{	
		reuse.click("homepage_XPATH");
		reuse.click("leadstab_XPATH"); 
		Thread.sleep(5000);
		reuse.click("createleadsbtn_XPATH");
		Thread.sleep(5000);
		reuse.type("companyname_XPATH",companyname);
		Thread.sleep(5000);
		reuse.type("firstname_XPATH",firstname);
		Thread.sleep(5000);
		reuse.type("lastname_XPATH",lastname);
	}
}
