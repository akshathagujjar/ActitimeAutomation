package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstants;
import com.actitime.generics.BasePage;

public class ActitimeSettings extends BasePage implements AutoConstants
{

	WebDriver driver;
	WebDriverWait wait;
	Duration timeout;
	
	@FindBy(xpath="//div[text()='Turn Features On / Off']")
	private WebElement turnfeatureonOption;
	
	@FindBy(xpath="(//div[contains(text(),'General Settings')])[2]")
	private WebElement generalsettingsOption;
	
	@FindBy(xpath="//a[text()='Workflow Settings']")
	private WebElement workflowsettingsOption;
	
	@FindBy(xpath="//a[text()='Types of Work']")
	private WebElement TypesofworkOption;
	
	@FindBy(xpath="//a[text()='Leave Types']")
	private WebElement leavetypesOption;
	
	@FindBy(xpath="//a[text()='Notifications']")
	private WebElement notificationOption;
	
	@FindBy(xpath="//a[text()='Logo Settings']")
	private WebElement logosettingsOption;
	
	@FindBy(xpath="//div[text()='Licenses']")
	private WebElement licensesOption;
	
	public ActitimeSettings(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		timeout = Duration.ofSeconds(30);
		wait = new WebDriverWait(driver, timeout);
	}
	
	public void typesOfWork() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(TypesofworkOption));
		performWaitUsingElementToBeClickable(driver, TypesofworkOption);
		TypesofworkOption.click();
	}
	
	public void leaveType() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(leavetypesOption));
		performWaitUsingElementToBeClickable(driver, leavetypesOption);
		leavetypesOption.click();
	}
}
