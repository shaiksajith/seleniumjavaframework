package com.AccesSpecifiers1;

import com.AccesSpecifiers.*;

class ClassD extends ClassA {

	public static void main(String[] args) {
		ClassD d=new ClassD();
		//System.out.println(d.x);//we cannot use default variable in other package even though if u import other pacagke classes
         System.out.println(d.x);
	}

}
//A-&gt;B-&gt;C = class hierarchy
class A 
{ 
 protected void display() 
  { 
      System.out.println("SoftwareTestingHelp"); 
  } 
} 

class B extends A {}  
class C extends B {}

class Main{
   public static void main(String args[]) 
 {   
     B obj = new B();     //create object of class B   
     obj.display();       //access class A protected method using obj
     C cObj = new C();    //create object of class C
     cObj.display ();     //access class A protected method using cObj
 }   
}
//Output:

//Protected access modifier in Java