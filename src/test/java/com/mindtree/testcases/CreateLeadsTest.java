package com.mindtree.testcases;


import java.util.Hashtable;




import org.testng.annotations.Test;

import com.mindtree.base.TestBase;
import com.mindtree.crm.CreateLeads;
import com.mindtree.utilities.TestUtil;

public class CreateLeadsTest extends TestBase{

	/*@Test(dataProviderClass=TestUtil.class,dataProvider="dataProvider")
	public void createLeads(Hashtable<String,String> data) throws InterruptedException{
		
		CreateLeads lead = new CreateLeads();
		System.out.println(data.get("companyname")+" "+data.get("firstname")+" "+data.get("lastname"));
		lead.createLeads(data.get("companyname"), data.get("firstname"), data.get("lastname"));
	}*/
	@Test()
	public void createLeads() throws InterruptedException{
		
		CreateLeads lead = new CreateLeads();
		Thread.sleep(5);
	//	System.out.println(data.get("companyname")+" "+data.get("firstname")+" "+data.get("lastname"));
		lead.createLeads("Realogy Corp", "Nagarjun", "Muruganantham");
	}
}
