package com.StepDefSauce;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseC_Sauce.BaseSauce;
import com.PageF.Elementz;
import com.Utilities_Sauce.Utilitiez;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStep extends BaseSauce {
	
	Elementz pf = PageFactory.initElements(driver, Elementz.class);
	
	@Given("User clicks add to cart")
	public void user_clicks_add_to_cart() {
		
		pf.getShirt().click();


	}

	@When("User clicks cart button")
	public void user_clicks_cart_button() throws InterruptedException {
		
		Thread.sleep(2000);
		pf.getCartButton().click();


	}

	@When("User clicks on checkout")
	public void user_clicks_on_checkout() {
		
		pf.getCheckOut().click();


	}

	@When("User enters first name")
	public void user_enters_first_name() throws InterruptedException {
		Thread.sleep(2000);
		pf.getFirst().sendKeys("Shahran");


	}

	@When("User enters last name")
	public void user_enters_last_name() {
		Utilitiez.getHighLighter(pf.getLast());
		pf.getLast().sendKeys("Jyhan");


	}

	@When("User enters zip code")
	public void user_enters_zip_code() {
		pf.getZipCode().sendKeys("11232");


	}

	@When("User clicks on Continue")
	public void user_clicks_on_continue() throws InterruptedException {
		pf.getContinue2().click();
		Thread.sleep(2000);


	}

	@Then("User clicks on finish")
	public void user_clicks_on_finish() {
		
		pf.getFinish().click();
		


	}

	@Then("User should see {string}")
	public void user_should_see(String string) throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		Utilitiez.getHighLighter(pf.getThankYou());
		String actual = pf.getThankYou().getText();
		Assert.assertTrue(actual.contains("THANK YOU FOR YOUR ORDER"));
		Utilitiez.takeScreenShot();
		
		System.out.println("Cool Beans");

	}


}
