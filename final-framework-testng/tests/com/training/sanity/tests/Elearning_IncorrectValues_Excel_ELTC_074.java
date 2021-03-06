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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.training.dataproviders.ElearningDataProvider;
import com.training.generics.ScreenShot;
import com.training.pom.ElearingAdvancedPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Elearning_IncorrectValues_Excel_ELTC_074 {
	
	private WebDriver driver;
	private String baseUrl;
	private ElearingAdvancedPOM loginPOM;
	private static Properties properties;	
	//private ScreenShot screenShot;
	

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
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}

	@Test(dataProvider = "xls-inputs1", dataProviderClass = ElearningDataProvider.class)
	public void datasheet(String userName, String password,String code,String name,String coursetitle ,String courcode , String teacher) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn(); 
		loginPOM.couseCategories(code, name);
		loginPOM.Admistration();
		loginPOM.CreateCourse(coursetitle, courcode, teacher);
		
		boolean breadcrumb=driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/ul")).isDisplayed();
		Assert.assertTrue(breadcrumb);
}
}
