package com.acttime.pageobjrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustInfo {
	
	
	@FindBy(xpath="//td[contains(text(),'d customer:')]/following-sibling::td/span")
	private WebElement custNameInfo;

	public WebElement getCustNameInfo() {
		return custNameInfo;
	}
	
	

}
