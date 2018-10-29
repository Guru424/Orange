package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://jqueryui.com/droppable/");
	
	Actions action=new Actions(driver);
	
	//Enter frame:-
	driver.switchTo().frame(0);
	//DragAndDrop
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	
	action.dragAndDrop(source, target).perform();
}
}
