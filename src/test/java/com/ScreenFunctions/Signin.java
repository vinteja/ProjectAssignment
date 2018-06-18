package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Signin extends GenericFunctions
{
	//***************************SignIN********************************************
	//locate SignIn button
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Sign in']")
	public static WebElement Lnk_signinMdl_signin;
	
	//Verify Create an account is isDisplayed
	@FindBy(how=How.XPATH,using="//h3[text()='Create an account']")
	public static WebElement Txt_creatacnt_enteremail;
	
	/*
	  Method Name		:	signin
	  Description		: 	When signin link is clicked from home page it should navigate to 
	  						signin page and verify the respective text isDisplayed or not to confirm it is signin page
	  Input	     		:   User should click on Signin link
	  Output Parameters	:   This method will return exception when sign-in operation is not performed.	
	  Author     		:   Teja	
	  Creation date    :   11/06/2018		
	  
	 */
	public static void signin()
	{
		//Click on Signin Link and verify it is Signin page
		Lnk_signinMdl_signin.click();
		try
		{
			if(Txt_creatacnt_enteremail.isDisplayed())
				{
				 System.out.println("Sign-in button is clicked Successfuly");
				 logEvent("Pass","Sign-in button is clicked Successfuly");
				}
			else
			{
				System.out.println("Sign-in button is not clicked Successfuly");
				logEvent("Fail","Sign-in button is not clicked Successfuly");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception raised in clicking Sign-in button");
		}
		
	}
	//*********************************************************************************
	
	//*******************Unregistered user login***************************************
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public static WebElement Edi_signin_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='passwd']")
	public static WebElement Edi_signin_password;
	
	@FindBy(how=How.XPATH,using="//button[@id='SubmitLogin']")
	public static WebElement Btn_signin_SigninBt;
	
	@FindBy(how=How.XPATH,using="//div[@class='alert alert-danger']//ol//li")
	public static WebElement Txt_signin_ErrAuthentication;
	
	
	/*
	  Method Name		:	verifysignin
	  Description		: 	This method allows user to enter set of credentials in the respective text boxes and click
	   						on login and get CSS Values for the error message displayed 
	  Input	     		:   User should give data as per requirement
	  Output Parameters	:   This method will return boolean when operation is performed.	
	  Author     		:   Teja	
	  Creation date    	:   11/06/2018		
	  
	 */
	public static void verifysignin()
	{
		
		
		boolean status=true;
		
		//get Max Iteration number
		
		int itr = getLastIterationNumber("Testcases");
		for(int i=1;i<=itr;i++)
		{					
			
			
		//get User name and  password data from Test data sheet
		try
		{
		 String emailvalue=getdata("Testcases","email", i);
		 status=SetText(Edi_signin_email, emailvalue);
		 
		 if(status)
		 {
				logEvent("pass", "UserName is entered sucessfully");
		 }else
		 {
			 	logEvent("Fail", "Unable to enter username");
		 }
		 
		   waitForElement(Edi_signin_password);	
			String passvalue=getdata("Testcases","password", i);
		    status=SetText(Edi_signin_password, passvalue);
	
		if(status)
		{
			logEvent("pass", "Password is entered sucessfully");
		}
		else
		{
			logEvent("Fail", "Password is not entered sucessfully");
		}
		
				
			
		waitForElement(Btn_signin_SigninBt);
		
		
		
		//Click on Signin button 
				Btn_signin_SigninBt.click();
				
				waitForElement(Txt_signin_ErrAuthentication);
				if(Txt_signin_ErrAuthentication.isDisplayed())
				{
					String colour=Txt_signin_ErrAuthentication.getCssValue("color");
					logEvent("pass", "object colour :: "+colour);
					
				}
				else
				{
					logEvent("Fail", "object color not found");
				}
				
		
				}
		catch(Exception e)
		{
			System.out.println("Exception raised for entring emailid");
		}
		
	
		
	}
		
		
	}
	}
			
	
	
	
	
	

