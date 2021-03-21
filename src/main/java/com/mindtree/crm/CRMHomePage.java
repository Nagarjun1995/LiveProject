package com.mindtree.crm;

import com.mindtree.base.TestBase;

public class CRMHomePage extends TestBase {

	
	public CreateAccounts gotoCreateAccounts(){
		
		reuse.click("accountstab_XPATH");
		
		return new CreateAccounts();
	}
	
	
}
