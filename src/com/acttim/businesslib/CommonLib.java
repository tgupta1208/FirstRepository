package com.acttim.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericlib.Driver;
import com.actitime.genericlib.WebDriverCommonLib;
import com.acttime.pageobjrepository.Common;
import com.acttime.pageobjrepository.Login;

public class CommonLib extends WebDriverCommonLib{
	
	Login loginPage = PageFactory.initElements(Driver.driver, Login.class);
	Common commonPage = PageFactory.initElements(Driver.driver, Common.class);
	
	
	public void loginTOAPP(String userName, String password){
		Driver.driver.get("http://admin-pc/login.do");
		loginPage.getUserNameEdt().sendKeys(userName);
		loginPage.getPasswordEdt().sendKeys(password);
		loginPage.getLoginBtnEdt().click();
		waitForPageToLoad();
		
	}
	
	
	public void logout(){
		commonPage.getLogoutImg().click();
		waitForPageToLoad();
	}

	
}
