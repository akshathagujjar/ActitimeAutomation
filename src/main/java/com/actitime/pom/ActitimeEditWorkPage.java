package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstants;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;



public class ActitimeEditWorkPage extends BasePage implements AutoConstants
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement nameTextField;
	
	@FindBy(xpath="//input[@value='   Save Changes   ']")
	private WebElement saveChangesButton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancelButton;
	
	WebDriverWait wait;
	
	public ActitimeEditWorkPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}
	
	public void editWork() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOf(nameTextField));
		nameTextField.clear();
		nameTextField.sendKeys(ExcelLibrary.getCellValue("create work", 1, 2));
		wait.until(ExpectedConditions.visibilityOf(saveChangesButton));
		saveChangesButton.click();
	}
}
