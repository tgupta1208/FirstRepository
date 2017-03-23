package com.acttime.pageobjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer {
	
	@FindBy(name="name")
	private WebElement custNameEdt;
	
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement createCustBtn;

	public WebElement getCustNameEdt() {
		return custNameEdt;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	

}
