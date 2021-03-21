package com.mindtree.reusable;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mindtree.base.TestBase;
import com.mindtree.utilities.Email;
import com.mindtree.utilities.TestConfig;
import com.mindtree.utilities.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class Listeners extends TestBase implements ITestListener {

	public 	String messageBody;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {

	
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : "+arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		rep.endTest(test);
		rep.flush();
		
		
	}

	public void onTestSkipped(ITestResult arg0) {


		test.log(LogStatus.SKIP, arg0.getName().toUpperCase()+" Skipped the test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();
	}


	public void onTestStart(ITestResult arg0) {

		test = rep.startTest(arg0.getName().toUpperCase());
	
	}

	public void onTestSuccess(ITestResult arg0) {

		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+" PASS");
		rep.endTest(test);
		rep.flush();
	}

	public void onFinish(ISuite arg0) {
		
	Email mail = new Email();
	 
	try {
		messageBody = "http://" + InetAddress.getLocalHost().getHostAddress()
				+ ":8080/job/DataDrivenLiveProject/Extent_Reports/";
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	try {
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
	} catch (AddressException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
