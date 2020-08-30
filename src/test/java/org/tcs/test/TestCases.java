package org.tcs.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
	
	@BeforeTest
	public void beforeEachMethod() {
		System.out.println("Before test");	
		}
	
	
	@AfterTest
	public void aftereachMethod() {
	System.out.println("After test");

	}

	@Test(invocationCount=3, threadPoolSize=3, dataProvider="login",dataProviderClass=DataProvider.class)
	
	public void testCase1(String s1, String s2) {
		System.out.println(s1+s2);
	}
	
	@Test()
	
	public void testcase2() {
		System.out.println("Failed Test case");
		Assert.fail();
	}

}
