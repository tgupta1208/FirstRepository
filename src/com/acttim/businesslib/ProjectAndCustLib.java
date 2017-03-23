package com.acttim.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.genericlib.Driver;
import com.actitime.genericlib.WebDriverCommonLib;
import com.acttime.pageobjrepository.ActiveProjAndCust;
import com.acttime.pageobjrepository.AddNewCustomer;
import com.acttime.pageobjrepository.OpenTasks;


public class ProjectAndCustLib extends WebDriverCommonLib{

	OpenTasks openTaskPage = PageFactory.initElements(Driver.driver, OpenTasks.class);
	ActiveProjAndCust actProAndCustPage =PageFactory.initElements(Driver.driver, ActiveProjAndCust.class);
	AddNewCustomer addNewCustPage = PageFactory.initElements(Driver.driver, AddNewCustomer.class);
	
	
	public void navigateProjectAndCustPage(){
		openTaskPage.getPrjAndCustLnk().click();
		waitForPageToLoad();
	}
	
	public void createCutomer(String customerName){
		actProAndCustPage.getAddNewCustBtn().click();
		waitForPageToLoad();
		addNewCustPage.getCustNameEdt().sendKeys(customerName);
		addNewCustPage.getCreateCustBtn().click();
	}
	
	
	public void navigateToCustomerDetailsPage(String customerName){
		Select sel = new Select(actProAndCustPage.getSelectCustLst());
		sel.selectByVisibleText(customerName);
		actProAndCustPage.getCustShowBtn().click();
		waitForPageToLoad();	
		Driver.driver.findElement(By.linkText(customerName)).click();
		waitForPageToLoad();
	}
	
}
