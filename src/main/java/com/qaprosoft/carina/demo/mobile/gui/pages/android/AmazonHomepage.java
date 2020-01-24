package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.AmazonHomeBase;

public class AmazonHomepage extends AmazonHomeBase {
	@FindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private ExtendedWebElement skip;



	public AmazonHomepage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public void signIn() throws InterruptedException {
		skip.click();
		Thread.sleep(2000);
		
	}

}
