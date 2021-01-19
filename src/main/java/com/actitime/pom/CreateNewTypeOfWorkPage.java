package com.actitime.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstants;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;



public class CreateNewTypeOfWorkPage extends BasePage implements AutoConstants
{
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement nameTextField;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement selectDropdown;
	
	@FindBy(xpath="//input[@id='billingType_setBillable']")
	private WebElement billableRadioButton;
	
	@FindBy(xpath="//input[@id='billingType_setNonBillable']")
	private WebElement nonbillableRadioButton;
	
	@FindBy(xpath="//input[@class='rate']")
	private WebElement billablerateField;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//div[@class='supportQuestionButton']")
	private WebElement supportquestionButton;
	
	
	public CreateNewTypeOfWorkPage(WebDriver driver)
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createWork() throws InterruptedException, IOException
	{
		performWaitUsingElementToBeClickable(driver, nameTextField);
		nameTextField.sendKeys(ExcelLibrary.getCellValue("create work", 1, 1));
		performWaitUsingVisiblityof(driver, selectDropdown);
		selectByValue(selectDropdown, "true");
		createtypeofworkButton.click();
		
	}	
}
