package com.demoPrograms;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a the amount for A ");
		int a=sc.nextInt();
		System.out.println("enter the amount for B");
		int b=sc.nextInt();
		// System.out.println(a+b);
		int result=addTwoNumbers(34,50);
		System.out.println(a+b);
		 
	}
public static int addTwoNumbers(int a,int b) {
	 return a+b;
}
}
