package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.Window;

import org.openqa.selenium.WindowType;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHome;
import com.actitime.pom.ActitimeSettings;
import com.actitime.pom.ActitimeSettingsTypeofWorkPage;

public class ActitimeDeleteWork  extends BaseTest
{

	@Test
	public void deteleWorkTest() throws InterruptedException
	{
		Reporter.log("deleting work", true);
		ActitimeHome ah  = new ActitimeHome(driver);
		ah.settings();
		
		ActitimeSettings as = new ActitimeSettings(driver);
		as.typesOfWork();
		
		ActitimeSettingsTypeofWorkPage workType = new ActitimeSettingsTypeofWorkPage(driver);
		workType.deleteWork();
		
		
	}
}
