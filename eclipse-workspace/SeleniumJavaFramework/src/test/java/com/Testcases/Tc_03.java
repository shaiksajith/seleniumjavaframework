package com.Testcases;

import org.testng.annotations.Test;

public class Tc_03 {
	  @Test(priority = 1)//in this testng @test is the main method,after every annotaion a method should be avialble
	     public void  Validate_Browser_Launch(){//Prority is in what order testcase excute
	    	 System.out.println("test case 3");
	     }
	     
}
