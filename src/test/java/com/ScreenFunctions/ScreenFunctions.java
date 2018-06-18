package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class ScreenFunctions extends GenericFunctions
{
	
	//***************************HOMEPAGE********************************************
	@FindBy(how=How.XPATH,using="//input[@id='search_query_top']")
	public static WebElement Txt_homepage_textbox;
	
	@FindBy(how=How.XPATH,using="//button[@name='submit_search']")
	public static WebElement Btn_homepage_search;
	
	@FindBy(how=How.XPATH,using="//p[normalize-space(text())='Please enter a search keyword']")
	public static WebElement Txt_homepage_entersearch;
	
	@FindBy(how=How.XPATH,using="//h5[@itemprop='name']//a[normalize-space(text())='Faded Short Sleeve T-shirts']")
	public static WebElement Txt_homepage_searchediten;
	
		
	public static boolean validatesrch()
	{
		boolean status=true;
		{
			try
			{
				Btn_homepage_search.click();
				String colour =Txt_homepage_entersearch.getCssValue("background-color");
				if(Txt_homepage_entersearch.isDisplayed())
				{
					logEvent("pass", "Error msg colour is :: "+colour);
					logEvent("fail", "Error msg for empty search is displayed");
					
				}
				else
				{
					logEvent("fail", "Error msg not displayed");
				
				}
				
				Txt_homepage_textbox.sendKeys("t-shirts");
				Btn_homepage_search.click();
				if(Txt_homepage_searchediten.isDisplayed())
				{
					
					logEvent("fail", "Searched item is displayed");
		
				}
				else
				{
					logEvent("fail", "Searched item is not displayed");
			
				}
				
			}
			catch(Exception e1)
			{
				status=false;
			}
		}
		return status;
		
		
	}
	
	
	
	
	
	
}
