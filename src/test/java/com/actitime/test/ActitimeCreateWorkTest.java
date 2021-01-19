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
import com.actitime.pom.ActitimeSettingsTypeofWorkPage;
import com.actitime.pom.CreateNewTypeOfWorkPage;



public class ActitimeCreateWorkTest extends BaseTest
{
	@Test
	public void createWorkTest() throws InterruptedException, IOException
	{
		Reporter.log("creating work", true);
		ActitimeHome ah  = new ActitimeHome(driver);
		ah.settings();
		
		ActitimeSettings as = new ActitimeSettings(driver);
		as.typesOfWork();
		
		ActitimeSettingsTypeofWorkPage workType = new ActitimeSettingsTypeofWorkPage(driver);
		workType.createTypeOfWork();
		
		CreateNewTypeOfWorkPage work = new CreateNewTypeOfWorkPage(driver);
		work.createWork();
	}
	
}
