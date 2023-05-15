package com.kpitech.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	
	private Utility() {
	}
	
	public static boolean isElementPresentByXpath(WebDriver driver, String name) {
		try 
		{
			findElement(driver, name, "xpath");
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}
	
	public static boolean isElementPresentByCssSelector(WebDriver driver, String name) {
		try {
			findElement(driver, name, "cssSelector");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isElementPresentById(WebDriver driver, String name) {
		try {
			findElement(driver, name, "id");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	public static WebElement findElement(WebDriver driver, String name, String type) {
		if(type.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(name));
		}
		if(type.equalsIgnoreCase("cssSelector")) {
			return driver.findElement(By.cssSelector(name));
		}
		if(type.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(name));
		}
		else {
			return driver.findElement(By.id(name));
		}
	}

}
