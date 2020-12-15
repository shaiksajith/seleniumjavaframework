package com.Exceptionhandling;

public class ThrowDemo {
/*static void validate(int age) {
	if(age<18) {//now we are givin our own condition to raise exception so we use /
		throw new ArithmeticException("you are not eleigible");
	}else {
		System.out.println("you are eligible");
	}
}
	public static void main(String[] args) {//when we use or own of conditions to raise exception then we use throw keyword
		validate(23);

	}*/
static void display() throws ArithmeticException{// this methods throws what kind exception it may rise
	int a=3/0;
	System.out.println(a);
}	
public static void main(String[] args) {
	try {
	display();
}catch(ArithmeticException ae) {//u need to catch the your method exception
	ae.printStackTrace();
	System.out.println("dengei");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
