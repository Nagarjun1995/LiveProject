package com.mindtree.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.mindtree.base.TestBase;
import com.mindtree.crm.CRMHomePage;
import com.mindtree.crm.CreateAccounts;
import com.mindtree.pages.AppPage;
import com.mindtree.utilities.TestUtil;


public class CreateAccountTest extends TestBase {
/*
	@Test(dataProviderClass=TestUtil.class,dataProvider="dataProvider")
	public void createAccountTest(Hashtable<String,String> data){
		
		AppPage ap = new AppPage();
		CRMHomePage home = ap.gotoCRM();
		CreateAccounts account = home.gotoCreateAccounts();
		account.createAccount(data.get("accountname"));
		
	}*/

	@Test()
	public void createAccountTest() throws InterruptedException{
		
		AppPage ap = new AppPage();
		Thread.sleep(5);
		CRMHomePage home = ap.gotoCRM();
		Thread.sleep(5);
		CreateAccounts account = home.gotoCreateAccounts();
		Thread.sleep(5);
		account.createAccount("Nagarjun");
		
	}
	
}

