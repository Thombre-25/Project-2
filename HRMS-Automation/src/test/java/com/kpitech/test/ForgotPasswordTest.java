package com.kpitech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kpitech.util.Utility;

public class ForgotPasswordTest 
{
	
private WebDriver driver;
	
	@BeforeMethod
	public void initiateDriver() 
	{
		driver = TestConfig.getInstance().driver;
	}
	
	//...........
	
	
	@Test(priority = 1)
	public void checkForgotPasswordLinkFunctionality() 
	{    
		try 
		{
			//Validation for forgot password link functionality  
		    driver.findElement(By.id("email-login")).sendKeys("ganeshthombre9797@gmail.com"); //Provide email
         	Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[3]/div/div/a")).click(); //click on forgot password link
		    
		    String actualURL = driver.getCurrentUrl();
		    Thread.sleep(3000);
		    String expectedURL ="http://10.0.138.52:3000/forgot-password/?email=ganeshthombre9797@gmail.com";
		    Assert.assertEquals(actualURL, expectedURL);
		    System.out.println("Test P1 pass:-Forgot password link is working, current URL is  :" + actualURL);
		    
		    //validating back to login link availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > div.MuiGrid-root.MuiGrid-container.MuiGrid-direction-xs-column.css-ujljcm-MuiGrid-root > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-6dalm9-MuiGrid-root > div > div > div > div > div > div:nth-child(1) > div > a"), "Back to login page button is not available");
		    System.out.println("Test P1 pass:- Back to login link is available");
		    
		    //validating back to login link functionality
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/a")).click(); //click on back to login link
		    String actualURL1 = driver.getCurrentUrl();
		    Thread.sleep(3000);
		    String expectedURL1 ="http://10.0.138.52:3000/login";
		    Assert.assertEquals(actualURL1, expectedURL1);
		    System.out.println("Test P1 pass:-Back to login link is working, current URL is  :" + actualURL1);
		    
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	

	
	@Test(priority=2)
	public void checkForgotPassScreenElement()
	{
		try 
		{
			//Check email address field is availability
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[3]/div/div/a")).click(); // click on forgot password link
			Thread.sleep(3000);
		    Assert.assertTrue(Utility.isElementPresentById(driver, "email-forgot"), "Email address field is not available");
			System.out.println("Test P2 pass:- email address field is availability");
		    
			//Check "send password reset email" button is availability 
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/button"), "send password reset email button is not available");
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/a")).click(); // click on back to login
			System.out.println("Test P2 pass:-send password reset email button is availability");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	
	
	
	@Test(priority=3)
	public void checkEmailAddressFieldFunctionality()
	{
		try 
		{
			// Check "send password reset email" button is Functionality without entering email address
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[3]/div/div/a")).click(); // click on forgot password link
			Thread.sleep(3000);
			Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/button", "xpath").click(); //click on send password reset button
			Thread.sleep(3000);
		    String errorMessage = Utility.findElement(driver, "helper-text-email-forgot", "id").getText(); //get text
		    System.out.println("Test P3 is pass:- Witout email address System is throwing the error message:" + errorMessage); //print the error message
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/a")).click(); // click on back to login
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}


	
	@Test(priority=4)
	public void checkEmailFieldInvalidFormat() 
	{
		try 
		{
			//forgot password screen:-  check Email Address field functionality   AND    incorrect format of email address
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[3]/div/div/a")).click(); // click on forgot password link
			Thread.sleep(3000);
			Utility.findElement(driver, "email-forgot", "id").sendKeys("ganeshthombreee9797@gmail."); //click on forgot password screen- email address field and send invalid email
			Thread.sleep(3000);
			System.out.println("Test P4 pass:- Email address field is present");
			
			Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/button", "xpath").click(); //click on send password reset button
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentById(driver, "helper-text-email-forgot"), "Must be a valid email Text not available");
			Assert.assertEquals(Utility.findElement(driver, "helper-text-email-forgot", "id").getText(), "Must be a valid email");
			System.out.println("Test P4 pass:- Email address field throwing error for incorrect email address");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}

	
	@Test(priority=5)
	public void checkEmailFieldUnknownFormate() //checkForgotPasswordInvalidFormateEmail1
	{
		try 
		{
			//check forgot password screen:-email address which is not in server
			Thread.sleep(5000);
			Utility.findElement(driver, "email-forgot", "id").sendKeys("com"); //click on forgot password screen- email address field and send invalid email
			Thread.sleep(3000);
			Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/button", "xpath").click(); //click on send password reset button
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/p"), "Your email is not registerd with us, Please check it Text not available");
			Assert.assertEquals(Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/p", "xpath").getText(), "Your email is not registerd with us, Please check it");
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/a")).click(); // click on back to login
		    
		    System.out.println("Test P5 pass:-Unknown email throws error.....");//.....

			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	
	@Test(priority=6)
	public void checkResetPasswordScreenElement() 
	{
		try 
		{
			//check reset password screen
			
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[3]/div/div/a")).click(); // click on forgot password link
			Thread.sleep(3000);
			Utility.findElement(driver, "email-forgot", "id").sendKeys("ganeshthombre9797@gmail.com"); //click on forgot password screen- email address field and send invalid email
			Thread.sleep(3000);
			Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/button", "xpath").click(); //click on send password reset button
			Thread.sleep(15000);
			//check page title
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/h3"), "Dialog box title is not available");
			Assert.assertEquals(Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/h3", "xpath").getText(), "Reset Password");
			System.out.println("Test P6 pass:-Page title is available");
			
			// check enter OTP field
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentById(driver, "password-old"), "Enter OTP field is not available");
			System.out.println("Test P6 pass:-Enter OTP field is available");
			
			// check new password field
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentById(driver, "password-password"), "New password field is not available");
			System.out.println("Test P6 pass:-New password field is available");

			
			// check confirm new password field
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentById(driver, "password-confirm"), "Confirm New password field is not available");
			System.out.println("Test P6 pass:-Confirm password field is available");

			//check new password requirement icon 
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[2]/div/h5/button"), "New password requirement icon is not available");
			System.out.println("Test P6 pass:-New password requirement icon is available");

			//check update password button
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[3]/button"), "update password button is not available");
			System.out.println("Test P6 pass:-Update password button is available");

			//check back to login page link
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/a"), "Back to login page link is not available");
			System.out.println("Test P6 pass:-Back to login page link is available");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	
	
	@Test(priority=7)
	public void checkEmptyOTPErrorFunctionality() 
	{
		try 
		{
			//check functionality with empty OTP AND empty new password AND empty confirm password
			Thread.sleep(6000);
			Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[3]/button", "xpath").click(); //click on update password button
			
			//without OTP
			Thread.sleep(3000);
			Assert.assertEquals(Utility.findElement(driver, "password-old-helper", "id").getText(), "OTP is required");
			System.out.println("Test P7 pass:- Without OTP system is throwing the error...");
			
			//without new password
			Thread.sleep(3000);
			Assert.assertEquals(Utility.findElement(driver, "password-password-helper", "id").getText(), "New password is required");
			System.out.println("Test P7 pass:- Without new password system is throwing the error...");

			//without confirm password
			Thread.sleep(3000);
			Assert.assertEquals(Utility.findElement(driver, "password-confirm-helper", "id").getText(), "Confirm new Password is required");
			System.out.println("Test P7 pass:- Without confirm new password system is throwing the error...");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	
	
	
	@Test(priority=8)
	public void checkIncorrectOTPErrorFunctionality() 
	{
		try 
		{
			//check enter OTP field functionality AND check incorrect OTP reset password functionality
			Thread.sleep(3000);
			Utility.findElement(driver, "password-old", "id").sendKeys("123456"); //click on Enter OTP field and send incorrect OTP
			Thread.sleep(3000);
			System.out.println("Test P8 pass:- OTP functionality is working");
		   
			Utility.findElement(driver, "password-password", "id").sendKeys("Ganesh@1234"); //click on new password and provide new good password
			Thread.sleep(3000);
			System.out.println("Test P8 pass:- new password field functionality is working");
			
			//...
			//String color = driver.findElement(By.cssSelector("")).getText(); //This might  work

			//Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "body > div.MuiDialog-root.MuiModal-root.css-v191eg-MuiModal-root-MuiDialog-root > div.MuiDialog-container.MuiDialog-scrollPaper.css-1sep8xo-MuiDialog-container > div > div > div > div > div.MuiBox-root.css-0 > form > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-6.css-g07akc-MuiGrid-root > div > ul > li:nth-child(1) > div.MuiListItemIcon-root.css-1qhmiek-MuiListItemIcon-root > span > svg");

			//...
			//Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[2]/div/ul/li[2]/div[1]/span/svg"), "At least one lowercase letter (a-z) checkbox is not available");

			//....
			//Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[2]/div/ul/li[3]/div[1]/span/svg"), "At least one uppercase letter (A-Z) checkbox is not available");

			//....
			//Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[2]/div/ul/li[4]/div[1]/span/svg"), "At least one number (0-9) checkbox is not available");

			//....
			//Assert.assertTrue(Utility.isElementPresentByXpath(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[2]/div/ul/li[5]/div[1]/span/svg"), "At least one special character checkbox is not available");


			Utility.findElement(driver, "password-confirm", "id").sendKeys("Ganesh@1234"); //click on Confirm password and provide same good password
			Thread.sleep(3000);
			System.out.println("Test P8 pass:- confirm password field functionality is working");

			Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[3]/button", "xpath").click(); //click on update button
			Thread.sleep(3000);
			System.out.println("Test P8 pass:- update button functionality is working");
			
			//URL should not change cause we dont give correct OTP (error message we cant inspect)
		    String actualURL = driver.getCurrentUrl();
		    Thread.sleep(3000);
		    String expectedURL ="http://10.0.138.52:3000/check-mail";
		    Assert.assertEquals(actualURL, expectedURL);
		    System.out.println("Test P8 pass:-By providing invalid OTP URL will not change URL will be the same as i.e:" + actualURL);
		    Thread.sleep(3000);
		    
		    
		    WebElement element = driver.findElement(By.id("password-old"));
		    element.sendKeys(Keys.CONTROL + "a");
		    element.sendKeys(Keys.DELETE);
		    Thread.sleep(5000);
		    
		    WebElement element1 = driver.findElement(By.id("password-password"));
		    element1.sendKeys(Keys.CONTROL + "a");
		    element1.sendKeys(Keys.DELETE);
		    Thread.sleep(5000);
		    
		    WebElement element2 = driver.findElement(By.id("password-confirm"));
		    element2.sendKeys(Keys.CONTROL + "a");
		    element2.sendKeys(Keys.DELETE);
		    Thread.sleep(5000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	
	
	@Test(priority=9)
	public void checkKpiPolicyErrorFunctionality() 
	{
		try 
		{
			//click for new password and enter password which does not follow the kpi policy
			Thread.sleep(3000);
			Utility.findElement(driver, "password-old", "id").sendKeys("123456"); //click on Enter OTP field and send some OTP
			Thread.sleep(3000);
			Utility.findElement(driver, "password-password", "id").sendKeys("Ganesh@"); //click on new password and provide new password which is not following kpi policy
			Thread.sleep(3000);
			Utility.findElement(driver, "password-confirm", "id").click(); //click on Confirm password 
			Thread.sleep(3000);
			Assert.assertEquals(Utility.findElement(driver, "password-password-helper", "id").getText(), "Password must follow the policy"); //get and compare error message because of not following kpi policy in new password
			System.out.println("Test P9 pass :- System is throwing the error if kpi policy not follows");
			
			
		    WebElement element = driver.findElement(By.id("password-old"));
		    element.sendKeys(Keys.CONTROL + "a");
		    element.sendKeys(Keys.DELETE);
		    Thread.sleep(5000);
		    
		    WebElement element1 = driver.findElement(By.id("password-password"));
		    element1.sendKeys(Keys.CONTROL + "a");
		    element1.sendKeys(Keys.DELETE);
		    Thread.sleep(5000);
		    
		    WebElement element2 = driver.findElement(By.id("password-confirm"));
		    element2.sendKeys(Keys.CONTROL + "a");
		    element2.sendKeys(Keys.DELETE);
		    Thread.sleep(5000);
		    
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	
	
	@Test(priority=10)
	public void checkPasswordNotMatchingErrorFunctionality() 
	{
		try 
		{
			//click for new password and enter miss-matching password
			Thread.sleep(3000);
			Utility.findElement(driver, "password-old", "id").sendKeys("123456"); //click on Enter OTP field and send some OTP
			Thread.sleep(3000);
			Utility.findElement(driver, "password-password", "id").sendKeys("Ganesh@12"); //click on new password and provide new password which is not following kpi policy
			Thread.sleep(3000);
			Utility.findElement(driver, "password-confirm", "id").sendKeys("Ganesh@1"); //click on Confirm password and provide miss-matching password
			Thread.sleep(3000);
			Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div/div/button", "xpath").click(); //click on 1st show password icon
			Thread.sleep(3000);
			Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[2]/form/div/div[1]/div[3]/div/div/div/div/button", "xpath").click(); //click on 2nd show password icon
			Thread.sleep(3000);
			Utility.findElement(driver, "password-password", "id").click(); //click on new password to refresh the screen
			Thread.sleep(5000);
			Assert.assertEquals(Utility.findElement(driver, "password-confirm-helper", "id").getText(), "Password mismatch"); //get and compare error message because of miss-matching password
			System.out.println("Test P10 pass :- System is throwing the error if password is miss-matching");
			Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/a", "xpath").click(); //click on Back to login button
			String actualURL = driver.getCurrentUrl();
		    Thread.sleep(3000);
		    String expectedURL ="http://10.0.138.52:3000/login";
		    Assert.assertEquals(actualURL, expectedURL);
			System.out.println("Test P10 pass:- Back to login button (Send password reset email) functionality is working");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	
}
