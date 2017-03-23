package com.arun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arun_page
{
WebDriver driver;
	
	public arun_page(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(name="username")
	private WebElement usertext;
	
	@FindBy(name="pwd")
	private WebElement pwdtext;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(id="logoutLin")
	private WebElement logoutbutton;
	
	public void login() throws InterruptedException
	{
		usertext.sendKeys("admin");
		
		pwdtext.sendKeys("manager");
		
//		loginbutton.click();
//		Thread.sleep(3000);
//		logoutbutton.click();
	}

}
