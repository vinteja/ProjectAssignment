package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.CreateAccount;
import com.ScreenFunctions.ScreenFunctions;
import com.ScreenFunctions.Signin;



public class Tc_01_Login extends GenericFunctions
{
	@Test(priority=0,enabled=false)
	public static void validatesearch()
	
	{
		launchApplication("firefox");
		ScreenFunctions sf=PageFactory.initElements(driver,ScreenFunctions.class);
		sf.validatesrch();
		
	}
	@Test(priority=0,enabled=false)
	public static void validateSignin()
	
	{
		launchApplication("firefox");
		Signin sign=PageFactory.initElements(driver,Signin.class);
		sign.signin();
		sign.verifysignin();
		
	}
	@Test(priority=0)
	public static void validatedateofbirth()
	
	{
		
		//Launch Firefox Browser
		launchApplication("firefox");
		
		//Creating PageFactory for CreateAccount Class
		CreateAccount ca=PageFactory.initElements(driver,CreateAccount.class);
		
		//Calling method for execution
		ca.fill_form();
		
		
	}
	
	
}
