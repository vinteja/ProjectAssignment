package com.TestCases;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;





public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		HttpURLConnection huc=(HttpURLConnection)(new URL("http://automationpractice.com/index.php?controller=authentication&back=my-account")).openConnection();
		
		
		int rescode=huc.getResponseCode();
		
		
		System.out.println(rescode);

	}

}
