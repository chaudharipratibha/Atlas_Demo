package com.qaprosoft.carina.demo;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.EguruHomebase;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.EguruLogin;

public class EguruTest extends AbstractTest {
	//EguruLogin eguruLogin =new EguruLogin(null);
	@Test
	public void setUp() throws InterruptedException
	{	System.out.println("Started");
		EguruHomebase eguruHomebase= initPage(getDriver(),EguruHomebase.class);
		System.out.println("opened");
		Thread.sleep(5000);
		eguruHomebase.LoginEguru();
		//eguruHomebase.isPageOpened();
	}
	}


