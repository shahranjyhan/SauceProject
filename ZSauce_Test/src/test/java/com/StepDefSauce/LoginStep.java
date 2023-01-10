package com.StepDefSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseC_Sauce.BaseSauce;
import com.PageF.Elementz;
import com.Utilities_Sauce.Utilitiez;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep extends BaseSauce {
	
	Elementz pf = PageFactory.initElements(driver, Elementz.class);

	
	@Given("User enters Username")
	public void user_enters_username() throws InterruptedException {
		
		Utilitiez.getHighLighter(pf.getUsername());
		
		Thread.sleep(2000);
		pf.getUsername().sendKeys("standard_user");
	    
	    
	}

	@Given("User enters Password")
	public void user_enters_password() {
	    pf.getPassword().sendKeys("secret_sauce");
	    
	}

	@Given("User clicks on Login")
	public void user_clicks_on_login() {
		pf.getLogin().click();
	    
	    
	}

	@Then("User able to see PRODUCTS")
	public void user_able_to_see_products() {
		
		String actual = pf.getProduct().getText();
		Assert.assertTrue(actual.contains("PRODUCT"));
		
		System.out.println("Hellzz yeaaa!");
	    
	    
	}


}
