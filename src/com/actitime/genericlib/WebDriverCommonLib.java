package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acttime.projectandcustomertest.ProjectAndCustomerTest;

public class WebDriverCommonLib {
	boolean flag = false;
	public void waitForPageToLoad(){
	
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void waitForLinkTextPresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));
		
	}
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbXpath)));
		
	}

	
	
	
	public boolean verifyText(String wbXpath , String expectedText){
		flag = false;
		String actPage = Driver.driver.findElement(By.xpath(wbXpath)).getText();
		if(expectedText.equals(actPage)){
			flag=true;
			System.out.println(expectedText + " = Page is verified");
		}else{
			System.out.println(expectedText + " = Page is not verified");
		}
		return flag;
	}
	
	public boolean verifyTextPresent(String expectedText){
		flag = false;
		String pageSource = Driver.driver.getPageSource();
		if(pageSource.contains(expectedText)){
			System.out.println(expectedText + "text is verified");
			flag = true;
		}else{
			System.out.println(expectedText + "text is not verified");
		}
		return flag;
	}
	
	public void acceptAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	
	public void cancelAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
	
	
	public void select(String selXpath , String expectedVal){
		Select sel = new Select(Driver.driver.findElement(By.xpath(selXpath)));
		sel.selectByVisibleText(expectedVal);
	}
	
	
	public void select(String selXpath , int index){
		Select sel = new Select(Driver.driver.findElement(By.xpath(selXpath)));
		sel.selectByIndex(index);
	}
	
	
	
	
	
	
	
}
