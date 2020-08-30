package org.tcs.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{
	public static int count = 0;
	int maxRunCount=3;

	public boolean retry(ITestResult arg0) {
		System.out.println("Rerun Started");
		if (count < maxRunCount)
		{
			count++;
			return true;
			
		}
		else
		{
		return false;
		}
	}

	
}
