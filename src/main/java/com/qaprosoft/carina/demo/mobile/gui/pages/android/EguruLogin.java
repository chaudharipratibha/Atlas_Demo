package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = EguruHomebase.class)

public class EguruLogin extends EguruHomebase {
	@FindBy(id = "com.tatamotors.eguruhybrid:id/user_id")
	private ExtendedWebElement username;
	@FindBy(id = "com.tatamotors.eguruhybrid:id/password")
	private ExtendedWebElement password;
	@FindBy(id = "com.tatamotors.eguruhybrid:id/email_sign_in_button")
	private ExtendedWebElement loginbtn;
	@FindBy(xpath= "//td[text()='ok']	")
	// @FindBy(id="com.tatamotors.eguruhybrid:id/tvCreateNew")
	private ExtendedWebElement clickOnOK;

	public EguruLogin(WebDriver driver) {
		super(driver);

	}

	@Override
	public void LoginEguru() {
		// skip.click();

		username.type("PV10_SPMA");

		password.type("Tata@2019");

	}

	@Override
	public void loginbtn() {
		loginbtn.click();
		driver.switchTo().frame(0);
		System.out.println(driver.getTitle());
		clickOnOK.click();

	}

}
