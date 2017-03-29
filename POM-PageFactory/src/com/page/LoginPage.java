package com.page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.base.BasePage;

public class LoginPage extends BasePage{
	
	//WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='username']") WebElement username;
	
	@FindBy(xpath="//*[@id='password']") WebElement password;
	
	@FindBy(how=How.ID,using="login") WebElement submitBtn;
	
	@FindBy(how=How.XPATH,using="//h6[@class='text-danger']") WebElement errorMsg;
	
	@FindBy(how =How.XPATH,using="//*[@id='loginButton']") WebElement loginlink;
	
	@FindBy(how=How.XPATH,using="//*[@class='heading-title pull-left']") WebElement heading;
	
	@FindBy(how=How.XPATH,using="//*[@id='forgotpassword']") WebElement forgotPass;
	
	public String clicklogin(){
		
		loginlink.click();
		
		return heading.getText();

	 }
	
	public String login(String user,String pwd){
		
        username.sendKeys(user);
		
		password.sendKeys(pwd);
		
		submitBtn.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return errorMsg.getText();
		
	}
	
	public boolean forgotPassword(){
		
		return forgotPass.isDisplayed();
		
	}

}
