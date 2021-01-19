package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
	
	public void selectByValue(WebElement e, String val)
	{
		Select s = new Select(e);
		s.selectByValue(val);
		
		
	}
	
	public void selectByVisibleText(WebElement e, String text)
	{
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}
	
	public void moveToElement(WebElement e, WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}
	
	public void javaScriptClick(WebElement e, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void performWaitUsingVisiblityof(WebDriver driver ,WebElement e)
	{
		Duration timeout = Duration.ofSeconds(60);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	public void performWaitUsingElementToBeClickable(WebDriver driver ,WebElement e)
	{
		Duration timeout = Duration.ofSeconds(60);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
	 public void performWaitUsingVisibilityofAllElemets(WebDriver driver ,List<WebElement> e)
	 {
		 Duration timeout = Duration.ofSeconds(60);
		 WebDriverWait wait = new WebDriverWait(driver, timeout);
		 wait.until(ExpectedConditions.visibilityOfAllElements(e));
	 }
	 
	 public void properties() throws IOException
	 {
		 Properties prop = new Properties();
		 FileInputStream f = new FileInputStream("./config.properties");
		 prop.load(f);
	 }
	
}
