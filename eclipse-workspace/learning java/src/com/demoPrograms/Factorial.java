package com.demoPrograms;

public class Factorial {

	public static void main(String[] args) { //recursion:any method we can cl two times
		Factorial f=new Factorial();
		int result=f.fact(5);
		System.out.println(result);
	}
 int fact(int n) {
	 if(n==1)
		 return 1;
	     int x=n*fact(n-1);
	     return x;
 }
}
