package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeLogin;

@Listeners(com.actitime.generics.ScreenShot_Utility.class)
public class ActitimeLoginTest extends BaseTest
{
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		ActitimeLogin al = new ActitimeLogin(driver);
		al.login();
		Reporter.log("login begins", true);
	}
}
