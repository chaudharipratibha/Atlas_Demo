package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract  class EguruHomebase extends AbstractPage{

	public EguruHomebase(WebDriver driver) {
		super(driver);
		
	}
    public abstract void LoginEguru();
}
