package com.qaprosoft.carina.demo;

import org.testng.annotations.Test;


import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.AmazonHomeBase;

public class AmazonTest extends AbstractTest {
	@Test
	public void setup() 
	{
	   AmazonHomeBase AmazonHomepage = initPage(getDriver(), AmazonHomeBase.class);
	   AmazonHomepage.skip();
	  // pause(10);
	   //AmazonHomepage.entersearch("iphone 11");
	  // Assert.assertTrue(AmazonHomepage.isPageOpened(), "Welcome page isn't opened");
	}
}
