package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
		
	@Test (dependsOnMethods = "test2", groups = {"sanity"})
	public void test1()
	{
		System.out.println("Inside Homeloan Test 1");
	}
	@Test(groups = {"sanity","regression"}) 
	public void test2()
	{
		System.out.println("Inside Homeloan Test 2");
	}
	

}
