package com.mindtree.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.mindtree.base.TestBase;
import com.mindtree.pages.HomePage;
import com.mindtree.pages.LoginPage;
import com.mindtree.utilities.TestUtil;
//Git Change new
public class Login extends TestBase {
/*@Test(dataProviderClass = TestUtil.class, dataProvider = "dataProvider")
	public void loginTest(Hashtable<String,String> data){

	
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		//lp.userLogin("nagarjunecemsn@gmail.com", "10747410@Msn","Y");
		lp.userLogin(data.get("username"), data.get("password"));
	//	Assert.fail("Login test failed");
	
		
	
}*/
	
	@Test()
	public void loginTest(){

	
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		//lp.userLogin("nagarjunecemsn@gmail.com", "10747410@Msn","Y");
		lp.userLogin("nagarjunpmv95@gmail.com", "10747410@msn");
	//	Assert.fail("Login test failed");
	
		
	
}
}
