package com.Testcases;

import org.testng.annotations.Test;

public class Tc_01 {

	
     @Test(priority = 1)//in this testng @test is the main method,after every annotaion a method should be avialble
     public void  Validate_Browser_Launch(){//Prority is in what order testcase excute
    	 System.out.println("iam launching the browser");
     }
     
     @Test(priority = 2 )//u can write any decsrption u want in test annotation and u can write testname=("") also
    public void Registartion() {
    	 System.out.println("user going to register");
     }
     @Test(priority = 3)//if write enabled in @test that test case will be ignored ,by default enable is true u need to give false if u wnat ignore
     public void Details() {
    	 System.out.println("user enter the details");
    	 
     }
     @Test(priority = 4)
     public void Log_Out() {
    	 System.out.println("user logging out the system");
     }
	
}
