package com.Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HardAssertion {
//it compares expected value with actual value and if the failure occuers programm excution stops
	@Test
	
	 public void  validateHardAssertion() {
		
		System.out.println("starting excution......");
		String expected="a";
		 
		String actuval="b";
		
		assertEquals(actuval, expected,"validating login functinality..");//u can write msg in that method also
		
	}
	
	
	
	
	
	
}
