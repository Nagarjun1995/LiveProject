package com.mindtree.pages;

import com.mindtree.base.TestBase;

public class HomePage extends TestBase {

	

	public LoginPage goToLogin(){
		
		reuse.click("loginlink_CSS");
		
		return new LoginPage();
	}
	
/*public void goToLogin(){
		
		reuse.click("loginlink_CSS");
		
		
	}*/
	
}