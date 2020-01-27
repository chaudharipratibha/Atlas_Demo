package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = EguruHomebase.class)

public class EguruLogin extends EguruHomebase{
	@FindBy(id="com.tatamotors.eguruhybrid:id/user_id")
	private ExtendedWebElement username;
	@FindBy(id="com.tatamotors.eguruhybrid:id/password")
	private ExtendedWebElement password;
	
	public EguruLogin(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public void LoginEguru() {
		//skip.click();
		
		username.type("PV10_SPMA");
		pause(5);
		password.type("Tata@2019");
		pause(5);
	}
	
	

}
