package com.qaprosoft.carina.demo.cucumber.steps;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.EguruHomebase;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.EgurucreateAccountbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Egurustepdef extends CucumberRunner {
	EguruHomebase eguruHomebase = null;
	EgurucreateAccountbase egurucreateAccountbase=null;

	@Given("^launch the application$")
	public void startMethod() {
		eguruHomebase = initPage(getDriver(), EguruHomebase.class);
	}

	@Then("^set Username and Password$")
	public void enter() {
		eguruHomebase.LoginEguru();
	}

	@Then("^login$")

	public void loginbtn() {
		eguruHomebase.loginbtn();
	}
	
	
	/*
	 * @Then("^create$") public void createbtn() { egurucreateAccountbase.create();
	 * }
	 */
}
