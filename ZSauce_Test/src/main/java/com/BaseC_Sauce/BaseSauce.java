package com.BaseC_Sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSauce {
	public static WebDriver driver;
	
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com");

}
	public static void main(String[] args) {
		//BaseSauce.setup();
	}
}
