package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ElearingPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Elearning_UploadFile_ELTC_043 {

	private WebDriver driver;
	private String baseUrl;
	private ElearingPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new ElearingPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws Throwable {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
		loginPOM.ClickMyCourse();
		loginPOM.slentest45();
		loginPOM.AssignmentIcon();
		loginPOM.SwitchtoStudent();
		loginPOM.assignmentlink();
		loginPOM.uploadfield();
		loginPOM.uploadfileclick();
		loginPOM.clicktestlink();
	}
}



