package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class AmazonHomeBase extends AbstractPage{
	public abstract void signIn() throws InterruptedException;
	

	public AmazonHomeBase(WebDriver driver) {
		super(driver);
		
	}


}
