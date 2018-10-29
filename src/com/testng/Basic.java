package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basic {

	@Test
	public void A()
	{
		System.out.println("This  test1 Annotation");
	}
	@Test(priority=1)
	public void B()
	{
		System.out.println("This  test2 Annotation");
	}
	@Test
	public void C()
	{
		System.out.println("This  test3 Annotation");
	}
	
	@BeforeClass
	public void bclass(){
	System.out.println("Before claas");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("After class");
	}
	@BeforeMethod
	public void bmethod(){
		
		System.out.println("Before method");
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("Afyer method");
	}
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void asuite()
	{
		System.out.println("After suite");
	}
}
