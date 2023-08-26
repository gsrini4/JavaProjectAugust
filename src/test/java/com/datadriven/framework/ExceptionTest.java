package com.datadriven.framework;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions = Exception.class)
	private void add() {
		int i = 10;
		int j =0;
		System.out.println(i/j);
	}
}
