package com.datadriven.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test(groups = "Shopping apps")
	private void amazon() {
		
		System.out.println("amazon");
	}

	@Test(groups = "Shopping apps")
	private void flipkart() {
		
		System.out.println("flipkart");
	}

	@Test(groups = "Movie apps")
	private void netflix() {
		
		System.out.println("netflix");
	}

	@Test(groups = "Movie apps")
	private void youtube() {
		
		System.out.println("youtube");
	}

}
