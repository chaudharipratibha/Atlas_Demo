package com.qaprosoft.carina.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.AmazonHomeBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;

public class AmazonTest extends AbstractTest {
	@Test
	public void init()
	{
	   AmazonHomeBase AmazonHomepage = initPage(getDriver(), AmazonHomeBase.class);
	   Assert.assertTrue(AmazonHomepage.isPageOpened(), "Welcome page isn't opened");
	}
}
