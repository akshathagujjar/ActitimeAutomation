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

public class ActitimeCreateNewLeaveTypePage extends BasePage implements AutoConstants
{
	WebDriver driver; 
	
	
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement leavetypenameTextField;
	
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement createleavetypeButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	
	public ActitimeCreateNewLeaveTypePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,  this);
		
	}
	
	public void createLeave() throws InterruptedException, IOException
	{
		performWaitUsingVisiblityof(driver, leavetypenameTextField);
		leavetypenameTextField.sendKeys(ExcelLibrary.getCellValue("create leave", 1, 0));
		performWaitUsingVisiblityof(driver, createleavetypeButton);
		createleavetypeButton.click();
	}
	
}
