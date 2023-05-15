package com.kpitech.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestConfig {
	
	private static TestConfig config;
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setup() throws Exception {
		TestConfig.config = this;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.20.95:3000/login");
	}
	
	@AfterSuite
	public void shutdown() {
		driver.quit();
	}
	
	public static TestConfig getInstance() {
		return config;
	}

}
