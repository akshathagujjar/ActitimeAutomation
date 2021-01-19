package com.actitime.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstants;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;



public class ActitimeLogin extends BasePage implements AutoConstants
{

	public WebDriver driver;
	Duration timeout;
	WebDriverWait wait;
	
	
 	@FindBy(xpath="//input[@id='username']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@class='textField pwdfield']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	public ActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		timeout = Duration.ofSeconds(30);
		wait = new WebDriverWait(driver, timeout);
	}
	public void login() throws InterruptedException, IOException
	{
		
		wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue("login", 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue("login", 1, 1));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
		Thread.sleep(2000);
	}

}
