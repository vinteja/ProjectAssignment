package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class CreateAccount extends GenericFunctions {

	// *********************Register a user to create an account************************

	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Sign in']")
	public static WebElement Lnk_CreateAccount_signin;

	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	public static WebElement Txt_CreateAccount_enterEmail;

	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']")
	public static WebElement Btn_CreateAccount_clickonCreate;

	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
	public static WebElement Rdo_CreateAccount_selectGndr;

	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']")
	public static WebElement Txt_CreateAccount_firstname;

	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']")
	public static WebElement Txt_CreateAccount_lastname;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public static WebElement Txt_CreateAccount_Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='passwd']")
	public static WebElement Txt_CreateAccount_pswd;

	@FindBy(how = How.XPATH, using = "//select[@id='days']")
	public static WebElement drp_CreateAccount_date;

	@FindBy(how = How.XPATH, using = "//select[@id='months']")
	public static WebElement drp_CreateAccount_month;

	@FindBy(how = How.XPATH, using = "//select[@id='years']")
	public static WebElement drp_CreateAccount_year;
	
	@FindBy(how=How.XPATH,using="//input[@id='firstname']")
	public static WebElement Txt_CreateAccount_FN;
	
	@FindBy(how=How.XPATH,using="//input[@id='lastname']")
	public static WebElement Txt_CreateAccount_LN;
	
	@FindBy(how=How.XPATH,using="//input[@id='company']")
	public static WebElement Txt_CreateAccount_Company;
	
	@FindBy(how=How.XPATH,using="//input[@id='address1']")
	public static WebElement Txt_CreateAccount_Address;
	
	@FindBy(how=How.XPATH,using="//input[@id='city']")
	public static WebElement Txt_CreateAccount_City;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_country']")
	public static WebElement Drp_CreateAccount_Country;
		
	@FindBy(how=How.XPATH,using="//input[@id='phone_mobile']")
	public static WebElement Txt_CreateAccount_MobileNum;
	
	@FindBy(how=How.XPATH,using="//input[@id='alias']")
	public static WebElement Txt_CreateAccount_AssignAdd;
	
	
	@FindBy(how=How.XPATH,using="//button[@id='submitAccount']")
	public static WebElement Btn_CreateAccount_Register;
	
	
	
		
	
	
	

	public boolean fill_form() 
	{
		boolean status = true;
		// Click on Sign-in link
		Lnk_CreateAccount_signin.click();
		if (status) {
			logEvent("Pass", "Sign-in link is operated Successfully");
		} else {
			logEvent("Fail", "Sign-in link is not operated Successfully");
		}
		waitForElement(Txt_CreateAccount_enterEmail);

		// Enter Email id
		String email = getdata("CreateAccount", "Email", 1);
		status = SetText(Txt_CreateAccount_enterEmail, email);
		if (status) {
			logEvent("Pass", "Email id is entered successfully");
		} else {
			logEvent("Fail", "Email id is not entered successfully");
		}
		waitForElement(Btn_CreateAccount_clickonCreate);

		// click on Create Account
		Btn_CreateAccount_clickonCreate.click();
		if (status) {
			logEvent("Pass", "Create an account link is clicked Successfully");
		} else {
			logEvent("Fail", "Create an account  is not clicked Successfully");
		}
		waitForElement(Rdo_CreateAccount_selectGndr);
		//Select Mr Radio Button
		Rdo_CreateAccount_selectGndr.click();
		if(status)
		{
			logEvent("Pass","Radio button is selected Successfully");
		}
		else
		{
			logEvent("Fail","Radio button is not selected Successfully");
		}
		waitForElement(Txt_CreateAccount_firstname);
		//enter First name
		String Firstname=getdata("CreateAccount","FN",1);
		status=SetText(Txt_CreateAccount_firstname, Firstname);
		if(status)
		{
			logEvent("Pass","Firstname is entered Successfully");
		}
		else
		{
			logEvent("Fail","Firstname is not entered Successfully");
		}
		waitForElement(Txt_CreateAccount_lastname);
		//Enter Last name
		String Lastname=getdata("CreateAccount","LN",1);
		status=SetText(Txt_CreateAccount_lastname, Lastname);
		if(status)
		{
			logEvent("Pass","Lastname is entered Successfully");
		}
		else
		{
			logEvent("Fail","Lastname is not entered Successfully");
		}
		waitForElement(Txt_CreateAccount_Email);
		//Enter Email
		String mailid=getdata("CreateAccount","mailid",1);
		status=SetText(Txt_CreateAccount_Email, mailid);
		if(status)
		{
			logEvent("Pass","mailid is entered Successfully");
		}
		else
		{
			logEvent("Fail","mailid is not entered Successfully");
		}
		waitForElement(Txt_CreateAccount_pswd);
		
		//Enter Password
		String pass=getdata("CreateAccount","Passwd",1);
		status=SetText(Txt_CreateAccount_pswd, pass);
		if(status)
		{
			logEvent("Pass","Passwd is entered Successfully");
		}
		else
		{
			logEvent("Fail","Passwd is not entered Successfully");
		}

		try {
			// get date from excel-data
			drp_CreateAccount_date.click();
			String date = getdata("CreateAccount", "Date", 1);
			status = select_option(drp_CreateAccount_date, date);
			if (status) {
				logEvent("Pass", "Date value is entered successfully");
			} else {
				logEvent("Fail", "Date value is not entered successfully");
			}
			waitForElement(drp_CreateAccount_month);

			// get month from excel-data
			drp_CreateAccount_month.click();
			String month = getdata("CreateAccount", "Month", 1);
			status = select_option(drp_CreateAccount_month, month);
			if (status) {
				logEvent("Pass", "Month value is entered successfully");
			} else {
				logEvent("Fail", "Month value is not entered successfully");
			}
			waitForElement(drp_CreateAccount_year);

			// get year from excel-data
			drp_CreateAccount_year.click();
			String year = getdata("CreateAccount", "BirthYear", 1);
			status = select_option(drp_CreateAccount_year, year);
			if (status) {
				logEvent("Pass", "Year value is entered successfully");
			} else {
				logEvent("Fail", "Year value is not entered successfully");
			}

		} catch (Exception e) {
			System.out.println("Exception raised in entring data");
		}
		return status;
	}

}
