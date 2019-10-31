package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div[2]/div/div[2]/div[4]/div/a")
	private WebElement Subscribe;
	
	@FindBy(xpath="//*[@id=\"page\"]/div[6]/div[7]/div/div/div[1]/a/img")
	private WebElement subscribedCourse;
	
	@FindBy(xpath="//*[@id=\"toolimage_4928\"]")
	private WebElement courseDiscription;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[2]/li[2]/a/img")
	private WebElement userIcon;
	
	@FindBy(id="logout_button")
	private WebElement logoutbutton;
	
	@FindBy(xpath="//*[@id=\"page\"]/div[6]/div[24]/div/div/div[1]/a/img")
	private WebElement CourceSelentest45;
	
	
	@FindBy(xpath="/html/body/main/section/div/div[3]/div/section/div/div[6]/div/div[7]/div/div[1]/a/img")
	private WebElement AssignmentIcon;
	
	@FindBy(xpath="//*[@id=\"view_as_link\"]/div/a")
	private WebElement SwitchtoStudent;
	
	
	@FindBy(xpath="//*[@id=\"69\"]/td[2]/a")
	private WebElement AsssignmentLink;
	
	@FindBy(xpath="//*[@id=\"toolbar-work\"]/div/div[2]/a")
	private WebElement uploadbutton;
	
	@FindBy(xpath="//*[@id=\"dropzone\"]/div")
	private WebElement clickforFiles;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/ul/li[3]/a")
	private WebElement testlink;
	
	@FindBy(xpath="//*[@id=\"toolimage_4096\"]")
	private WebElement GroupIcon;
	
	@FindBy(xpath="/html/body/main/section/div/div[4]/table/tbody/tr[2]/td[1]/a")
	private WebElement groupname;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[4]/ul/li[7]/a/img")
	private WebElement chatIcon;
	
	@FindBy(id="chat-reset")
	private WebElement chatReset;
	
	@FindBy(xpath="//*[@id=\"tab1\"]/div/div[1]/div")
	private WebElement chattextbox;
	
	@FindBy(id="chat-send-message")
	private WebElement SendMessage;
	
	@FindBy(id="istooldesc_4093")
	private WebElement forumIcon;
	
	@FindBy(xpath="//*[@id=\"category_16\"]/div/div[2]/div[2]/div/div/div/div[2]/h3/a[1]")
	private WebElement groupnameofforum;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/a[2]/img")
	private WebElement createThreadicon;
	
	@FindBy(xpath="//*[@id=\"thread_post_title\"]")
	private WebElement title;
	
	@FindBy(xpath="//*[@id=\"thread_SubmitPost\"]")
	private WebElement createthreadbutton;
	
	@FindBy(xpath="/html/body/main/section/div/div[3]/div/div[3]/div/div/div[2]/div[2]/a[2]")
	private WebElement submitbutton;
	
	@FindBy(xpath="/html/body/main/section/div/div[3]/div/div[3]/div/div/div[2]/div[2]/a[2]")
	private WebElement returnmessage;
	
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
	
	public void slentest45() {
		this.CourceSelentest45.click();
		
	}
	
	public void AssignmentIcon() {
		this.AssignmentIcon.click();
		
	}
	
	public void SwitchtoStudent() {
		this.SwitchtoStudent.click();
	}
	public void assignmentlink() {
		this.AsssignmentLink.click();
	}
	
	public void uploadfield() {
		this.uploadbutton.click();
		}
	public void uploadfileclick() throws Throwable {
		this.clickforFiles.click();
		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		StringSelection stringselect = new StringSelection("C:\\Users\\HARSHASANGINEEDI\\Documents\\key.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void clicktestlink() {
		this.testlink.click();
	}
	
	public void groupicon() {
		this.GroupIcon.click();
		this.groupname.click();
	}
	
	public void chatfields() throws Throwable {
		this.chatIcon.click();
		Thread.sleep(3000);
		  //to switch to child window 
		  Set<String>windowIds=driver.getWindowHandles();
		  Iterator<String>iter=windowIds.iterator();
		  
		  String mainWindow=iter.next();
		  String childWindow=iter.next();
		  
		  driver.switchTo().window(childWindow);
		  this.chatReset.click();
		  //to accept alert
          Alert alert=driver.switchTo().alert();
		  alert.accept();
		  }
	public void chatTextbox() {
		this.chattextbox.sendKeys("Hello");
		this.SendMessage.click();
		driver.close();
	}
	
	public void forum() throws Throwable {
		this.forumIcon.click();  
		this.groupnameofforum.click();  
		this.createThreadicon.click(); //create thread icon
		//creation of thread 
		this.title.sendKeys("Test");  
		//switch to frame
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		 
        //Enter the value into the textbox inside frame
        WebElement textbox=driver.findElement(By.xpath("/html/body"));
        textbox.sendKeys("Need help");
        driver.switchTo().defaultContent();
        
		this.createthreadbutton.click(); // create thread button
		//this.submitbutton.click();
		this.returnmessage.click();
	}
}




