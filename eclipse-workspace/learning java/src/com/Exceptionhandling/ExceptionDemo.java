package com.Exceptionhandling;

public class ExceptionDemo{//we can crete mauliple catch blocks to try bolck but u can only create single finally blck
	public static void main(String[] args) {
		System.out.println("hello sunny");
		
		
		
		try {//when we assume there is going to be expection, from that exception we place that in try block
			int a=10;
			int b=0;
			int c=a/b;//create exception object and give to jvm
			System.out.println(c);
		}//and jvm gives this object to catch block like handler,and prints statements
		catch(ArithmeticException ae) {//whatever the exception we gonna get, that exception we use in catch block
			ae.printStackTrace();//this method prints excetion reason and name and line
			//System.out.println("you cannot divide nummber with 0");
		}
		finally {//what ever statements  u write in finally excutes without exception interept
			System.out.println("from finllay block");
		}
	
		System.out.println("hai sunny");
		System.out.println("hello riccob");
		
	}

}
