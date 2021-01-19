package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstants;
import com.actitime.generics.BasePage;

public class ActitimeSettingsTypeofWorkPage extends BasePage implements AutoConstants
{
WebDriver driver;
	
	@FindBy(xpath="//span[text()='Create Type of Work']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath="//label[text()='All (active and archived)']")
	private WebElement allactiveandarchivesRadioButton;
	
	@FindBy(xpath="//label[text()='Active only']")
	private WebElement activeonlyRadioButton;
	
	@FindBy(xpath="//label[text()='Archived only']")
	private WebElement archivedonlyRadioButton;
	
	@FindBy(xpath="//label[text()='All (billable and non-billable)']")
	private WebElement allbillableandnonbillableRadioButton;
	
	@FindBy(xpath="//label[text()='Billable only']")
	private WebElement billableonlyRadioButton;
	
	@FindBy(xpath="//label[text()='Non-Billable only']")
	private WebElement nonbillableonlyRadioButton;

	@FindBy(xpath="//input[@value='Show Types of Work']")
	private WebElement showtypesofworkButton;
	
	@FindBy(xpath="//a[text()='akshatha']")
	private WebElement editworkLink;
	
	@FindBy(xpath="//a[text()='akshathatest']/../..//a[contains(text(),'delete')]")
	private WebElement deleteworkLink;
	
	
	WebDriverWait wait;
	
	public ActitimeSettingsTypeofWorkPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}
	
	public void createTypeOfWork() throws InterruptedException
	{
		performWaitUsingElementToBeClickable(driver, createtypeofworkButton);
		createtypeofworkButton.click();
		
	}
	
	public void editWork()
	{
		performWaitUsingVisiblityof(driver, editworkLink);
		editworkLink.click();
	}
	
	
	public void deleteWork() throws InterruptedException
	{
		performWaitUsingVisiblityof(driver, deleteworkLink);
		deleteworkLink.click();
		acceptAlert(driver);
	}
	
}
