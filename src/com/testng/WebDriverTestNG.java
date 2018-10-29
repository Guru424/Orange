package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverTestNG {

	WebDriver driver;
	@BeforeClass
	public void startUp()
	{
		driver=new FirefoxDriver();
		Reporter.log("Open new Browser");
	}
	
	@Test
	public void login(){
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Reporter.log("Open Application");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		WebDriverWait wait=new  WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		
	    driver.findElement(By.name("txtPassword")).sendKeys("admin");
	    driver.findElement(By.name("Submit")).click();
	    Reporter.log("Login Complated");
	}
	@Test
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout complate");
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
		Reporter.log("Close Browser");
	}
}
