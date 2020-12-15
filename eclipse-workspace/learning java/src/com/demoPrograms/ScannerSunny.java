package com.demoPrograms;

import java.util.Scanner;

public class ScannerSunny {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name=");
		String Name=sc.next();
		System.out.println("enter your age=");
		int Age=sc.nextInt();
		System.out.println("enter your fees=");
		Double Fees=sc.nextDouble();
		System.out.println("name="+Name+"  "+"age="+Age+"  "+"fee="+Fees);
		sc.close();
	}

}
