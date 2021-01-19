package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHome;
import com.actitime.pom.ActitimeSettings;
import com.actitime.pom.ActitimeSettingsLeaveTypePage;

public class ActitimeEditLeaveTest extends BaseTest
{
	@Test
	public void editLeaveTest() throws InterruptedException, IOException
	{
		Reporter.log("editing leave", true);
		
		ActitimeHome ah  = new ActitimeHome(driver);
		ah.settings();
		
		ActitimeSettings as = new ActitimeSettings(driver);
		as.leaveType();
		
		ActitimeSettingsLeaveTypePage leaveType = new ActitimeSettingsLeaveTypePage(driver);
		leaveType.editLeave();
	}
}
