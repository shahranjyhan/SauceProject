package com.PageF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseC_Sauce.BaseSauce;

public class Elementz extends BaseSauce {
	
	public Elementz() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}
	
	@FindBy (id = "password")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy (xpath = "//*[@class='submit-button btn_action']")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
	
	@FindBy (xpath = "//*[@class='title']")
	private WebElement Product;

	public WebElement getProduct() {
		return Product;
	}

	@FindBy (xpath = "(//*[@class='btn btn_primary btn_small btn_inventory'])[3]")
	private WebElement shirt;

	public WebElement getShirt() {
		return shirt;
	}
	
	@FindBy (xpath = "//*[@class='shopping_cart_link']")
	private WebElement CartButton;

	public WebElement getCartButton() {
		return CartButton;
	}
	
	@FindBy (id="checkout")
	public WebElement CheckOut;

	public WebElement getCheckOut() {
		return CheckOut;
	}
	
	@FindBy (id ="first-name")
	private WebElement First;

	public WebElement getFirst() {
		return First;
	}
	
	@FindBy (id = "last-name")
	private WebElement Last;

	public WebElement getLast() {
		return Last;
	}
	
	@FindBy (id = "postal-code")
	private WebElement ZipCode;

	public WebElement getZipCode() {
		return ZipCode;
	}
	
	@FindBy (xpath = "//*[@class='submit-button btn btn_primary cart_button btn_action']")
	private WebElement Continue2;

	public WebElement getContinue2() {
		return Continue2;
	}
	
	@FindBy (id = "finish")
	private WebElement Finish;

	public WebElement getFinish() {
		return Finish;
	}
	
	@FindBy (xpath = "//*[@class='complete-header']")
	private WebElement ThankYou;

	public WebElement getThankYou() {
		return ThankYou;
	}
	
	@FindBy (xpath = "//*[@class='error-message-container error']")
	private WebElement Error;

	public WebElement getError() {
		return Error;
	}

}
