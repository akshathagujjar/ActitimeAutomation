package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHome;
import com.actitime.pom.ActitimeSettings;
import com.actitime.pom.ActitimeSettingsLeaveTypePage;

public class ActitimeDeleteLeaveTest extends BaseTest
{
	@Test
	public void deleteLeaveTest() throws InterruptedException
	{
		Reporter.log("deleting leave", true);
		
		ActitimeHome ah  = new ActitimeHome(driver);
		ah.settings();
		
		ActitimeSettings as = new ActitimeSettings(driver);
		as.leaveType();
		
		ActitimeSettingsLeaveTypePage leaveType = new ActitimeSettingsLeaveTypePage(driver);
		leaveType.deleteLeaveType();
	}
}
