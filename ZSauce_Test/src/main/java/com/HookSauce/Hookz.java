package com.HookSauce;

import com.BaseC_Sauce.BaseSauce;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookz extends BaseSauce {
	
	@Before
	public static void initialize() {
		BaseSauce.setup();
	}
	
	@After
	public static void teardown() {
		//driver.quit();
	}

}
