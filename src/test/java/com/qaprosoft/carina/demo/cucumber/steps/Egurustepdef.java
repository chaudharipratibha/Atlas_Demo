package com.qaprosoft.carina.demo.cucumber.steps;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.EguruHomebase;

import cucumber.api.java.en.Given;

public class Egurustepdef extends CucumberRunner {
	EguruHomebase eguruHomebase =null;
	@Given("^launch the application$")
	public void startMethod()
	{
	
	 eguruHomebase= initPage(getDriver(),EguruHomebase.class);
	}

}
