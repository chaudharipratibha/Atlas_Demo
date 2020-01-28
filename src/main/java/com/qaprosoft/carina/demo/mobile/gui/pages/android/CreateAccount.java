package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class CreateAccount extends EgurucreateAccountbase {

	public CreateAccount(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="android:id/button")
	//@FindBy(id="com.tatamotors.eguruhybrid:id/tvCreateNew")
	private ExtendedWebElement clickOnOK;
	
	
	public void create()
	{
		clickOnOK.click();
	}


	
}
