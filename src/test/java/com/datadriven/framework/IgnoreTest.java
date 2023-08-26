package com.datadriven.framework;

import org.testng.annotations.Test;

public class IgnoreTest{

	@Test
	//(enabled = false)
	private void product_select() {
		System.out.println("ProductSelect");
	}

	@Test
	//(enabled = false)
	private void overview() {
		System.out.println("Overview");
	}
	
	@Test
	private void amazon() {
		System.out.println("amazon");
	}
	
	@Test
	private void flipkart() {
		System.out.println("flipkart");
	}
}
