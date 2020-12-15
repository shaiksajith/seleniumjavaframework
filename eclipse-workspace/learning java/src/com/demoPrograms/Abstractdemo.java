package com.demoPrograms;//abstract can have concrete methods and as well as abstract methods

abstract class Abstractdemo {//if abstract class is here it should be extended i.e (child class)
 
	abstract void sound();//it only have declaration and not body and the same method should override in child class
	  void display() {//concrete method
		  System.out.println("im from abstrac demo class");//we can create constrctor for abstract class 
	  }// suppose if abtsrct class have 3 methods and that 3 methods should override in child class

}
 class rajiya extends Abstractdemo{//
	void sound() {//method overriding
		System.out.println("printed abstarct demo class");
	}
	public static void main(String[] args) {//we cannot create object to abstarct class cannot instantiated
		Abstractdemo ab=new rajiya();//we can create refernce of abstarct class
		rajiya s=new rajiya();
		s.display();
	}//we cannot create abstract+final keyword at time
}
// what is the use of abdtsrct class?
//if i create one method dispaly()....this method can be used by diff members 
 
 