package com.StepDefSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.BaseC_Sauce.BaseSauce;
import com.PageF.Elementz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NegStep extends BaseSauce {
	
	Elementz pf = PageFactory.initElements(driver, Elementz.class);
	
	@Given("User navigates to URL")
	public void user_navigates_to_url() {


	}

	@Given("user enters Wrong <username> and <password>")
	public void user_enters_wrong_username_and_password() {
		pf.getUsername().sendKeys("Username");
		pf.getPassword().sendKeys("Password");


	}

	@Then("User clicks on login")
	public void user_clicks_on_login() {
		
		pf.getLogin().click();


	}

	@Then("User should see an error message")
	public void user_should_see_an_error_message() {
		
		pf.getError().getText();


	}

	
	

}
