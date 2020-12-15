package com.demoPrograms;
public class SuperKeyworddemo {//super keyword use to access the parent class instance variable if child and parent having the same variable name
	int x=34;
}
class sunny extends SuperKeyworddemo{
	int x=45;
	 void sun() {
		 int x=34;//local variable
		 System.out.println(x);// prints local variable
		 System.out.println(this.x);//prints child instance variable
		 System.out.println(super.x);//prints child instance variable
		 }
	 public static void main(String[] args) {
		 sunny s=new sunny();
		 s.sun();
	 }
	 
 class Supermethoddemo{//with this super keyword we can call parent class instant method
	void m1() {
		System.out.println("helo from parent");
	}
 }
	class sajith extends Supermethoddemo{
		
		void m1() {
			super.m1();
			System.out.println("hello from child");
		}
		public static void main(String[] args) {	
			sajith sa=new sajith();
			sa.m1();
		}
		
		
class Constructor{//super in constructor 
	
	 Constructor(){
		 System.out.println("im parent class consturctor");
	 }
}
	class samer extends Constructor{//if u dont use super keyword jvm automaticaally  calls
		samer(){
			super();//parent class constructor excutes and in construcor frst line must be super keyword
			System.out.println("im child class constructor");
		}
		public static void main(String[] args) {
			samer sr= new samer();
		}
	
	}
	
	
	
	
	
	
	
	
	
}
		
	}
	
 













