package com.testng;

import org.testng.annotations.Test;

public class Basic1 {

	@Test(groups={"Smoke"})
	public void One()
	{
		System.out.println("Hello..Smoketest");
	}
	@Test(groups={"Regression"})
	public void Two()
	{
		System.out.println("Hello..Regression");
	}
	@Test(groups={"Smoke"})
	public void Three()
	{
		System.out.println("Hello..Smoketest");
	}
	@Test(groups={"Smoke"})
	public void four()
	{
		System.out.println("Hello..Smoketest");
	}
	@Test(groups={"Regression"})
	public void five()
	{
		System.out.println("Hello..Regression");
	}
}
