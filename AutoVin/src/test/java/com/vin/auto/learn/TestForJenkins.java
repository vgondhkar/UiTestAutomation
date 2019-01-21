package com.vin.auto.learn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestForJenkins {
	@Test
	
	public void firstStep() {
		System.out.println("Test the  First script");
	}

	@BeforeMethod
	
	public void openBrowser() {
		System.out.println("Open Browser");
	}
	
	@AfterMethod
	
	public void closeBrowser() {
		
		System.out.println("Close Browser");
	}
	
}
