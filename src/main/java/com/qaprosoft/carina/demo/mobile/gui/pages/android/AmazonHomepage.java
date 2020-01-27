package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.AmazonHomeBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = AmazonHomeBase.class)



public class AmazonHomepage extends AmazonHomeBase {
	
	@FindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private ExtendedWebElement skip;
	
	//@FindBy(id="com.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon")
	//private ExtendedWebElement search;
	

	public AmazonHomepage(WebDriver driver) {
		super(driver);

	}

	@Override
	public void skip() {
		System.out.println("in sikip...");
		skip.click();
		System.out.println("in add to cart");
		//search.click();

	}
//	@Override
//	public void entersearch(String str) {
//		System.out.println("in add to cart");
//		search.click();
//	
//		//search.type(str);
//
//	}

}
