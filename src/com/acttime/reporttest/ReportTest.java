package com.acttime.reporttest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.genericlib.Driver;
import com.actitime.genericlib.ExcelLib;
import com.actitime.genericlib.WebDriverCommonLib;
import com.acttim.businesslib.CommonLib;
import com.acttim.businesslib.ProjectAndCustLib;
import com.acttime.pageobjrepository.ActiveProjAndCust;
import com.acttime.pageobjrepository.EditCustInfo;

public class ReportTest {
	//obj declaration
	ExcelLib eLib;
	WebDriverCommonLib wLib;
	CommonLib cLib;
	ProjectAndCustLib bLib;
	EditCustInfo editCustInfoPage;

   @BeforeClass
   public void configBeforeClass(){
		//object intailization
		eLib = new ExcelLib();
		wLib = new WebDriverCommonLib();
		cLib = new CommonLib();
		bLib = new ProjectAndCustLib();
		editCustInfoPage = PageFactory.initElements(Driver.driver, EditCustInfo.class);
		
   }
	
	
   @BeforeMethod
   public void configBeforeMts() throws InvalidFormatException, IOException{
		
		// get test data from ecxel 
		String userName =eLib.getExcelRowData("Data" ,1,2);
		String password = eLib.getExcelRowData("Data" ,1,3);
		
		//step 1 : login To aPP
		cLib.loginTOAPP(userName, password);
		

		
   }
   
   
	@Test
	public void createReportTest() throws InvalidFormatException, IOException{
		
		System.out.println("ececute crete report");
	}
	
	@Test
	public void modifyReportTest() throws InvalidFormatException, IOException{
		
		System.out.println("ececute modify report");
	}
	
	
	
	@AfterMethod
	public void configAfterMtd(){
		//step 6 : logout
		cLib.logout();
		
	}
	
	
	@AfterClass
	public void configAfterclass(){
		Driver.driver.quit();
	}

}
