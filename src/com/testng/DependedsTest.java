package com.testng;

import org.testng.annotations.Test;

public class DependedsTest {

	@Test(dependsOnMethods={"openBrowser"})
	public void signIn()
	{
		System.out.println("Login your application");
	}
	@Test
	public void openBrowser()
	{
		System.out.println("Open your browser");
	}
	@Test (dependsOnMethods={"signIn"})
	public void  logout()
	{
		System.out.println("Logout application");
	}
}
