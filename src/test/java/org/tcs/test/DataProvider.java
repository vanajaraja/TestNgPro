package org.tcs.test;

public class DataProvider {
	
	@org.testng.annotations.DataProvider(name ="login")
	
	public Object[][] getData()
	{
		Object[][] obj = new Object[][] 
		    	{
		            { "Krishna", "UK" },
		            { "Bhupesh", "USA" }
		        };
		
		return obj;
	}
	@org.testng.annotations.DataProvider(name ="testlogin")
	
	public Object[][] getLoginData() {
		Object[][] obj1 = new Object[][]
				{
						{"Vanaja","java"},							
						{ "",""}
				};
				return obj1;
				}

	
}
