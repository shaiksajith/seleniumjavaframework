package com.GlobalvsLocal;

public class GlobalvsLocal {
 int a=3;
 int b=4;
int c;
	public static void main(String[] args) {
		 GlobalvsLocal sun=new GlobalvsLocal();
		System.out.println(sun.c=sun.a+sun.b);
		 sun.addNumbers();
		 //System.out.println(sun.c);
	}
 public void addNumbers() {
	 int a=45;
	 int b=45;
	 int c=a+b;
	 System.out.println("inside method="+c);
 }
}
