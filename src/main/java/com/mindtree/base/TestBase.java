package com.mindtree.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.mindtree.reusable.Reusable;
import com.mindtree.utilities.ExcelReader;
import com.mindtree.utilities.ExtentUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static String browser;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	public static ExcelReader excel = new ExcelReader(
	System.getProperty("user.dir") + "\\resources\\testdata\\testdata.xlsx");
	public ExtentReports rep = ExtentUtil.getInstance();
	public static ExtentTest test;
	public static Reusable reuse = new Reusable();
	

	@BeforeSuite

	public void setUp() {
		
		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\resources\\properties\\Config.properties");

				System.out.println(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			 log.debug("Config file loaded !!!");
			} catch (IOException e) {

				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\resources\\properties\\Object.properties");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			try {
				OR.load(fis);
			 log.debug("OR file loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (System.getenv("browser") != null && !System.getenv("browser").isEmpty()) {

				browser = System.getenv("browser");
			} else {

				browser = config.getProperty("browser");

			}

			config.setProperty("browser", browser);

			if (config.getProperty("browser").equals("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\resources\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (config.getProperty("browser").equals("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
				log.debug("Chrome Launched !!!");
			} else if (config.getProperty("browser").equals("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\resources\\driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}

			driver.get(config.getProperty("testsiteurl"));
			log.debug("Navigated to : " + config.getProperty("testsiteurl"));
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 3);
		}
	
	}

	
	
	
	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
		log.debug("test execution completed !!!");
	}
}

