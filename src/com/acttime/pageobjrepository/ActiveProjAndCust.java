package com.acttime.pageobjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjAndCust {
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustBtn;
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjBtn;

	@FindBy(xpath="//select[@name='selectedCustomer']")
	private WebElement selectCustLst;
	
	
	@FindBy(xpath="//input[contains(@value,'Show')]")
	private WebElement custShowBtn;
	
	
	public WebElement getCustShowBtn() {
		return custShowBtn;
	}
	
	public WebElement getSelectCustLst() {
		return selectCustLst;
	}
	
	public WebElement getAddNewCustBtn() {
		return addNewCustBtn;
	}

	public WebElement getAddNewProjBtn() {
		return addNewProjBtn;
	}

}
