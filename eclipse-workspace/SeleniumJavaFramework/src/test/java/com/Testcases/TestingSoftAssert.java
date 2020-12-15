package com.Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestingSoftAssert {

	@Test
	 public void validateSoftAssert() {//in soft assert we need to creat object for softassert classs
		 SoftAssert asert=new SoftAssert();//in soft assert it skips failure,excution runs
		System.out.println("starting excution......");
		String expected="a";
		 
		String actual="b";
		
		asert.assertEquals(actual,expected);
		
		System.out.println("program excuton is completd");
		asert.assertAll();//it will show all the failure at the end of excution
		
		
		
		
	}
	
	
	
	
	
	
}
