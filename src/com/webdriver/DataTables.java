package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataTables {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin");
    driver.findElement(By.name("Submit")).click();
    
    //Enter frame
    driver.switchTo().frame("rightMenu");
    //Count rows and columns
    int rows=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
    int colu=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr[1]/td")).size();
    
    int rowscolus=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td")).size();
    
    System.out.println("Total rows="+rows);
    System.out.println("Total columns="+colu);
    System.out.println("Total Rows and Columns="+rowscolus);
    
   String data= driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr[3]/td[3]/a")).getText();
   System.out.println(data);
   
   for(int i=1;i<rows;i++)
   {
	 String data1=  driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]")).getText();
	 System.out.println(data1);
	 if(data1.equals("Guru prakash")){
		 
	 }
   }
}
}
