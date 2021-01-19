package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeCreateNewLeaveTypePage;
import com.actitime.pom.ActitimeHome;
import com.actitime.pom.ActitimeSettings;
import com.actitime.pom.ActitimeSettingsLeaveTypePage;

public class ActitimeCreateLeaveTest extends BaseTest
{

	@Test
	public void createLeaveTest() throws InterruptedException, IOException
	{
		Reporter.log("creating leave", true);
		
		ActitimeHome ah  = new ActitimeHome(driver);
		ah.settings();
		
		ActitimeSettings as = new ActitimeSettings(driver);
		as.leaveType();
		
		ActitimeSettingsLeaveTypePage leaveType = new ActitimeSettingsLeaveTypePage(driver);
		leaveType.createLeaveType();
		
		ActitimeCreateNewLeaveTypePage createleave = new ActitimeCreateNewLeaveTypePage(driver);
		createleave.createLeave();
		
	}
	
}
