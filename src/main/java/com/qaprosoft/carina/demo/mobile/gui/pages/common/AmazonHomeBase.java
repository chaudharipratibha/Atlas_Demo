package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class AmazonHomeBase extends AbstractPage{

	public AmazonHomeBase(WebDriver driver) {
		super(driver);
	}
	public abstract void skip() ;

	
	

}
