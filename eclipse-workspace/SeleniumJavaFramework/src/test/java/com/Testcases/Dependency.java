package com.Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Dependency {

	@Test(priority=1)
	public void test1() {
			
		System.out.println("starting excution......");
		String expected="a";
		 
		String actuval="b";
		
		assertEquals(actuval, expected,"validating login functinality..");
		
	}
	
	@Test(priority=2,dependsOnMethods = "test1")
	
	public void test2() {
		
		System.out.println("starting excution my test case 2......");

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
