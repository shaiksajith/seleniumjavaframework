package com.demoPrograms;

public class OverRidingDemo {//is same method name with same signatures(parameters)and the relation is parent and child class
 void msg() {
	 System.out.println("parent method");
            }
}	
class Demo extends OverRidingDemo{//overriding only applicable for instance methods
	void msg() {
		 System.out.println("child  method");//overriding is run time,whatever the class we create object that class excutes
	           }
	public static void main(String[] args) {//static and final methods cannot overridden because they are local to class
		Demo d=new Demo();
		d.msg();
	                                       }
}

