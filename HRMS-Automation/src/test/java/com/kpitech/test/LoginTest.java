package com.kpitech.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kpitech.util.Utility;

public class LoginTest 
{
	private WebDriver driver;
	
	@BeforeMethod
	public void initiateDriver() 
	{
		driver = TestConfig.getInstance().driver;
	}
	
	@Test(priority = 1)
	public void checkLoginElements() 
	{
			//login button
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button"), "Login Button is not available");
			/*boolean isDisplayed= driver.findElement(By.xpath("")).isDisplayed();
			if(isDisplayed)
			{
				System.out.println("Test 1 pass:-Login button is Present");
			}
			else
			{
				System.out.println("Test 1 fail:-Login button is not present");
			}*/ 	
	}	

	@Test(priority = 2)
	public void checkLoginFunctionality()  
	{
		try 
		{
			//login button functionality
	    	driver.findElement(By.id("email-login")).sendKeys("ganeshthombre9797@gmail.com"); //Provide email
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("-password-login")).sendKeys("Ganesh@123"); //Provide password
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click(); //click on login button
	    	Thread.sleep(2000);
		    String actualURL = driver.getCurrentUrl();
		    String expectedURL ="http://192.168.20.95:3000/dashboard";
		    Assert.assertEquals(actualURL, expectedURL);
		    System.out.println("Test 2 pass:-Login button functionality is working, current URL is  :" + actualURL);
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[6]/button/div/h6")).click();//click on profile
	    	Thread.sleep(2000);
    		driver.findElement(By.xpath("//*[@id=\"profile-tabpanel-0\"]/div/nav/div[4]/div[2]/span")).click(); //click on logout
	    	Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 3)
	public void checkLunchScreen() throws InterruptedException 
	{
	    	//Lunch screen
	        String actualTitle1 = driver.getTitle();
	        String expectedTitle1 ="HRMS | KPi-Tech";
	        Assert.assertEquals(actualTitle1, expectedTitle1);
	        System.out.println("Test 3 pass:-HRMS screen lunch succesfully with title :" + actualTitle1);
	}	
	
    		@Test(priority = 4)
    		public void checkEmailFieldPlaceholder() throws InterruptedException 
   	{
    			//Check Email field is showing the placeholder 
        		String expectedPlaceHolder ="Enter email address";
        		String actualPlaceHolder=driver.findElement(By.cssSelector(".css-1u40o6b-MuiInputBase-input-MuiOutlinedInput-input")).getAttribute("placeholder");
        		if(actualPlaceHolder.equals(expectedPlaceHolder))
        		{
        			System.out.println("Test 4 pass:- Email field is showing the PlaceHolder :" + actualPlaceHolder);
        		}
        		else
        		{
        			System.out.println("Test 4 Fail:- Email filed is not showing the PlaceHolder " + expectedPlaceHolder );
        		}
    } 
    		
    		@Test(priority = 5)
    		public void checkPasswordFieldPlaceholder() throws InterruptedException 
   	{
    			//Check password field is showing the placeholder
        		String expectedPlaceHolder1 ="Enter password";
        		String actualPlaceHolder1=driver.findElement(By.cssSelector("#-password-login")).getAttribute("placeholder");
        		if(actualPlaceHolder1.equals(expectedPlaceHolder1))
        		{
        			System.out.println("Test 5 pass:- Password field is showing PlaceHolder :" + actualPlaceHolder1);
        		}
        		else
        		{
        			System.out.println("Test 5 Fail:- Password field is not showing PlaceHolder" + expectedPlaceHolder1);
        		}
    }
    		
	@Test(priority = 6)
	public void checkEmailField()  
	{
		try
		{
			//Check the email field error
	        driver.findElement(By.id("email-login")).click(); // click on email
	        Thread.sleep(3000);
	        driver.findElement(By.id("-password-login")).click(); //click on password
	        Thread.sleep(3000);
	        String errorMessage = driver.findElement(By.xpath("//*[@id=\"standard-weight-helper-text-email-login\"]")).getText();
	        System.out.println("Test 6 pass:-Email feild is throwing the error message :" + errorMessage);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
		    
	} 
	
	@Test(priority = 7)
	public void checkPasswordfield()   
	{
		try 
		{
			//check the password field error
    	    driver.findElement(By.id("-password-login")).click(); // click on password
	        Thread.sleep(3000);
	        driver.findElement(By.id("email-login")).click(); // click on email
	        Thread.sleep(3000);
    	    String errorMessage1 = driver.findElement(By.id("standard-weight-helper-text-password-login")).getText();
    	    System.out.println("Test 7 pass:- Paasword field throwing the error message :" + errorMessage1);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
			
	}
	
	@Test(priority = 8)
	public void checkLoginErrorMessage()  
	{
		try 
		{
			//Error message for login without credentials 
    	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
    	    Thread.sleep(3000);
    	    String errorMessage= driver.findElement(By.id("standard-weight-helper-text-email-login")).getText();
    	    String errorMessage1= driver.findElement(By.id("standard-weight-helper-text-password-login")).getText();
    	    System.out.println("Test 8 pass:- System is throwing the message :" + errorMessage + " And " + errorMessage1 );
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
			
	} 
	
	@Test(priority = 9)
	public void checkInvalidFormateCredentials() throws InterruptedException 
	{
			//Error message for invalid formate of email 
	        driver.findElement(By.id("email-login")).sendKeys("ganeshthombre@gmail."); //provide invalid email address
    	    driver.findElement(By.id("-password-login")).click(); // click on password
    	    String errorMessage = driver.findElement(By.id("standard-weight-helper-text-email-login")).getText();
    	    System.out.println("Test 9 pass:- System is throwing message :" + errorMessage);
    	    // driver.findElement(By.id("email-login")).clear();
	} 
	
	@Test(priority = 10)
	public void checkInvalidEmailAddress() throws InterruptedException 
	{
			//Error message for invalid email address and valid password
		    WebElement element = driver.findElement(By.id("email-login"));
		    element.sendKeys(Keys.CONTROL + "a");
		    element.sendKeys(Keys.DELETE);
		    Thread.sleep(2000);
	        driver.findElement(By.id("email-login")).sendKeys("ganeshdinkarthombre9797@gmail.com"); //provide invalid email address
	        Thread.sleep(2000);
    	    driver.findElement(By.id("-password-login")).sendKeys("Ganesh@123"); //Provide valid password
    	    Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click(); //click on login button
    	    Thread.sleep(2000);
    	    String errorMessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/p")).getText();
    	    Thread.sleep(2000);
    	    System.out.println("Test 10 pass:- System is throwing message for invalid Password :" + errorMessage);
	} 
	
	@Test(priority = 11)
	public void checkInvalidPassword() throws InterruptedException 
	{
			//Error message for valid email address and invalid password
		    WebElement element = driver.findElement(By.id("email-login"));
		    element.sendKeys(Keys.CONTROL + "a");
		    element.sendKeys(Keys.DELETE);
		    WebElement element1 = driver.findElement(By.id("-password-login"));
		    element1.sendKeys(Keys.CONTROL + "a");
		    element1.sendKeys(Keys.DELETE);
		    Thread.sleep(2000);
	        driver.findElement(By.id("email-login")).sendKeys("ganeshthombre9797@gmail.com"); //provide invalid email address
	        Thread.sleep(2000);
    	    driver.findElement(By.id("-password-login")).sendKeys("Ganesh@1234"); //Provide valid password
    	    Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click(); //click on login button
    	    Thread.sleep(2000);
    	    String errorMessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/p")).getText();
    	    Thread.sleep(2000);
    	    System.out.println("Test 11 pass:- System is throwing message for invalid email address:" + errorMessage);
	} 
	
	@Test(priority = 12)
	public void checkValidCredentials() throws InterruptedException 
	{    
		    //Validation for valid credentials  
	    	WebElement element = driver.findElement(By.id("email-login"));
	        element.sendKeys(Keys.CONTROL + "a");
	        element.sendKeys(Keys.DELETE);
	        WebElement element1 = driver.findElement(By.id("-password-login"));
	        element1.sendKeys(Keys.CONTROL + "a");
	        element1.sendKeys(Keys.DELETE);
	     	driver.findElement(By.id("email-login")).sendKeys("ganeshthombre9797@gmail.com"); //Provide email
        	Thread.sleep(2000);
        	driver.findElement(By.id("-password-login")).sendKeys("Ganesh@123"); //Provide password
    	    Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/div/div/div/button")).click(); //click on view icon
    	    Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click(); //click on login button
    	    Thread.sleep(2000);
	        String actualURL = driver.getCurrentUrl();
	        String expectedURL ="http://10.0.138.52:3000/dashboard";
	        Assert.assertEquals(actualURL, expectedURL);
	        System.out.println("Test 12 pass:-With the valid credentials user is redirected to the dashboard, having URL of:" + actualURL);
	        System.out.println("Test 13 pass:- View icon is working");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[6]/button/div/h6")).click();//click on profile
        	Thread.sleep(2000);
        	
        	
        	//.....change 
	        driver.findElement(By.xpath("//*[@id=\"profile-tabpanel-0\"]/div/nav/div[3]/div[2]/span")).click();//click on change password

	        WebElement E = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/form/div/div[2]/div/ul/li[1]/div[1]/span/svg"));
        	String backgroundc = E.getCssValue("color");
        	System.out.println(backgroundc);
        	//.....changes end
        	
        	
	     	driver.findElement(By.xpath("//*[@id=\"profile-tabpanel-0\"]/div/nav/div[4]/div[2]/span")).click(); //click on logout
    	    Thread.sleep(2000);   
	} 
	
	@Test(priority = 13)
	public void checkKpiLogo() throws InterruptedException 
	{    
		    //Validation for kPI LOGO
	        boolean isDisplayed= driver.findElement(By.cssSelector("#root > div > div.MuiGrid-root.MuiGrid-container.MuiGrid-direction-xs-column.css-ujljcm-MuiGrid-root > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-zf1fm7-MuiGrid-root > a > img")).isDisplayed();
	    	if(isDisplayed)
	    	{
	    		System.out.println("Test 14 pass:-Kpi tech logo is Present");
	    	}
	    	else
	    	{
	    		System.out.println("Test 14 fail:-Kpi tech logo is not Present");
	    	} 	
	} 
	
	@Test(priority = 14)
	public void checkCapslockError() throws InterruptedException, Exception
	{    
		    //Validate for Caps lock error message  
		    Thread.sleep(3000);
		    driver.findElement(By.id("-password-login")).click(); // click on password
			Thread.sleep(3000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			
			//driver.findElement(By.id("-password-login")).sendKeys(Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true));
 	       // driver.findElement(By.xpath("standard-weight-helper-text-password-login")).click();
			Thread.sleep(3000);
 	        String errorMessage = driver.findElement(By.id("warning-helper-text-password-login")).getText();
 	        System.out.println("Test 15 pass:- Password field throwing the error message :" + errorMessage);
	} 
	
	
	
	@Test(priority = 15)
	public void checkForgotPasswordLink() throws InterruptedException 
	{    
		    //Validation for presence of forgot password link  
		Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[3]/div/div/a"), "Forgot Password is not available");
	} 
	
	
	
	
	//....................
	@Test(priority = 16)
	public void checkForgotPasswordLinkFunctionality() 
	{    
		try 
		{
			//Validation for forgot password link functionality  
		    driver.findElement(By.id("email-login")).sendKeys("ganeshthombre9797@gmail.com"); //Provide email
         	Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[3]/div/div/a")).click(); //click on forgot password link
		    
		    String actualURL = driver.getCurrentUrl();
		    Thread.sleep(2000);
		    String expectedURL ="http://10.0.138.52:3000/forgot-password/?email=ganeshthombre9797@gmail.com";
		    Assert.assertEquals(actualURL, expectedURL);
		    System.out.println("Test 17 pass:-Forgot password link is working, current URL is  :" + actualURL);
		    
		    //validating back to login link availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > div.MuiGrid-root.MuiGrid-container.MuiGrid-direction-xs-column.css-ujljcm-MuiGrid-root > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-6dalm9-MuiGrid-root > div > div > div > div > div > div:nth-child(1) > div > a"), "Back to login page button is not available");

		    
		    //validating back to login link functionality
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/a")).click(); //click on back to login link
		    String actualURL1 = driver.getCurrentUrl();
		    Thread.sleep(2000);
		    String expectedURL1 ="http://10.0.138.52:3000/login";
		    Assert.assertEquals(actualURL1, expectedURL1);
		    System.out.println("Test 18 pass:-Back to login link is working, current URL is  :" + actualURL1);
		    System.out.println("--------------Testing for login page is completed------------------");
		    System.out.println("");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
		
}


