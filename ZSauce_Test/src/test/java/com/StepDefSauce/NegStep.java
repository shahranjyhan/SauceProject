package com.StepDefSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseC_Sauce.BaseSauce;
import com.PageF.Elementz;
import com.Utilities_Sauce.Utilitiez;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class NegStep extends BaseSauce {
	
	Elementz pf = PageFactory.initElements(driver, Elementz.class);
	
	@Given("User navigates to URL")
	public void user_navigates_to_url() {


	}

	@Given("user enters Wrong {string} and {string}")
	public void user_enters_wrong_and(String username, String password) {
	
		pf.getUsername().sendKeys(username);
		pf.getPassword().sendKeys(password);


	}

	@Then("User clicks on login")
	public void user_clicks_on_login() {
		
		pf.getLogin().click();


	}

	@Then("User should see an error message")
	public void user_should_see_an_error_message() throws InterruptedException {
		Thread.sleep(2000);
		String Expected =  "Username and password do not match any user in this service";
		String Actual = driver.findElement(By.xpath("//*[@data-test = 'error']")).getText();
		
		Assert.assertEquals(Actual, Expected);
		
		System.out.println("Title");
		
		
		


	}

	
	

}
