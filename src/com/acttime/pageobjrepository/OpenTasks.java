package com.acttime.pageobjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement prjAndCustLnk;
	
	@FindBy(linkText="Reports")
	private WebElement reportLnk;
	
	@FindBy(linkText="Users")
	private WebElement userLnk;

	public WebElement getPrjAndCustLnk() {
		return prjAndCustLnk;
	}

	public WebElement getReportLnk() {
		return reportLnk;
	}

	public WebElement getUserLnk() {
		return userLnk;
	}

	
}
