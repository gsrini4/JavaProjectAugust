package com.datadriven.framework;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 0)
	private void product_select() {
		System.out.println("ProductSelect");
	}

	@Test(priority = 1)
	private void overview() {
		System.out.println("Overview");
	}
	
	@Test(invocationCount = 10)
	private void amazon() {
		System.out.println("amazon");
	}
	
	@Test(priority = 2)
	private void flipkart() {
		System.out.println("flipkart");
	}
}
