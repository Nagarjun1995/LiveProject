package com.mindtree.crm;

import com.mindtree.base.TestBase;

public class CreateAccounts extends TestBase {

	public CreateLeads createAccount(String accountName) {

		reuse.click("createaccountbtn_XPATH");
		reuse.type("accountname_CSS", accountName);
		reuse.click("saveaccountbtn_CSS");
		
		return new CreateLeads();
	}



}
