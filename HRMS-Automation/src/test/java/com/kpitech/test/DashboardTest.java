package com.kpitech.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kpitech.util.Utility;

public class DashboardTest 
{

private WebDriver driver;
	
	@BeforeMethod
	public void initiateDriver() 
	{
		driver = TestConfig.getInstance().driver;
	}

	@Test(priority = 1)
	public void CheckDashboardElement()
	{
		try
		{
			/*Utility.findElement(driver, "email-login", "id").sendKeys("ganeshthombre9797@gmail.com"); //send email
			Thread.sleep(3000);
			Utility.findElement(driver, "-password-login", "id").sendKeys("Ganesh@123"); //send password
			Thread.sleep(3000);
			Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button", "xpath").click(); //click on login button
			Thread.sleep(3000);
			
			//availability of KPI logo
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/nav/div/div/div[1]/a/img"), "KPI logo is not available");
			System.out.println("Test P1 pass:- KPI logo is available");
			
			//availability of Dashboard logo
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a.MuiButtonBase-root.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.css-1bbzv6u-MuiButtonBase-root-MuiListItemButton-root > div > span > svg"), "Dashboard logo is not available");
			System.out.println("Test P1 pass:- Dashboard logo is available");
			
			//availability of Employee details logo
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div"), "Employee details logo is not available");
			System.out.println("Test P1 pass:- Employee details logo is available");
				
			//availability of Offboarding logo
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a:nth-child(3) > div > span > svg"), "Offboarding logo is not available");
			System.out.println("Test P1 pass:- Offboarding logo is available");
				
			//availability of recruitment logo
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a:nth-child(4) > div > span > svg"), "Recruitment logo is not available");
			System.out.println("Test P1 pass:- Recruitment logo is available");
				
			//availability of user logo
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a:nth-child(5) > div > span > svg"), "User logo is not available");
			System.out.println("Test P1 pass:- User logo is available");
			
			//availability of expand button
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/header/div/button"), "Expand button is not available");
			System.out.println("Test P1 pass:- Expand button is available");
			
			//availability of page title
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/main/div[2]/div[2]/div[1]/div/span"), "Page title (Dashboard) is not available");
			System.out.println("Test P1 pass:- Page title (Dashboard) is available");
			
			//availability of change language button 
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/header/div/div[3]/button"), "Change Language button is not available");
			System.out.println("Test P1 pass:- Change Language button is available");
			
			//availability of notification bell button
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/header/div/div[4]/div/button"), "notification bell button is not available");
			System.out.println("Test P1 pass:- notification bell button is available");
			
			//availability of message button
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/header/div/div[5]/div[1]/button"), "Message button is not available");
			System.out.println("Test P1 pass:- Message button is available");
			
			//availability of setting button
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/header/div/div[5]/div[2]/button"), "Setting button is not available");
			System.out.println("Test P1 pass:- Setting button is available");
			
			//availability of user avtar
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > header > div > div:nth-child(7) > button > div > div > img"), "User avtar is not available");
			System.out.println("Test P1 pass:- User avtar is available");
			
			//availability of user name
			Thread.sleep(3000);
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > header > div > div:nth-child(7) > button > div > h6"), "User name is not available");
			System.out.println("Test P1 pass:- User name is available");*/
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 2)
	public void CheckMenuScreenElement() //functionality of expand bar and menu screen elements
	{
		try
		{
			/*Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > header > div > button"), "Expand button is not available");
			System.out.println("Test P2 Pass:- Expand button is available");
			
			Utility.findElement(driver, "//*[@id=\"root\"]/div/header/div/button", "xpath").click(); //click on expand button
			
			//check KPI logo availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.MuiBox-root.css-1c2m6kz > a > img"), "KPI logo is not available");
			System.out.println("Test P2 Pass:- KPI logo is available");
			
			//Check title(Menu) availability
			String pageTitle = Utility.findElement(driver, "//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div/h6", "xpath").getText(); //get text
			System.out.println("Test P2 pass:- Page title is: " + pageTitle);
			
			//check dashboard button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a.MuiButtonBase-root.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.css-16c0csd-MuiButtonBase-root-MuiListItemButton-root > div.MuiListItemIcon-root.css-1nepu3a-MuiListItemIcon-root > span > svg"), "Dashboard icon is not available");
			System.out.println("Test P2 pass:- Dashboard Button icon is available");
			
			String buttonTitle = Utility.findElement(driver, "//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[1]/div[2]/h6", "xpath").getText(); //get text
			System.out.println("Test P2 pass:- Button title is: " + buttonTitle);
			
			//check Employee details button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a:nth-child(3) > div.MuiListItemIcon-root.css-s9qt9o-MuiListItemIcon-root > span > svg"), "Employee details icon is not available");
			System.out.println("Test P2 pass:- Employe details Button icon is available");
				
			String buttonTitle2 = Utility.findElement(driver, "//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6", "xpath").getText(); //get text
			System.out.println("Test P2 pass:- Button title is: " + buttonTitle2);
			
			//check Offboarding button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a:nth-child(4) > div.MuiListItemIcon-root.css-s9qt9o-MuiListItemIcon-root > span > svg"), "Offboarding icon is not available");
			System.out.println("Test P2 pass:- Offboarding Button icon is available");
				
			String buttonTitle3 = Utility.findElement(driver, "//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[3]/div[2]/h6", "xpath").getText(); //get text
			System.out.println("Test P2 pass:- Button title is: " + buttonTitle3);
			
			//check Recruitment button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a:nth-child(5) > div.MuiListItemIcon-root.css-s9qt9o-MuiListItemIcon-root > span > svg"), "Recruitment icon is not available");
			System.out.println("Test P2 pass:- Recruitment Button icon is available");
				
			String buttonTitle4 = Utility.findElement(driver, "//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[4]/div[2]/h6", "xpath").getText(); //get text
			System.out.println("Test P2 pass:- Button title is: " + buttonTitle4);
			
			//check User button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#root > div > nav > div > div > div.css-jjtu05 > div > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > a:nth-child(6) > div.MuiListItemIcon-root.css-s9qt9o-MuiListItemIcon-root > span > svg"), "User icon is not available");
			System.out.println("Test P2 pass:- User Button icon is available");
				
			String buttonTitle5 = Utility.findElement(driver, "//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[5]/div[2]/h6", "xpath").getText(); //get text
			System.out.println("Test P2 pass:- Button title is: " + buttonTitle5);
			
			Utility.findElement(driver, "//*[@id=\"root\"]/div/header/div/button", "xpath").click(); //click on expand button
			*/
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	
	
	@Test(priority = 3) //pending here
	public void CheckSettingScreenElement() //functionality of Setting button and setting screen elements
	{
		try
		{
			//temp
			Utility.findElement(driver, "email-login", "id").sendKeys("ganeshthombre9797@gmail.com"); //send email
			Thread.sleep(3000);
			Utility.findElement(driver, "-password-login", "id").sendKeys("Ganesh@123"); //send password
			Thread.sleep(3000);
			Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button", "xpath").click(); //click on login button
			Thread.sleep(3000);
			
			//temp
			Utility.findElement(driver, "//*[@id=\"root\"]/div/header/div/div[5]/div[2]/button", "xpath").click(); //click on setting button
			Utility.findElement(driver, "//*[@id=\"panel4d-content\"]/div/div/div/div[1]/label/span[2]/div/div/div/h5", "xpath").click(); //click on 1st theme
			Thread.sleep(3000);
			String buttonTitle5 = Utility.findElement(driver, "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-84ey6j-MuiModal-root-MuiDrawer-root > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1sjsqk1-MuiPaper-root-MuiDrawer-paper > div > div.MuiCardHeader-root.css-14c277-MuiCardHeader-root > div.MuiCardHeader-content.css-1qbkelo-MuiCardHeader-content > span", "cssSelector").getAttribute("font-family");//get text
			System.out.println(buttonTitle5);
			Thread.sleep(3000);
					
			Utility.findElement(driver, "//*[@id=\"panel4d-content\"]/div/div/div/div[2]/label/span[2]/div/div/div/h5", "xpath").click(); //click on 2nd theme
			Thread.sleep(3000);
			
			String buttonTitle6 = Utility.findElement(driver, "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-84ey6j-MuiModal-root-MuiDrawer-root > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1sjsqk1-MuiPaper-root-MuiDrawer-paper > div > div.MuiCardHeader-root.css-14c277-MuiCardHeader-root > div.MuiCardHeader-content.css-1qbkelo-MuiCardHeader-content > span", "cssSelector").getAttribute("font-family");//get text
			System.out.println(buttonTitle6);
			Thread.sleep(3000);
			if(buttonTitle5!=buttonTitle6)
			{
				System.out.println("Test P3 Pass:- Dif theam");
			}
			else 
			{
				System.out.println("Test P3 fail:- same theam");
			
			}
			
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	

	@Test(priority = 4)
	public void CheckProfileScreenElement() //functionality of profile button and profile screen elements
	{
		try
		{
			/*Utility.findElement(driver, "#root > div > header > div > div:nth-child(7) > button > div > h6", "cssSelector").click(); //click on profile button
			Thread.sleep(3000);
			
			//check user avtar and user-name 
			Assert.assertTrue(Utility.isElementPresentByXpath(driver, "//*[@id=\"root\"]/div/header/div/div[6]/div/div/div/div/div/div[1]/div/div/div/div[1]/img"), "User avtar is not available");
			System.out.println("Test P4 pass:- User avtar is available");
			Thread.sleep(3000);
			
			String buttonTitle4 = Utility.findElement(driver, "//*[@id=\"root\"]/div/header/div/div[6]/div/div/div/div/div/div[1]/div/div/div/div[2]/h6", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- User-name is: " + buttonTitle4);
			Thread.sleep(3000);
			
			//check profile icon and title
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tab-0 > span > svg"), "profile icon is not available");
			System.out.println("Test P4 pass:- profile icon is available");
			Thread.sleep(3000);
			
			String buttonTitle5 = Utility.findElement(driver, "//*[@id=\"profile-tab-0\"]", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- User-name is: " + buttonTitle5);
			Thread.sleep(3000);
			
			//check setting icon and title
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tab-1 > span > svg"), "setting icon is not available");
			System.out.println("Test P4 pass:- setting icon is available");
			Thread.sleep(3000);
			
			String buttonTitle6 = Utility.findElement(driver, "//*[@id=\"profile-tab-1\"]", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- User-name is: " + buttonTitle6);
			Thread.sleep(3000);
			
			//check edit profile button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-0 > div > nav > div.MuiButtonBase-root.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.css-1yceknl-MuiButtonBase-root-MuiListItemButton-root > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "Edit profile icon is not available");
			System.out.println("Test P4 pass:- Edit profile Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-0\"]/div/nav/div[1]/div[2]/span", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- Button title is: " + buttonTitle);
			Thread.sleep(3000);
			
			//check view profile button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-0 > div > nav > div:nth-child(2) > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "View profile icon is not available");
			System.out.println("Test P4 pass:- View profile Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle1 = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-0\"]/div/nav/div[2]/div[2]/span", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- Button title is: " + buttonTitle1);
			Thread.sleep(3000);
			
			//check change password button icon and title availability
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-0 > div > nav > div:nth-child(3) > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "Change password icon is not available");
			System.out.println("Test P4 pass:- Change password Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle2 = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-0\"]/div/nav/div[3]/div[2]/span", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- Button title is: " + buttonTitle2);
			Thread.sleep(3000);
			
			//check logout button icon and title availability 
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-0 > div > nav > div:nth-child(3) > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "Logout icon is not available");
			System.out.println("Test P4 pass:- logout Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle3 = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-0\"]/div/nav/div[4]/div[2]/span", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- Button title is: " + buttonTitle3);
			Thread.sleep(3000);
			
			//check functionality of change password button
			Utility.findElement(driver, "#profile-tabpanel-0 > div > nav > div:nth-child(3)", "cssSelector").click(); //click on change password button
			Thread.sleep(3000);
			
			String buttonTitle7 = Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div[1]/div/span/h2", "xpath").getText(); //get text
			System.out.println("Test P4 pass:- change password Button is working and page title is: " + buttonTitle7);
			Thread.sleep(3000);
			
			Utility.findElement(driver, "/html/body/div[2]/div[3]/div/div/div/div[2]/form/div/div[3]/div/button[1]", "xpath").click(); //click on cancel button
			Thread.sleep(3000);
			
			//check functionality of Logout button
			Utility.findElement(driver, "//*[@id=\"profile-tabpanel-0\"]/div/nav/div[4]/div[2]/span", "xpath").click(); //click on logout button
			Thread.sleep(3000);
			
			String actualURL = driver.getCurrentUrl();
			Thread.sleep(3000);
			String expectedURL ="http://10.0.138.52:3000/login";
			Assert.assertEquals(actualURL, expectedURL);
			System.out.println("Test P4 pass:-Logout button is working, current URL is  :" + actualURL);*/
			
			
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	
	
	@Test(priority = 5) 
	public void CheckProfileSettingScreenElement() //functionality of Profile-Setting button and Profile-setting screen elements
	{
		try
		{
			
			/*// login again
			Utility.findElement(driver, "email-login", "id").sendKeys("ganeshthombre9797@gmail.com"); //send email
			Thread.sleep(3000);
			Utility.findElement(driver, "-password-login", "id").sendKeys("Ganesh@123"); //send password
			Thread.sleep(3000);
			Utility.findElement(driver, "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button", "xpath").click(); //click on login button
			Thread.sleep(3000);
			
			Utility.findElement(driver, "#root > div > header > div > div:nth-child(7) > button > div > h6", "cssSelector").click(); //click on profile button
			Thread.sleep(3000);
			
			
			Utility.findElement(driver, "//*[@id=\"profile-tab-1\"]", "xpath").click(); //click on profile-setting button
			Thread.sleep(3000);
			
			//check support button icon and title availability 
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-1 > nav > div.MuiButtonBase-root.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.css-1yceknl-MuiButtonBase-root-MuiListItemButton-root > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "Support icon is not available");
			System.out.println("Test P5 pass:- Support Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-1\"]/nav/div[1]/div[2]/span", "xpath").getText(); //get text
			System.out.println("Test P5 pass:- Button title is: " + buttonTitle);
			Thread.sleep(3000);
			
			//check account setting button icon and title availability 
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-1 > nav > div:nth-child(2) > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "Account setting icon is not available");
			System.out.println("Test P5 pass:- Account setting Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle1 = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-1\"]/nav/div[2]/div[2]/span", "xpath").getText(); //get text
			System.out.println("Test P5 pass:- Button title is: " + buttonTitle1);
			Thread.sleep(3000);
			
			//check Privacy center button icon and title availability 
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-1 > nav > div:nth-child(3) > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "Privacy center icon is not available");
			System.out.println("Test P5 pass:- Privacy center Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle2 = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-1\"]/nav/div[3]/div[2]/span", "xpath").getText(); //get text
			System.out.println("Test P5 pass:- Button title is: " + buttonTitle2);
			Thread.sleep(3000);
			
			//check feedback button icon and title availability 
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-1 > nav > div:nth-child(4) > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "Feedback icon is not available");
			System.out.println("Test P5 pass:- Feedback Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle3 = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-1\"]/nav/div[4]/div[2]/span" , "xpath").getText(); //get text
			System.out.println("Test P5 pass:- Button title is: " + buttonTitle3);
			Thread.sleep(3000);
			
			//check history button icon and title availability 
			Assert.assertTrue(Utility.isElementPresentByCssSelector(driver, "#profile-tabpanel-1 > nav > div.MuiButtonBase-root.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.MuiListItemButton-root.MuiListItemButton-gutters.Mui-selected.css-1yceknl-MuiButtonBase-root-MuiListItemButton-root > div.MuiListItemIcon-root.css-1ltam8z-MuiListItemIcon-root > span > svg"), "History icon is not available");
			System.out.println("Test P5 pass:- History Button icon is available");
			Thread.sleep(3000);
			
			String buttonTitle4 = Utility.findElement(driver, "//*[@id=\"profile-tabpanel-1\"]/nav/div[5]/div[2]/span" , "xpath").getText(); //get text
			System.out.println("Test P5 pass:- Button title is: " + buttonTitle4);
			Thread.sleep(3000);*/
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	
}
