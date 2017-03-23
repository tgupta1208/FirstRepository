package com.acttime.pageobjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	
	@FindBy(className="logoutImg")
	private WebElement logoutImg;

	public WebElement getLogoutImg() {
		return logoutImg;
	}
	
	
	

}
