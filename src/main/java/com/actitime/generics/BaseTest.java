package com.actitime.generics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.actitime.pom.ActitimeHome;
import com.actitime.pom.ActitimeLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.actitime.generics.ScreenShot_Utility.class)

public class BaseTest implements AutoConstants
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void executionBegins()
	{
		org.testng.Reporter.log("execution begins", true);
	}
	
	@BeforeClass
	public void performLogin() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(page_url);
//		ActitimeLogin al = new ActitimeLogin(driver);
//		al.login();
		
	}
	
	@AfterClass
	public void performLogout() throws InterruptedException
	{
		ActitimeHome ah = new ActitimeHome(driver);
		ah.logout();
		driver.close();
	}
	@AfterSuite
	public void executionEnds()
	{
		org.testng.Reporter.log("execution ends", true);
	}

}
