package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElearingPOM {
	
private WebDriver driver; 
	
	public ElearingPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[2]")
	private WebElement MyCourse;
	
	@FindBy(xpath="//*[@id=\"coursesCollapse\"]/div/ul/li[5]/a")
	private WebElement CouseCatlog;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/input")
	private WebElement CourseSearch;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/div/button")
	private WebElement ClickSearch;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div/div/div[2]/div[4]/div/a")
	private WebElement Subscribe;
	
	@FindBy(xpath="//*[@id=\"collapse_56\"]/div/div/div/div/div/div[2]/h4/a")
	private WebElement subscribedCourse;
	
	@FindBy(xpath="//*[@id=\"toolimage_343\"]")
	private WebElement courseDiscription;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[2]/li[2]/a/img")
	private WebElement userIcon;
	
	@FindBy(id="logout_button")
	private WebElement logoutbutton;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void ClickMyCourse() {
		this.MyCourse.click();
		
		}
	public void clickcoursecatlog() {
		this.CouseCatlog.click();
		
	}
	
	public void sendSaerchText(String CourseSearch) {
		this.CourseSearch.clear();
		this.CourseSearch.sendKeys(CourseSearch);
	}
	
	public void clicksearch() {
		this.ClickSearch.click();
	}
	
	public void clicksubscribe() {
		this.Subscribe.click();
	}
	
	public void clicksubscribedCourse() {
	    this.subscribedCourse.click();	
		
	}
	
	public void ClickDiscription() {
		this.courseDiscription.click();
	}

	public void clickuserIcon() {
		this.userIcon.click();
	}
	
	public void clicklogout() {
		this.logoutbutton.click();
	}
}



