package com.datadriven.framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTopics {

	@Test(retryAnalyzer = RetryAnalyzerClass.class)
	private void data() {
		String expected = "Garuda";
		String actual = "garuda";
		
		//Hard assert
		Assert.assertEquals(actual, expected);
	}
}
