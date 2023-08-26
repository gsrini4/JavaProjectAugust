package com.datadriven.framework;

import org.testng.annotations.*;


public class ParameterizedTest {

	@Test(dataProvider = "data")
	private void testData(String username, String password) {
		System.out.println("Username = "+username+ " and Password = "+password);
	}
	
	@DataProvider //return type: 2D array
	private Object[][] data() {

		return new Object[][] {	{"Ganishka", "Gani"},
			{"Dhamodharan", "Dhamo"},
			{"Vignesh", "Vicky"},
			{"Barani","barani"},
			{"Nandhini","nandhini"}	
		};
	}
}
