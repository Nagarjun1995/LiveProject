package com.mindtree.pages;

import com.mindtree.base.TestBase;

public class LoginPage extends TestBase {

public AppPage userLogin(String username,String password){
		
	
	
		reuse.type("email_XPATH",username);
		reuse.click("nxtbtn_XPATH");
		reuse.type("password_CSS",password);
		reuse.click("signbtn_XPATH");
		
		return new AppPage();
	}
	
	
	/*public void userLogin(String username,String password,String runmode){
		
		if(runmode.equals("Y")){
		
		throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		
			reuse.type("email_XPATH",username);
			reuse.click("nxtbtn_XPATH");
			reuse.type("password_CSS",password);
			reuse.click("signbtn_XPATH");
			
			
		}*/
	
}
