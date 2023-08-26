package com.datadriven.framework;

import org.testng.annotations.*;

public class SimpleAnnotation {

	// we can do validate using data provoder by pass multiple data in testcases
	
//	it will have more than one parameters
//	
//	and then we will pass it in testcase..
//	
//	methods to test data to our test methods.. it allows us to separate the test data from test logic, ,
//	making our tests more flexible and reusable
//	
//	using 2d array
//	
//	data driven will pass the data to testcases
//	
//	only one data we can pass in xml
//	
//	data driven will can pass the data from excel
	
	
	
	@BeforeTest
	private void url() {
		System.out.println("URL");
	}

	@BeforeClass
	private void productSearch() {
		System.out.println("Product search");
	}

	@BeforeMethod
	private void filters() {
		System.out.println("Filters");
	}
	@AfterMethod
	private void productReview() {
		System.out.println("Product review");
	}

	@AfterTest
	private void bookProduct() {
		System.out.println("Book the product");
	}
}
