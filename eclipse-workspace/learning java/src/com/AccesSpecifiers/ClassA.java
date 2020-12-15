package com.AccesSpecifiers;

  public class ClassA {
 //private int x=10;//this private variable,now we use this variable in this class only,we cant use in any other class and package and subclass
    //int x=10;//deafult variable
	protected int x=10;//protected var 
	public static void main(String[] args) {//private only applicable for variables,methods and constrctors
		ClassA a=new ClassA();
		System.out.println(a.x);//proetcted we can access with parent and child relaiton ship
	}

}
//public>protected>default>priavte
 //public:we can access from anywhere
  //protectd:we can access from same pacakge and another pakage sub class
  //default:we can access from within pacakge only and we cannot access from other pacage
  //private:only in one clss of same pacakge
  //Note that a class and an interface cannot be protected i.e. we cannot apply protected modifiers to classes and interfaces.
  
  //Private access modifier cannot be used for classes and interfaces.
  
  
  
  
  