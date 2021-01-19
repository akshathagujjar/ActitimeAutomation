package com.actitime.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstants;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeSettingsLeaveTypePage extends BasePage implements AutoConstants
{


	WebDriver driver;
	WebDriverWait wait;
	Duration timeout;
	
	@FindBy(xpath="//span[text()='Create Leave Type']")
	private WebElement createleavetypeButton;
	
	@FindBy(xpath="(//span[text()='akshatha'])[1]")
	private WebElement editleavetypeLink;
	
	@FindBy(xpath="//input[@id='inputDiv']")
	private WebElement editleavetypeTextField;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement editleavetypeOkButton;
	
	@FindBy(xpath="(//div[@class='cancelButton'])[3]")
	private WebElement editleavetypeCancelButton;
	
	@FindBy(xpath="//span[@class='leaveTypeNameText'][text()='akshathatest']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement deleteleavetypeButton;
	
	
		
	public ActitimeSettingsLeaveTypePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		timeout = Duration.ofSeconds(30);
		wait = new WebDriverWait(driver, timeout);
	}
		
	public void createLeaveType() throws InterruptedException
	{
		performWaitUsingElementToBeClickable(driver, createleavetypeButton);
		createleavetypeButton.click();
	}
	
	public void editLeave() throws IOException
	{
		performWaitUsingElementToBeClickable(driver, editleavetypeLink);
		editleavetypeLink.click();
		performWaitUsingVisiblityof(driver, editleavetypeTextField);
		editleavetypeTextField.clear();
		editleavetypeTextField.sendKeys(ExcelLibrary.getCellValue("create leave", 1, 1));
		performWaitUsingVisiblityof(driver, editleavetypeOkButton);
		editleavetypeOkButton.click();
	}
	
	public void deleteLeaveType() throws InterruptedException
	{
		performWaitUsingVisiblityof(driver, deleteleavetypeButton);
		deleteleavetypeButton.click();
		acceptAlert(driver);
	}
	
}
