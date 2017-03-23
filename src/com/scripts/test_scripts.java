package com.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.arun.arun_page;

public class test_scripts
{
	
	
	@Test
	public void testlogin_script() throws InterruptedException
	{
		
		WebDriver driver =new FirefoxDriver(); 
		
		driver.get("http://admin-pc/login.do");
		
		
	
		arun_page ap=new arun_page(driver);
		ap.login();
		
	}

}
