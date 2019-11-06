package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.ElearningDataProvider;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.ElearingAdvancedPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Elearning_DB_Display_ELTC_073 {
	
	private WebDriver driver;
	private String baseUrl;
	private ElearingAdvancedPOM loginPOM;
	private static Properties properties;	
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new ElearingAdvancedPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = ElearningDataProvider.class)
	public void DBTest(String userName, String password,String coursetitle ,String courcode) {
		// for demonstration 
       //	genericMethods.getElement("login", "id"); 
				
		loginPOM.sendUserName(userName);
		
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		loginPOM.createtwo(coursetitle, courcode);
		
		//boolean breadcrumb=driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[7]/a")).isDisplayed();
		//Assert.assertTrue(breadcrumb);
		
	
}
}