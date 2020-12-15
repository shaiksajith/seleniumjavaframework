package com.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Implementation {

	@Test(dataProviderClass =com.Testcases.TestDataProvider.class, dataProvider="loginCredentials")
	public void testLogin(String username,String password) {
		System.out.println("validation of login functionality with diff username and password");
		System.out.println("username");
		System.out.println("password");
	
	
	
	/*
	@DataProvider
	
	public Object[][] loginCredentials(){
		
		Object[][] obj=new Object[2][2];
		//1st row
		obj[0][0]="user01";//1 st col
		obj[0][1]="pawrd1";//2 col
		//2nd row
		obj[1][0]="user02";//1 st col
		obj[1][1]="pawrd2";//2 col*		
		
		return obj;*/
		
	}
	
	
}
