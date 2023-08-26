package com.datadriven.framework;

import org.testng.annotations.Test;

public class TimeoutTest {

	@Test(timeOut = 3000)
	private void add() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("BrowserLaunch");
	}
}
