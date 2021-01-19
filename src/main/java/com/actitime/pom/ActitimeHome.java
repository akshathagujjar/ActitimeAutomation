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


public class ActitimeHome extends BasePage implements AutoConstants
{

	public WebDriver driver;
	WebDriverWait wait;
	Duration timeout;

	@FindBy(xpath="//div[text()='Time-Track']")
	private WebElement timetrackButton;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksButton;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reportsButton;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement usersButton;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsButton;
	
	
	
	
	public ActitimeHome(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		timeout = Duration.ofSeconds(30);
		wait = new WebDriverWait(driver, timeout);
	}
	
	public void tasks() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(tasksButton));
		Thread.sleep(2000);
		tasksButton.click();
		Thread.sleep(2000);
	}
	
	public void settings() throws InterruptedException
	{
		//Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOf(settingsButton));
		settingsButton.click();
	}
	public void logout() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(logoutLink));
		ActitimeHome ah = new ActitimeHome(driver);
		ah.javaScriptClick(logoutLink, driver);
		Thread.sleep(2000);
	}
}
