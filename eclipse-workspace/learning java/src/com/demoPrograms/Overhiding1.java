package com.demoPrograms;

public class Overhiding1 {//we can apply for only static methods,with same method and parameter and same return type parent and child relationship
static void m1() {
	System.out.println("hello from parent");
}
}
class Overhiding extends Overhiding1{//parent and child relationship
	static void m1() {
		System.out.println("hello from child");
	}
	public static void main(String[] args) {//in overhiding which class referece we use that class excutes and in overriding whatevr the class we create object that class excutes
		Overhiding1 o1=new Overhiding();
	}
}